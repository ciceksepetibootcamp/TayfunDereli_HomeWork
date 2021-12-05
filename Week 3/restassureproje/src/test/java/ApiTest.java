import javafx.beans.binding.When;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.number.OrderingComparison.comparesEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThan;

public class ApiTest {

    @Test
    public void getById () {
        when()
                .get("https://petstore.swagger.io/v2/pet/512")
                .then()
                .statusCode(200)
                .body("name",equalTo("karabaş"))
                .time(lessThan(2000L));
    }
    @Test
    public void LoginUser () {
        when()
                .get("https://petstore.swagger.io/v2/user/login?username=tayfun&password=dereli")
                .then()
                .statusCode(200)
                .body("type",equalTo("unknown"))
                .time(lessThan(2000L));
    }
    @Test
    public void LogOut () {
        when()
                .get("https://petstore.swagger.io/v2/user/logout")
                .then()
                .statusCode(200)
                .body("type",equalTo("unknown"))
                .body("message",equalTo("ok"))
                .time(lessThan(2000L));
    }

    @Test
    public void GetUser () {
        when()
                .get("https://petstore.swagger.io/v2/user/savior")
                .then()
                .statusCode(200)
                .body("id",equalTo(513))
                .body("firstName",equalTo("tayfun"))
                .body("lastName",equalTo("dereli"))
                .body("email",equalTo("tayfun@dereli.com"))
                .time(lessThan(2000L));
    }
    @Test
    public void DeleteUser () {
        when()
                .get("https://petstore.swagger.io/v2/user/login?username=savior&password=123T")
                .then()
                .statusCode(200)
                .body("code",equalTo(200))
                .body("type",equalTo("unknown"))
                .time(lessThan(2000L));
    }
}
