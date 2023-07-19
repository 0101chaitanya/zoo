- Package the feeding module
```shell
jar -cvf mods/zoo.animal.feeding.jar -C feeding/ .
```

- Packaging the care module
```shell
jar -cvf mods/zoo.animal.care.jar -C care/ .
```

- Packaging the talks module
```shell
jar -cvf mods/zoo.animal.talks.jar -C talks/ .

```
- Packaging the staff module
```shell
jar -cvf mods/zoo.staff.jar -C staff/ .
```
- Packaging the serviceProviderInterfaceModule module
```shell
jar -cvf mods/zoo.tours.api.jar -C serviceProviderInterfaceModule/ .
```
- Packaging serviceLocatorModule
```shell
jar -cvf mods/zoo.tours.reservations.jar -C serviceLocatorModule/ .
```