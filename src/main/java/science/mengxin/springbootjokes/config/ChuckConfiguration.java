package science.mengxin.springbootjokes.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;

/**
 * <p>Date:    22/04/18
 *
 * @author mengxin
 * @version 1.0
 */
//@Configuration
public class ChuckConfiguration {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
