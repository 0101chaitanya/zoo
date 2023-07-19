- Compile feeding module
```shell
javac -p mods -d feeding feeding/src/main/java/zoo/animal/feeding/*.java feeding/src/main/java/module-info.java
```
- compiling care module
```shell
javac -p mods -d care care/src/main/java/zoo/animal/care/details/*.java care/src/main/java/zoo/animal/care/medical/*.java care/src/main/java/module-info.java
```
- compiling the talks module
```shell
javac -p mods -d talks talks/src/main/java/zoo/animal/talks/content/*.java talks/src/main/java/zoo/animal/talks/media/*.java talks/src/main/java/zoo/animal/talks/schedule/*.java talks/src/main/java/module-info.java
```