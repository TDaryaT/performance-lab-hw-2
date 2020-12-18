Для подключения локальной зависимости dummy-connector необходимо выполнить:

```
mvn install:install-file \
   -Dfile=<path-to-file>/dummy-connector.jar\
   -DgroupId=ru.pflb \
   -DartifactId=dummy-connector \
   -Dversion=1.0\
   -Dpackaging=jar \
   -DgeneratePom=true
```
Для запуска задачи 1 выполнить
```
java -cp ./target/performance-lab-hw-2-1.0-SNAPSHOT-jar-with-dependencies.jar  tlepbergenova.FirstApp
```

Для запуска задачи 2 выполнить
```
java -cp ./target/performance-lab-hw-2-1.0-SNAPSHOT-jar-with-dependencies.jar  tlepbergenova.SecondApp
```
Для запуска задачи 2*: 

(Для запуска из файла message.dat - пустой аргумент)
```
java -cp ./target/performance-lab-hw-2-1.0-SNAPSHOT-jar-with-dependencies.jar  tlepbergenova.SecondAppWithStar <path-to-file>
```
Для запуска задачи 2**: 

(Для запуска из файла message.dat - пустой аргумент)
```
java -cp ./target/performance-lab-hw-2-1.0-SNAPSHOT-jar-with-dependencies.jar  tlepbergenova.SecondAppWithDoubleStar <path-to-file>
```
или
```
java -jar ./target/performance-lab-hw-2-1.0-SNAPSHOT-jar-with-dependencies.jar  tlepbergenova.SecondAppWithDoubleStar <path-to-file>
```