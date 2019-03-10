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

def decrypt():
    x = list("_eZ`tMab.X*lXA)pX<kriM)XpHkDv")
    res = ''
    for i in range(len(x)):
        c = ord(x[i]) + 10
        b = c * 2
        a = b - 6
        z = a / 2
        res = res + chr(int(z))
    return res

print ("---Shisou Apps---\n")
print ("-----------------\n")
# plain = input("Plain text : ")
print ("Result : \n")
print (decrypt())
# print (system(plain))
