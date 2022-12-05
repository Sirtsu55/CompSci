from math import factorial


n = int(input())


numBarrier = 26

if(n>numBarrier):
    print("YES")

elif(1<n<=numBarrier):
    print("MAYBE")

else:
    print("NO")

print(len( str( factorial(123) ) ))