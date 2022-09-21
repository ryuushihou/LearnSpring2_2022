package soundsystem;

import org.springframework.stereotype.Component;

//@Component
public class SgtPeppers implements CompactDisc{

    private String title = "Sgt.Pepper Lonely";
    private String artist = "The BBB";

    @Override
    public void play() {
        System.out.print("Playing");
    }
}
