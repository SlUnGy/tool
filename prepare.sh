#! /bin/bash

antlrpath=/usr/local/lib/antlr-4.1-complete.jar
name=generated


java -jar $antlrpath Tool.g4 -no-listener -visitor

rm project/src/$name/*.java
sed -i "1i package $name;" *.java

mv *.java project/src/$name/
mv *.tokens project/src/$name/
