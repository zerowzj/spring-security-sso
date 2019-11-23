package study.springsecurity.auth.server.auth.service;

import com.google.common.collect.Sets;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Component;
import study.springsecurity.auth.server.auth.details.CustomClientDetails;

import java.util.Set;

@Component
public class CustomClientDetailsService implements ClientDetailsService {

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        Set<String> scope = Sets.newHashSet("user_info");
        Set<String> authorizedGrantTypes = Sets.newHashSet("authorization_code", "refresh_token");
        CustomClientDetails details = new CustomClientDetails();
        return details;
    }
}
