#        a = m2 - n2
#        b = 2 * m * n
#        c  = m2 + n2
# because,
#        a2 = m4 + n4 – 2 * m2 * n2
#        b2 = 4 * m2 * n2
#        c2 = m4 + n4 + 2* m2 * n2

import sys

m = 2
n = 1

a = b = c = 0

while(True):
  while(n < m):
    a = m**2 - n**2
    b = 2*m*n
    c = m**2 + n**2
    n = n+1
    if(a+b+c > 1000):
      break
    if(a+b+c == 1000):
      print(a,b,c, a*b*c)
      sys.exit()
  m = m+1
  n = 1