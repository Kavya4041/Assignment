package com.relations.task.dictionarytask.mapper;
import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;

@Configuration
public class MapperConfig {
	
	@Bean
	public ModelMapper createconfig()
	{
		return new ModelMapper();
	}

}
