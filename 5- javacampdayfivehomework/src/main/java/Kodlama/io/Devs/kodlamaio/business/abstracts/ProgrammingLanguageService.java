package Kodlama.io.Devs.kodlamaio.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.kodlamaio.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.kodlamaio.business.requests.DeleteProgrammingLanguageRequest;
import Kodlama.io.Devs.kodlamaio.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.io.Devs.kodlamaio.business.responses.GetAllProgrammingLanguagesResponse;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguagesResponse> getAll();
	void Add(CreateProgrammingLanguageRequest programmingLanguageRequest);
	void Update(UpdateProgrammingLanguageRequest programmingLanguageRequest);
	void Delete(DeleteProgrammingLanguageRequest programmingLanguageRequest);
}
