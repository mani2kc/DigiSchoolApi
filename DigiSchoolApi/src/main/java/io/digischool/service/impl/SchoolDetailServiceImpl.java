package io.digischool.service.impl;

import io.digischool.Exception.DigiSchoolException;
import io.digischool.dto.request.SchoolAdmissionRequestDTO;
import io.digischool.dto.request.SchoolRequestDTO;
import io.digischool.dto.response.AdmissionResponseDTO;
import io.digischool.dto.response.ResponseDTO;
import io.digischool.dto.response.SchoolDetailsResponseDTO;
import io.digischool.model.AdmissionDetails;
import io.digischool.model.SchoolInfo;
import io.digischool.respository.AdmissionDetailsRepository;
import io.digischool.respository.SchoolInfoRespository;
import io.digischool.service.SchoolDetailServiceInterface;
import io.digischool.util.MessageConstants;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
public class SchoolDetailServiceImpl implements SchoolDetailServiceInterface {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SchoolInfoRespository schoolInfoRespository;

	@Autowired
	private AdmissionDetailsRepository admissionDetailsRepository;

	@Override
	@Transactional(readOnly = true)
	public ResponseDTO getDetails(String name) throws DigiSchoolException {
		logger.info("SchoolDetailServiceInterface : getDetails : Entered ");
		ResponseDTO response = new ResponseDTO();
		List<SchoolInfo> schoolInfo = schoolInfoRespository.findByname(name);

		if (schoolInfo == null || schoolInfo.size() <= 0) {
			logger.error("SchoolDetailServiceInterface : create : No school found.");
			throw new DigiSchoolException(MessageConstants.SCHOOL_NOT_FOUND);
		}
		List<SchoolDetailsResponseDTO> schoolList = new ArrayList<SchoolDetailsResponseDTO>();
		/*for (SchoolInfo school : schoolInfo) {
			SchoolDetailsResponseDTO responseDTO = new SchoolDetailsResponseDTO();
			BeanUtils.copyProperties(school, responseDTO);
			List<AdmissionDetails> admissionList = school
					.getAdmissionDetailsList();
			for (AdmissionDetails admissionDetails : admissionList) {
				AdmissionResponseDTO admissionResponseDTO = new AdmissionResponseDTO();
				BeanUtils
						.copyProperties(admissionDetails, admissionResponseDTO);
				responseDTO.getAdmissions().add(admissionResponseDTO);
			}
			schoolList.add(responseDTO);
		}*/

		response.setData(schoolInfo);
		response.setMessage(MessageConstants.success);
		logger.info("SchoolDetailServiceInterface : getDetails : Leaving");
		return response;
	}

	@Override
	@Transactional(readOnly = false, rollbackFor = DigiSchoolException.class)
	public String create(SchoolRequestDTO request) throws DigiSchoolException {
		logger.info("SchoolDetailServiceInterface : create : Entered ");
		SchoolInfo school = null;
		try {
			school = new SchoolInfo();

			String name = request.getName();
			Integer pincode = request.getPinCode();
			List<SchoolInfo> schoolInfo = schoolInfoRespository
					.findByNameAndPinCode(name, pincode);

			if (StringUtils.isEmpty(name)) {
				logger.error(
						"SchoolDetailServiceInterface : create : {} School name is invalid.",
						name, pincode);
				throw new DigiSchoolException(
						MessageConstants.SCHOOL_NAME_IS_INVALID);
			}
			if (pincode == null) {
				logger.error(
						"SchoolDetailServiceInterface : create : {} School branch pincode is empty.",
						name, pincode);
				throw new DigiSchoolException(MessageConstants.PINCODE_IS_EMPTY);
			}
			if (schoolInfo != null && schoolInfo.size() > 0) {
				logger.error(
						"SchoolDetailServiceInterface : create : {} School already exists in {} branch.",
						name, pincode);
				throw new DigiSchoolException(String.format(
						MessageConstants.SCHOOL_ALREADY_EXISTIS, name, pincode));
			}
			BeanUtils.copyProperties(request, school);

			schoolInfoRespository.save(school);
		} catch (DigiSchoolException e) {
			logger.error(
					"SchoolDetailServiceInterface : create : Exception occurred.",
					e);
			throw e;
		} catch (Exception e) {
			logger.error(
					"SchoolDetailServiceInterface : create : Exception occurred.",
					e);
			throw new DigiSchoolException(e);
		}
		logger.info("SchoolDetailServiceInterface : create : Leaving ");
		return school.getId();
	}

	@Override
	@Transactional(readOnly = false, rollbackFor = DigiSchoolException.class)
	public void updateAdmissionDetails(SchoolAdmissionRequestDTO request)
			throws DigiSchoolException {

		logger.info("SchoolDetailServiceInterface : updateAdmissionDetails : Entered ");
		SchoolInfo school = null;
		try {

			String schoolId = request.getSchoolId();
			school = schoolInfoRespository.findOne(schoolId);

			if (school == null || !school.isActive()) {
				logger.error("SchoolDetailServiceInterface : updateAdmissionDetails : Requested School is invalid.");
				throw new DigiSchoolException(MessageConstants.SCHOOL_NOT_FOUND);
			}
			AdmissionDetails admissionDetails = new AdmissionDetails();

			// TODO : Have to validate the date scenarios
			BeanUtils.copyProperties(request, admissionDetails);

			admissionDetails.setSchool(school);

			admissionDetailsRepository.save(admissionDetails);
		} catch (DigiSchoolException e) {
			logger.error(
					"SchoolDetailServiceInterface : updateAdmissionDetails : Exception occurred.",
					e);
			throw e;
		} catch (Exception e) {
			logger.error(
					"SchoolDetailServiceInterface : updateAdmissionDetails : Exception occurred.",
					e);
			throw new DigiSchoolException(e);
		}
		logger.info("SchoolDetailServiceInterface : updateAdmissionDetails : Leaving ");

	}

}