package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.business.validators.ProgrammingLanguageValidator;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageDao;
import kodlama.io.Devs.entities.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	
	private ProgrammingLanguageDao programmingLanguageDao;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageDao programmingLanguageDao)
	{
		this.programmingLanguageDao = programmingLanguageDao;
	}

	@Override
	public ProgrammingLanguage GetById(int id) {
		return programmingLanguageDao.GetById(id);
	}

	@Override
	public void Add(ProgrammingLanguage programmingLanguage) {
		ProgrammingLanguageExists(programmingLanguage);
		if (ProgrammingLanguageValidator.isValid(programmingLanguage)) {
			programmingLanguageDao.Add(programmingLanguage);
		}
		else {
			System.out.println("validation error");
		}
	}

	@Override
	public List<ProgrammingLanguage> GetAll() {
		return programmingLanguageDao.GetAll();
	}

	@Override
	public void Delete(int id) {
		programmingLanguageDao.Delete(id);
		
	}

	@Override
	public void Update(int id, ProgrammingLanguage programmingLanguage) {
		ProgrammingLanguageExists(programmingLanguage);
		if (ProgrammingLanguageValidator.isValid(programmingLanguage)) {
			programmingLanguageDao.Update(id, programmingLanguage);
		}
		else {
			System.out.println("validation error");
		}
		
	}
	
	public void ProgrammingLanguageExists(ProgrammingLanguage language)
	{
		GetAll().stream().filter(language2 -> language2.getName().equalsIgnoreCase(language.getName())).findFirst().ifPresent(language2 -> {
			throw new RuntimeException("programming language name exists");
		});
	}
}