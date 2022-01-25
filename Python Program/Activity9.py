list1=[12,34,9,67,80]
list2=[56,20,19,50,70]
print("List 1",list1)
print("List 2",list2)
list3=[]
for num in list1:
    if(num%2!=0):
        list3.append(num)
for num in list2:
    if(num%2==0):
        list3.append(num)

print("Final List",list3)
