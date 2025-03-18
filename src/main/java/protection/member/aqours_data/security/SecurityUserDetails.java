package protection.member.aqours_data.security;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import protection.member.aqours_data.sql.UserData;

public class SecurityUserDetails implements UserDetails {
    private final UserData userData;

    public SecurityUserDetails(UserData userData) {
        this.userData = userData;
    }

    public int getId() {
        return userData.getId();
    }

    public String getFullName() {
        return userData.getFullName();
    }

    public String getRole() {
        return userData.getRole();
    }

    public Date getCreateAt() {
        return userData.getCreateAt();
    }

    @Override
    public String getUsername() {
        return userData.getEmail();
    }

    @Override
    public String getPassword() {
        return userData.getPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        throw new UnsupportedOperationException("Unimplemented method 'getAuthorities'");
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }
}
