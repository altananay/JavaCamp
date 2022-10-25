package nTierArchitecture.core.CrossCuttingConcerns.Logging;

import nTierArchitecture.entities.Entity;

public class MailLogger implements LoggerBase {

	@Override
	public void Logging(Entity entity) {
		System.out.println("logged to mail" + entity);	
	}
}