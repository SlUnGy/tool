#! /bin/bash

antlrpath=/usr/local/lib/antlr-4.1-complete.jar

java -jar $antlrpath Tool.g4 -no-listener -visitor

rm project/src/parser/*.java
sed -i '1i package parser;' *.java

mv *.java project/src/parser/
mv *.tokens project/src/parser/
