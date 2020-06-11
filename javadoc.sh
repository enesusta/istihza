#!/bin/bash
mvn javadoc:javadoc
cp -a target/site/apidocs/. docs/