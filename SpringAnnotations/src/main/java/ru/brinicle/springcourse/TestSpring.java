package ru.brinicle.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        //Music music = context.getBean("someRockMusic", Music.class);
//        Music music = context.getBean("rockMusic", Music.class);
//        Music classicalMusic = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);
//
//        musicPlayer.playMusic();
//        classicalMusicPlayer.playMusic();
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}