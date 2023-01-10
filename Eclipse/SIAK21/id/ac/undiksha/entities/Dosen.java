package id.ac.undiksha.entities;

import id.ac.undiksha.organisasi.Prodi;

public class Dosen extends Manusia{
	private String nip;
	public Prodi prodi;
	private String jabatan;
	
	public Dosen() {
		super();
		this.setNip("(nip belum diisi)");				
		prodi = new Prodi();		
		this.setJabatan("(jabatan belum diisi)");		
	}
	
	
	
	public Dosen(String nama, String alamat, boolean jenisKelamin,
			String nip, String kodeProdi, String namaProdi, String jabatan, String namaJurusan, String kodeJurusan) {
		super(nama, alamat, jenisKelamin);
		this.nip = nip;
		prodi = new Prodi(kodeProdi, namaProdi, namaJurusan, kodeJurusan);
		this.jabatan = jabatan;
	}

	public void printAllinfo() {		//mempengaruhi urutan program ketika di run
		System.out.println("Nama: " 		+ this.getNama());
		System.out.println("Alamat: " 		+ this.getAlamat());
		System.out.println("NIP: " 			+ this.getNip());
		System.out.println("Kode Prodi: "	+ this.prodi.getKodeProdi());
		System.out.println("Nama Prodi: " 	+ this.prodi.getNamaProdi());
		System.out.println("Kode Jurusan: "	+ this.prodi.getKodeJurusan());
		System.out.println("Nama Jurusan: " 	+ this.prodi.getNamaJurusan());
		System.out.println("Jabatan: " 		+ this.getJabatan());
		
		System.out.println("Jenis Kelamin:"
				+ (this.isJenisKelamin() ? "Laki-laki" : "Perempuan"));
	}



	public String getNip() {
		return nip;
	}



	public void setNip(String nip) {
		this.nip = nip;
	}



	public Prodi getProdi() {
		return prodi;
	}



	public void setProdi(Prodi prodi) {
		this.prodi = prodi;
	}



	public String getJabatan() {
		return jabatan;
	}



	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}
	
}