package test.yezac2.global.config.security.jwt;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UsernamePasswordAuthReq {

    private String username;
    private String password;

}
