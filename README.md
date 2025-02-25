## 

Pada laporan ini, saya mengembangkan sebuah program Java sederhana sesuai dengan 
tugas yang diberikan. Program ini memiliki beberapa fungsi utama seperti:
<li>
    Menampilkan pesan selamat datang
    Menerima masukan dari pengguna 
    Serta memberikan informasi unik tentang Java
</li>

Saya menggunakan Visual Studio Code (VS Code) sebagai editor untuk efisiensi 
pemrograman dan memudahkan eksekusi program secara langsung melalui built-in 
terminal. Program ini juga memiliki fitur opsional untuk menampilkan versi Java yang 
digunakan pengguna.

![][image1]



Hasil diatas dijalankan lewat terminal VSCode dengan menambahkan kode ANSI pada kode program seperti fakta unik, versi angka, bahkan pesan selamat datang.

Tantangan yang saya hadapi dalam membuat program ini adalah cara menyimpan fakta menggunakan array lalu mengambil salah satu kata tersebut secara acak. Masalah ini dipecahkan dengan menggunakan fungsi ``final String[] facts = {}`` yang berperan menyimpan kalimat-kalimat fakta unik dan ``Random.nextInt(int)`` untuk mengacak kalimat-kalimat, walaupun ada kemungkinan fungsi tersebut akan mengambil kata yang sama jika kita menjalankan ulang program tersebut. Tetapi karena banyak String yang ditambahkan, munculnya kata yang sama bisa berkurang.
