import pytest

#Addition Test
def addition():
    num1=10
    num2=30
    sum= num1+num2
    assert sum==40

#Subtraction Test
def subtraction():
    num1=90
    num2=50
    sub=num1-num2
    assert sub==40

#Multiplication Test
def multiplication():
    num1=20
    num2=10
    prod=num1*num2
    assert prod==200

#Division Test
def division():
    num1=100
    num2=20
    div=num1/num2
    assert div==5