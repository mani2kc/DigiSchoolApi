package io.digischool.respository;

import io.digischool.model.AdmissionDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmissionDetailsRepository  extends JpaRepository<AdmissionDetails, String>{

}
