package io.digischool.dto.request;

import javax.validation.constraints.NotNull;


public class SchoolRequestDTO {

    private String name;
	
	private boolean isHostelAvailable; 
	 
	private boolean isBoardingCompulsory;

	private String established;
	 
	private String gradesUpto;
	 
	private String type;
	 
	private String board;
	private Integer pinCode;
	
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

	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

}
