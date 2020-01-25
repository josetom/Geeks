val=3
prime_list = [2,3]

def isPrime(num):
  for i in prime_list:
    if(num % i == 0):
      return False
  return True

while(len(prime_list) < 10001):
  val=val+2
  isp_bool = isPrime(val)
  if(isp_bool):
    prime_list.append(val)

print(len(prime_list), prime_list.pop())