package stepdefiniton;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginFucntionality extends Base {
	@Given("I am in walmart.com")
	public void i_am_in_walmart_com() {
	    driver.get("https://www.walmart.com/");
	}
	@Given("I want to click the search button and type camera on the search bar and click on the search bar link.")
	public void i_want_to_click_the_search_button_and_type_camera_on_the_search_bar_and_click_on_the_search_bar_link() {
	    driver.findElement(By.xpath("//input[@type='search']")).sendKeys("camera");
	    driver.findElement(By.xpath("//*[@id='__next']/div[1]/div/span/header/div/form/div/button/i")).click();
	}

	@Then("i need to click on kodak PIXPRO EZ43 compact Digital Camera 16MP Zoom HD 720P.")
	public void i_need_to_click_on_kodak_pixpro_ez43_compact_digital_camera_16mp_zoom_hd_720p() throws InterruptedException {
	    Thread.sleep(5000);
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Click on the availability nearby")
	public void click_on_the_availability_nearby() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
