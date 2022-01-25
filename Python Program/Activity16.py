class Car:
    "This is car class"

    def __init__(self,manufacturer,model,make,transmission,color):
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color

    def accelerate(self):
        print(self.manufacturer +" "+self.model+"is moving")
    def stop(self):
        print(self.manufacturer+" "+self.model+"has stopped")

car1=Car("Maruti","800","2015","Manual","White")
car2=Car("Hyundai","Verna","2018","Automatic","Black")
car3=Car("Toyota","Innova","2019","Automatic","White")

car3.accelerate()
car3.stop()