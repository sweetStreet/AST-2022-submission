#!/bin/bash
BASEDIR=$(dirname "$0")
echo "Compiling generated tests source files..."
javac -cp "$BASEDIR/../../../target/crawljax-examples-5.0-beta-jar-with-dependencies.jar" "$BASEDIR/src/test/java//generated/GeneratedTests.java"
echo "Running generated tests..."
java -cp "$BASEDIR/../../../target/crawljax-examples-5.0-beta-jar-with-dependencies.jar":"$BASEDIR/src/test/java/" org.testng.TestNG testng.xml