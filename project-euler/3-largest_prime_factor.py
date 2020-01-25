import math

n = 600851475143
maxPrime = -1

while n % 2 == 0: 
  maxPrime = 2
  n = n/2

for i in range(3, int(math.ceil(math.sqrt(n))), 2):
  while n%i == 0:
    maxPrime = i
    n = n/i

if(n > 2):
  maxPrime = n

print(maxPrime)