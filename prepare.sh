#! /bin/bash

antlrpath=/usr/local/lib/antlr-4.1-complete.jar

rm *.class
java -jar $antlrpath tool.g4 -no-listener -visitor
javac *.java
