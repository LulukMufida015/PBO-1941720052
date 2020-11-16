# Laporan Percobaan Praktikum Pertemuan 12

## Nama : Luluk Mufida

## Kelas : TI-2C

## Absen/NIM : 11/1941720052

Percobaan 1

Output Program

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan12/img/p1.JPG)

Pertanyaan Percobaan 1

1.  Class apa sajakah yang merupakan turunan dari class Employee?

Jawab : InternshipEmployee dan PermanentEmployee

2.  Class apa sajakah yang implements ke interface Payable?

Jawab : PermanentEmployee dan ElectricityBill

3.  Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee) dan objek iEmp (merupakan objek dari class InternshipEmploye) ?

jawab : Karena kedua class tersebut turunan/extends terhadap class Employee yang dideklarasikan bahwa e adalah Employee.

4.  Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi denganobjekpEmp  (merupakan objek dari class PermanentEmployee) dan objek eBill (merupakan objek dari class ElectricityBill) ?

Jawab : Karena kedua class tersebut mengimplementasikan class interface Payable yang dideklarasikan p.

5.  Coba tambahkan sintaks: p = iEmp; e = eBill;

pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang 
menyebabkan error?

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan12/img/p5.pc1.JPG)

Jawab : Terjadi error karena objek iEmp dari class IntershipEmployee tidak mengimplementasikan class interface Payable p dan objek eBill objek dari class ElectricityBill bukan turunan/extends dari class Employee e.

6.  Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme!

Jawab : Polimorfisme merupakan kemampuan suatu objek untuk dapat memiliki banyak bentuk objek. Dengan catatan kelas dari bentuk objek tersebut masih ada hubungan dengan kelas objek misal extends atau implements.

Percobaan 2

Output Program

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan12/img/p2.JPG)

Pertanyaan Percobaan 2!

1.  Perhatikan class Tester2 di atas, mengapa pemanggilan e.getEmployeeInfo()  pada  baris  8  dan
pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?

Jawab : Karena pada pemanggilan e.getEmployeeInfo() merupakan pemanggilan method virtual sehingga bisa memanggil method getEmployeeInfo() yang ada pada kelas permanentEmployee. Sehingga hasil kedua pemanggilan sama.

2.  Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai pemanggilan  method  virtual  (virtual  method  invication),  sedangkan pEmp.getEmployeeInfo() tidak?

Jawab : Karena pemanggilan tersebut merupakan pemanggilan overriding method dari suatu objek polimorfisme. Saat compile time, compiler akan mengenali method getEmployeeInfo() yang akan dipanggil adalah method getEmployeeInfo() yang ada di class Employee, karena objek e bertipe Employee. Tetapi saat dijalankan (run time), maka yang dijalankan oleh JVM justru method getEmployeeInfo() yang ada di class Deer. Akan berbeda halnya jika pemanggilan method getEmployeeInfo() dilakukan dari objek pEmp (bukan objek polimorfisme), maka method getEmployeeInfo() yang dikenali saat compile time oleh compiler dan yang dijalankan saat runtime oleh JVM adalah sama-sama method getEmployeeInfo() yang ada di class PermanentEmployee (karena objek pEmp dideklarasikan dari class PermanentEmployee).

3.  Jadi apakah yang dimaksud dari virtual method invocation? Mengapa disebut virtual? 

Jawab : Virtual method invocation adalah pemanggilan overriding method dari suatu objek polimorfisme. Disebut virtual karena antara method yang dikenali oleh compiler dan method yang dijalankan oleh JVM berbeda.

Percobaan 3!

Pertanyaan Percobaan 3!

1.  Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objekobjek dengan tipe yang berbeda, yaitu objek pEmp (objek dari PermanentEmployee) dan objek iEmp (objek dari InternshipEmployee) ?

Jawab : hal tersebut dikarenakan menggunakan konsep  polimorfisme,  maka  variabel  array  bisa  dibuat heterogen.  Artinya  di  dalam  array  tersebut  bisa  berisi  berbagai  macam  objek 
yang berbeda. dan array tersebut menggolongkan objek yang extends pada clas employee e.

2.  Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dariPermanentEmployee) dan objek eBill (objek dari
ElectricityBilling) ?

Jawab : Sama dengan pertanyaan satu namun disini menggolongkan untuk class yang mengimplementasikan class interface Payable p.

3.  Perhatikan baris ke-10, mengapa terjadi error? 

Jawab : Karena objek eBill dibuat dari kelas ElectricityBill yang tidak memiliki keterkaitan hubungan apapun dengan kelas Employee. Sedangkan objek e2 dibuat dari kelas Employee. Sehingga objek eBill tidak bisa masuk ke dalam array e2.

Percobaan 4!

Output Program

![output](https://github.com/LulukMufida015/PBO-1941720052/blob/master/pertemuan12/img/p4.JPG)

Pertanyaan Percobaan 4!

1.  Perhatikan  class Tester4  baris  ke-7  dan  baris  ke-11,  mengapa pemanggilan ow.pay(eBill)  dan ow.pay(pEmp)  bisa  dilakukan, padahal jika diperhatikan method pay() yang ada di dalam class Owner memiliki argument/parameter  bertipe  Payable? Jika diperhatikan  lebih  detil  eBill  merupakan  objek  dari ElectricityBill  dan  pEmp merupakan  objek  dari PermanentEmployee?

Jawab: Dikarenakan kedua class tersebut mengimplementasikan class interface Payable itu sebabnya parameter trsebut masih terkait dengan kedua objek.

2.  Jadi apakah tujuan membuat argument bertipe Payable pada method pay() yang ada di dalam class Owner?

Jawab : Untuk mengetahui objek mana yang ingin dipanggil pada method pay.

3.  Coba pada baris terakhir method main() yang ada di dalam class Tester4 ditambahkan perintah ow.pay(iEmp); 
Mengapa terjadi error?

jawab : Karena pada objek iEmp dari class InternshipEmployee tidak mengimplementasikan class interface Payable sedangkan pada fugsi pay memiliki parameter Payable.

4.  Perhatikan class Owner, diperlukan untuk apakah sintaks p instanceof ElectricityBill pada baris ke-6 ?

Jawab : untuk mengecek apakah objek p merupakan hasil instansiasi dari suatu class ElectricityEmployee.

5.  Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek disana (ElectricityBill  eb  =  (ElectricityBill)  p) diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke 
dalam objek eb yang bertipe ElectricityBill ?

Jawab : Iya diperlukan. Karena untuk mengubah tipe data objek yang berupa electricityBill menjadi tipe data sesuai dengan superclass yaitu Payable.




