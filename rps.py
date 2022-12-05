from ast import While
import random
def GetInput():
    action = input("Rock = r, Paper = p, Scissors = s \nWhat do you select?: ")
    return action
def GetCompChosen():
    rps = ["r", "p", "s"]
    return random.choice(rps)


while True:
    imp = GetInput()
    cmp_chosen = GetCompChosen()
    if(imp == "r"):
        if(cmp_chosen == "s"):
            print(f"You won the Thing!!\nYour Input: {imp}\nComputer Input: {cmp_chosen}")

        elif(cmp_chosen == "p"):
            print(f"You Lost the Thing!!\nYour Input: {imp}\nComputer Input: {cmp_chosen}")

        else:
            print(f"Its a draw :(\nYour Input:{imp}\nComputer Input: {cmp_chosen}")
    elif(imp == "p"):
        if(cmp_chosen == "r"):
            print(f"You won the Thing!!\nYour Input: {imp}\nComputer Input: {cmp_chosen}")

        elif(cmp_chosen == "s"):
            print(f"You Lost the Thing!!\nYour Input: {imp}\nComputer Input: {cmp_chosen}")
        else:
            print(f"Its a draw :(\nYour Input: {imp}\nComputer Input: {cmp_chosen}")

    elif(imp == "s"):
        if(cmp_chosen == "p"):
            print(f"You won the Thing!!\nYour Input: {imp}\nComputer Input: {cmp_chosen}")

        elif(cmp_chosen == "r"):
            print(f"You Lost the Thing!!\nYour Input:{imp}\nComputer Input: {cmp_chosen}")

        else:
            print(f"Its a draw :(\nYour Input: {imp}\nComputer Input: {cmp_chosen}")
    else:
        print("Wrong input Try again")

