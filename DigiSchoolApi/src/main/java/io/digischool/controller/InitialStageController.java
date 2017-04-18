/*package io.digischool.controller;

import io.digischool.model.SchoolDetails;
import io.digischool.service.InitialStageService;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InitialStageController {
	
	@Autowired
	private InitialStageService initialservice;
	
	@RequestMapping("/hello")
	public String welcome()
	{
		return initialservice.getHelloMessage();
	}
	
	
	@RequestMapping("/details")
	public List<SchoolDetails> getDetails()
	{
		return initialservice.getAllDetails();
	}
	
	@RequestMapping("/details/{id}")
	public SchoolDetails getDetail(@PathVariable String id)
	{
		return initialservice.getDetail(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/details")
	public void addDetail(@RequestBody SchoolDetails detail)
	{
		initialservice.addDetail(detail);	
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/details/{id}")
	public void updateDetail(@RequestBody SchoolDetails detail, @PathVariable String id)
	{
		initialservice.updateDetail(id , detail);	
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/details/{id}")
	public void deleteDetail( @PathVariable String id)
	{
		initialservice.deleteDetail(id);	
	}
	

}
*/