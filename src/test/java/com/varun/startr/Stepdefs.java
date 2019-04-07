package com.varun.startr;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;

@ContextConfiguration(classes = StartrApplication.class,
                        loader = SpringBootContextLoader.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest
public class Stepdefs {

    private boolean isServerRunning = false;
    private CloseableHttpClient client = HttpClients.createDefault();
    private HttpResponse response;

    @Given("that the server is running")
    public void that_the_server_is_runinng() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Yay");
    }


    @When("user call GET on \\/article")
    public void user_call_GET_on_article() {
        try {
            HttpGet request = new HttpGet("http://localhost:8080/article");
            request.addHeader("content-type", "application/json");
            response = client.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Then("we return the full HTTP Response")
    public void we_return_the_full_HTTP_Response() {
        // Write code here that turns the phrase above into concrete actions

        throw new cucumber.api.PendingException();
    }

}
