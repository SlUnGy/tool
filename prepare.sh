#! /bin/bash


rm *.class
java -jar /usr/local/lib/antlr-4.1-complete.jar tool.g4
javac *.java
