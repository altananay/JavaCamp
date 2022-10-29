package kodlama.io.Devs.webApi.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.entities.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

	@Autowired
	private ProgrammingLanguageService programmingLanguageService;
	
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService)
	{
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getbyid")
	public ProgrammingLanguage GetById(int id)
	{
		return programmingLanguageService.GetById(id);
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> GetAll()
	{
		return programmingLanguageService.GetAll();
	}
	
	@PostMapping("/add")
	public void Add(@RequestBody ProgrammingLanguage programmingLanguage)
	{
		System.out.println(programmingLanguage.Id + " " + programmingLanguage.Name);
		programmingLanguageService.Add(programmingLanguage);
	}
	
	@GetMapping("/delete")
	public void Delete(int id)
	{
		programmingLanguageService.Delete(id);
	}
	
	@PutMapping("/update/{id}")
	public void Update(@PathVariable int id, @RequestBody ProgrammingLanguage programmingLanguage)
	{
		System.out.println(id + " " + programmingLanguage.Id + " " + programmingLanguage.Name);
		programmingLanguageService.Update(id, programmingLanguage);
	}
}