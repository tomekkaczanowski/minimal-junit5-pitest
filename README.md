# minimal-junit5-pitest

This project includes basic `pom.xml` that allows to run Pitest on JUnit5 tests. 

There is a sample test in `src/test/java` so you can see it working.

## execution

`mvn clean test org.pitest:pitest-maven:mutationCoverage site`

## report
open `target/site/index.html` to see the HTML report generated by Pitest.

## links
* JUnit5 https://junit.org/junit5/
* Pitest http://pitest.org/
* pitest-junit5-plugin https://github.com/pitest/pitest-junit5-plugin

## more goodness?
visit http://testinglikeaboss.com
