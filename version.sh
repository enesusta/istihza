#!/bin/bash

version=$(cat pom.xml | grep "<version>" | head -1)
mavenVersion=$(echo "$version" | sed 's/<version>/ /g')
mavenVersion=$(echo "$mavenVersion" | sed 's|</version>| |g')
echo $mavenVersion
