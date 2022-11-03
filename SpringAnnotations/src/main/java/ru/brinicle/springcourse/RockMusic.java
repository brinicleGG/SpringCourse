package ru.brinicle.springcourse;

//@Component("someRockMusic")
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
