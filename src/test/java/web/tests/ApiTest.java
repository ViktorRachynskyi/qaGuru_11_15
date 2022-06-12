package web.tests;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import web.config.ApiConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApiTest {

    @Test
    public void apiTest() {
        ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());

        assertThat(config.baseUrl()).isEqualTo("https://github.com/");
        assertThat(config.token()).isEqualTo("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3O" +
                "DkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c");
    }
}
