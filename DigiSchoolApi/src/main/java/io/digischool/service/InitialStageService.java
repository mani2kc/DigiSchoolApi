/*package io.digischool.service;

import io.digischool.model.SchoolDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class InitialStageService {
	
	public List<SchoolDetails> details = new ArrayList<>( Arrays.asList(
			new SchoolDetails("ABC", "Redhills", "CBSE"),
			new SchoolDetails("DEF", "Porur", "CBSE"),
			new SchoolDetails("GHI", "AshokPillar", "StateBoard")
			));
	
	public List<SchoolDetails> getAllDetails()
	{
		return details;
	}
	
	public SchoolDetails getDetail(String id)
	{
		return details.stream().filter(t -> t.getName().equals(id)).findFirst().get();
	}
	
	public String getHelloMessage()
	{
		return "Welcome to Spring World";
	}

	public void addDetail(SchoolDetails detail) {
		// TODO Auto-generated method stub
		
		details.add(detail);
		
	}

	public void updateDetail(String name, SchoolDetails detail) {
			
		for (int i=0;i<details.size();i++)
		{
			SchoolDetails sd = details.get(i);
			if(sd.getName().equals(name))
			{
				details.set(i, detail);
			}
		}
	}

	public void deleteDetail(String name) {
		
		details.removeIf(t -> t.getName().equals(name));
	}

}
*/