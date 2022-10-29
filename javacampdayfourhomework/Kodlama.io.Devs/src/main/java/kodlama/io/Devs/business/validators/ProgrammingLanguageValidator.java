package kodlama.io.Devs.business.validators;

import kodlama.io.Devs.entities.ProgrammingLanguage;

public class ProgrammingLanguageValidator {
	
	public static boolean isValid(ProgrammingLanguage programmingLanguage)
	{
		System.out.println(programmingLanguage.Id + "" + programmingLanguage.Name);
		if (!programmingLanguage.Name.isEmpty() && programmingLanguage.Id != 0 && programmingLanguage.Name != "") {
			return true;
		}
		else {
			return false;
		}
	}
	
}