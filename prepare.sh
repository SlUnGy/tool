#! /bin/bash

antlrpath=/usr/local/lib/antlr-4.1-complete.jar
grun=org.antlr.v4.runtime.misc.TestRig

rm *.class
java -jar $antlrpath tool.g4

javac *.java
echo "enter some stuff:"
java $grun tool start -gui 
