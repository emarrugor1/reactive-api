package udc.edu.co.reactiveapi.persistence.config;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@Configuration
@EnableReactiveMongoRepositories(basePackages = "udc.edu.co.reactiveapi.persistence.repository")
public class PersistanceConfig extends AbstractReactiveMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "curriculums_db";
    }

    @Override
    public MongoClient reactiveMongoClient() {
        return MongoClients.create("mongodb://user:pass@localhost:27017/?authMechanism=SCRAM-SHA-1");
    }

}
