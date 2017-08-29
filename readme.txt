1. Instalations
  Make sure you have
    Java
    Gradle
    Mysql

2. Set up mysql
  Open mysql command line client and run...

  mysql> create database notes_db;
  mysql> create user 'notetaker'@'localhost' identified by 'notepassword';
  mysql> grant all on notes_db.* to 'notetaker'@'localhost';

3. Run the app
  cd into root directory
  run
    gradle wrapper
    ./gradlew bootRun


The application will run at http://localhost:8080/api/notes
