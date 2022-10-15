package soundsystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan
public class CDPlayerConfig {

    @Bean
//    @Profile("dev")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    @Profile("test")
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPeppers());
    }
}