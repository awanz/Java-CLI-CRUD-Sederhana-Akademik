package com.akademik;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
import people.Mahasiswa;

public class Main{
	
	public static void main(String[] args) {
		int nomor;
		Mahasiswa[] mhs = new Mahasiswa[100];
		ArrayList<Mahasiswa> mhsArray = new ArrayList<>();
		boolean menu = true;
		while(menu) {
			int jmlMhs = Mahasiswa.getTotalEntry();
			if(menu == false) {
				break;
			}
			System.out.println("==============================================");
			System.out.println("          Sistem Informasi Akademik");
			System.out.println("==============================================");
			System.out.println("List menu: ");
			System.out.println("1. Input Mahasiswa");
			System.out.println("2. List Mahasiswa");
			System.out.println("3. Update Mahasiswa");
			System.out.println("4. Delete Mahasiswa");
			System.out.println("5. Rata-rata IPK");
			System.out.println("6. Exit");
			
			Scanner pilihMenuScan = new Scanner(System.in);
			System.out.print("Masukan pilihan: ");
			int pilihMenu = pilihMenuScan.nextInt();
			
			switch(pilihMenu) {
				case 1:
					boolean menuInput = true;
					Scanner inputNama = new Scanner(System.in);
					Scanner inputNIM = new Scanner(System.in);
					Scanner inputIPK = new Scanner(System.in);
					
					System.out.print("Masukan Nama: ");
					String nama = inputNama.nextLine();
					System.out.print("Masukan NIM: ");
					long NIM = inputNIM.nextLong();
					System.out.print("Masukan IPK: ");
					double IPK = inputIPK.nextDouble();
					
					mhs[jmlMhs] = new Mahasiswa(nama, NIM, IPK);
					mhsArray.add(mhs[jmlMhs]);
					break;
				case 2:
					System.out.println("List Mahasiswa: ");
					System.out.println("# - NIM - Nama - IPK");
					nomor = 1;
					for (int i = 0; i < mhsArray.size(); i++) {
						Mahasiswa mhsList = mhsArray.get(i);
						System.out.println(nomor + ".  " + mhsList.getNIM() + " - " + mhsList.getNama() + " - " + mhsList.getIPK());
						nomor++;
					}
					break;
				case 3:
					System.out.println("List Mahasiswa: ");
					System.out.println("# - NIM - Nama - IPK");
					nomor = 1;
					for (int i = 0; i < mhsArray.size(); i++) {
						Mahasiswa mhsList = mhsArray.get(i);
						System.out.println(nomor + ".  " + mhsList.getNIM() + " - " + mhsList.getNama() + " - " + mhsList.getIPK());
						nomor++;
					}
					System.out.print("Masukan no Mahasiswa yang mau di update: ");
					Scanner inputNo = new Scanner(System.in);
					int noMhs = inputNo.nextInt();
					if(mhsArray.get(noMhs-1) == null) {
						System.out.println("Mahasiswa yang dipilih tidak ada");
					}else {
						System.out.print("Masukan nama baru: ");
						Scanner inputNamaBaru = new Scanner(System.in);
						String namaBaru = inputNamaBaru.nextLine();
						System.out.print("Masukan NIM baru: ");
						Scanner inputNIMBaru = new Scanner(System.in);
						long NIMBaru = inputNIMBaru.nextLong();
						System.out.print("Masukan IPK baru: ");
						Scanner inputIPKBaru = new Scanner(System.in);
						double IPKBaru =  inputIPKBaru.nextDouble();
						if(mhsArray.get(noMhs-1) == null) {
							System.out.println("Mahasiswa yang dipilih tidak ada");
						}else {
							mhs[noMhs-1].setAll(namaBaru, NIMBaru, IPKBaru);
							mhsArray.set(noMhs-1, mhs[noMhs-1]);
						}
					}
					break;
				case 4:
					System.out.println("List Mahasiswa: ");
					System.out.println("# - NIM - Nama - IPK");
					nomor = 1;
					for (int i = 0; i < mhsArray.size(); i++) {
						Mahasiswa mhsList = mhsArray.get(i);
						System.out.println(nomor + ".  " + mhsList.getNIM() + " - " + mhsList.getNama() + " - " + mhsList.getIPK());
						nomor++;
					}
					System.out.print("Masukan no Mahasiswa yang mau di delete: ");
					Scanner inputNoDelete = new Scanner(System.in);
					int noMhsDelete = inputNoDelete.nextInt();
					if(mhsArray.get(noMhsDelete - 1) == null) {
						System.out.println("Mahasiswa yang dipilih tidak ada");
					}else {
						mhsArray.remove(noMhsDelete - 1);
						System.out.println("Mahasiswa yang dipilih berhasil di hapus");
					}
					break;
				case 5:
					double totalIPK = 0.0;
					for (int i = 0; i < mhsArray.size(); i++) {
						Mahasiswa mhsList = mhsArray.get(i);
						totalIPK = totalIPK + mhsList.getIPK();
					}
					double averageIPK = totalIPK / mhsArray.size();
					DecimalFormat df = new DecimalFormat("#.##");
					System.out.println("Rata-rata IPK: " + df.format(averageIPK));
					break;
				case 6:
					Scanner exitScanner = new Scanner(System.in);
					System.out.print("Apakah anda yakin untuk keluar (yes/no): ");
					String pilihExit = exitScanner.nextLine();
					if(pilihExit.equals("yes")) {
						menu = false;
					}
					break;
				default:
					System.out.println("Pilihan yang dimasukan salah");
			}
		}
		System.out.println("Sampai jumpa!");
	}

}

