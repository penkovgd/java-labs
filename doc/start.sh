#!/bin/bash
javac -cp Pokemon.jar -d classes labDemo.java mypokemons/*/*
jar cfm java-lab.jar manifestAddition -C classes .
java -jar java-lab.jar