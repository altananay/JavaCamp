package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.business.validators.ProgrammingLanguageValidator;
import kodlama.io.Devs.entities.ProgrammingLanguage;
import lombok.experimental.var;

@Repository
public class ProgrammingLanguageDao implements kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageDao {

	List<ProgrammingLanguage> programmingLanguages;
	
	public ProgrammingLanguageDao()
	{
		programmingLanguages = new ArrayList<>();
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.Id = 1;
		programmingLanguage.Name = "java";
		programmingLanguages.add(programmingLanguage);
	}
	
	@Override
	public void Add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);		
	}

	@Override
	public void Delete(int id) {
		ProgrammingLanguage programmingLanguage = GetById(id);
		programmingLanguages.remove(programmingLanguage);
	}

	@Override
	public List<ProgrammingLanguage> GetAll() {
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage GetById(int id) {
		return (ProgrammingLanguage) programmingLanguages.stream().filter(item -> item.getId()==id).findFirst().get();
	}

	@Override
	public void Update(int id, ProgrammingLanguage programmingLanguage) {
		programmingLanguages.set(id-1, programmingLanguage);
		
	}
}