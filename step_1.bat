
dir /S /B src\*.java > sources.txt

javac -p mods -d feeding feeding/src/main/java/zoo/animal/feeding/*.java feeding/src/main/java/module-info.java