 java -jar lib/junit-platform-console-standalone-1.10.1.jar -cp bin --scan-class-path 

javac -cp lib/junit-platform-console-standalone-1.10.1.jar -d bin src/*.java  
