package io.digischool.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "school_info")
public class SchoolInfo extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6965396628429305234L;

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "id", unique = true)
	private String id;
	
	@NotNull
	@Column(name = "name")
	private String name;
	
	@NotNull
	@Column(name = "is_hostel_available")
	private boolean isHostelAvailable; 
	@NotNull
	@Column(name = "is_boarding_compulsory")
	private boolean isBoardingCompulsory;

	@Column(name = "is_active")
	private boolean active = true;
	
	@Column(name = "established")
	private String established;
	@NotNull
	@Column(name = "grades")
	private String gradesUpto;
	@NotNull
	@Column(name = "type")
	private String type;
	@NotNull
	@Column(name = "pincode")
	private Integer pinCode;

	@OneToMany(fetch = FetchType.LAZY,mappedBy="school")
	@Cascade(value={CascadeType.ALL})
	@JsonIgnore
	private List<AdmissionDetails> admissionDetailsList;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHostelAvailable() {
		return isHostelAvailable;
	}

	public void setHostelAvailable(boolean isHostelAvailable) {
		this.isHostelAvailable = isHostelAvailable;
	}

	public boolean isBoardingCompulsory() {
		return isBoardingCompulsory;
	}

	public void setBoardingCompulsory(boolean isBoardingCompulsory) {
		this.isBoardingCompulsory = isBoardingCompulsory;
	}

	public String getEstablished() {
		return established;
	}

	public void setEstablished(String established) {
		this.established = established;
	}

	public String getGradesUpto() {
		return gradesUpto;
	}

	public void setGradesUpto(String gradesUpto) {
		this.gradesUpto = gradesUpto;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<AdmissionDetails> getAdmissionDetailsList() {
		return admissionDetailsList;
	}

	public void setAdmissionDetailsList(List<AdmissionDetails> admissionDetailsList) {
		this.admissionDetailsList = admissionDetailsList;
	}
	
	
}
