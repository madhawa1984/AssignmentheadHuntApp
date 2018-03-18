package com.headhunt.managementportal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.headhunt.managementportal.configuration.HeadHuntAppConfiguration;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = HeadHuntAppConfiguration.class)
@SpringBootTest
public class ManagementportalApplicationTests {

	@Test
	public void contextLoads() {
	}

}
