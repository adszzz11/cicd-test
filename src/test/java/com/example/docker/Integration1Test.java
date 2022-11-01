package com.example.docker;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Integration1Test extends IntegrationTest{
    @Test
    public void alwaysTrueTest1() {
        Assertions.assertThat(1).isEqualTo(1);
    }
    @Test
    public void alwaysTrueTest2() {
        Assertions.assertThat(1).isEqualTo(1);
    }
    @Test
    public void alwaysTrueTest3() {
        Assertions.assertThat(1).isEqualTo(1);
    }
    @Test
    public void alwaysTrueTest4() {
        Assertions.assertThat(1).isEqualTo(1);
    }
}
