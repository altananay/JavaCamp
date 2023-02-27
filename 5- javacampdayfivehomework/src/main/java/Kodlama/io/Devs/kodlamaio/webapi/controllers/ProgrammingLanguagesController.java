package Kodlama.io.Devs.kodlamaio.webapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.kodlamaio.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.kodlamaio.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.kodlamaio.business.requests.DeleteProgrammingLanguageRequest;
import Kodlama.io.Devs.kodlamaio.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.io.Devs.kodlamaio.business.responses.GetAllProgrammingLanguagesResponse;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService programmingLanguageService;
	
	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService)
	{
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@PostMapping("/add")
	public void add(@RequestBody CreateProgrammingLanguageRequest programmingLanguageRequest)
	{
		this.programmingLanguageService.Add(programmingLanguageRequest);
	}
	
	@GetMapping("/getall")
	public List<GetAllProgrammingLanguagesResponse> getAll()
	{
		return this.programmingLanguageService.getAll();
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody DeleteProgrammingLanguageRequest request)
	{
		this.programmingLanguageService.Delete(request);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody UpdateProgrammingLanguageRequest request)
	{
		this.programmingLanguageService.Update(request);
	}
}
