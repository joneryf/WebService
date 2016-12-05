package br.com.livro.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Application;

import org.springframework.stereotype.Component;

@Component
public class MyApplication extends Application {

	@Override
	public Map<String, Object> getProperties() {
		Map<String, Object> properties = new HashMap<>();
		//Configura o pacote para fazer scan das classes com anotacoes REST
		properties.put("jersey.config.server.provider.packages", "br.com.livro");
		return properties;
	}

}
