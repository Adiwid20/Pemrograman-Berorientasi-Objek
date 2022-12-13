package id.ac.undiksha.entities;

public class Mahasiswa {
	
	private String nama;
	private String alamat;
	private boolean jenisKelamin; //0 perempuan, 1 laki-laki
	private String nim;
	private String prodi;
	private String jurusan;
	private String fakultas;
	
	public Mahasiswa() {
		this.setNama("(nama belum diisi)");
		this.setAlamat("(alamat belum diisi)");
		this.setNim("(nim belum diisi)");
		this.setProdi("(prodi belum diisi)");
		this.setJurusan("(jurusan belum diisi)");
		this.setFakultas("(fakultas belum diisi)");
	}
	
	
	public Mahasiswa(String nama, 
			String alamat, 
			boolean jenisKelamin, 
			String nim, 
			String prodi, 
			String jurusan,
			String fakultas) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
		this.nim = nim;
		this.prodi = prodi;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}

	public void printAllInfo() {
		System.out.println("Nama: " + this.getNama());
		System.out.println("Alamat: " + this.getAlamat());
		System.out.println("Nim: " + this.getNim());
		System.out.println("Prodi: " + this.getProdi());
		System.out.println("Jurusan: " + this.getJurusan());
		System.out.println("Fakultas: " + this.getFakultas());
		
		System.out.println("jenisKelamin: " + (jenisKelamin ? "Laki-Laki" : "Perempuan"));
	}
	
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public boolean getJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getProdi() {
		return prodi;
	}
	public void setProdi(String prodi) {
		this.prodi = prodi;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public String getFakultas() {
		return fakultas;
	}
	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}
	//Mencoba membuat inheritence dengan Manusia memeiliki nama alamat nim dan Subclass Mahasiswa Pegawai Dosen
}