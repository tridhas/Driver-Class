public class jalurSBMPTN{
	public static void main (String[] args){
		/*int noPeserta, String namaPeserta, String kelompokUjian, int tahunIjazah, int telepon, String daftarPilihan, String alamat, String provinsi, String kabupatenKota, int kodePos, String tempatLahir, int tanggalLahir, String jenisKelamin, String agama, String lokasiUjian)*/

		seleksiUniv as = new seleksiUniv(999503, "Triana Ridhaswari", "Saintek", 2017, 281034, "UIN-Teknik Informatika","Jl. Otista 3", "Jawa Barat", "Cianjur", 43211, "Cianjur", "13 10 1999", "Perempuan", "Islam", "SMAN 3 Sukabumi Ruang 13");
		System.out.println("---------------------------------------------");
		System.out.println("	KARTU TANDA PESERTA SBMPTN	");
		System.out.println("---------------------------------------------");
		System.out.println("No Peserta		: "+as.NoPeserta());
		System.out.println("Nama			: "+as.NamaPeserta());
		System.out.println("Kelompok Ujian		: "+as.KelompokUjian());
		System.out.println("Tahun Ijazah 		: "+as.TahunIjazah());
		System.out.println("Telepon 		: "+as.Telepon());
		System.out.println("Alamat			: "+as.Alamat());
		System.out.println("Provinsi		: "+as.Provinsi());
		System.out.println("Kabupaten/Kota		: "+as.KabupatenKota());
		System.out.println("Kode Pos		: "+as.KodePos());
		System.out.println("Tempat Lahir		: "+as.TempatLahir());
		System.out.println("Tanggal Lahir		: "+as.TanggalLahir());
		System.out.println("Jenis Kelamin		: "+as.JenisKelamin());
		System.out.println("Agama			: "+as.Agama());
		System.out.println("DaftarPilihan	 	: "+as.DaftarPilihan());
		System.out.println("Lokasi Ujian		: "+as.LokasiUjian());
	}
}