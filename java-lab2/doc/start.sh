#!/bin/bash
cd ..
javac -cp lib/Pokemon.jar -d classes src/labDemo.java src/*/*
jar cfm java-lab2.jar doc/manifestAddition -C classes .
java -jar java-lab2.jar