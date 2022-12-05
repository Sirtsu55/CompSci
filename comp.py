string = input()


count = {}

for i in string:

    if i not in count:
        count[i] = 1
    else:
        count[i] += 1

odd_count = 0
first_half = ""
center = ""
for i, j in count.items():

    if j % 2 != 0:
        odd_count += 1
        center = i
        
        if odd_count > 1:
            print("NO SOLUTION")
            quit()
    else:
        n = j / 2
        first_half += i * int(n)
        


print(f"{first_half}{center}{first_half[::-1]}")

