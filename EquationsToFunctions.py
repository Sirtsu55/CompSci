from operator import eq
import re
import string
import expressionparser as ep
def split(mystr):
    return re.split("([+-/*^()])", mystr.replace(" ", ""))

functions = []
equation = input("Enter equation:")


print(i)