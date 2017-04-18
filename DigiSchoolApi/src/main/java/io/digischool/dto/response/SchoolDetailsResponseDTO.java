package io.digischool.dto.response;

import java.util.ArrayList;
import java.util.List;

public class SchoolDetailsResponseDTO {
	private String name;

	private boolean isHostelAvailable;

	private boolean isBoardingCompulsory;

	private String established;

	private String gradesUpto;

	private String type;

	private String board;

	private List<AdmissionResponseDTO> admissions = new ArrayList<AdmissionResponseDTO>();

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

	public List<AdmissionResponseDTO> getAdmissions() {
		return admissions;
	}

	public void setAdmissions(List<AdmissionResponseDTO> admissions) {
		this.admissions = admissions;
	}

	public String getName() {
		return name;
	}

}
