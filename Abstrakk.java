public abstract class Abstrakk {
        public abstract int total(int  a, int b);
        public abstract int total_1(int  a);
        public abstract int total_2(int  a);
        public abstract int total_3(int  a);
        public abstract int total_4(int  a);
        //public abstract float belanja();
    }

    interface menu{
        public void MenuUtama();
        public void Laptop();
        public void Komputer();
        public void Printer();
    }

     class toko implements menu{
        @Override
        public void MenuUtama(){
            System.out.println("\t\t\t+------------------------B.P.KOMPUTER-----------------------+");
            System.out.println("\t\t\t|1. Laptop          || Tekan 1 Jika Ingin Membeli laptop    |");
            System.out.println("\t\t\t|2. Komputer        || Tekan 2 Jika Ingin Membeli komputer  |");
            System.out.println("\t\t\t|3. Printer         || Tekan 3 Jika Ingin Membeli perinter  |");
            System.out.println("\t\t\t|4. Stop membeli    || Tekan 4 Jika Ingin Stop Membeli      |");
            System.out.println("\t\t\t+-----------------------------------------------------------+");
        }
        @Override
        public void Laptop () {
            System.out.println("\t\t\t+-------------------B.P.KOMPUTER-------------------------+");
            System.out.println("\t\t\t|1. Laptop Acer nitro 5     || Harga : Rp 12.500.000     |");
            System.out.println("\t\t\t|2. Laptop Dell             || Harga : Rp 8.600.000      |");
            System.out.println("\t\t\t|3. Laptop Asus             || Harga : Rp 4.500.000      |");
            System.out.println("\t\t\t|4. Laptop Lenovo yoga      || Harga : Rp 13.000.000     |");
            System.out.println("\t\t\t+--------------------------------------------------------+");
        }

        @Override
        public void Komputer(){
            System.out.println("\t\t\t+-------------------B.P.KOMPUTER-------------------------+");
            System.out.println("\t\t\t|1. PC HP                   || Harga : Rp 10.500.000     |");
            System.out.println("\t\t\t|2. PC ASUS                 || Harga : Rp 8.000.000      |");
            System.out.println("\t\t\t|3. PC Lenovo               || Harga : Rp 12.000.000     |");
            System.out.println("\t\t\t|4. PC LG                   || Harga : Rp 6.500.000      |");
            System.out.println("\t\t\t+--------------------------------------------------------+");
        }
        @Override
        public void Printer(){
            System.out.println("\t\t\t+-----------------B.P.KOMPUTER---------------------+");
            System.out.println("\t\t\t|1. Printer Canon   || Harga : Rp 2.300.000        |");
            System.out.println("\t\t\t|2. Printer Epson   || Harga : Rp 2.500.000        |");
            System.out.println("\t\t\t|3. Printer HP      || Harga : Rp 1.900.000        |");
            System.out.println("\t\t\t|4. Printer Samsung || Harga : Rp 2.100.000        |");
            System.out.println("\t\t\t+--------------------------------------------------+");
        }
    }

