import os

arr = []
file1 = open(os.path.join('project-euler/data', 'p067_triangle.txt'), 'r')

while True: 
  line = file1.readline() 
  if not line:
    break
  line = line.strip()
  line_arr = line.split(' ')
  arr.append(0)
  arr_copy = list(arr)
  for i,num in enumerate(list(map(int, line_arr))):
    sum_i1 = 0
    sum_i = num + arr_copy[i]
    if(i-1 >= 0):
      sum_i1 = num + arr_copy[i-1]
    arr[i] = max([sum_i, sum_i1])

print(max(arr))
file1.close()