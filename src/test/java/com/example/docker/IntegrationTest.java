package com.example.docker;

import jdk.jfr.Category;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
@Category("IntegrationTest.class")
public abstract class IntegrationTest {

}
