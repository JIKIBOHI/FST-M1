def reccursiveAdder(num):
    if num:
        return num+reccursiveAdder(num-1)
    else:
        return 0
print(reccursiveAdder(105))