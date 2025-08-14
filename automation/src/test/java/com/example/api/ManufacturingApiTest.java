package com.example.api;
import io.restassured.RestAssured; import org.testng.annotations.Test;
import static io.restassured.RestAssured.given; import static org.hamcrest.Matchers.equalTo;
public class ManufacturingApiTest {
 @Test public void echo(){ RestAssured.baseURI="https://postman-echo.com";
   given().contentType("application/json").body("{\"hello\":\"world\"}")
   .when().post("/post").then().statusCode(200).body("json.hello", equalTo("world")); }
}