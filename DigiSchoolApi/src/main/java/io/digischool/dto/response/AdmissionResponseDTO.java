package io.digischool.dto.response;

import java.util.Date;

public class AdmissionResponseDTO {
	private Date issueDate;

	private Date endDate;

	private boolean active;

	private Date enteranceExamDate;

	private Date applicationSubmissionDate;

	private String procedure;

	private String eligibility;

	private int seatsAvailable;

	private String feeDetails;


	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getEnteranceExamDate() {
		return enteranceExamDate;
	}

	public void setEnteranceExamDate(Date enteranceExamDate) {
		this.enteranceExamDate = enteranceExamDate;
	}

	public Date getApplicationSubmissionDate() {
		return applicationSubmissionDate;
	}

	public void setApplicationSubmissionDate(Date applicationSubmissionDate) {
		this.applicationSubmissionDate = applicationSubmissionDate;
	}

	public String getProcedure() {
		return procedure;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	public String getEligibility() {
		return eligibility;
	}

	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	public String getFeeDetails() {
		return feeDetails;
	}

	public void setFeeDetails(String feeDetails) {
		this.feeDetails = feeDetails;
	}
	
}
