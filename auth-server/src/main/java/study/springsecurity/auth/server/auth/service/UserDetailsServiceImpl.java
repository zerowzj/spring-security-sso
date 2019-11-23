package study.springsecurity.auth.server.auth.service;

import com.google.common.collect.Sets;
import com.sun.applet2.preloader.event.UserDeclinedEvent;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Component;
import study.springsecurity.auth.server.auth.details.CustomClientDetails;

import java.util.Set;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
