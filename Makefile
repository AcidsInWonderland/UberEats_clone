SRCDIR = src
BINDIR = bin
DOCDIR = doc
TESTDIR = test

#modified file JUNIT variable for compiling but not using JUNIT
JUNIT = ../junit/junit-4.12.jar -sourcepath ./src ./src/$*.java

JAVAC = javac
JFLAGS = -g -d $(BINDIR) -cp $(BINDIR)

#to check the src and test folders for the .java files
#also to ensure that class files are in bin 
vpath %.java $(SRCDIR):$(TESTDIR)
vpath %.class $(BINDIR)

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $(JFLAGS) $<

classes: Driver.class Person.class UberEatsMobileApp.class UberEatsRestaurantApp.class User.class Vehicle.class

default: $(CLASSES)
	
Driver.class: Driver.java 
	javac -d $(BINDIR) -cp $(JUNIT)
Person.class: Person.java 
	javac -d $(BINDIR) -cp $(JUNIT)
UberEatsMobileApp.class: UberEatsMobileApp.java 
	javac -d $(BINDIR) -cp $(JUNIT)
UberEatsRestaurantApp.class: UberEatsRestaurantApp.java 
	javac -d $(BINDIR) -cp $(JUNIT)
User.class: User.java 
	javac -d $(BINDIR) -cp $(JUNIT)

clean:
	rm -f  $(BINDIR)/*.class
	rm -Rf doc