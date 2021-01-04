package people;

public class Siswa {
	protected String nama;
	protected long NIM;
	protected double IPK;
	static int total = 0;
	
	public Siswa(){
	}
	
	public Siswa(String nama, long NIM, double IPK){
		this.nama = nama;
		this.NIM = NIM;
		this.IPK = IPK;
		this.total++;
	}
	
	
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public long getNIM() {
		return NIM;
	}

	public void setNIM(long nIM) {
		NIM = nIM;
	}

	public double getIPK() {
		return IPK;
	}

	public void setIPK(double iPK) {
		IPK = iPK;
	}
	
	
	
	// display entry
	public void display() {
		System.out.print(this.NIM + " - ");
		System.out.print(this.nama + " - ");
		System.out.println(this.IPK);
	}
	
	public void setAll(String nama, long NIM, double IPK) {
		this.nama = nama;
		this.NIM = NIM;
		this.IPK = IPK;
	}
	
	// Method static untuk menghitung jumlah entry
	public static int getTotalEntry(){
		return total;
	}
}
