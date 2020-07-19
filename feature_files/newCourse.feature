 @eLearning_site
Feature: This feature is to verify whether application allows a teacher to create a course and add its details
		 add description, objective & Topics

 @TeacherLogin
Scenario: Teacher logins in the application
	Given I launch the eLearning application
	Then I enter the username "nidhi.229" and password "nidhi@2020"
	And I click on Login button
	
@CreateCourse
Scenario: Teacher create a course for Selenium
	Given I am logged into the application
	Then I click on the link 'Create a course'
	Then I enter valid credentials in the Course name text box "Selenium2209"
	Then I click on Advanced settings button
	Then I select valid credentials from Category list box "Projects"
	Then I enter valid credentials in Course code text box "sel"
	Then I select valid credentials from Language list box "English"
	Then I click on Create this course button

@AddIntro
Scenario: Teacher adds the course introduction
Given I click on edition icon to add the introduction
Then I enter valid credentials in the text box "This is a Selenium course"
Then I click on Save intro text

@AddCourseDescription
Scenario: Teacher adds the course description
Given I click on Course description icon
Then I click on Description icon
Then I enter valid credentials in the Title text box "Selenium course for beginners"
Then I enter valid credentials in the Content text box "Selenium course for beginners"
Then I click on Save button 
Then I click on Objectives icon
Then I enter valid objective credentials in the Title text box "Selenium course for beginners"
Then I enter valid objective credentials in the Content text box "Selenium course for beginners"
Then I click on objective Save button
Then I click on Topics icon
Then I enter valid topic credentials in the Title text box "Selenium course for beginners"
Then I enter valid topic credentials in the Content text box "Selenium course for beginners"
Then I click on topic Save button



 