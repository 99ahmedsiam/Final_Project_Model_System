
package Models;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CloseConnection implements ConnectionState {

    @Override
    public Connection getStateOfConnection(MySQLConnection dbConnection) {
        try {
            dbConnection.getStatement("").close();
            dbConnection.connection.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return dbConnection.connection;
    }



    @Override
    public MongoDatabase getStateOfMongoConnection(MongoConnection mongoConnection) {
        mongoConnection.client.close(); 
        return mongoConnection.database;
    }

}
