package az.insurance.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class InsuranceCloudServerConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsuranceCloudServerConfigurationApplication.class, args);
    }

}
//http://localhost:8888/main/application-test-default.yml working
//http://localhost:8888/main/application-test-default not working, search
//http://localhost:8888/application-test/default