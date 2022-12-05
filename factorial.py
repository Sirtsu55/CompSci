from math import factorial

inp = input()


count = inp.split(" ")
n = 0
for i in range(0, 10):
    count[i] = int(count[i])
    n += count[i]

def checkIfCorrect(f : str) -> bool:
    isNum = True
    for j in range(0, 10):
        cf = f.count(str(j))
        if(cf == int(count[j])):
            continue
        else:
            isNum = False
            break
    return isNum


imin = 0
imax = 10**5

flg = True
while flg:
    mid = (imin + imax ) // 2  
    
    f = str(factorial(mid))
    l = len(f)
    mag = n-l

    if mag > 0:
        imin = mid
    elif mag < 0:
        imax = mid
    elif mag == 0:
        
        if(checkIfCorrect(f)):
            flg = False
            print(mid)
        else:
            for i in range(-1, 2):
                f = str(factorial(mid+i))
                if(checkIfCorrect(f)): 
                    print(mid+i)
                    flg = False
        
        


