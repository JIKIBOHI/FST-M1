def fibonacci(num):
    if num<=1:
        return num
    else:
        return fibonacci(num-1)+fibonacci(num-2)
term=int(input("Enter num of terms"))

if term<=0:
    print("Please enter a positive num")

else:
    print("Fibonacci series is: ")
    for i in range(term):
        print(fibonacci(i))