package {{ cookiecutter.package_name }};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{ cookiecutter.application_class_name }} {

    public static void main(String[] args) {
        SpringApplication.run({{ cookiecutter.application_class_name }}.class, args);
    }
}
