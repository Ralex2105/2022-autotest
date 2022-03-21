package ru.ok.Utils;

public class User {
    private final String login;
    private final String password;
    private final String full_name;
    private final String friendID;
    private final String id;

    public User (String login, String password, String full_name,String friendId, String id) {
        this.login = login;
        this.password = password;
        this.full_name = full_name;
        this.friendID = friendId;
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getFriendID() {
        return friendID;
    }

    public String getId() {
        return id;
    }
}
