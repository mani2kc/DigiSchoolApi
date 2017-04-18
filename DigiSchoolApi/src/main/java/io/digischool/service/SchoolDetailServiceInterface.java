package io.digischool.service;
import io.digischool.Exception.DigiSchoolException;
import io.digischool.dto.request.SchoolAdmissionRequestDTO;
import io.digischool.dto.request.SchoolRequestDTO;
import io.digischool.dto.response.ResponseDTO;

public interface SchoolDetailServiceInterface {
	
	String create(SchoolRequestDTO request) throws DigiSchoolException;
	ResponseDTO getDetails(String name) throws DigiSchoolException;

	void updateAdmissionDetails(SchoolAdmissionRequestDTO request) throws DigiSchoolException;
}
