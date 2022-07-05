package main.java.dungeonDragon.character.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import dungeonDragon.character.Warrior;

public class WarriorDAO {

    private final String BDD = "abstractCharacter";
    private final String url ="jdbc:mysql://localhost:3306/" + BDD;
            // "http://localhost/phpmyadmin/db_structure.php?server=1&db=abstractcharacter";
    private final String user = "Virginie";
    private final String pwd = "toto";

     // private Connection connection = new Connection();

    /**
     * get all characters on database
     * @return characters list
     */

    public List<Warrior>getAll() {

        List<Warrior>warriorList = new ArrayList<>();

        try {
            Connection connection = DriverManager.getConnection(url, user, pwd);
            // Connection connection = this.getConnection(this.getUrl(), this.getUser(), this.getPwd());
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM abstractCharacter");
            while (rs.next()) {
                String name = rs.getString("name");
                int life = rs.getInt("life");
                int force = rs.getInt("forceLvl");
                int intelligence = rs.getInt("intelligence");
                warriorList.add(new Warrior(name, life, force, intelligence));
            }
            // connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return warriorList;
    }

    /* GETTERS_&_SETTERS_____________________________________________________________________________ */


}
