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
		runOperationWithCheck(user,"kaydedildi.","kaydedilmesi.");		
	}

	@Override
	
	public void update(User user) {
		runOperationWithCheck(user,"güncellendi.","güncellenmedi.");	
	}

	@Override
	public void delete(User user) {
		runOperationWithCheck(user,"silindi.","silinemedi.");	
	}
	
	private void runOperationWithCheck(User user,String upMessage,String downMessage) {
		if (nationalityService.verify(user)) {
			System.out.println(user.getFirstName()+" adlı kişi "+upMessage);	
		} else {
			System.out.println(user.getFirstName()+" adlı kişi "+downMessage);	
		}	
	}

}
