import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.PetBody;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

//@Listeners({Al})
public class Lemon8 {

    @Test
    public void firstTest() {

        RestAssured.baseURI = "https://petstore.swagger.io/v2";

                given()
                        .log().all()
                        .when()
                        .get("/pet/101")
                        .then()
                        .log().all()
                        .statusCode(200)
                        .body("id",equalTo(101));
    }

    @Test
    public void validateCreatingPet(){

        given()
                .baseUri("https://petstore.swagger.io/v2")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"id\": 9996,\n" +
                        "  \"name\": \"Luna2\",\n" +
                        "  \"status\": \"sold\"\n" +
                        "}")
                .log().all()
                .when()
                .post("/pet")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(9996))
                .body("name", equalTo("Luna2"))
                .body("status", equalTo("sold"));

    }

    @Test
    public void validateCreatingPetbody() throws JsonProcessingException {

        PetBody petBody = new PetBody();
        petBody.setId(0607);
        petBody.setName("Dark");
        petBody.setStatus("sold");

        ObjectMapper mapper = new ObjectMapper();
        String bodyForPet = mapper.writeValueAsString(petBody);

        given()
                .baseUri("https://petstore.swagger.io/v2")
                .header("Content-Type", "application/json")
                .body(bodyForPet)
                .log().all()
                .when()
                .post("/pet")
                .then()
                .log().all()
                .statusCode(200)
                .body("id", equalTo(0607))
                .body("name", equalTo("Dark"))
                .body("status", equalTo("sold"));

    }
}


