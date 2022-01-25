a = """Lorem ipsum dolor sit amet,
consectetur adipiscing elit,
sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua."""
print(a) 
a="Hello World"
print(a[7])
print(a[4:8])
print(len(a))
print(a.lower())
print(a.upper())
print(a.replace('H','J'))
print(a.split("o"))
b="Jiki"
c="Bohidar"
print(b+" "+c)
age=35
txt="My name is Jill and my age is {}"
print(txt.format(age))
	
quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item {} for {} dollars."
print(myorder.format(quantity, itemno, price))

username = input("Enter username:")
print("Username is: " + username)