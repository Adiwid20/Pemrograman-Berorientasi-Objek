package id.ac.undiksha.siak;
import id.ac.undiksha.entities.Dosen;
import id.ac.undiksha.entities.Mahasiswa;
import id.ac.undiksha.entities.Pegawai;

public class Main {

	public static void main(String[] args) {
		Mahasiswa mhs2 = new Mahasiswa(
				"Putu Adi Widyantara",
				"Busungbiu",
				true,
				"2115101044",	
				"Ilmu Komputer",
				"TI01",
				"Teknik Informatika"
				"FTK"
				);
		mhs2.printAllInfo();
		
		Dosen dosen1 = new Dosen(
				"A.A. Gede Yudhi Paramartha, S.Kom., M.Kom.",
				"Singaraja",
				true,
				"116655",
				"Ilmu Komputer",
				"Koorprodi",
				"TI01",
				"Teknik Informatika"
				"FTK"
				);
		dosen1.printAllInfo();
		
		Pegawai pegawai1 = new Pegawai(
				"Pegawai",
				"Buleleng",
				false,
				"112200",
				"Penjaga LAB"
				);
		pegawai1.printAllInfo();
	}
}