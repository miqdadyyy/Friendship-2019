### Soal
Bantu Ibu Susi!

Ibu Susi Pujiastuti sedang membuat mega proyek bernama fungsi laut dan ikan bagi kemaslahatan Indonesia. Namun, ia lupa password yang perlu dimasukkan untuk membuka mega proyek tersebut! Sebagai Insan Terbaik Cyber Security Indonesia, bantu Ibu Susi memecahkan sistem fungsi mega proyek.

[funct64](../assets/soal/funct64)

### Langkah - langkah
1. Kita check file dan memiliki extensi ELF64 eksekusi untuk linux, setelah itu lakukan strings dan grep flag ternyata tidak dapat apa2 :( .  
  ![](../assets/CrackMe v2.0_step_1.png)
2. Kita coba untuk run, tetapi meminta sebuah string password saat eksekusi lalu muncul response TRY HARDER
3. Saat dicoba ltrace ternyata langsung keluar :)

![](../assets/CrackMe v2.0.png)

```
flag{t0O_MuNcH_FUNct1on_C7f}
```
