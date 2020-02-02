
import inflect

sum = 0
inflect_engine = inflect.engine()

for i in range(1, 1001):
  sum = sum + len(inflect_engine.number_to_words(i).replace(',','').replace('-','').replace(' ',''))

print(sum)

