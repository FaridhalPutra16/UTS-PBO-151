public class Main {
    public static void main(String[] args) throws Exception {
        Tendik karyawan1 = new Tendik(101,"Paridol", "banyumas","29-Maret-2003","Laki-Laki", 2021);
        karyawan1.display();
        karyawan1.waktuLembur(20);
        karyawan1.setUangLembur(0);
        karyawan1.displaygaji();
        System.out.println();
        System.out.println();

        Dosen dosen1 = new Dosen(169, "Muhammad wahyu", "Bima","21-Juli-1970" , "Laki-Laki", 2002);
        dosen1.setNomorIndukDosen(696969);
        dosen1.setJurusan("Ekonomi pembangunan");
        dosen1.display();
        dosen1.displayDosen_Jurusan();
        dosen1.waktuLembur(6);
        dosen1.displaygaji();
    }
}