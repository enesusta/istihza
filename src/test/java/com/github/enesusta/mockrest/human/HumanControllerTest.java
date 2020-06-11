package com.github.enesusta.mockrest.human;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.jupiter.api.Assertions.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

@QuarkusTest
class HumanControllerTest {

    @Test
    public void testList() {
        given()
                .when().get("/humans")
                .then()
                .statusCode(200)
                .body(
                        "$.size()", is(1000),
                        "first_name", hasItems("Marjorie", "Edyth"),
                        "id", hasItems(1,2));
    }

}