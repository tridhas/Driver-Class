public class seleksiUniv{
	private int noPeserta, tahunIjazah, kodePos, telepon;
	private String namaPeserta, kelompokUjian, alamat, daftarPilihan, provinsi, kabupatenKota, tempatLahir, jenisKelamin, agama, lokasiUjian,tanggalLahir;
	
	public seleksiUniv(int noPeserta, String namaPeserta, String kelompokUjian, int tahunIjazah, int telepon, String daftarPilihan, String alamat, String provinsi, String kabupatenKota, int kodePos, String tempatLahir, String tanggalLahir, String jenisKelamin, String agama, String lokasiUjian)
	{
		this.noPeserta = noPeserta;
		this.namaPeserta = namaPeserta;
		this.kelompokUjian = kelompokUjian;
		this.tahunIjazah = tahunIjazah;
		this.telepon = telepon;
		this.alamat = alamat;
		this.provinsi = provinsi;
		this.kabupatenKota = kabupatenKota;
		this.kodePos = kodePos;
		this.tempatLahir = tempatLahir;
		this.tanggalLahir = tanggalLahir;
		this.jenisKelamin = jenisKelamin;
		this.agama = agama;
		this.daftarPilihan = daftarPilihan;
		this.lokasiUjian = lokasiUjian;
	}
		public int NoPeserta(){
			return noPeserta;
		}
		public String NamaPeserta(){
			return namaPeserta;
		}
		public String KelompokUjian(){
			return kelompokUjian;
		}
		public int TahunIjazah(){
			return tahunIjazah;
		}
		public long Telepon(){
			return telepon;
		}
		public String Alamat(){
			return alamat;
		}
		public String Provinsi(){
			return provinsi;
		}
		public String KabupatenKota(){
			return kabupatenKota;
		}
		public int KodePos(){
			return kodePos;
		}
		public String TempatLahir(){
			return tempatLahir;
		}
		public String TanggalLahir(){
			return tanggalLahir;
		}
		public String JenisKelamin(){
			return jenisKelamin;
		}
		public String Agama(){
			return agama;
		}
		public String DaftarPilihan(){
			return daftarPilihan;
		}
		public String LokasiUjian(){
			return lokasiUjian;
		}
}