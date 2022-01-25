list=[10,20,30,40]
def Sum(num):
    s=0
    for i in num:
        s=s+i
    return s

print("Sum of all the num",Sum(list))