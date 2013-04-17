#!/bin/bash
for i in $(cat newcrops); do
	cp turnip.png $(echo $i).png
	cp turnipseeds.png $(echo $i)seeds.png
done
