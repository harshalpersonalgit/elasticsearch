package com.es.elasticsearch;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan
@EnableElasticsearchRepositories
@EnableScheduling
public class ElasticsearchApplication<T> {

	public static void main(String[] args) {
		SpringApplication.run(ElasticsearchApplication.class, args);
	}

	@Bean
	RestHighLevelClient elasticsearchClient() {
		final ClientConfiguration configuration = ClientConfiguration.localhost();
		RestHighLevelClient client = RestClients.create(configuration).rest();
		return client;
	}

	@Bean
	ElasticsearchRestTemplate elasticsearchTemplate() {
		return new ElasticsearchRestTemplate(elasticsearchClient());
	}
}
