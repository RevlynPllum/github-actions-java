@SuppressWarnings("checkstyle:HideUtilityClassConstructor")
@SpringBootApplication
public class DevopsTrainingApplication {
    public static void main(String[] args) {
        SpringApplication.run(DevopsTrainingApplication.class, args);
    }
}

public class DevopsTrainingApplication {
    
    // Private constructor to prevent instantiation
    private DevopsTrainingApplication() {
        throw new UnsupportedOperationException("Utility class");
    }
    
    public static void main(String[] args) {
        SpringApplication.run(DevopsTrainingApplication.class, args);
    }
}
