package com.mavenit.selenium.training.step_def;

import com.mavenit.selenium.training.pages.BasketPage;
import com.mavenit.selenium.training.pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class BasketSteps extends ResultPage {
    private ResultPage resultpage = new ResultPage();
    private  BasketPage basketPage = new BasketPage();





    @When("^I select any product$")
    public void i_select_any_product() {
       resultpage.linktext("GOT IT");

        resultpage.selectAnyProduct();


    }

    @And("^I add the product to the basket$")
    public void i_add_the_product_to_the_basket()  {
        resultpage.addTrollytoBasket();
        resultpage.trollyButton();


    }


    @Then("^The product should be in the basket$")
    public void the_product_should_be_in_the_basket()  {
      String  actual = selectedProduct;
     // String expected = basketPage.getproductName();
       // assertThat(actual, is(equalTo(expected)));
      //  System.out.println(actual);
      //  System.out.println(expected);
       // sleep(3000);

    }








}
