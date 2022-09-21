package soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=SoundSystemConfig.class)
//@ContextConfiguration(classes=SoundSystemConfig.class)
@ContextConfiguration(locations = {"classpath:demo.xml"}) // junit测试时候 加载xml配置bean
public class CDPlayerTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer mediaPlayer;

    @Autowired
    private CompactDisc compactDisc;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(compactDisc);
    }

    @Test
    public void play(){
        mediaPlayer.play();
        assertEquals("Playing",systemOutRule.getLog());
    }

}
