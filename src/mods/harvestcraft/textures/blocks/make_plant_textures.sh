#!/bin/bash
for i in $(cat newcrops); do
	for f in $(seq 0 2); do
		cp turnip_1.png $(echo $i)_$(echo $f).png
	done
done
