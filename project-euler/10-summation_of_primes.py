import math

val=3
prime_list = [2,3]
sp = 5

def isPrime(num):
  nb2 = math.ceil(math.sqrt(num))
  for i in prime_list:
    if(i > nb2):
      return True
    if(num % i == 0):
      return False
  return True

while(val + 2 < 2*1000*1000):
  val=val+2
  isp_bool = isPrime(val)
  if(isp_bool):
    print(val)
    prime_list.append(val)
    sp = sp + val

print(sp)