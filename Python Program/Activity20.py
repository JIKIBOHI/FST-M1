import pandas
dataframe = pandas.read_excel('Employee.xls')
print(dataframe)

print("No of row and columns",dataframe.shape)

print("Email list")
print(dataframe['Email'])

print("Sorted Firstname in Acsending order")
print(dataframe.sort_values('FirstName'))