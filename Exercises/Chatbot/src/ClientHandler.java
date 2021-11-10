public class ClientHandler
{
    private String userName = "";

    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public ClientHandler(String userName)
    {
        this.userName = userName;
    }

    public static String createUserName()
    {

    }
}
