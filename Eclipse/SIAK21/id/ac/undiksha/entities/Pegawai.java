package id.ac.undiksha.entities;

public class Pegawai extends Manusia{
	private String nip;
	private String unit;
	
	public Pegawai() {
		this.setNip("(nip belum diisi)");				
		this.setUnit("(unit belum diisi)");			
	}

	public Pegawai(String nama, String alamat, boolean jenisKelamin,
			String nip, String unit) {
		super(nama, alamat, jenisKelamin);
		this.nip = nip;
		this.unit = unit;
	}



	public Pegawai(String nip, String unit) {
		super();
		this.nip = nip;
		this.unit = unit;
	}

	public void printAllinfo() {
		System.out.println("Nama: " 	+ this.getNama());
		System.out.println("Alamat: " 	+ this.getAlamat());
		System.out.println("NIP: " 		+ this.getNip());
		System.out.println("Unit: "	+ this.getUnit());
		
		
		System.out.println("Jenis Kelamin:"
				+ (this.isJenisKelamin() ? "Laki-laki" : "Perempuan"));
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}