#!usr/bin/python3

def system(x):
    z = list(x)
    enc = ""
    for i in range(len(x)):
        a = ord(z[i]) * 2
        b = a +  6
        c = int(b /  2)
        d = c - 10
        enc += chr(d) + "-Open Source-"
    return enc

print ("---Shisou Apps---\n")
print ("-----------------\n")
plain = input("Plain text : ")
print ("Result : \n")
print (system(plain))
