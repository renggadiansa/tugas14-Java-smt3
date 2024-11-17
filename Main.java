public class Main {

  public static void main(String[] args) {
    Database mysql = new MySqlDatabase();

    UserController userController = new UserController(mysql);

    userController.MySqlDatabase();
  }
}
