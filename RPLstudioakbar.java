/* 
Tugas tiket CINEMA pertemuan 6
muhammad Akbar Permanaatmaja
NIM 2204074
RPL 4B 
*/

public class RPLstudioakbar {
    String nama_film;
    String jam_tayang;
    double rating_film;

    public RPLstudioakbar(String newNama_film, String newjam_tayang, double newrating_film) {
        this.nama_film = newNama_film;
        this.jam_tayang = newjam_tayang;
        this.rating_film = newrating_film;

    }

    // setter
    public void setNama_film(String newNama_film) {
        this.nama_film = newNama_film;
    }

    public void setjam_tayang(String newjam_tayang) {
        this.jam_tayang = newjam_tayang;
    }

    public void setrating_film(double newrating_film) {
        this.rating_film = newrating_film;
    }

    // Getter
    public String getNama_film() {
        return this.nama_film;
    }

    public String getjam_tayang() {
        return this.jam_tayang;
    }

    public double getrating_film() {
        return this.rating_film;
    }

    public String toString() {
        String str = "Nama Film   : " + this.getNama_film() + "\n" +
                "Jam Tayang  : " + this.getjam_tayang() + "\n" +
                "Rating       : " + this.getrating_film();
        return str;
    }

    static void test() {
        RPLstudioakbar t = new RPLstudioakbar("The New Light", "12:00 WIB", 8.7);
        System.out.println("RPLStudioakbar menyediakan film :");
        System.out.println(t.getNama_film());
        System.out.println(t.getjam_tayang());
        System.out.println(t.getrating_film());
    }

    // Superclass Regular2D
    public class Regular2D extends RPLstudioakbar {
        private int jumlahTiket;
        public int tikettersedia = 40;
        public int hargatiket = 30000;

        public Regular2D(String newNama_film, String newjam_tayang, double newrating_film, int jumlahTiket) {
            super(newNama_film, newjam_tayang, newrating_film);
            this.jumlahTiket = jumlahTiket;
        }

        public int getJumlahTiket() {
            return jumlahTiket;
        }

        public void setJumlahTiket(int jumlahTiket) {
            this.jumlahTiket = jumlahTiket;
        }

        public double hitungTotalHarga() {
            return jumlahTiket * hargatiket; // Harga tiket Regular 2D
        }
    }

    // Superclass Regular3D
    public class Regular3D extends RPLstudioakbar {
        private int jumlahTiket;

        public Regular3D(String newNama_film, String newjam_tayang, double newrating_film, int jumlahTiket) {
            super(newNama_film, newjam_tayang, newrating_film);
            this.jumlahTiket = jumlahTiket;
        }

        public int getJumlahTiket() {
            return jumlahTiket;
        }

        public void setJumlahTiket(int jumlahTiket) {
            this.jumlahTiket = jumlahTiket;
        }

        public double hitungTotalHarga() {
            return jumlahTiket * 50000; // Harga tiket Regular 3D
        }
    }

    // Superclass Velvet
    public class Velvet extends RPLstudioakbar {
        private int jumlahTiket;

        public Velvet(String newNama_film, String newjam_tayang, double newrating_film, int jumlahTiket) {
            super(newNama_film, newjam_tayang, newrating_film);
            this.jumlahTiket = jumlahTiket;
        }

        public int getJumlahTiket() {
            return jumlahTiket;
        }

        public void setJumlahTiket(int jumlahTiket) {
            this.jumlahTiket = jumlahTiket;
        }

        public double hitungTotalHarga() {
            return jumlahTiket * 100000; // Harga tiket Velvet
        }
    }

    public static void main(String[] args) {
        test();
        System.out.println("==========================");

        // Buat objek RPLstudioakbar
        RPLstudioakbar studio = new RPLstudioakbar("The New Light", "12:00 WIB", 8.7);

        // Membuat objek dari Regular2D
        Regular2D regular2D = studio.new Regular2D("The New Light", "12:00 WIB", 8.7, 3);
        // Menampilkan informasi Regular2D
        System.out.println("Informasi Regular 2D:");
        System.out.println(regular2D.toString());
        System.out.println("Jumlah Tiket: " + regular2D.getJumlahTiket());
        System.out.println("Total Harga: " + regular2D.hitungTotalHarga());

        // Membuat objek dari Regular3D
        Regular3D regular3D = studio.new Regular3D("The New Light", "12:00 WIB", 8.7, 10);
        // Menampilkan informasi Regular3D
        System.out.println("\nInformasi Regular 3D:");
        System.out.println(regular3D.toString());
        System.out.println("Jumlah Tiket: " + regular3D.getJumlahTiket());
        System.out.println("Total Harga: " + regular3D.hitungTotalHarga());

        // Membuat objek dari Velvet
        Velvet velvet = studio.new Velvet("The New Light", "12:00 WIB", 8.7, 1);
        // Menampilkan informasi Velvet
        System.out.println("\nInformasi Velvet:");
        System.out.println(velvet.toString());
        System.out.println("Jumlah Tiket: " + velvet.getJumlahTiket());
        System.out.println("Total Harga: " + velvet.hitungTotalHarga());

    }

}
