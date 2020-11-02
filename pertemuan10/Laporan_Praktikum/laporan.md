# Laporan Percobaan Praktikum Pertemuan 10

## Nama : Luluk Mufida

## Kelas : TI-2C

## Absen/NIM : 11/1941720052

Output Program

Pertanyaan diskusi!

Bolehkah  apabila  sebuah  class  yang  meng-extend  suatu  abstract  class  tidak 
mengimplementasikan method abstract yang ada di class induknya? Buktikan! 

Jawab: Tidak Boleh, karena subclass akan terjadi error dan meminta untuk melakukan override terhadap kelas parentnya.

Pembuktian

Pertanyaan!

1. Berikan penjelasan terkait tentang jalannya program diatas

Jawab: Program diatas dimulai dari membuat class Hewan yang memiliki method abstract yang diberi nama bergerak() kemuadian class tersebut memiliki subclass Kucing dan Ikan dan kedua kelas tersebut extends dengan class Hewan yang merupakan class abstract oleh sebab itu class Hewan akan meng-override methodnya kepada kedua subclass. Kemudian terdapat class orang yang berisi nama dan juga method peliharaanHewan untuk memanggil method yang ada di class hewan yakni bergerak yang merujuk pada dua class dan hal tersebut diisikan pada parameter method itu, serta terdapat method untuk menampilkan info data yang dipanggil yakni ajakPeliharaanJalanJalan(). Terakhir terdapat class Program yang berisi main untuk membuat sebuah objek dari subclass dan memanggil method dari masing masing class tersebut lalu memanggil method ajakPeliharaanJalanJalan() untuk mencetak info yang didapat.

2. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika method
bergerak() diubah menjadi method abstract!

Jawab: Pada class Hewan method bergerak sudah menjadi method abstract dan tidak terjadi error karena merupakan class abstract namun jika yang diubah adalah method bergerak dari class Kucing dan Ikan maka akan terjadi error karena class tersebut bukan class abstract melainkan class turunan dari class abstract.

Kompilasi


3. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika tidak dilakukan 
overriding terhadap method bergerak()

jawab: Maka akan terjadi error pada class tersebut karena class turunan dari class abstract harus mewarisi atau melakukan overriding dari method parentnya.

Kompilasi

4. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika abstract method
bergerak()yang dideklarasikan dalam Class Ikan 

Jawab: Maka akan terjadi error pada class Ikan karena merupakan class turunan dan bukan berupa class abstract.

Kompilasi