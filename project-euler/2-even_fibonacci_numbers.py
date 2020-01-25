a = 1
b = 2
c = a+b
i = 2
s = 2
while(c <= 4000 * 1000):
  i=i+1
  c=a+b
  if(c%2==0):
    s = s+c
  a=b
  b=c
print(s)