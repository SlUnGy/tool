#! /bin/bash
cd compilat
rm -f Default.class
java -jar ../project/jasmin.jar output.j
java Default

