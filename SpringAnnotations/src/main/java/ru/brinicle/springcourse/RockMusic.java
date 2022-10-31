package ru.brinicle.springcourse;

import org.springframework.stereotype.Component;

//@Component("someRockMusic")
@Component
public class RockMusic implements Music {

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
