package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	public ProgrammingLanguage GetById(int id);
	public void Add(ProgrammingLanguage programmingLanguage);
	public List<ProgrammingLanguage> GetAll();
	public void Delete(int id);
	public void Update(int id, ProgrammingLanguage programmingLanguage);
}
