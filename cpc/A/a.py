def main():
    T = int(input())
    for i in range(0, T):
        s = solve()
        print('Kasus #'+str((i+1))+': '+s)


def solve():
    s = input()
    return str(int(eval(s)))

main()
