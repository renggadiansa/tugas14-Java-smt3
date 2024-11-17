class MySqlDatabase implements Database {
  public MySqlDatabase() {

  }

  public void connect() {
    System.out.println("Connect to MySqlDatabase");
  }

  public void disconnect() {
    System.out.println("Disconnect to MySqlDatabase");
  }

}
