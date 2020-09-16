# Laporan Praktikum Pertemuan 3

## Nama : Luluk Mufida

## Kelas : TI-2C

## Absen/NIM : 11/1941720052

## Percobaan




## Tugas

1. Cobalah program dibawah ini dan	tuliskan hasil	outputnya	

2. Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada saat ditampilkan ke layar nilainya 30, jelaskan mengapa.

    Jawab : Karena pada method setAge() telah diatur bahwa jika Age lebih dari 30 maka age secara otomatis akan bernilai 30 jika kurang dari 30 maka nilai yang diset di objek akan ditampilkan.

3. Ubah program diatas agar atribut age dapat diberi nilai	maksimal 30 dan	minimal 18.

4. Pada	sebuah sistem informasi koperasi	simpan pinjam, terdapat class	Anggota yang memiliki atribut antara lain	 nomor KTP, nama, limit peminjaman, dan jumlah pinjaman. Anggota dapat meminjam	uang dengan batas limit	peminjaman	yang	ditentukan. Anggota	juga dapat mengangsur pinjaman.	Ketika	Anggota tersebut mengangsur pinjaman,	maka jumlah pinjama akan	berkurang sesuai dengan nominal	yang diangsur. Buatlah class Anggota	
tersebut, berikan atribut, method dan konstruktor sesuai dengan kebutuhan. Uji dengan TestKoperasi berikut ini untuk memeriksa apakah	class	Anggota yang anda buat telah sesuai dengan yang diharapkan.

    Jawab :
    public class Koperasi {
    private String noKTP;
    private String nama;
    private int saldo;
    private int limitPinjam = 5000000;
    private int jumlahPinjam;

    public Koperasi(String noKTP, String nama, int saldo) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.saldo = saldo;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getLimitPinjam() {
        return limitPinjam;
    }

    public int getJumlahPinjam() {
        return jumlahPinjam;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setLimitPinjam(int limitPinjam) {
        this.limitPinjam = limitPinjam;
    }

    public void setJumlahPinjam(int jumlahPinjam) {
        this.jumlahPinjam = jumlahPinjam;
    }

    
    
    public int pinjam(int pinjam){
        if (pinjam < limitPinjam){
          jumlahPinjam += pinjam;
        }
        else{
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }  
        return jumlahPinjam;
    }
    
    public int angsur(int angsur){
        jumlahPinjam -= angsur;
    return jumlahPinjam;
    }
}

5. Modifikasi soal no. 4  agar nominal yang	dapat	diangsur minimal adalah 10% dari jumlah pinjaman saat ini. Jika mengangsur kurang dari itu, maka muncul peringatan “Maaf, angsuran harus 10% dari jumlah pinjaman”.


6. Modifikasi	class	TestKoperasi,	agar	jumlah	pinjaman	dan	angsura dapat	menerima	input	dari	console.

    Membuat Scanner untuk menginputkan data

