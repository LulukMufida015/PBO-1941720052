# Laporan Percobaan Praktikum Pertemuan 11

## Nama : Luluk Mufida

## Kelas : TI-2C

## Absen/NIM : 11/1941720052

Percobaan 1

Output Program

Pertanyaan Percobaan 1!

1. Pada  langkah  ke  9,  pada  baris  program  ke  3  terdapat  warning  pada  script  tersebut. 
Jelaskan penyebab terjadinya hal tersebut ?

Jawab : karena berada pada package yang sama

2. Pada  langkah  ke  9,  pada  baris  program  ke  3.  Apa  yang  terjadi  jika  script  tersebut 
dihilangkan? Jelaskan menurut pemahaman anda.

Jawab : Hal tersebut tidak akan mempengaruhi apapun dan tidak akan terjadi error karena baris kode tersebut memang tidak digunakan dari awal karena tidak adanya intansiasi class ICumlaude pada class main.

3. Mengapa pada langkah nomor 9 terjadi error? Jelaskan!

Jawab : Karena pada class Rektor method berparameter dengan tipe data ICumlaude sedangkan class Mahasiswa tidak mengimplementasikan interface class ICumlaude.

4. Dapatkah method  kuliahDiKampus()  dipanggil dari objek  sarjanaCumlaude  di  class
Program? Mengapa demikian?

Jawab : Bisa karena class Sarjana merupakan class turunan dari class Mahasiswa jadi method yang ada didalamnya dapat digunakan oleh class Sarjana.

5. Dapatkah method  kuliahDiKampus()  dipanggil dari parameter  mahasiswa  di method 
beriSertifikatCumlaude() pada class Rektor? Mengapa demikian?

Jawab : Bisa jika parameter pada method beriSertifikatCumlaude diubah menjadi Mahasiswa bukan Icumlaude.

6. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi 
class Program menjadi seperti berikut ini:

Jawab : Yang diubah adalah di class Mahasiswa di implementasikan class interface dengan mengosongkan method abstractnya kemudian di class Rektor parameter pada methode beriSertifikatCumlaude diganti menjadi bertipe data Mahasiswa.

Percobaan 2

Output Program

Pertanyaan Percobaan 2!

1. Pada script code interface IBerprestasi, modifikasi script tersebut sesuai dengan gambar 
dibawah ini :

Jawab : Hal tersebut akan menyebabkann error karena modifier yang dapat digunakan pada class interface hanya public.

2. Perhatikan script code dibawah ini :

Jelaskan menurut anda, mengapa hasil dari script code tersebut error ?

Jawab: Karena class Interface tidak dapat dibuat objek instance-nya dengan kata kunci new.

3.  Apabila  Sarjana  Berprestasi  harus  menjuarai  kompetisi  NASIONAL  dan 
menerbitkan artikel di jurnal NASIONAL, maka modifikasilah  class-class yang terkait 
pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat 
mawapres pada objek sarjanaCumlaude.



