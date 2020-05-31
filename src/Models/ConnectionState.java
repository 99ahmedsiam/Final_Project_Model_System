
package Models;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import java.sql.Connection;


public interface ConnectionState {

    public Connection getStateOfConnection(MySQLConnection dbConnection);
    public MongoDatabase getStateOfMongoConnection(MongoConnection mongoConnection);
}
