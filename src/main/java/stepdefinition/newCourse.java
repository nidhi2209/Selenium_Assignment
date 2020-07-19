package stepdefinition;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class newCourse  {
	
	static WebDriver driver;
	@Given("^I launch the eLearning application$")
	public void i_launch_the_eLearning_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe.");
		driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/index.php");
		
	}

	@Then("^I enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_the_username_and_password(String arg1, String arg2) throws Throwable {
	  
		driver.findElement(By.id("login")).sendKeys("nidhi.229");
		driver.findElement(By.id("password")).sendKeys("nidhi@2020");
	    
	}

	@Then("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
	   
		driver.findElement(By.id("form-login_submitAuth")).click();
	 
	}

	@Given("^I am logged into the application$")
	public void i_am_logged_into_the_application() throws Throwable {
		
		//boolean home = driver.findElement(By.xpath("//a[contain(text(),'My Courses')]")).isDisplayed();
		System.out.println("I am on Home page");
		
	}

	@Then("^I click on the link 'Create a course'$")
	public void i_click_on_the_link_Create_a_course() throws Throwable {
		
		driver.findElement(By.partialLinkText("Create")).click();
		
	}

	@Then("^I enter valid credentials in the Course name text box \"([^\"]*)\"$")
	public void i_enter_valid_credentials_in_the_Course_name_text_box(String arg1) throws Throwable {
		
		driver.findElement(By.id("title")).sendKeys("Selenium2209");
	   
	}

	@Then("^I click on Advanced settings button$")
	public void i_click_on_Advanced_settings_button() throws Throwable {
		
		driver.findElement(By.id("advanced_params")).click();
		       	
	}

	@Then("^I select valid credentials from Category list box \"([^\"]*)\"$")
	public void i_select_valid_credentials_from_Category_list_box(String arg1) throws Throwable {
		
		Select sel = new Select(driver.findElement(By.xpath("//*[@id=\"add_course_category_code\"]")));
	    sel.selectByVisibleText("Projects (PR001)");
	
	}

	@Then("^I enter valid credentials in Course code text box \"([^\"]*)\"$")
	public void i_enter_valid_credentials_in_Course_code_text_box(String arg1) throws Throwable {
	    
		driver.findElement(By.id("add_course_wanted_code")).sendKeys("sel021");
	    
	}

	@Then("^I select valid credentials from Language list box \"([^\"]*)\"$")
	public void i_select_valid_credentials_from_Language_list_box(String arg1) throws Throwable {
		
		Select sel1 = new Select(driver.findElement(By.id("add_course_course_language")));
		sel1.selectByVisibleText("English");
	   
	}

	@Then("^I click on Create this course button$")
	public void i_click_on_Create_this_course_button() throws Throwable {
		
		driver.findElement(By.id("add_course_submit")).click();
	   
	}

	@Given("^I click on edition icon to add the introduction$")
	public void i_click_on_edition_icon_to_add_the_introduction() throws Throwable {
		
		driver.findElement(By.xpath("//a[@title='Add an introduction text']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@Then("^I enter valid credentials in the text box \"([^\"]*)\"$")
	public void i_enter_valid_credentials_in_the_text_box(String arg1) throws Throwable {
		
		int size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println(size);
	    //switch to frame
	    driver.switchTo().frame(0);
	  //*[@id="cke_1_contents"]/iframe
	    //writing to frame
	    driver.findElement(By.xpath("/html/body")).sendKeys("This is a Selenium course");
	    //come out to main window from frame
	    driver.switchTo().defaultContent();
	    
		
	}

	@Then("^I click on Save intro text$")
	public void i_click_on_Save_intro_text() throws Throwable {
	 
		//clicking on save button
	    driver.findElement(By.id("introduction_text_intro_cmdUpdate")).click();
	    
	}

	@Given("^I click on Course description icon$")
	public void i_click_on_Course_description_icon() throws Throwable {
	    
		  driver.findElement(By.xpath("//img[@alt='Course description']")).click();
	    
	}
    //DESCRIPTION
	@Then("^I click on Description icon$")
	public void i_click_on_Description_icon() throws Throwable {
	    
		driver.findElement(By.xpath("//img[@alt='Description']")).click();
	    
	}

	@Then("^I enter valid credentials in the Title text box \"([^\"]*)\"$")
	public void i_enter_valid_credentials_in_the_Title_text_box(String arg1) throws Throwable {
	 
		driver.findElement(By.id("course_description_title")).sendKeys("Selenium course for beginners");
	    Thread.sleep(2000);
	    
	}

	@Then("^I enter valid credentials in the Content text box \"([^\"]*)\"$")
	public void i_enter_valid_credentials_in_the_Content_text_box(String arg1) throws Throwable {
	    
		driver.switchTo().frame(0);
	    driver.findElement(By.xpath("/html/body")).sendKeys("This is a Selenium course");
	    driver.switchTo().defaultContent();
	   
	}

	@Then("^I click on Save button$")
	public void i_click_on_Save_button() throws Throwable {
	   
		driver.findElement(By.id("course_description_submit")).click();
	}

	//OBJECTIVE
	@Then("^I click on Objectives icon$")
	public void i_click_on_Objectives_icon() throws Throwable {
	   
		  driver.findElement(By.xpath("//img[@alt='Objectives']")).click();
	   
	}

	@Then("^I enter valid objective credentials in the Title text box \"([^\"]*)\"$")
	public void i_enter_valid_objective_credentials_in_the_Title_text_box(String arg1) throws Throwable {
		 
		driver.findElement(By.id("course_description_title")).sendKeys("Selenium course for beginners");
		    Thread.sleep(2000);
	  }

	@Then("^I enter valid objective credentials in the Content text box \"([^\"]*)\"$")
	public void i_enter_valid_objective_credentials_in_the_Content_text_box(String arg1) throws Throwable {
		
		driver.switchTo().frame(0);
	    driver.findElement(By.xpath("/html/body")).sendKeys("This is a Selenium course");
	    driver.switchTo().defaultContent();
	    
	}
	
	@Then("^I click on objective Save button$")
	public void i_click_on_objective_Save_button() throws Throwable {
	   
		driver.findElement(By.id("course_description_submit")).click();
	}
	
	//TOPIC
	@Then("^I click on Topics icon$")
	public void i_click_on_Topics_icon() throws Throwable {
	
		driver.findElement(By.xpath("//img[@alt='Topics']")).click();
	  
	}

	@Then("^I enter valid topic credentials in the Title text box \"([^\"]*)\"$")
	public void i_enter_valid_topic_credentials_in_the_Title_text_box(String arg1) throws Throwable {
		
		driver.findElement(By.id("course_description_title")).sendKeys("Selenium course for beginners");
		Thread.sleep(2000);
	    
	}

	@Then("^I enter valid topic credentials in the Content text box \"([^\"]*)\"$")
	public void i_enter_valid_topic_credentials_in_the_Content_text_box(String arg1) throws Throwable {
		
		driver.switchTo().frame(0);
	    driver.findElement(By.xpath("/html/body")).sendKeys("This is a selenium course");
	    driver.switchTo().defaultContent();
	    
	}

	@Then("^I click on topic Save button$")
	public void i_click_on_topic_Save_button() throws Throwable {
	   
		driver.findElement(By.id("course_description_submit")).click();
	}


}
