#!/bin/bash
ls $1 | while read line; do
echo $line | awk -F"-" '{print "mv "$0" "$2}'
done
