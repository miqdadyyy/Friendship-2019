#!/usr/bin/python3

def encrypt(x):
	plain = list(x)
	enc = ""
	for i in range(len(plain)):
		y = (ord(plain[i])^0x6E)+3
		c = "Jatim"
		z = y*c
		enc += z
		if i != len(plain)-1:
			enc += "_"
	return enc


print ("----------------------------------\n")
print ("Selamat Datang di Jatim Encrypter\n")
print ("----------------------------------\n")

plain_text = input("Plain Text : ")
print ("Result : \n")

print(encrypt(plain_text))
