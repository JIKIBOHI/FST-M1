import pandas

dataframe=pandas.read_csv("test.csv")
print("Full Data")
print(dataframe)

print("Username only")
print(dataframe["Usernames"])

print("Unsername and password of 2nd row")
print(dataframe["Usernames"][2],dataframe["Passwords"][2])

print("Sorted as Username in ascending order")
print(dataframe.sort_values("Usernames"))

print("Sorted as Password in descending order")
print(dataframe.sort_values("Passwords",ascending=False))
