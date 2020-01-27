import math

global collatzSizeMap
collatzSizeMap = {}

def collatzNextNumber(n):
  if(n == 1 or n == -1):
    return -1
  elif(n % 2 == 1):
    return (3 * n) + 1
  else:
    return n//2

def collatzSize(n):
  size = 0
  cn = n
  while(cn != -1):
    csm_size = collatzSizeMap.get(cn, -1)
    if(csm_size != -1):
      size = size + csm_size
      break
    else:
      cn = collatzNextNumber(cn)
      size = size + 1 + collatzSize(cn)
      break
  collatzSizeMap[n] = size
  return size

max_collatz_size = 0
max_collatz_num = 0

for i in range(1, 1000000):
  cs = collatzSize(i)
  print(i, cs)
  if(cs > max_collatz_size):
    max_collatz_size = cs
    max_collatz_num = i

print(max_collatz_num)
print(max_collatz_size)