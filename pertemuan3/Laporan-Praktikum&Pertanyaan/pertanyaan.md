# Laporan Jawaban Pertanyaan Pertemuan 3

## Nama : Luluk Mufida

## Kelas : TI-2C

## Absen/NIM : 11/1941720052

3.3 Pertanyaan

1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”? 

    Jawab : karena attribute kontakOn diawal diset false yang artinya mesin dalam keadaan off namun jika sudah diset dengan method nyalakanMesin maka akan berstatus on.

2. Mengapa atribut kecepatan dan kontakOn diset private?	

    jawab: Karena atribut tersebut akan digunakan pada class Motor saja dan untuk mengakses/mengubah di class lain bisa memanggil method yang telah dibuat untuk mengubah kecepatan dan status on/off nya. 	

3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!



3.6 Pertanyaan – Percobaan 3 dan 4

1. Apa yang dimaksud	getter dan setter?

    Jawab :  getter dan setter merupakan syntax yang digunakan untuk memberi/mengubah(menyetting) dan mengambil nilai dari sebuah atribut. Sehingga ketika kita akan memberi nilai pada attribut kita bisa memanggil method set dan untuk memanggil yang sudah diisi di set menggunakan method get.

2. Apa kegunaan dari method	getSimpanan()?

    Jawab : method getSimpanan digunakan untuk mengambil nilai dari simpanan yang terakhir kali dioperasikan bisa dibilang sebagai wadah untuk menampung berapa nilai terakhir pada attribut simpanan yang kemudian akan diambil untuk ditampilkan pada user.

3. Method apa yang digunakan untuk menambah saldo?
    Jawab : method setor().

4. Apa yang dimaksud konstruktor?

    Jawab : method khusus yang akan dijalankan secara otomatis pada saat sebuah objek dibuat (instansiasi), yakni ketika perintah “new” dijalankan.

5. Sebutkan aturan dalam membuat konstruktor?
    Jawab : 
    - nama harus sama dengan nama class
    - tidak memiliki tipe data return
    - Konstruktor tidak boleh menggunakan modifier abstract, static, final, dan synchronized

6. Apakah boleh konstruktor bertipe	private?

    Jawab :  boleh

7. Kapan	menggunakan parameter dengan passing parameter?
    
    Jawab : Ketika sebuah class/ method memiliki parameter maka ketika melakukan pemanggilan harus melakukan passing parameter.

8. Apa perbedaan atribut class dan instansiasi atribut?

    Jawab : atribut class digunakan sebagai penamaan properti dari kelas tersebut atau bisa dibilang sebagai nama komponen yang akan dirangkai. Sedangkan instansiasi atribut digunakan untuk pembuatan atau pendeklarasian atribut agar dapat digunakan oleh objek yang telah dibuat.

9. Apa perbedaan class method dan instansiasi method?	
    
    Jawab : class method  fungsi  yang didefinisikan di dalam suatu class. Sedangkan instansiasi method merupakan pembuatan atau pendeklarasian method agar dapat digunakan untuk objek yang telah dibuat.

