# Automated Script for Sytner Platform

Automated Script will help the regression testing become so easy.

* [Testcases](https://docs.google.com/spreadsheets/d/180QOtNmlk5SOwa7_Hossf9uzrhbbMloS3BKyJl2dVI4/edit?usp=sharing)
## What is this repository for? ###

* [Demo site](https://www.sytner.co.uk/)

## How do I get set up? ###
### Prerequisites
- Install Java JDK 11 and add variables environment
- Install Maven latest and add variables environment
### Installation
* Cloning this repository to this local: 
  ```
  git clone https://github.com/giangdang99/Sytner-Maven-Project.git
  ```
* Install MVN packages
   ```sh
   mvn install
   ```
* Start test
   ```sh
   mvn clean
   mvn test
   ```
* After done, use cmd: 
  ```
  allure serve allure-json to show the report
  ```

### Who do I talk to? ###

* Repo owner : contact dangthigiang99@gmail.com
