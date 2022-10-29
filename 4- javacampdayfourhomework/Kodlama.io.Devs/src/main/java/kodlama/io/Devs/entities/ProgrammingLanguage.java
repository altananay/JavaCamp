package kodlama.io.Devs.entities;

public class ProgrammingLanguage {
	public int Id;
	public String Name;
	
	
	public ProgrammingLanguage(int id, String name) {
		this.Id = id;
		this.Name = name;
	}
	
	public ProgrammingLanguage() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return this.Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}
	
	
}
