package io.digischool.controller;

import io.digischool.Exception.DigiSchoolException;
import io.digischool.dto.request.SchoolAdmissionRequestDTO;
import io.digischool.dto.request.SchoolRequestDTO;
import io.digischool.dto.response.ResponseDTO;
import io.digischool.model.SchoolInfo;
import io.digischool.service.SchoolDetailServiceInterface;
import io.digischool.util.MessageConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/school")
public class SchoolDetailsController {
	
	@Autowired
	private SchoolDetailServiceInterface schoolDetailService;
	
	@ResponseBody
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	public ResponseDTO addDetails(@RequestBody SchoolRequestDTO request)throws DigiSchoolException 
	{
		ResponseDTO response = new ResponseDTO();
		String schoolId =	schoolDetailService.create(request);

		response.setData(schoolId);
		response.setMessage(MessageConstants.SCHOOL_CREATED_SUCCESSFULLY);
		return response;
		
	}
	
	@ResponseBody
	@RequestMapping(value="/get")
	public ResponseDTO getDetails(@RequestParam String name) throws DigiSchoolException {
		ResponseDTO responce=	schoolDetailService.getDetails(name);
		return responce;
	}
	
	@ResponseBody
	@RequestMapping(value="/admission/update")
	public ResponseDTO getDetails(@RequestBody SchoolAdmissionRequestDTO request) throws DigiSchoolException {
		schoolDetailService.updateAdmissionDetails(request);
		ResponseDTO response = new ResponseDTO();

		response.setMessage(MessageConstants.ADMISSION_DETAIL_UPDATED_SUCCESSFULLY);
		
		return response;
	}
	

}
