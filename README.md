# Test-Driven Development in Spring Boot with JUnit and Mockito
This is the repository for the LinkedIn Learning course `Test-Driven Development in Spring Boot with JUnit and Mockito`. The full course is available from [LinkedIn Learning][lil-course-url].

![lil-thumbnail-url]

If you’ve ever run out of time to write tests for your code, you know what a potential disaster you’re flirting with. Test-driven development (TDD) lets you write the test before the implementation code, essentially using the test to guide your development process. This course shows you how to apply TDD principles with Spring Boot projects. No prior knowledge of TDD is assumed, so instructor Maaike van Putten starts off by introducing TDD and showing a plain example. Then, move on to setting up the environment that will be used so you can follow along. After that, find out how to develop the different layers of a REST API the TDD way: controller layer, service layer, and the repository/data layer. Finally, Maaike wraps up the course up with some TDD best practices.

Learning objectives
- Apply TDD principles with Spring Boot projects.
- Use JUnit and Mockito in a TDD environment.
- Understand how to test the different layers of a Spring Boot REST API.


_See the readme file in the main branch for updated instructions and information._

## Instructions
This repository has branches for each of the videos in the course. You can use the branch pop up menu in github to switch to a specific branch and take a look at the course at that stage, or you can add `/tree/BRANCH_NAME` to the URL to go to the branch you want to access.

## Branches
The branches are structured to correspond to the videos in the course. The naming convention is `CHAPTER#_MOVIE#`. As an example, the branch named `02_03` corresponds to the second chapter and the third video in that chapter. 
Some branches will have a beginning and an end state. These are marked with the letters `b` for "beginning" and `e` for "end". The `b` branch contains the code as it is at the beginning of the movie. The `e` branch contains the code as it is at the end of the movie. The `main` branch holds the final state of the code when in the course.

When switching from one exercise files branch to the next after making changes to the files, you may get a message like this:

    error: Your local changes to the following files would be overwritten by checkout:        [files]
    Please commit your changes or stash them before you switch branches.
    Aborting

To resolve this issue:
	
    Add changes to git using this command: git add .
	Commit changes using this command: git commit -m "some message"

Maaike van Putten

Trainer and Developer for Java, Python, Spring Boot, and More

                            

Check out my other courses on [LinkedIn Learning](https://www.linkedin.com/learning/instructors/maaike-van-putten?u=104).


[0]: # (Replace these placeholder URLs with actual course URLs)

[lil-course-url]: https://www.linkedin.com/learning/test-driven-development-in-spring-boot-with-junit-and-mockito
[lil-thumbnail-url]: https://media.licdn.com/dms/image/v2/D4D0DAQEAE-wyZaN9ig/learning-public-crop_675_1200/learning-public-crop_675_1200/0/1735865345360?e=2147483647&v=beta&t=6D8sbbM3G-wEoU6adq67iZdO3HbhFbr156Y4HE1Qz9E

