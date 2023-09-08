# Human Capital Web Testing Project

## Getting started with Serenity and Cucumber
Serenity BDD is a library that makes it easier to write high quality automated acceptance tests, with powerful reporting and living documentation features. It has strong support for both web testing with Selenium, and API testing using RestAssured.

Serenity strongly encourages good test automation design, and supports several design patterns, including classic Page Objects, the newer Lean Page Objects/ Action Classes approach, and the more sophisticated and flexible Screenplay pattern.

## The project directory structure
The project has build scripts for both Maven and Gradle, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
  + main
  + test
    + java                        Test runners and supporting code
    + resources
      + features                  Feature files
```

## The sample scenario
```Gherkin
Fitur: Fitur Profil

  Dasar: arahkan pengguna ke halaman profil
    Dengan pengguna masuk menggunakan myits id: "id" dan kata sandi: "kataSandi"
    Ketika pengguna diarahkan ke halaman "Profil"

  @Positif
  Skenario: memeriksa data pengguna pada halaman profil
    Maka pengguna harus melihat namanya pada halaman profil
    Dan pengguna harus melihat pekerjaan pada halaman profil
```

## Executing the tests
To run the project, you can either just run the `CucumberRunner` test runner class, or run either `mvn verify` from the command line.

By default, the tests will run using Chrome. You can run them in Firefox by overriding the `driver` system property, e.g.
```json
$ mvn clean verify -Ddriver=firefox
```

The test results will be recorded in the `target/site/serenity` directory.
