package mernisService.Concrate;

import java.rmi.RemoteException;

import mernisService.Abstract.NationalityService;
import oyunProject.Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class NationalityManager implements NationalityService {
	
	KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();

	@Override
	public boolean verify(User user) {
		
		boolean result = false;
		try {
			result = kpsPublicSoap.TCKimlikNoDogrula(
					Long.parseLong(user.getIdentityNumber()),
					user.getFirstName().toUpperCase(),
					user.getLastName().toUpperCase(),
					user.getDateOfBird().getYear());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		} 
		return result;
		
	}	
	

}
