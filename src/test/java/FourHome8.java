import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class FourHome8 {

    @Test
    public void firstTest(){

        given()
                .baseUri("https://petstore.swagger.io/v2")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"id\": 16077060,\n" +
                        "  \"name\": \"Chivas\",\n" +
                        "  \"status\": \"sold\"\n" +
                        "}")
                .log().all()
                .when()
                .post("/pet")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(16077060))
                .body("name", equalTo("Chivas"))
                .body("status", equalTo("sold"));
    }

    @Test
    public void secondTest(){

        given()
                .baseUri("https://petstore.swagger.io/v2")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"id\": 16077060,\n" +
                        "  \"name\": \"Chivas12\",\n" +
                        "  \"status\": \"sold\"\n" +
                        "}")
                .log().all()
                .when()
                .put("/pet")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(16077060))
                .body("name", equalTo("Chivas12"))
                .body("status", equalTo("sold"));
    }

    @Test
    public void thirdTest() {

        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        given()
                .log().all()
                .when()
                .delete("/pet/16077060")
                .then()
                .log().all()
                .statusCode(200);

    }
}
