JAVAC=javac
JAVA=java
BIN=bin
SRC=FLT.java
CLASS=FLT

# Default values
p ?= FLT
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
	@$(JAVA) -cp $(BIN) $(p) $(nn)
