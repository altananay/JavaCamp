package nTierArchitecture.core.CrossCuttingConcerns.Logging;

import nTierArchitecture.entities.Entity;

public class FileLogger implements LoggerBase {

	@Override
	public void Logging(Entity entity) {
		System.out.println("logged to file" + entity);
		
	}

}
