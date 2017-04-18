package io.digischool.respository;

import io.digischool.model.SchoolInfo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolInfoRespository extends JpaRepository<SchoolInfo, String>{
	
	List<SchoolInfo> findByname(String name);

	List<SchoolInfo> findByNameAndPinCode(String name,Integer pinCode);
	
}
