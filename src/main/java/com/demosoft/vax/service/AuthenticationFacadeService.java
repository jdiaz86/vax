package com.demosoft.vax.service;

import org.springframework.security.core.Authentication;

/**
 *
 * @author jdiaz
 */
public interface AuthenticationFacadeService {

    Authentication getAuthentication();
}