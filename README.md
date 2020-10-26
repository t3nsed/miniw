# miniw

A simple java build system inspired by gradle's syntax, but in no way like gradle.

##### Dependencies

* any modern jdk
* any modern kotlin implementation

Gradle will tell you if anything is missing.

##### Setup

`./gradlew package`

* add .jar to a comfy directory
* add to path

##### Usage

`miniw --init huge_project`

`miniw --build`

Build always builds and runs the whole application, no matter if changes where made.

##### To Do

* controller for overarching workflow: should it build, init, etc. so that it is not all in `Application.kt`
* some integration and unit tests
* making sure that it works (it doesn't rn)