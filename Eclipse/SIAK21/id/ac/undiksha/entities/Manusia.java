package id.ac.undiksha.entities;

public abstract class Manusia {

	private String nama;
	private String alamat;
	private boolean jenisKelamin; //0 perempuan, 1 laki-laki
	
	public Manusia() {
		this.setNama("(nama belum diisi)");
		this.setAlamat("(alamat belum diisi)");		
	}

	public Manusia(String nama, String alamat, boolean jenisKelamin) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.jenisKelamin = jenisKelamin;
	}

	public void printAllinfo() {
		System.out.println("Nama: " 	+ this.getNama());
		System.out.println("Alamat: " 	+ this.getAlamat());
		
		System.out.println("Jenis Kelamin:"
				+ (jenisKelamin ? "Laki-laki" : "Perempuan"));
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

	public boolean isJenisKelamin() {
		return jenisKelamin;
	}

	public void setJenisKelamin(boolean jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}


	
}