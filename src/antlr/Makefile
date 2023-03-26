JC = javac
src = *.java
target = program
antlr4=java -jar /usr/local/lib/antlr-complete.jar
grun=java org.antlr.v4.gui.TestRig
grammar='Expr.g4'

visit:
	$(antlr4) $(grammar) -no-listener -visitor
listen:
	$(antlr4) $(grammar) 

all: Expr.g4 
	$(antlr4) $(grammar) -visitor
	$(JC) *.java

gui:
	$(grun) Expr prog -gui

tree:
	$(grun) Expr prog -tree
tokens:
	$(grun) Expr prog -tokens

run:
	java program

clean:
	rm *.class
