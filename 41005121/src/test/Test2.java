package test;

import dao.AudioDao;
import datos.Audio;

public class Test2 {
	public static void main(String[] args) {
		Audio a=AudioDao.getInstance().traer(3);
		System.out.println(a);
		
	}
}
