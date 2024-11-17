public class UserController {

  private Database database;

  public UserController(Database database) {
    this.database = database;
  }

  public void MySqlDatabase() {
    database.connect();
    database.disconnect();
  }

}
