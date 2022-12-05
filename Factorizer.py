from decimal import Decimal
print("Quadratic Factorization Solver")
print("ax^2 + bx + c = 0")
a = Decimal(input("a = "))
b = Decimal(input("b = "))
c = Decimal(input("c = "))

def SolveQuadratic(a : Decimal, b : Decimal, c : Decimal):
    d = Decimal.sqrt(b**2 - 4*a*c)
    mb = -b
    denom = 2 * a

    x1 = Decimal((mb + d) / denom)
    x2 = Decimal((mb - d) / denom)

    return[x1, x2]

solutions = SolveQuadratic(a, b, c)

ratios = [solutions[0].as_integer_ratio(), solutions[1].as_integer_ratio()]

print(f"Decimal Form Solutions are x = {solutions[0]}, x = {solutions[1]}")
print(f"Fraction Form Solutions are x = {ratios[0][0]}/{ratios[0][1]}, x = {ratios[1][0]}/{ratios[1][1]}")


print("-" * 50)
print(f"Decimal Form: (x + {solutions[0]})(x - {solutions[1]})")
print(f"Fraction Form: (x + ( {ratios[0][0]} / {ratios[0][1]} ))(x - ( {ratios[1][0]} / {ratios[1][1]} ))")

#quadratic function x = (-b +- sqrt(b**2 - 4*a*c)) / 2*a