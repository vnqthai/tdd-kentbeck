Source code of examples in Test-Driven Development by Kent Beck

## Setup

### Install Java

Download Java Development Kit from [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

Install Java Development Kit: follow instructions [here](http://docs.oracle.com/javase/8/docs/technotes/guides/install/mac_jdk.html#CHDBADCG)

### Verify

Run these commands to verify if Java is installed successfully:

```
java -version
```

```
javac -version
```

## How to run

```
javac -cp .:./lib/* **/*.java && java -cp .:./lib/* org.junit.runner.JUnitCore test.<TestClass>
```
