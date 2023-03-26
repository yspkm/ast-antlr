JC = javac
JFLAGS = -cp ".:src/main/antlr:lib/antlr-4.9.2-complete.jar"\
         -d bin\
         -sourcepath src/main/java\
         -sourcepath src/main/antlr
RULE = src/main/antlr/Expr.g4
ANTLR = java -jar lib/antlr-4.9.2-complete.jar -visitor
SRC_DIR = src/main/java
OUT_DIR = bin
MAIN_CLASS = Main

# Allow the input file to be specified on the command line
ifeq ($(strip $(INPUT)),)
  INPUT :=
endif

# Default output file
OUTPUT_FILE = dat/output.txt

# 타겟 정의
.PHONY: all clean run

all: $(OUT_DIR)/$(MAIN_CLASS).class

$(OUT_DIR)/%.class: $(SRC_DIR)/%.java
	@mkdir -p $(OUT_DIR)
	@$(ANTLR) $(RULE)
	@$(JC) $(JFLAGS) $< 

clean:
	@rm -rf $(OUT_DIR)

run: all
ifeq ($(strip $(INPUT)),)
	@java -cp "$(OUT_DIR):lib/antlr-4.9.2-complete.jar" $(MAIN_CLASS)
else
	@java -cp "$(OUT_DIR):lib/antlr-4.9.2-complete.jar" $(MAIN_CLASS) < $(INPUT)
endif
