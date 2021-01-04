package people;

public class Mahasiswa extends Siswa{
	public Mahasiswa(String nama, long NIM, double IPK) {
		this.nama = nama;
		this.NIM = NIM;
		this.IPK = IPK;
		this.total++;
	}
}