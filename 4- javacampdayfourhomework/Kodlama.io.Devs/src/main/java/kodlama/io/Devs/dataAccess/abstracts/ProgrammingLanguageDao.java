package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.entities.ProgrammingLanguage;


public interface ProgrammingLanguageDao {
	public void Add(ProgrammingLanguage programmingLanguage);
	public void Delete(int id);
	public List<ProgrammingLanguage> GetAll();
	public ProgrammingLanguage GetById(int id);
	public void Update(int id, ProgrammingLanguage programmingLanguage);
}
