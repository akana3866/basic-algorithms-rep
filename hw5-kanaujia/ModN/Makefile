JAVAC=javac
JAVA=java
BIN=bin
SRC=Modn.java
CLASS=Modn

# Default values, in case no arguments are provided
p ?= Modn
nn ?= 10
mm ?= 1

all: compile

compile: $(BIN)
	$(JAVAC) -d $(BIN) $(SRC)

$(BIN):
	mkdir -p $(BIN)

clean:
	rm -rf $(BIN)

run:
	@$(JAVA) -cp $(BIN) $(p) 0 $(nn) $(mm)
