package {{ cookiecutter.package_name }};

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("tests")
class {{ cookiecutter.application_class_name }}Tests {

    @Test
    void contextLoads() {
    }
}
