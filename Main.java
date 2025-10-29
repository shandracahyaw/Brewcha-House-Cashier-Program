import java.util.Scanner;

public class Main {

    // Array untuk menyimpan daftar menu
    static Menu[] daftarMenu = new Menu[8]; // Minimal 4 makanan dan 4 minuman

    public static void main(String[] args) {
        // Inisialisasi daftar menu
        inisialisasiMenu();

        Scanner scanner = new Scanner(System.in);

        // Menampilkan daftar menu
        tampilkanMenu();

        // Menerima pesanan
        String[] pesananNama = new String[4];
        int[] pesananJumlah = new int[4];
        int jumlahItemPesanan = 0;

        System.out.println("\n===== Silakan Masukkan Pesanan (maksimal 4 menu) =====");
        System.out.println("Format: [Nama Menu] = [Jumlah]");
        

        // Input pesanan pertama
        System.out.print("Pesanan 1: ");
        String input1 = scanner.nextLine();
        // Memecah input dan menyimpan ke array pesanan
        if (!input1.trim().isEmpty()) {
            String[] bagian1 = input1.split(" = ");
            if (bagian1.length == 2) {
                pesananNama[jumlahItemPesanan] = bagian1[0].trim();
                pesananJumlah[jumlahItemPesanan] = Integer.parseInt(bagian1[1].trim());
                jumlahItemPesanan++;
            }
        }

        // Input pesanan kedua
        if (jumlahItemPesanan < 4) {
            System.out.print("Pesanan 2 (Opsional): ");
            String input2 = scanner.nextLine();
            if (!input2.trim().isEmpty()) {
                String[] bagian2 = input2.split(" = ");
                if (bagian2.length == 2) {
                    pesananNama[jumlahItemPesanan] = bagian2[0].trim();
                    pesananJumlah[jumlahItemPesanan] = Integer.parseInt(bagian2[1].trim());
                    jumlahItemPesanan++;
                }
            }
        }

        // Input pesanan ketiga
        if (jumlahItemPesanan < 4) {
            System.out.print("Pesanan 3 (Opsional): ");
            String input3 = scanner.nextLine();
            if (!input3.trim().isEmpty()) {
                String[] bagian3 = input3.split(" = ");
                if (bagian3.length == 2) {
                    pesananNama[jumlahItemPesanan] = bagian3[0].trim();
                    pesananJumlah[jumlahItemPesanan] = Integer.parseInt(bagian3[1].trim());
                    jumlahItemPesanan++;
                }
            }
        }

        // Input pesanan keempat
        if (jumlahItemPesanan < 4) {
            System.out.print("Pesanan 4 (Opsional): ");
            String input4 = scanner.nextLine();
            if (!input4.trim().isEmpty()) {
                String[] bagian4 = input4.split(" = ");
                if (bagian4.length == 2) {
                    pesananNama[jumlahItemPesanan] = bagian4[0].trim();
                    pesananJumlah[jumlahItemPesanan] = Integer.parseInt(bagian4[1].trim());
                    jumlahItemPesanan++;
                }
            }
        }
        
        // Memproses pesanan dan mencetak struk
        hitungDanCetakStruk(pesananNama, pesananJumlah, jumlahItemPesanan);

        scanner.close();
    }

    // Method untuk inisialisasi daftar menu
    public static void inisialisasiMenu() {
        daftarMenu[0] = new Menu("Matcha Lava Brownie", 35000.0, "makanan");
        daftarMenu[1] = new Menu("Esspresso Fudge Brownies", 33000.0, "makanan");
        daftarMenu[2] = new Menu("Hojicha Walnut Blondie", 32000.0, "makanan");
        daftarMenu[3] = new Menu("Triple Choco Crumb", 36000.0, "makanan");
        daftarMenu[4] = new Menu("Dirty Matcha Latte", 38000.0, "minuman");
        daftarMenu[5] = new Menu("Brown Sugar Matcha Cold Brew", 36000.0, "minuman");
        daftarMenu[6] = new Menu("Creamy Mocha Cha", 40000.0, "minuman");
        daftarMenu[7] = new Menu("Vanilla Cream Matcha Frappe", 42000.0, "minuman");
    }

    // Method untuk menampilkan daftar menu
    public static void tampilkanMenu() {
        System.out.println("===== Daftar Menu Brewcha House =====");
        System.out.println("--- Makanan ---");
        // Menampilkan makanan
        if (daftarMenu[0].getKategori().equals("makanan")) {
            System.out.println("- " + daftarMenu[0].getNama() + " (Rp " + String.format("%.0f", daftarMenu[0].getHarga()) + ")");
        }
        if (daftarMenu[1].getKategori().equals("makanan")) {
            System.out.println("- " + daftarMenu[1].getNama() + " (Rp " + String.format("%.0f", daftarMenu[1].getHarga()) + ")");
        }
        if (daftarMenu[2].getKategori().equals("makanan")) {
            System.out.println("- " + daftarMenu[2].getNama() + " (Rp " + String.format("%.0f", daftarMenu[2].getHarga()) + ")");
        }
        if (daftarMenu[3].getKategori().equals("makanan")) {
            System.out.println("- " + daftarMenu[3].getNama() + " (Rp " + String.format("%.0f", daftarMenu[3].getHarga()) + ")");
        }

        System.out.println("\n--- Minuman ---");
        // Menampilkan minuman
        if (daftarMenu[4].getKategori().equals("minuman")) {
            System.out.println("- " + daftarMenu[4].getNama() + " (Rp " + String.format("%.0f", daftarMenu[4].getHarga()) + ")");
        }
        if (daftarMenu[5].getKategori().equals("minuman")) {
            System.out.println("- " + daftarMenu[5].getNama() + " (Rp " + String.format("%.0f", daftarMenu[5].getHarga()) + ")");
        }
        if (daftarMenu[6].getKategori().equals("minuman")) {
            System.out.println("- " + daftarMenu[6].getNama() + " (Rp " + String.format("%.0f", daftarMenu[6].getHarga()) + ")");
        }
        if (daftarMenu[7].getKategori().equals("minuman")) {
            System.out.println("- " + daftarMenu[7].getNama() + " (Rp " + String.format("%.0f", daftarMenu[7].getHarga()) + ")");
        }
    }

    // Method untuk menghitung total biaya dan mencetak struk
    public static void hitungDanCetakStruk(String[] pesananNama, int[] pesananJumlah, int jumlahItemPesanan) {
        double totalHargaSebelumPajak = 0;
        double biayaPajak = 0;
        double biayaPelayanan = 20000;
        double diskon = 0;
        double totalHargaSetelahDiskon = 0;
        boolean adaBeliSatuGratisSatu = false;
        String menuGratis = "";
        double hargaMenuGratis = 0;

        System.out.println("\n\n===== Struk Pesanan =====");

        // Menampilkan item yang dipesan dan menghitung subtotal
        if (jumlahItemPesanan > 0) {
            // Item 1
            String namaMenu1 = pesananNama[0];
            int jumlah1 = pesananJumlah[0];
            double hargaPerItem1 = 0;
            String kategori1 = "";

            // Mencari harga dan kategori menu 1
            if (daftarMenu[0].getNama().equalsIgnoreCase(namaMenu1)) {
                hargaPerItem1 = daftarMenu[0].getHarga();
                kategori1 = daftarMenu[0].getKategori();
            } else if (daftarMenu[1].getNama().equalsIgnoreCase(namaMenu1)) {
                hargaPerItem1 = daftarMenu[1].getHarga();
                kategori1 = daftarMenu[1].getKategori();
            } else if (daftarMenu[2].getNama().equalsIgnoreCase(namaMenu1)) {
                hargaPerItem1 = daftarMenu[2].getHarga();
                kategori1 = daftarMenu[2].getKategori();
            } else if (daftarMenu[3].getNama().equalsIgnoreCase(namaMenu1)) {
                hargaPerItem1 = daftarMenu[3].getHarga();
                kategori1 = daftarMenu[3].getKategori();
            } else if (daftarMenu[4].getNama().equalsIgnoreCase(namaMenu1)) {
                hargaPerItem1 = daftarMenu[4].getHarga();
                kategori1 = daftarMenu[4].getKategori();
            } else if (daftarMenu[5].getNama().equalsIgnoreCase(namaMenu1)) {
                hargaPerItem1 = daftarMenu[5].getHarga();
                kategori1 = daftarMenu[5].getKategori();
            } else if (daftarMenu[6].getNama().equalsIgnoreCase(namaMenu1)) {
                hargaPerItem1 = daftarMenu[6].getHarga();
                kategori1 = daftarMenu[6].getKategori();
            } else if (daftarMenu[7].getNama().equalsIgnoreCase(namaMenu1)) {
                hargaPerItem1 = daftarMenu[7].getHarga();
                kategori1 = daftarMenu[7].getKategori();
            }
            
            double totalPerItem1 = hargaPerItem1 * jumlah1;
            totalHargaSebelumPajak += totalPerItem1;
            System.out.println(String.format("%-20s %3d x Rp %7.0f = Rp %9.0f", namaMenu1, jumlah1, hargaPerItem1, totalPerItem1));
            
            // Logika Buy One Get One (Item 1)
            if (kategori1.equals("minuman") && totalHargaSebelumPajak > 50000 && !adaBeliSatuGratisSatu && jumlah1 >= 1) {
                adaBeliSatuGratisSatu = true;
                menuGratis = namaMenu1;
                hargaMenuGratis = hargaPerItem1;
            }
        }

        if (jumlahItemPesanan > 1) {
            // Item 2
            String namaMenu2 = pesananNama[1];
            int jumlah2 = pesananJumlah[1];
            double hargaPerItem2 = 0;
            String kategori2 = "";

            // Mencari harga dan kategori menu 2
            if (daftarMenu[0].getNama().equalsIgnoreCase(namaMenu2)) {
                hargaPerItem2 = daftarMenu[0].getHarga();
                kategori2 = daftarMenu[0].getKategori();
            } else if (daftarMenu[1].getNama().equalsIgnoreCase(namaMenu2)) {
                hargaPerItem2 = daftarMenu[1].getHarga();
                kategori2 = daftarMenu[1].getKategori();
            } else if (daftarMenu[2].getNama().equalsIgnoreCase(namaMenu2)) {
                hargaPerItem2 = daftarMenu[2].getHarga();
                kategori2 = daftarMenu[2].getKategori();
            } else if (daftarMenu[3].getNama().equalsIgnoreCase(namaMenu2)) {
                hargaPerItem2 = daftarMenu[3].getHarga();
                kategori2 = daftarMenu[3].getKategori();
            } else if (daftarMenu[4].getNama().equalsIgnoreCase(namaMenu2)) {
                hargaPerItem2 = daftarMenu[4].getHarga();
                kategori2 = daftarMenu[4].getKategori();
            } else if (daftarMenu[5].getNama().equalsIgnoreCase(namaMenu2)) {
                hargaPerItem2 = daftarMenu[5].getHarga();
                kategori2 = daftarMenu[5].getKategori();
            } else if (daftarMenu[6].getNama().equalsIgnoreCase(namaMenu2)) {
                hargaPerItem2 = daftarMenu[6].getHarga();
                kategori2 = daftarMenu[6].getKategori();
            } else if (daftarMenu[7].getNama().equalsIgnoreCase(namaMenu2)) {
                hargaPerItem2 = daftarMenu[7].getHarga();
                kategori2 = daftarMenu[7].getKategori();
            }
            
            double totalPerItem2 = hargaPerItem2 * jumlah2;
            totalHargaSebelumPajak += totalPerItem2;
            System.out.println(String.format("%-20s %3d x Rp %7.0f = Rp %9.0f", namaMenu2, jumlah2, hargaPerItem2, totalPerItem2));

            // Logika Buy One Get One (Item 2)
            if (kategori2.equals("minuman") && totalHargaSebelumPajak > 50000 && !adaBeliSatuGratisSatu && jumlah2 >= 1) {
                adaBeliSatuGratisSatu = true;
                menuGratis = namaMenu2;
                hargaMenuGratis = hargaPerItem2;
            }
        }

        if (jumlahItemPesanan > 2) {
            // Item 3
            String namaMenu3 = pesananNama[2];
            int jumlah3 = pesananJumlah[2];
            double hargaPerItem3 = 0;
            String kategori3 = "";

            // Mencari harga dan kategori menu 3
            if (daftarMenu[0].getNama().equalsIgnoreCase(namaMenu3)) {
                hargaPerItem3 = daftarMenu[0].getHarga();
                kategori3 = daftarMenu[0].getKategori();
            } else if (daftarMenu[1].getNama().equalsIgnoreCase(namaMenu3)) {
                hargaPerItem3 = daftarMenu[1].getHarga();
                kategori3 = daftarMenu[1].getKategori();
            } else if (daftarMenu[2].getNama().equalsIgnoreCase(namaMenu3)) {
                hargaPerItem3 = daftarMenu[2].getHarga();
                kategori3 = daftarMenu[2].getKategori();
            } else if (daftarMenu[3].getNama().equalsIgnoreCase(namaMenu3)) {
                hargaPerItem3 = daftarMenu[3].getHarga();
                kategori3 = daftarMenu[3].getKategori();
            } else if (daftarMenu[4].getNama().equalsIgnoreCase(namaMenu3)) {
                hargaPerItem3 = daftarMenu[4].getHarga();
                kategori3 = daftarMenu[4].getKategori();
            } else if (daftarMenu[5].getNama().equalsIgnoreCase(namaMenu3)) {
                hargaPerItem3 = daftarMenu[5].getHarga();
                kategori3 = daftarMenu[5].getKategori();
            } else if (daftarMenu[6].getNama().equalsIgnoreCase(namaMenu3)) {
                hargaPerItem3 = daftarMenu[6].getHarga();
                kategori3 = daftarMenu[6].getKategori();
            } else if (daftarMenu[7].getNama().equalsIgnoreCase(namaMenu3)) {
                hargaPerItem3 = daftarMenu[7].getHarga();
                kategori3 = daftarMenu[7].getKategori();
            }
            
            double totalPerItem3 = hargaPerItem3 * jumlah3;
            totalHargaSebelumPajak += totalPerItem3;
            System.out.println(String.format("%-20s %3d x Rp %7.0f = Rp %9.0f", namaMenu3, jumlah3, hargaPerItem3, totalPerItem3));

            // Logika Buy One Get One (Item 3)
            if (kategori3.equals("minuman") && totalHargaSebelumPajak > 50000 && !adaBeliSatuGratisSatu && jumlah3 >= 1) {
                adaBeliSatuGratisSatu = true;
                menuGratis = namaMenu3;
                hargaMenuGratis = hargaPerItem3;
            }
        }

        if (jumlahItemPesanan > 3) {
            // Item 4
            String namaMenu4 = pesananNama[3];
            int jumlah4 = pesananJumlah[3];
            double hargaPerItem4 = 0;
            String kategori4 = "";

            // Mencari harga dan kategori menu 4
            if (daftarMenu[0].getNama().equalsIgnoreCase(namaMenu4)) {
                hargaPerItem4 = daftarMenu[0].getHarga();
                kategori4 = daftarMenu[0].getKategori();
            } else if (daftarMenu[1].getNama().equalsIgnoreCase(namaMenu4)) {
                hargaPerItem4 = daftarMenu[1].getHarga();
                kategori4 = daftarMenu[1].getKategori();
            } else if (daftarMenu[2].getNama().equalsIgnoreCase(namaMenu4)) {
                hargaPerItem4 = daftarMenu[2].getHarga();
                kategori4 = daftarMenu[2].getKategori();
            } else if (daftarMenu[3].getNama().equalsIgnoreCase(namaMenu4)) {
                hargaPerItem4 = daftarMenu[3].getHarga();
                kategori4 = daftarMenu[3].getKategori();
            } else if (daftarMenu[4].getNama().equalsIgnoreCase(namaMenu4)) {
                hargaPerItem4 = daftarMenu[4].getHarga();
                kategori4 = daftarMenu[4].getKategori();
            } else if (daftarMenu[5].getNama().equalsIgnoreCase(namaMenu4)) {
                hargaPerItem4 = daftarMenu[5].getHarga();
                kategori4 = daftarMenu[5].getKategori();
            } else if (daftarMenu[6].getNama().equalsIgnoreCase(namaMenu4)) {
                hargaPerItem4 = daftarMenu[6].getHarga();
                kategori4 = daftarMenu[6].getKategori();
            } else if (daftarMenu[7].getNama().equalsIgnoreCase(namaMenu4)) {
                hargaPerItem4 = daftarMenu[7].getHarga();
                kategori4 = daftarMenu[7].getKategori();
            }
            
            double totalPerItem4 = hargaPerItem4 * jumlah4;
            totalHargaSebelumPajak += totalPerItem4;
            System.out.println(String.format("%-20s %3d x Rp %7.0f = Rp %9.0f", namaMenu4, jumlah4, hargaPerItem4, totalPerItem4));

            // Logika Buy One Get One (Item 4)
            if (kategori4.equals("minuman") && totalHargaSebelumPajak > 50000 && !adaBeliSatuGratisSatu && jumlah4 >= 1) {
                adaBeliSatuGratisSatu = true;
                menuGratis = namaMenu4;
                hargaMenuGratis = hargaPerItem4;
            }
        }
        
        System.out.println("----------------------------------------");
        System.out.println(String.format("%-33s = Rp %9.0f", "Subtotal", totalHargaSebelumPajak));

        // Menghitung pajak
        biayaPajak = totalHargaSebelumPajak * 0.10;
        System.out.println(String.format("%-33s = Rp %9.0f", "Pajak (10%)", biayaPajak));

        // Menambahkan biaya pelayanan
        System.out.println(String.format("%-33s = Rp %9.0f", "Biaya Pelayanan", biayaPelayanan));

        double totalBiayaKeseluruhan = totalHargaSebelumPajak + biayaPajak + biayaPelayanan;
        System.out.println(String.format("%-33s = Rp %9.0f", "Total Sebelum Diskon", totalBiayaKeseluruhan));

        // Penawaran Buy One Get One (jika total > 50.000 dan ada minuman)
        if (adaBeliSatuGratisSatu) {
            System.out.println(String.format("Penawaran Khusus: Beli 1 %s GRATIS 1 %s!", menuGratis, menuGratis));
            System.out.println(String.format("%-33s = -Rp %9.0f", "Diskon Beli 1 Gratis 1", hargaMenuGratis));
            totalBiayaKeseluruhan -= hargaMenuGratis;
        }

        // Diskon 10% jika total biaya keseluruhan pesanan melebihi Rp 100.000,-
        if (totalBiayaKeseluruhan > 100000) {
            diskon = totalBiayaKeseluruhan * 0.10;
            System.out.println(String.format("%-33s = -Rp %9.0f", "Diskon (10%)", diskon));
            totalHargaSetelahDiskon = totalBiayaKeseluruhan - diskon;
        } else {
            totalHargaSetelahDiskon = totalBiayaKeseluruhan;
        }

        System.out.println("----------------------------------------");
        System.out.println(String.format("%-33s = Rp %9.0f", "TOTAL PEMBAYARAN", totalHargaSetelahDiskon));
        System.out.println("========================================\n");
    }
}