package io.digischool.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "admission_details")
public class AdmissionDetails extends BaseEntity {

	private static final long serialVersionUID = -5093665213807035093L;

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "id", unique = true)
	private String id;

	@OneToOne
	private SchoolInfo school; 
	
	@NotNull
	@Column(name = "issue_date")
	@Temporal(TemporalType.DATE)
	private Date issueDate;
	@NotNull
	@Column(name = "end_date")
	@Temporal(TemporalType.DATE)
	private Date endDate;

	@NotNull
	@Column(name = "is_active")
	private boolean active;

	@NotNull
	@Column(name = "enterance_exam__date")
	@Temporal(TemporalType.DATE)
	private Date enteranceExamDate;

	@NotNull
	@Column(name = "application_submission__date")
	@Temporal(TemporalType.DATE)
	private Date applicationSubmissionDate;

	@Column(name = "procedure")
	private String procedure;
	@NotNull
	@Column(name = "eligibility")
	private String eligibility;
	@Column(name = "seats_available")
	private int seatsAvailable;

	@Column(name = "fee_details")
	private String feeDetails;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SchoolInfo getSchool() {
		return school;
	}

	public void setSchool(SchoolInfo school) {
		this.school = school;
	}

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
