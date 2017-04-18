package io.digischool.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class BaseEntity implements Serializable{

	@Column(name="created_by", nullable = false)
	private String createdBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="created_on", nullable = false)
	private Date createdOn;
	
	@Column(name="updated_by")
	private String updatedBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_on")
	private Date updatedOn;

	public String getCreatedBy() {
		return createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}
	
	@PrePersist
    protected void onPrePersist() {
        this.createdBy="ADMIN";
        this.createdOn= new Date();
    }
	
	@PreUpdate
	protected void onPreUpdate(){
		//TODO : Current user details.
		this.updatedBy="ADMIN";
	        this.updatedOn= new Date();
	}
}
