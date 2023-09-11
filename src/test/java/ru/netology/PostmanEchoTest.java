package ru.netology;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.Argument;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class PostmanEchoTest {
    @Test
    void shouldTestPostmanEcho() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200);
    }
}
