package id.ac.undiksha.siak;

import id.ac.undiksha.entities.Mahasiswa;
import id.ac.undiksha.entities.Dosen;

public class Main {

	public static void main(String[] args) {
		Mahasiswa mhs1 = new Mahasiswa();
		mhs1.setNama("Adi");
		mhs1.printAllInfo();
		
		Mahasiswa mhs2 = new Mahasiswa(
		"Budi", 
		"Singaraja",  
		true, 
		"2115101003" , 
		"Ilmu Komputer", 
		"Teknik Informatika", 
		"FTK");
		
		mhs2.printAllInfo();
		
		System.out.println(mhs1.getNama());
	
		Dosen dsn1 = new Dosen();
		dsn1.setNama("Aldo");
		
		System.out.println(dsn1.getNama());
		
		
	}

}