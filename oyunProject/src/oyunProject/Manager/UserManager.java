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
			System.out.println(user.getFirstName()+" adl� ki�i kaydedildi.");	
		} else {
			System.out.println(user.getFirstName()+" adl� ki�i kaydedilmedi.");	
		}			
	}

	@Override
	
	public void update(User user) {
		if (nationalityService.verify(user)) {
			System.out.println(user.getFirstName()+" adl� ki�i g�ncellendi.");	
		} else {
			System.out.println(user.getFirstName()+" adl� ki�i g�ncellenmedi.");	
		}		
	}

	@Override
	public void delete(User user) {
		if (nationalityService.verify(user)) {
			System.out.println(user.getFirstName()+" adl� ki�i silindi.");	
		} else {
			System.out.println(user.getFirstName()+" adl� ki�i silinemedi.");	
		}		
	}

}
