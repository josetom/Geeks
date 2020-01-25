import math

num=20

m = {}
i = 2
while(i <= num):
  j=i
  counter = 0
  while(j%2 == 0):
    counter = counter + 1
    j = j/2
  if(m.get(2, 0) < counter):
    m[2] = counter
  
  for k in range(3, math.ceil(math.sqrt(i))+1, 2):
    counter=0
    print('jb', i, j, k, counter)
    while(j%k == 0):
      counter = counter + 1
      j = j/k
    print('j', i,j, k, counter)
    if(m.get(k, 0) < counter):
      m[k] = counter

  if(j > 2):
    if(m.get(j, 0) < 1):
      m[j] = 1
  
  i=i+1

prod = 1
for (key, value) in m.items():
  prod = prod * (key ** value)

print(m)
print(prod)