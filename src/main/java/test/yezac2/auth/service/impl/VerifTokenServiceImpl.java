package test.yezac2.auth.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import test.yezac2.auth.model.VerifToken;
import test.yezac2.auth.payload.VerifTokenReq;
import test.yezac2.auth.mapper.VerifTokenMapper;
import test.yezac2.auth.service.VerifTokenService;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class VerifTokenServiceImpl implements VerifTokenService {

    private final VerifTokenMapper verifTokenMapper;

    @Override
    public int saveVerifToken(VerifTokenReq req) {
        return verifTokenMapper.saveVerifToken(req);
    }

    @Override
    public Optional<VerifToken> getVerifToken(VerifTokenReq req) {
        return verifTokenMapper.getVerifToken(req);
    }

    @Override
    public int setVerifiedAt(VerifTokenReq req) {
        return verifTokenMapper.setVerifiedAt(req);
    }
}
