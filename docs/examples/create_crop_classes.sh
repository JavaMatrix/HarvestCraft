#!/bin/bash
for i in $(cat newcrops); do
	cat AnExamplePlant.java | sed 's/EXAMPLE/$i/' > ./plants/$(echo $i)Plant.java
	cat AnExampleFruit.java | sed 's/EXAMPLE/$i/' > ./fruit/$(echo $i)Fruit.java
	cat AnExampleSeeds.java | sed 's/EXAMPLE/$i/' > ./seeds/$(echo $i)Seeds.java
done
