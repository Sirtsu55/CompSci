import math

n = int(input())

ways = 0


for i in range(2, n+1):
    ways += math.factorial(i-1)


print(ways)