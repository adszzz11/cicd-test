package com.example.docker;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class ForJenkinsJunitTest {

    @Test
    public void alwaysTrue() {
        assertThat(1).isEqualTo(1);
    }

    @Test
    public void alwaysFalse() {

        int value=2;
        assertThat(value).isEqualTo(1);
    }

}
