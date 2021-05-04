package mernisService.Concrate;

import mernisService.Abstract.NationalityService;
import oyunProject.Entities.Person;

public class NationalityManager implements NationalityService {

	@Override
	public boolean verify(Person person) {
		
		if (person.getIdentityNumber() == "123456789") {
			return true;			
		} else {
			return false;
		}
		
	}	
	

}
