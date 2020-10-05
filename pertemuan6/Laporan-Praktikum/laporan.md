# Laporan Praktikum Pertemuan 6

## Nama : Luluk Mufida

## Kelas : TI-2C

## Absen/NIM : 11/1941720052

Percobaan 1

Output Program

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan6/img/p1.JPG)

Pertanyaan 1

Code

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan6/img/codeP1.P1.JPG)

Output

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan6/img/outP1.P1.JPG)

Pertanyaan 2

Penyebab terjadinya error pada kode program percobaan 1 dikarenakan belum memberikan sintaks pewarisan berupa extends dari ClassA yang diberikan pada ClassB.

Percobaan 2

Output Program

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan6/img/p2.JPG)

Pertanyaan 1

Code

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan6/img/codeP2.P1.JPG)

Output

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan6/img/outP2.P1.JPG)

Pertanyaan 2
Penyebab terjadinya error pada percobaan 2 hampir sama dengan percobaan 1 karen belum diberi sintaks pewarisan dan ada penyebab lain dikarenakan modifier dari attribute yang ada di ClassA merupakan private maka harus diberi sintas super.namaAttribute untuk mengakses attribute dari class tersebut.

Percobaan 3

Output Program

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan6/img/p3.JPG)

Pertanyaan 1

fungsi dari sintaks tersebut adalah untuk mendeklarasikan attribute phi dan juga r yang ada di Class Bangun karena sebelumnya belum di deklarasikan di dalamnya.

Pertanyaan 2

Fungsi dari sintaks super dan this pada code tersebut adalah untuk memanggil attribute yang telah dideklarasikan sebelumnya, super untuk class parent dan this untuk class itu sendiri.

Pertanyaan 3

Karena phi dan r telah diinisialisasikan pada class parent yakni class Bangun dengan menggunakan modifier protected yang bisa diakses untuk subclass dari class tersebut sehingga pada class Tabung yang merupakan subclass dari class Bangun bisa mengakses phi dan r.

Percobaan 4

Output Program

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan6/img/p4.JPG)

Pertanyaan 1

Yang merupakan Superclass adalah ClassA dan ClassB karena kedua class tersebut mewariskan kepada subclassnya masing masing yakni ClassB dan Class C
dan yang merupakan subclass adalah ClassB dan juga ClassC karena kedua class tersebut mendapatkan pewarisan dari masing masing superclassnya yakni ClassA dan ClassB.
disini peran ClassB memang menjadi dua karena class ini mewarisi dan juga diwarisi.

Pertanyaan 2

Code

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan6/img/codeP4.P2.JPG)

Output

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan6/img/outP4.P2.JPG)

Pertanyaan 3

Code

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan6/img/codeP4.P3.JPG)

Output

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan6/img/outP4.P3.JPG)

Error yang terjadi pada code program pertanyaan 3 ini dikarenakan super() dipanggil setelah statement ClassC yang harusnya urut dimulai dari Superclass terlebih dahulu sehingga program akan error karena dianggap rancu dalam urutan pemanggilannya.

Pertanyaan 4

fungsi super() pada ClassC diigunakan untuk memanggil superclass dari class tersebut yakni ClassB yang extends ke ClassA sehingga outputnya akan sama saja karena hal tersebut berarti relasi yang sudah diwakili dengan sintaks extends. dalam catatan jika dipanggil sebelum statement dari tersebut(ClassC).
