import java.util.Scanner;

    public class main {
        public static void main(String []args){
            int a,hasil,tampung,jumlah,c,b,d;
            int pilih,ulang;
            String[] arr= new String[5];
            Scanner input=new Scanner(System.in);
            toko menu_1 = new toko();      //interface
            belanja hitung = new belanja();     //abstract
            hasil=0;
            d=0;
            do{
                System.out.println("+----------------------------------------------------------------------------------------------+");
                menu_1.MenuUtama();
                System.out.println("\t\t\tSilahkan Memasukan No Pilihan Menu :");
                pilih=input.nextInt();
                if(pilih==1){
                    menu_1.Laptop();   //interface
                    do{
                        System.out.println("\t\t\tSilahkan memilih no Laptop untuk membeli  :");
                        pilih=input.nextInt();
                        if(pilih>4){
                            System.out.println("Inputan anda kurang valid, mohon coba lagi");
                        }else {
                            System.out.println("\t\t\tAnda Ingin Membeli Brapa Unit Laptop? :");
                            a = input.nextInt();
                            if (pilih == 1) {
                                jumlah = 12500000 * a;
                                System.out.println("\t\t\t"+a + " " + "Laptop Acer Nitro5 Berhasil Dipesan dengan Total Harga " + jumlah);
                                hasil = hasil + jumlah;
                                arr[d]="\t\t\t|"+  a  +"\t\t||\t Laptop Acer Nitro5  ||Total Harga Setiap Pesanan ||";
                            } else if (pilih == 2) {
                                jumlah = 8600000 * a;
                                System.out.println("\t\t\t"+a + " " + "Laptop Dell Berhasil Dipesan dengan Total Harga " + jumlah);
                                hasil = hasil + jumlah;
                                arr[d]="\t\t\t|"+ a+ "\t\t||\tLaptop Dell \t || "+hasil+"  \t\t\t\t||";
                            } else if (pilih == 3) {
                                jumlah =  4500000 * a;
                                System.out.println("\t\t\t"+a + " " + "Laptop Asus  Berhasil Dipesan dengan Total Harga " + jumlah);
                                hasil = hasil + jumlah;
                                arr[d]="\t\t\t|"+ a+ "\t\t||\tLaptop Asus\t    || "+hasil+"  \t\t\t\t||";
                            } else if (pilih == 4) {
                                jumlah = 13000000 * a;
                                System.out.println("\t\t\t"+a + " " + "Laptop Lenovo Yoga  Berhasil Dipesan dengan Total Harga " + jumlah);
                                hasil = hasil + jumlah;
                                arr[d]="\t\t\t|"+ a+ "\t\t||\tLaptop Lenovo Yoga\t     || "+hasil+"  \t\t\t\t||";
                            } else {
                                System.out.println("\t\t\tLaptop Lenovo Yoga");
                            }
                        }d=d+1;
                        System.out.println("\t\t\t+---------------------------------------------------------------------------------------------+");
                        System.out.println("\t\t\tJika Ingin Membeli Laptop Lagi, Tekan 1:");
                        ulang=input.nextInt();
                    }while(ulang==1);
                }else if(pilih==2){
                    menu_1.Komputer(); //interface
                    do{
                        System.out.println("\t\t\tSilahkan Memilih NO Komputer untuk Memesan :");
                        pilih=input.nextInt();
                        if(pilih>4){
                            System.out.println("Inputan anda kurang valid, mohon coba lagi");
                        }else {
                            System.out.println("\t\t\tAnda Ingin Memesan Unit Komputer? :");
                            a = input.nextInt();
                            if (pilih == 1) {
                                jumlah = 10500000 * a;
                                System.out.println("\t\t\t"+a + " " + "PC HP Berhasil Dipesan dengan Total Harga " + jumlah);
                                hasil = hasil + jumlah;
                            } else if (pilih == 2) {
                                jumlah = 8000000 * a;
                                System.out.println("\t\t\t"+a + "PC ASUS Berhasil Dipesan dengan Total Harga " + jumlah);
                                hasil = hasil + jumlah;
                            } else if (pilih == 3) {
                                jumlah = 12000000 * a;
                                System.out.println("\t\t\t"+a + " " + "PC Lenovo Berhasil Dipesan dengan Total Harga " + jumlah);
                                hasil = hasil + jumlah;
                            } else if (pilih == 4) {
                                jumlah = 6500000* a;
                                System.out.println("\t\t\t"+a + " " + "PC LG  Berhasil Dipesan dengan Total Harga " + jumlah);
                                hasil = hasil + jumlah;
                            } else {
                                System.out.println("\t\t\tInputan anda kurang valid, mohon coba lagi");
                            }
                        }
                        System.out.println("\t\t\t+---------------------------------------------------------------------------------------------------+");
                        System.out.println("\t\t\tJika Ingin Memesan Komputer Lagi, Tekan 1: ");
                        ulang=input.nextInt();
                    }while(ulang==1);
                }else if(pilih==3){
                    menu_1.Printer(); //interface
                }else if(pilih==4){
                    System.out.println("hallo");
                }else{
                    System.out.println("\t\t\t Menu Inputan Anda Tidak valid!, Mohon Coba Lagi");
                }
                System.out.println("\t\t\t+------------------------------------------------------------------------------------+");
                System.out.println("\t\t\tJika Ingin Memesan Ulang Tekan 4:");
                ulang=input.nextInt();
            }while(ulang==4);
            System.out.println("\t\t\t+------------------------------------------------------------+");
            System.out.println("\t\t\t|jumlah     ||   Nama_Pesanan  ||Total Harga Setiap Pesanan ||");
            System.out.println("\t\t\t+------------------------------------------------------------+");
            for (b=0; b<=d; b++){
                if(arr[b]==null){
                    System.out.println(" ");
                }else {
                    System.out.println(arr[b]);
                }
            }
            System.out.println("\t\t\t+----------------------------------------------------------+");
            System.out.println("\t\t\tTotal Belanja :\t                "+ hasil+"           ||");
            System.out.println("\t\t\t+----------------------------------------------------------+");
            if(hasil > 20000000) {
                System.out.println("\t\t\tAnda Mendapat potongan harga 500000 Karena Total Belanja Anda Lebih Dari 20000000");
                jumlah = hitung.total_1(hasil);
                System.out.println("\t\t\tTotal Belanja Anda setelah di diskon :" + jumlah);
            }else if(hasil >25000000){
                System.out.println("\t\t\tAnda Mendapat potongan harga 800000 Karena Total Belanja Anda Lebih Dari 25000000");
                jumlah = hitung.total_2(hasil);
                System.out.println("\t\t\tTotal Belanja Anda setelah di diskon :" + jumlah);
            }else if(hasil >30000000){
                System.out.println("\t\t\tAnda Mendapat potongan harga 1000000 Karena Total Belanja Anda Lebih Dari 30000000");
                jumlah = hitung.total_3(hasil);
                System.out.println("\t\t\tTotal Belanja Anda setelah di diskon :" + jumlah);
            }else{
                jumlah=hitung.total_4(hasil);
                System.out.println("\t\t\tTotal Belanja Anda setelah di diskon :" + jumlah);
            }
            do{
                System.out.println("\t\t\tMasukan Jumlah Uang yang dibayarkan :");
                a=input.nextInt();

                if (a < jumlah) {
                    System.out.println("\t\t\tMohon maaf Jumlah Uang Anda Tidak Cukup");
                    System.out.println("\t\t\tSilahkan Bayar Ulang :");
                    c = 1;
                } else {
                    c=0;
                    hitung.total(a, jumlah);
                    System.out.println("\t\t\t+-------------------------------------------+");
                    System.out.println("\t\t\tKembalian Anda :" + hitung.total(a, jumlah));
                    System.out.println("\t\t\t+-------------------------------------------+");
                    System.out.println("\t\t\tTerimakasi Telah Berbelanja di B.P.KOMPUTER");
                }
            }while(c==1);
        }
    }

    class belanja extends Abstrakk{
        public int a,s;
        @Override
        public int total(int a, int b){
            int hasil;
            hasil=a-b;
            return hasil;
        }
        public int total_1(int a){
            int hasil;
            hasil=0;
            hasil=a-500000;
            return hasil;
        }
        public int total_2(int a){
            int hasil;
            hasil=0;
            hasil=a-800000;
            return hasil;
        }public int total_3(int a){
            int hasil;
            hasil=0;
            hasil=a-1000000;
            return hasil;
        }
        public int total_4(int a){
            int hasil;
            hasil=0;
            hasil=a-0;
            return hasil;
        }
    }

