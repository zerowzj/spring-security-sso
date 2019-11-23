package study.springsecurity.sso.client.support;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@EnableOAuth2Sso
@SpringBootApplication(scanBasePackages = "study.springsecurity.sso.client2")
public class SpringBootCfg {
}
