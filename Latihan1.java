import java.util.*;


public class Latihan1{
	Scanner input = new Scanner(System.in);
	ArrayList<Mahasiswa> args = new ArrayList<>();

	public static void main(String[] args) {
		Latihan1 alm = new Latihan1();
		alm.runThis();
	}

	void runThis(){
		inputData();
		inputData();
		inputData();
		viewData();
	}

	void inputData(){
		System.out.println("== Masukan Data Mahasiswa ==");
		System.out.print("Masukan Nim : ");
		String nim = input.nextLine();
		System.out.print("Masukan Nama: ");
		String nama = input.nextLine();
		System.out.print("Masukan Asal Sekolah : ");
		String asal_sekolah = input.nextLine();
		System.out.print("Masukan Alamat Asal : ");
		String alamat_asal = input.nextLine();
		System.out.print("Masukan Alamat Sekarang : ");
		String alamat_sekarang = input.nextLine();
		Mahasiswa siswa = new Mahasiswa(nim, nama, asal_sekolah, alamat_asal, alamat_sekarang);
		args.add(siswa);
	}

	void viewData(){
		for(int i = 0; i < args.size(); i++){
			String siswa = args.get(i).getMahasiswa();
			String namadoang = args.get(i).getNama();
			System.out.println(siswa);
		}
	}

}

class Mahasiswa{
	private String nim, nama, asal_sekolah, alamat_asal, alamat_sekarang;

	public Mahasiswa(String nim, String nama, String asal_sekolah, String alamat_asal, String alamat_sekarang){
		this.nim = nim;
		this.nama = nama;
		this.asal_sekolah = asal_sekolah;
		this.alamat_asal = alamat_asal;
		this.alamat_sekarang = alamat_sekarang;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public void setNim(String nim){
		this.nim = nim;
	}

	public void setALamat_Asal(String alamat_asal){
		this.alamat_asal = alamat_asal;
	}

	public String getAlamat_Asal(){
		return this.alamat_asal;
	}

	public void setAsal_sekolah(String asal_sekolah){
		this.asal_sekolah = asal_sekolah;
	}

	public String getAsal_sekolah(){
		return this.asal_sekolah;
	}

	public void setAlamat_sekarang(String alamat_sekarang){
		this.alamat_sekarang = alamat_sekarang;
	}
	public String getAlamat_sekarang(){
		return this.alamat_sekarang;
	}

	public String getNama(){
		return this.nama;
	}

	public String getNim(){
		return this.nim;
	}

	public String getMahasiswa(){
		System.out.print("=========\n");
		return nim + " - " + nama + " - " + asal_sekolah + " - " + alamat_asal + " - " + alamat_sekarang;
	}
}