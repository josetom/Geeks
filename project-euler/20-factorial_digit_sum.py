import math

s = 0
f100 = math.factorial(100)
while(f100 > 0):
  s = s + (f100 % 10)
  f100 = f100 // 10

print(s)