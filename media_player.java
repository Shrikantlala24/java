import java.util.*;

public class media_player {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equals("Audio")) {
            audio_player a1 = new audio_player();
            a1.play();
        }
        else if (input.equals("Video")) {
            video_player v1 = new video_player();
            v1.play();
        }
        sc.close();
    }
}

class player {
    void play() {
        System.out.println("playing");
    }
}
class audio_player extends player {
    @Override
    void play() {
        System.out.println("Playing Audio");
    }
}
class video_player extends player {
    @Override
    void play() {
        System.out.println("Playing Video");
    } 
}