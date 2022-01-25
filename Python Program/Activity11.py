fruit_shop={"Apple":100,
            "Banana":40,
            "Orange":50,
            "Grapes":70,
            "Mango":120}
fruit_you_want=input("Enter the fruit you want")

if(fruit_you_want in fruit_shop):
    print(fruit_you_want,"is present")

else:
    print(fruit_you_want,"is not present")