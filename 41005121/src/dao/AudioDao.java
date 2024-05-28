package dao;

import datos.Audio;

public class AudioDao extends Dao<Audio> {
	private static AudioDao instancia = null; // Patrón Singleton

	protected AudioDao() {
	}

	public static AudioDao getInstance() {
		if (instancia == null)
			instancia = new AudioDao();
		return instancia;
	}
	
}
