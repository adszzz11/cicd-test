package com.example.docker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class Unit1Test extends UnitTest{

    @Test
    public void alwaysTrue() {
        assertThat(1).isEqualTo(1);
    }

//    @Test
//    public void alwaysFalse() {
//        int value=2;
//        assertThat(value).isEqualTo(1);
//    }

}
