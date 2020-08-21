import io.quarkus.test.junit.QuarkusTest;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

@QuarkusTest
class ReactiveHealthBugTest {
    @Test
    void call() {
        given()
                .get("/health")
                .then()
                .statusCode(200)
                .body("status", equalTo("UP"));
    }
}
