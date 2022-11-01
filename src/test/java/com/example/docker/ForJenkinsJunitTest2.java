package com.example.docker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ForJenkinsJunitTest2 {

//    @Test
//    public void alwaysTrue() {
//        assertThat(1).isEqualTo(1);
//    }

    @Test
    public void alwaysFalse() {

        int value=2;
        assertThat(value).isEqualTo(1);
    }

}
