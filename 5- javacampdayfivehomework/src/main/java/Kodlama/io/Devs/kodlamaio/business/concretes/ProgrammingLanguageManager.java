package Kodlama.io.Devs.kodlamaio.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.kodlamaio.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.kodlamaio.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.kodlamaio.business.requests.DeleteProgrammingLanguageRequest;
import Kodlama.io.Devs.kodlamaio.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.io.Devs.kodlamaio.business.responses.GetAllProgrammingLanguagesResponse;
import Kodlama.io.Devs.kodlamaio.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.kodlamaio.entities.concretes.ProgrammingLanguage;
import lombok.experimental.var;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository)
	{
		this.programmingLanguageRepository = programmingLanguageRepository;
	}
	
	@Override
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguagesResponse> programmingLanguagesResponses = new ArrayList<GetAllProgrammingLanguagesResponse>();
		
		for (ProgrammingLanguage language: programmingLanguages)
		{
			GetAllProgrammingLanguagesResponse response = new GetAllProgrammingLanguagesResponse();
			response.setName(language.getName());
			response.setId(language.getId());
			programmingLanguagesResponses.add(response);
		}
		
		return programmingLanguagesResponses;
	}

	@Override
	public void Add(CreateProgrammingLanguageRequest programmingLanguageRequest) {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(programmingLanguageRequest.getName());
		this.programmingLanguageRepository.save(programmingLanguage);
	}

	@Override
	public void Update(UpdateProgrammingLanguageRequest programmingLanguageRequest) {
		ProgrammingLanguage result = programmingLanguageRepository.findById(programmingLanguageRequest.getId()).get();
		result.setName(programmingLanguageRequest.getName());
		this.programmingLanguageRepository.save(result);
		
	}

	@Override
	public void Delete(DeleteProgrammingLanguageRequest programmingLanguageRequest) {
		ProgrammingLanguage result = programmingLanguageRepository.findById(programmingLanguageRequest.getId()).get();
		this.programmingLanguageRepository.delete(result);
		
	}

}
