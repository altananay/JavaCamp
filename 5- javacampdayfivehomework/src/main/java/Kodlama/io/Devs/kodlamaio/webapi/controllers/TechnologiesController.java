package Kodlama.io.Devs.kodlamaio.webapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.kodlamaio.business.abstracts.TechnologyService;
import Kodlama.io.Devs.kodlamaio.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.kodlamaio.business.requests.DeleteTechnologyRequest;
import Kodlama.io.Devs.kodlamaio.business.requests.UpdateTechnologyRequest;
import Kodlama.io.Devs.kodlamaio.business.responses.GetAllTechnologyResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {
	private TechnologyService technologyService;
	
	@Autowired
	public TechnologiesController(TechnologyService technologyService)
	{
		this.technologyService = technologyService;
	}
	
	@PostMapping("/add")
	public void add(CreateTechnologyRequest request)
	{
		this.technologyService.Add(request);
	}
	
	@GetMapping("/getall")
	public List<GetAllTechnologyResponse> getAll()
	{
		return this.technologyService.getAll();
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteTechnologyRequest request)
	{
		this.technologyService.Delete(request);
	}
	
	@PutMapping("/update")
	public void update(UpdateTechnologyRequest request)
	{
		this.technologyService.Update(request);
	}
	
}
