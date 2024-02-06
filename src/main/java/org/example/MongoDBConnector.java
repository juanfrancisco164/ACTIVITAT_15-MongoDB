package org.example;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnector {
    private MongoClient mongoClient;
    private MongoDatabase database;

    public MongoDBConnector() {
        mongoClient = MongoClients.create("mongodb://localhost:27017");

        database = mongoClient.getDatabase("reservesDB");
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void closeConnection() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}