import java.util.Scanner;

class main{
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int pilih, hargaBarang, jumlahBarang;
                double totalHarga, diskon, totalDiskon, hargaAkhir, uang, kembalian;
                totalHarga = 0;
                hargaAkhir = 0;

                System.out.println("1. sepatu = 10.000");
                System.out.println("2. tas = 20.000");
                System.out.println("3. baju = 15.000");
                System.out.print("Pilih barang, ketik nomor: ");

                pilih = input.nextInt();

                switch (pilih) {
                        case 1 :
                                hargaBarang = 10000;
                                System.out.print("Mau beli berapa banyak? ");
                                jumlahBarang = input.nextInt();
                                totalHarga = hargaBarang * jumlahBarang;
                                System.out.println("Harganya adalah " + totalHarga);
                                break;

                        case 2 :
                                hargaBarang = 20000;
                                System.out.print("Mau beli berapa banyak? ");
                                jumlahBarang = input.nextInt();
                                totalHarga = hargaBarang * jumlahBarang;
                                System.out.println("Harganya adalah " + totalHarga);
                                break;
                        
                        case 3 :
                                hargaBarang = 15000;
                                System.out.print("Mau beli berapa banyak? ");
                                jumlahBarang = input.nextInt();
                                totalHarga = hargaBarang * jumlahBarang;
                                System.out.println("Harganya adalah " + totalHarga);
                                break;

                        default:
                                System.out.println("Maaf, barang yang anda pilih tidak ada");
                }

                if(totalHarga >=100000 && totalHarga <=200000){
                        diskon = 0.05;
                        totalDiskon = totalHarga * diskon;
                        System.out.println("Total diskon anda adalah = " + totalDiskon);
                        
                        hargaAkhir = totalHarga - totalDiskon;
                        System.out.println("Total harga akhir anda adalah = " + hargaAkhir);
                }
                else if(totalHarga >= 200001 && totalHarga <=300000){
                        diskon = 0.1;
                        totalDiskon = totalHarga * diskon;
                        System.out.println("Total diskon anda adalah = " + totalDiskon);
                        
                        hargaAkhir = totalHarga - totalDiskon;
                        System.out.println("Total harga akhir anda adalah = " + hargaAkhir);        
                }
                else if(totalHarga >= 300001 && totalHarga <=400000){
                        diskon = 0.15;
                        totalDiskon = totalHarga * diskon;
                        System.out.println("Total diskon anda adalah = " + totalDiskon);
                        
                        hargaAkhir = totalHarga - totalDiskon;
                        System.out.println("Total harga akhir anda adalah = " + hargaAkhir);        
                }
                else if(totalHarga >= 400001 && totalHarga <=500000){
                        diskon = 0.2;
                        totalDiskon = totalHarga * diskon;
                        System.out.println("Total diskon anda adalah = " + totalDiskon);
                        
                        hargaAkhir = totalHarga - totalDiskon;
                        System.out.println("Total harga akhir anda adalah = " + hargaAkhir);        
                }
                else if(totalHarga > 500000){
                        diskon = 0.25;
                        totalDiskon = totalHarga * diskon;
                        System.out.print("Total diskon anda adalah = " + totalDiskon);
                        
                        hargaAkhir = totalHarga - totalDiskon;
                        System.out.println("Total harga akhir anda adalah = " + hargaAkhir);        
                }

                System.out.print("Masukkan uang anda = ");
                uang = input.nextInt();
                System.out.println("Uang anda = " + uang);
                if(uang == hargaAkhir){
                        System.out.println("Uang pas");
                }
                else if(uang > hargaAkhir){
                        kembalian = uang - hargaAkhir;
                        System.out.print("Kembalian anda adalah = " + kembalian);
                }
                else{
                        System.out.println("Maaf, uang anda tidak cukup");
                }
        }
}