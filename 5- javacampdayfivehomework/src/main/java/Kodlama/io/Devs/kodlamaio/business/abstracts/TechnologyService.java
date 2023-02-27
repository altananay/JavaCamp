package Kodlama.io.Devs.kodlamaio.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.kodlamaio.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.kodlamaio.business.requests.DeleteTechnologyRequest;
import Kodlama.io.Devs.kodlamaio.business.requests.UpdateTechnologyRequest;
import Kodlama.io.Devs.kodlamaio.business.responses.GetAllTechnologyResponse;

public interface TechnologyService {
	List<GetAllTechnologyResponse> getAll();
	void Add(CreateTechnologyRequest technologyRequest);
	void Update(UpdateTechnologyRequest request);
	void Delete(DeleteTechnologyRequest request);
}
