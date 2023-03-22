JC = javac
JFLAGS = -cp ".:src/main/java/antlr:lib/antlr-4.9.2-complete.jar" -d bin -sourcepath src/main/java/ast -sourcepath src/main/java/antlr

RULE = src/main/java/antlr/Expr.g4
ANTLR = java -jar lib/antlr-4.9.2-complete.jar -visitor
SRC_DIR = src/main/java/ast
OUT_DIR = bin
MAIN_CLASS = program

# INPUT_FILE = input.txt
# OUTPUT_FILE = output.txt

# 타겟 정의
.PHONY: all clean run

all: $(OUT_DIR)/$(MAIN_CLASS).class

$(OUT_DIR)/%.class: $(SRC_DIR)/%.java
	mkdir -p $(OUT_DIR)
	$(ANTLR) $(RULE)
	$(JC) $(JFLAGS) $<

clean:
	@rm -rf $(OUT_DIR)

run: all
	@java -cp "$(OUT_DIR):lib/antlr-4.9.2-complete.jar" $(MAIN_CLASS)

#$(INPUT_FILE) $(OUTPUT_FILE)
