
lst=[]
num = int(input('How many numbers: '))
for n in range(num):
    numList = int(input('Enter number '))
    lst.append(numList)
print("Given list is ", lst)
firstElement = lst[0]
lastElement = lst[-1]
if (firstElement == lastElement):
    print(True)
else:
    print(False)