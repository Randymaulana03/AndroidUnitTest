# Android Unit Test Kalkulator Sederhana

## Deskripsi
Project ini merupakan aplikasi Android sederhana yang dibuat untuk mempelajari konsep **Unit Testing** menggunakan JUnit dan **Instrument Testing** menggunakan Espresso.

Aplikasi ini hanya memiliki fitur sederhana yaitu melakukan operasi penjumlahan dan pengurangan, dengan tujuan utama untuk memahami bagaimana proses pengujian dilakukan dalam pengembangan aplikasi Android.

---

## Tujuan
- Memahami konsep **Unit Test (Local Test)**
- Memahami konsep **Instrument Test (UI Test)**
- Mengimplementasikan pengujian menggunakan **JUnit dan Espresso**
- Memastikan logika dan interaksi aplikasi berjalan dengan baik

---

## Fitur Aplikasi
- Tombol untuk menghitung **2 + 3** (untuk pengujian intrument test)
- Menampilkan hasil perhitungan (untuk pengujian intrument test)
- Fungsi penjumlahan dan pengurangan pada class Calculator (untuk pengujian local test)

---

## Jenis Testing

### 1. Local Test (Unit Test)
Dilakukan pada class `Calculator.kt`

Test yang dibuat:
- Menguji fungsi penjumlahan
- Menguji fungsi pengurangan


---

### 2. Instrument Test (UI Test)
Dilakukan pada `MainActivity`

Test yang dibuat:
- Menguji apakah Activity dapat dijalankan
- Menguji apakah tombol dapat diklik dan menghasilkan output


---

## Cara Menjalankan Aplikasi
1. Buka project di Android Studio
2. Jalankan aplikasi ke emulator atau device
3. Klik tombol untuk melihat hasil perhitungan

---

## Cara Menjalankan Testing

### Local Test
Klik kanan pada class `CalculatorTest` → Run

### Instrument Test
Klik kanan pada class `MainActivityTest` → Run

---

## Hasil Testing
Semua test berhasil dijalankan dengan status **PASS**, yang menunjukkan bahwa:
- Logika program berjalan dengan benar
- Interaksi user interface berfungsi dengan baik

---

## Note
Aplikasi dibuat sederhana karena fokus utama dari project ini adalah memahami proses testing, bukan kompleksitas aplikasi.

---

## Author
Nama: Randy Maulana
