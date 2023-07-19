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
- compiling the staff module
```shell
javac -p mods -d staff staff/src/main/java/zoo/staff/*.java staff/src/main/java/module-info.java
```
- Compiling the serviceProviderInterfaceModule
```shell
javac -d serviceProviderInterfaceModule serviceProviderInterfaceModule/src/main/java/zoo/tours/api/*.java serviceProviderInterfaceModule/src/main/java/module-info.java
```
- Compiling the serviceLocatorModule
```shell
javac -p mods -d serviceLocatorModule serviceLocatorModule/src/main/java/zoo/tours/reservations/*.java serviceLocatorModule/src/main/java/module-info.java
```