import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaServer {

    /**
     * Main boot method to start app
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class, args);
    }

}
