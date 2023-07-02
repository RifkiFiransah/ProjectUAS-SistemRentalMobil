package projectuas;
import java.io.*;

abstract class Rental {
    final String title = "RENTAL MOBIL SIIUU";
    abstract void detailMobil();
    abstract void inputPengguna(String nama, int noTelp, int pilihan, String tglRental, String tglKembali, int lama);
}

class Mobil extends Rental {
    protected String[][] dataMobil = {
        {"Honda", "Brio", "4", "300000"},
        {"Suzuki", "Ertiga", "6", "50000"},
        {"Toyota", "Fortuner", "6", "800000"},
        {"Daihatsu", "Pajero", "6", "700000"}
    };
    
    public Mobil(String name, String alamat){
        System.out.println(" Nama\t\t: "+name);
        System.out.println(" Alamat\t\t: "+alamat);
    }
    
    public void fasilitas(){
        String[] fslts = {"AC", "Wifi", "Music", "Tv", "Radio", "Bagasi"};
        System.out.println(" Fasilitas \t:");
        for(int i = 0; i < fslts.length; i++){
            System.out.println(" \t\t  "+ (i+1)+". "+fslts[i]);
        }
        System.out.println("--------------------------------------------------------");
    }
    
    @Override
    void detailMobil(){
        System.out.println(" \t\t\t DATA MOBIL");
        System.out.println(" _______________________________________________________");
        for(int i = 0; i < this.dataMobil.length; i++){
            System.out.println(" No\t: "+(i+1));
            for(int k = 0; k < this.dataMobil.length; k++){
                switch(k){
                    case 0: 
                        System.out.println(" Nama\t: "+this.dataMobil[i][k]);
                      break;
                    case 1:
                        System.out.println(" Type\t: "+this.dataMobil[i][k]);
                        break;
                    case 2:
                        System.out.println(" Kursi\t: "+this.dataMobil[i][k]);
                        break;
                    case 3:
                        System.out.println(" Harga\t: "+this.dataMobil[i][k]);   
                        break;
                }
            }
        System.out.println("________________________________________________________");
        }
    }
    
    @Override
    void inputPengguna(String nama, int noTelp, int pilihan, String tglRental, String tglKembali, int lama){
        int harga;
        String mobil;
        switch(pilihan) {
            case 1 :
                mobil = "Brio";
                harga = 300000;
                break;
            case 2:
                mobil = "Ertiga";
                harga = 500000;
                break;
            case 3:
                mobil = "Fortuner";
                harga = 800000;
                break;
            default:
                mobil = "Pajero";
                harga = 700000;
                break;
        }
        System.out.println(" -------------------------------------------------------");
        System.out.println(" \t\t Detail Pembayaran");
        System.out.println(" -------------------------------------------------------");
        System.out.println(" Nama Lengkap \t\t: "+nama);
        System.out.println(" No Telp\t\t: "+noTelp);
        System.out.println(" Type Mobil\t\t: "+mobil);
        System.out.println(" Tanggal Rental\t\t: "+tglRental);
        System.out.println(" Tanggal Kembali\t: "+tglKembali);
        System.out.println(" Harga Sewa Mobil\t: Rp."+harga);
        System.out.println(" Lama Rental\t\t: "+lama+" Hari");
        int hargaTotal = harga * lama;
        System.out.println("\n Total Harga Rental \t: Rp."+hargaTotal);
    }
}

class main {
    public static void main(String[] args) throws IOException{
        System.out.println("\t\t INFORMASI RENTAL MOBIL");
        System.out.println("--------------------------------------------------------");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String pt = "PT. Kharisma Car Safety";
        String alamat = "Mulya Jaya, Cimahi, Kuningan";
        Mobil mbl = new Mobil(pt, alamat);
        
        mbl.fasilitas();
        mbl.detailMobil();
        
        System.out.print(" \t\t Form Sewa Mobil\n");
        
        System.out.print(" Nama\t\t\t: ");
        String nama = in.readLine();
        
        System.out.print(" No Telp\t\t: ");
        int noTelp = Integer.parseInt(in.readLine());
        
        System.out.print(" Pilhan Mobil (angka)\t: ");
        int pilihan = Integer.parseInt(in.readLine());
        
        System.out.print(" Tanggal Rental\t\t: ");
        String tgl_rental = in.readLine();
        
        System.out.print(" Tanggal Kembali\t: ");
        String tgl_kembali = in.readLine();
        
        System.out.print(" Lama Rental\t\t: ");
        int lama = Integer.parseInt(in.readLine());
        System.out.print(" \n");
        
        mbl.inputPengguna(nama, noTelp, pilihan, tgl_rental, tgl_kembali, lama);
    }
}