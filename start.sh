#!/bin/bash
javac -cp Pokemon.jar mypokemons/*/*.java labDemo.java
jar cfm java-lab2.jar manifestAddition mypokemons/*/*.class labDemo.class
java -jar java-lab2.jar
