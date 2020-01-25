i = 999999
def reverse(n, sum):
  rem = n%10
  sum = sum * 10 + rem
  if(n > 10):
    return reverse(int(n/10), sum)
  else:
    return sum

def isPalindrome(n):
  return reverse(n, 0) == n

def isDivisibleByTwo3DigitNumbers(n):
  j=999
  while(j > 100):
    div = n/j
    if(n%j == 0 and div > 100 and div < 1000):
      return True
    j=j-1
  return False

while(i > 10000):
  if(isPalindrome(i) and isDivisibleByTwo3DigitNumbers(i)):
    break
  i=i-1

print(i)