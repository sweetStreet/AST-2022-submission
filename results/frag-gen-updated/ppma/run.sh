#!/bin/bash
BASEDIR=$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )
echo "Compiling generated tests source files..."
javac -cp "$BASEDIR/crawljax-examples-5.0-beta-jar-with-dependencies.jar":"$BASEDIR/testng-7.4.0.jar" "$BASEDIR/src/test/java/generated/GeneratedTests.java"
echo "Running generated tests..."
java -cp "$BASEDIR/crawljax-examples-5.0-beta-jar-with-dependencies.jar":"$BASEDIR/src/test/java/":"$BASEDIR/testng-7.4.0.jar" org.testng.TestNG testng.xml