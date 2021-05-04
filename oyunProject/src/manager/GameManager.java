package manager;

import entities.Game;
import service.GameService;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		
		System.out.println("Yeni oyun eklendi.");	
		
	}

	@Override
	public void update(Game game) {
		
		System.out.println("Oyun güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("Oyun silindi.");
		
	}

}
