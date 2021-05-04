package manager;

import entities.User;
import service.NationalityService;
import service.UserService;

public class UserManager implements UserService {
	
	private NationalityService nationalityService;
	
	
	public UserManager(NationalityService nationalityService) {
		
		this.nationalityService = nationalityService;
		
	}

	@Override
	public void add(User user) {
		if (nationalityService.verify(user)) {
			System.out.println(user.getFirstName()+" adlı kişi kaydedildi.");	
		} else {
			System.out.println(user.getFirstName()+" adlı kişi kaydedilmedi.");	
		}
	}

	@Override
	
	public void update(User user) {
		System.out.println(user.getFirstName()+" adlı kişi güncellendi.");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+" adlı kişi silindi.");
	}
	

}
