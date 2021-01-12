package com.adactin.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.HomePage;
import com.adactinsite.runner.Runner;
import com.project.baseclass.BaseClsMaven;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClsMaven {
	
	public static WebDriver driver=Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	@Given("^User Launch the Adactin Application$")
	public void user_Launch_the_Adactin_Application() throws IOException  {
		/*
		 * driver = Getbrowser("chrome"); geturl("https://adactinhotelapp.com/");
		 */
		String url = FileReaderManager.getInstance().getCrInstance().geturl();
		geturl(url);
	}

	@When("^User Enter valid \"([^\"]*)\" in the username field$")
	public void user_Enter_valid_in_the_username_field(String username)  {
		//HomePage hp = new HomePage(driver);
		inputtoElement(pom.getHp().getUsername(),username); 
	}

	@When("^User Enter valid \"([^\"]*)\" in password field$")
	public void user_Enter_valid_in_password_field(String password) {
		//HomePage hp = new HomePage(driver);
		inputtoElement(pom.getHp().getPassword(), password);
	    
	}

	@When("^User clicks the Login Button$")
	public void user_clicks_the_Login_Button() {
		//HomePage hp = new HomePage(driver);
		clickonElement(pom.getHp().getLogin());
	   
	}

	@Then("^User navigates to the search hotel page$")
	public void user_navigates_to_the_search_hotel_page() {
	    
	}

	@Given("^It navigates to search hotel page$")
	public void it_navigates_to_search_hotel_page()  {
	    
	}

	@When("^User Select the location$")
	public void user_Select_the_location()  {
	    
	}

	@When("^User Select the Hotel$")
	public void user_Select_the_Hotel()  {
	   
	}

	@When("^User Select the Room Type$")
	public void user_Select_the_Room_Type()  {
	    
	}

	@When("^User choose the \"([^\"]*)\"$")
	public void user_choose_the(String arg1)  {
	   
	}

	@When("^User Select the AdultsPerRoom$")
	public void user_Select_the_AdultsPerRoom()  {
	   
	}

	@When("^User Select the ChildrensPerRoom$")
	public void user_Select_the_ChildrensPerRoom()  {
	   
	}

	@Then("^User navigates to Select Hotel page$")
	public void user_navigates_to_Select_Hotel_page()  {
	   
	}

	@When("^User select the hotel which is displayed\\.$")
	public void user_select_the_hotel_which_is_displayed()  {
	   
	}

	@When("^User click the continue button$")
	public void user_click_the_continue_button()  {
	    
	}

	@Then("^User navigates to Book a Hotel Page$")
	public void user_navigates_to_Book_a_Hotel_Page()  {
	   
	}

	@Given("^It navigates to book a hotel page$")
	public void it_navigates_to_book_a_hotel_page()  {
	    
	}

	@When("^User enters the \"([^\"]*)\"$")
	public void user_enters_the(String arg1)  {
	    
	}

	@When("^User enter the \"([^\"]*)\"$")
	public void user_enter_the(String arg1)  {
	   
	}

	@When("^User Select the CreditCard Type$")
	public void user_Select_the_CreditCard_Type()  {
	    
	}

	@When("^User Select the Expire Date for month$")
	public void user_Select_the_Expire_Date_for_month()  {
	   
	}

	@When("^User Select the Expire Date of year$")
	public void user_Select_the_Expire_Date_of_year()  {
	    
	}

	@When("^User Enter the \"([^\"]*)\"$")
	public void user_Enter_the(String arg1)  {
	    
	}

	@When("^click the BookNow Button$")
	public void click_the_BookNow_Button()  {
	    
	}


}
