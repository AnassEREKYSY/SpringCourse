package com.hitema.intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class IntroApplication implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(IntroApplication.class);
	@Value("${server.port}")
	private Integer port ;

	@Value("${server.servlet.context-path}")
	private String contextPath ;
	public static void main(String[] args) {
		SpringApplication.run(IntroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String url = String.format("http://localhost:%d%s/check", port, contextPath);
		log.info("{}",url);
	}

}
