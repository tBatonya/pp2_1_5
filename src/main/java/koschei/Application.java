package koschei;

import koschei.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Application {
    public static void main(String[] args) {
        final Logger log = Logger.getLogger(Application.class.getName());

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        KoscheiTheDeathless koscheiTheDeathless =
                applicationContext.getBean(KoscheiTheDeathless.class);
        log.info(koscheiTheDeathless.getRulesByDeth());
    }
}
