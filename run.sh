#!/usr/bin/sh
rm -rf output
hadoopStream=/usr/lib/hadoop/share/hadoop/tools/lib/hadoop-streaming-2.8.0.jar
mapper=./PY/Mapper
reducer=./PY/Reducer
inputFile=./input
outputFile=./output
hadoop jar $hadoopStream -input $inputFile -output $outputFile -mapper "$mapper" -reducer "$reducer"