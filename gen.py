import threading
# Python program to display all the prime numbers within an interval


def findprimes(lower, upper):
    for num in range(lower, upper + 1):
        # all prime numbers are greater than 1
        if num > 1:
            for i in range(2, num):
                if (num % i) == 0:
                    break
            else:
                print(num)


findprimes(3, 1000)


for i in range(0, 10):
    t = threading.Thread(target=findprimes, args=(10, 100))
    t.start()
    