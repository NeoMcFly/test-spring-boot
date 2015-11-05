package neomcfly.test.spring.boot.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import neomcfly.test.spring.boot.Connection;

@Slf4j
@Service
public class DefaultConnection implements Connection {

	@Value("${key}")
	private String key;

	@Override
	public void execute(String command) {
		log.info(key + " execute " + command);
	}

}
