# PokemonLab — разделённая версия проекта

Каждый самостоятельно реализованный класс находится в отдельном `.java` файле в папке `src`.

## Файлы
- `Main.java` — точка входа, создание команд и запуск боя.
- `Latios.java`, `Electrike.java`, `Manectric.java`, `Bellsprout.java`, `Weepinbell.java`, `Victreebel.java` — классы покемонов.
- `ChargeBeam.java`, `IceBeam.java`, `SteelWing.java`, `RestMove.java`, `Leer.java`, `Thunderbolt.java`, `Spark.java`, `Overheat.java`, `SweetScent.java`, `SludgeBomb.java`, `PoisonPowder.java`, `LeafTornado.java` — классы атак.

## Внешняя библиотека
Добавьте предоставленный преподавателем `Pokemon.jar` в IntelliJ IDEA через `File → Project Structure → Libraries`, затем назначьте библиотеку модулю. Сам файл `Pokemon.jar` в архив не включён: в исходном архиве его не было.

## Компиляция из терминала
Из корневой папки проекта выполните (если `Pokemon.jar` лежит в корне):

```bash
javac -encoding UTF-8 -cp Pokemon.jar -d out src/*.java
java -cp "out:Pokemon.jar" Main
```

В Windows вместо `:` в classpath используется `;`:

```powershell
java -cp "out;Pokemon.jar" Main
```

Все классы оставлены в пакете по умолчанию, как и в исходном проекте.
