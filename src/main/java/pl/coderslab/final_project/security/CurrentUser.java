package pl.coderslab.final_project.security;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import java.util.Collection;

public class CurrentUser extends User {
    private final pl.coderslab.final_project.security.User user;

    public CurrentUser(String userName, String password, Collection<? extends GrantedAuthority> authorities,
                       pl.coderslab.final_project.security.User user) {
        super(userName, password,true, true, true, true, authorities);
        this.user = user;
    }

    public pl.coderslab.final_project.security.User getUser() {
        return user;
    }
}
