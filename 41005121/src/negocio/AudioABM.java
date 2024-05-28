package negocio;

import dao.AudioDao;
import datos.Audio;

public class AudioABM {
	private static AudioABM instancia = null; // Patrón Singleton

	protected AudioABM() {
	}

	public static AudioABM getInstance() {
		if (instancia == null)
			instancia = new AudioABM();
		return instancia;
	}
	public Audio traer(int id) {
		return AudioDao.getInstance().traer(id);

	}
}
