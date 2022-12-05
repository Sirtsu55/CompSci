inp = input()
n, m = inp.split(" ")
n = int(n)
m = int(m)

count = 0
for i in range(0, n):
    line = input()
    if(line.count("*") == 2):
        
        s = line.find("*")
        e = line.find("*", s+1)
        
        l = line[s:e]

        c = l.count("@")
        count += c

print(count)            
            
