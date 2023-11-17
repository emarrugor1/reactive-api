package udc.edu.co.reactiveapi.persistence.mongodb.config;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories(basePackages = "udc.edu.co.reactiveapi.persistence.mongodb.repository")
public class PersistenceConfig extends AbstractReactiveMongoConfiguration {

    @Value("${spring.data.mongodb.user}")
    private String username;
    @Value("${spring.data.mongodb.password}")
    private String password;
    @Value("${spring.data.mongodb.host}")
    private String host;
    @Value("${spring.data.mongodb.port}")
    private String port;
    @Value("${spring.data.mongodb.auth-mechanism}")
    private String authMechanism;
    @Value("${spring.data.mongodb.database}")
    private String database;
    @Override
    protected String getDatabaseName() {
        return database;
    }

    @Override
    public MongoClient reactiveMongoClient() {
        return MongoClients.create("mongodb://"+username+":"+password+"@"+host+":"+port+"/?authMechanism="+authMechanism);
    }

}
