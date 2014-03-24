#! /bin/bash

antlrpath=project/antlr-4.2-complete.jar
name=generated


java -jar $antlrpath Tool.g4 -no-listener -visitor -package $name


rm project/src/$name/*

mv *.java project/src/$name/
mv *.tokens project/src/$name/
