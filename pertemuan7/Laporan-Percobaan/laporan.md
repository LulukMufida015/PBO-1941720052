# Laporan Percobaan Praktikum Pertemuan 7

## Nama : Luluk Mufida

## Kelas : TI-2C

## Absen/NIM : 11/1941720052

PERCOBAAN 1

Output program

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan7/imgOutput/p1.JPG)

1. Sebutkan class mana yang termasuk super class dan sub class dari percobaan 1 diatas!

Jawab : superclass : Karyawan(), subclass: Manager(), Staff().

2. Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain?

Jawab : extends

3. Perhatikan kode program pada class Manager, atribut apa saja yang dimiliki oleh class 
tersebut? Sebutkan atribut mana saja yang diwarisi dari class Karyawan!

Jawab : attribute dari class Manager : tunjangan, attribute dari pewarisan Karyawan : nama, alamat, jenisKelamin, umur, gaji.

4. Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class 
Manager!

Jawab: kata kunci super tersebut digunakan untuk memanggil attribute gaji dari superclass.

5. Program pada percobaan 1 diatas termasuk dalam jenis inheritance apa? Jelaskan 
alasannya!

Jawab : Termasuk Hierarchical Inheritance karena pewarisan yang terjadi yakni sebuah kelas memiliki lebih  dari  satu  kelas  turunan  ( subclass)  atau  dengan  kata  lain,  lebih  dari  satu  kelas  turunan memiliki kelas induk yang sama.

PERCOBAAN 2

Output Program 

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan7/imgOutput/p2.JPG)

1. Berdasarkan class diatas manakah yang termasuk single inheritance dan mana yang termasuk multilevel inheritance?

Jawab: single inheritance : Karyawan(), multilevel inheritance: Staff().

2. Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Staff!

Jawab: attribute StaffTetap : golongan dan asuransi, attribute StaffHarian: jmlJamKerja, attribute pewarisan Staff: lembur, potongan.

3. Apakah fungsi potongan program berikut pada class StaffHarian

Jawab : Fungsi dari potongan code program tersebut adalah untuk menginisialisasi semua attribute yang ada di dalam superclass(Staff) dari class StaffHarian.

4. Apakah fungsi potongan program berikut pada class StaffHarian 

Jawab : Fungsi dari code program tersebut adalah untuk mencetak method tampilDataStaff yang ada di superclass(Staff) di class StaffHarian.

5. Perhatikan kode program dibawah ini yang terdapat pada class StaffTetap.
Terlihat dipotongan program diatas atribut gaji, lembur dan potongan dapat diakses 
langsung. Kenapa hal ini bisa terjadi dan bagaimana class StaffTetap memiliki atribut gaji, 
lembur, dan potongan padahal dalam class tersebut tidak dideklarasikan atribut gaji, lembur, 
dan potongan?

Jawab: Karena class StaffTetap telah mewarisi semua attribute dari class Staff yang didapat dari class Karyawan maka tidak perlu lagi memamnggilnya dengan super karena sudah merujuk pada class Staff.