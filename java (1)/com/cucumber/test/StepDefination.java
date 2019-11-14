package com.cucumber.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	WebDriver driver;
	/*
	 * public static WebDriver driver;
	 * 
	 * //@Given("Open browser and enter url") //public void
	 * open_browser_and_enter_url() {
	 * 
	 * 
	 * @Given("Open browser and enter url") public void open_browser_and_enter_url()
	 * { System.setProperty("webdriver.chrome.driver",
	 * "D:\\Selenium_Java-Jars2019\\chromedriver.exe"); WebDriver driver = new
	 * ChromeDriver();
	 * 
	 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
	 * driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	 * driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	 * 
	 * driver.get("https://in.yahoo.com/?p=us"); }
	 * 
	 * @When("clicked on the signIn button") public void
	 * clicked_on_the_signIn_button() {
	 * 
	 * // driver.findElement(By.xpath("//a[@id='uh-signin']")).click();
	 * driver.navigate().refresh();
	 * 
	 * }
	 * 
	 * @When("enter the userName and password") public void
	 * enter_the_userName_and_password() {
	 * //driver.findElement(By.id("login-username")).sendKeys("Ajeetyahoo@yahho.com"
	 * ); driver.navigate().refresh();
	 * 
	 * }
	 * 
	 * @When("clicked on the Signin Button") public void
	 * clicked_on_the_Signin_Button() {
	 * 
	 * 
	 * // driver.findElement(By.id("login-signin")).click();
	 * 
	 * driver.navigate().refresh();
	 * 
	 * }
	 * 
	 * @Then("close the browser") public void close_the_browser() {
	 * 
	 * driver.close();
	 * 
	 * }
	 */

	@Given("Open browser and enter url")
	public void open_browser_and_enter_url() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Java-Jars2019\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		driver.get("https://in.yahoo.com/?p=us");
	}

	@When("clicked on the signIn button")
	public void clicked_on_the_signIn_button() {

		driver.navigate().refresh();

	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}

}