package ru.netology.rest;


import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.given;


public class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {

        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some data"));

    }


}
