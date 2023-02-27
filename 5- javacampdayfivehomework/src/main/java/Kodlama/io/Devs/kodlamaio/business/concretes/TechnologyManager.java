package Kodlama.io.Devs.kodlamaio.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Kodlama.io.Devs.kodlamaio.business.abstracts.TechnologyService;
import Kodlama.io.Devs.kodlamaio.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.kodlamaio.business.requests.DeleteTechnologyRequest;
import Kodlama.io.Devs.kodlamaio.business.requests.UpdateTechnologyRequest;
import Kodlama.io.Devs.kodlamaio.business.responses.GetAllTechnologyResponse;
import Kodlama.io.Devs.kodlamaio.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.kodlamaio.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.Devs.kodlamaio.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Devs.kodlamaio.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {

	private TechnologyRepository technologyRepository;
	private ProgrammingLanguageRepository programmingLanguageRepository;
	public TechnologyManager(TechnologyRepository technologyRepository, ProgrammingLanguageRepository programmingLanguageRepository)
	{
		this.technologyRepository = technologyRepository;
		this.programmingLanguageRepository = programmingLanguageRepository;
	}
	
	@Override
	public List<GetAllTechnologyResponse> getAll() {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologyResponse> responses = new ArrayList<GetAllTechnologyResponse>();
		
		for (Technology technology : technologies)
		{
			GetAllTechnologyResponse response = new GetAllTechnologyResponse();
			response.setName(technology.getName());
			response.setId(technology.getId());
			responses.add(response);
		}
		
		return responses;
	}

	@Override
	public void Add(CreateTechnologyRequest technologyRequest) {
		List<Technology> technologies = new ArrayList<Technology>();
		Technology technology = new Technology();
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage = this.programmingLanguageRepository.findById(technologyRequest.getId()).get();
		technologies = technologyRepository.findAll();
		technology.setName(technologyRequest.getName());
		technology.setProgrammingLanguage(programmingLanguage);
		technologies.add(technology);
		programmingLanguage.setTechnologies(technologies);
		this.technologyRepository.save(technology);
		this.programmingLanguageRepository.save(programmingLanguage);
	}

	@Override
	public void Update(UpdateTechnologyRequest request) {
		Technology technology = this.technologyRepository.findById(request.getId()).get();
		technology.setName(request.getName());
		this.technologyRepository.save(technology);
	}

	@Override
	public void Delete(DeleteTechnologyRequest request) {
		
		Technology technology = this.technologyRepository.findById(request.getId()).get();
		ProgrammingLanguage programmingLanguage = this.programmingLanguageRepository.findById(technology.getProgrammingLanguage().getId()).get();
		List<Technology> technologies = new ArrayList<Technology>();
		technologies = programmingLanguage.getTechnologies();
		technologies.remove(technology);
		this.technologyRepository.delete(technology);
		this.programmingLanguageRepository.save(programmingLanguage);
	}

}
