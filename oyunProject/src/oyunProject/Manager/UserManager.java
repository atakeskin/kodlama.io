package oyunProject.Manager;

import mernisService.Abstract.NationalityService;
import oyunProject.Entities.User;
import oyunProject.Service.UserService;

public class UserManager implements UserService {
	
	private NationalityService nationalityService;
	
	
	public UserManager(NationalityService nationalityService) {
		
		this.nationalityService = nationalityService;
		
	}

	@Override
	public void add(User user) {
		if (nationalityService.verify(user)) {
			System.out.println(user.getFirstName()+" adlý kiþi kaydedildi.");	
		} else {
			System.out.println(user.getFirstName()+" adlý kiþi kaydedilmedi.");	
		}			
	}

	@Override
	
	public void update(User user) {
		if (nationalityService.verify(user)) {
			System.out.println(user.getFirstName()+" adlý kiþi güncellendi.");	
		} else {
			System.out.println(user.getFirstName()+" adlý kiþi güncellenmedi.");	
		}		
	}

	@Override
	public void delete(User user) {
		if (nationalityService.verify(user)) {
			System.out.println(user.getFirstName()+" adlý kiþi silindi.");	
		} else {
			System.out.println(user.getFirstName()+" adlý kiþi silinemedi.");	
		}		
	}

}
