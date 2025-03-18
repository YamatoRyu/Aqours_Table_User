package protection.member.aqours_data.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import protection.member.aqours_data.sql.UserData;
import protection.member.aqours_data.sql.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class SecurityService implements UserDetailsService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserData userData = repository.findByEmail(username);

        if (userData != null) {
            return User.withUsername(userData.getEmail())
                    .password(userData.getPassword())
                    .roles(userData.getRole())
                    .build();
        }

        throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
    }

    public UserData getEmail() {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();

        return repository.findByEmail(email);
    }
}
