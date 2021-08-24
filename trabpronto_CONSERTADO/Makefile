# Modifique as variaveis conforme o seu setup.

JAVA=java
JAVAC=javac

YEAR=$(shell pwd | grep -o '20..-.')
ROOT=/home/zambon/Teaching/$(YEAR)/CC/labs

#ANTLR_PATH=$(ROOT)/tools/antlr-4.9.2-complete.jar
ANTLR_PATH=/usr/local/lib/antlr-4.9.2-complete.jar
CLASS_PATH_OPTION=-cp .:$(ANTLR_PATH)

# Comandos como descritos na página do ANTLR.
ANTLR4=$(JAVA) -jar $(ANTLR_PATH)
GRUN=$(JAVA) $(CLASS_PATH_OPTION) org.antlr.v4.gui.TestRig

# Diretório para aonde vão os arquivos gerados.
GEN_PATH=parser

# Diretório para os casos de teste
IN=./tests

all: antlr javac
	@echo "Done."

antlr: HaskellLexer.g4 HaskellParser.g4
	$(ANTLR4) -no-listener -visitor -o $(GEN_PATH) HaskellLexer.g4 HaskellParser.g4
	cp HaskellBaseLexer.java $(GEN_PATH)

javac:
	$(JAVAC) $(CLASS_PATH_OPTION) $(GEN_PATH)/*.java

run:
	# Não era $(GEN_PATH)/Haskell... -_-
	$(GRUN) $(GEN_PATH).Haskell module -gui $(FILE)

runall:
	-for FILE in $(IN)/test_run/*.hs; do \
	 	echo -e "\nRunning $${FILE}" && \
	 	$(GRUN) $(GEN_PATH).Haskell module $${FILE}; \
	done;

runfail:
	-for FILE in $(IN)/test_fail/*.hs; do \
	 	echo -e "\nRunning $${FILE}" && \
	 	$(GRUN) $(GEN_PATH).Haskell module $${FILE}; \
	done;

clean:
	@rm -rf $(GEN_PATH)
