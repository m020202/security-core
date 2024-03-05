package com.example.corespringsecurity.security.filter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.io.IOException;

public class AjaxLoginProcessingFilter extends AbstractAuthenticationProcessingFilter {
    public AjaxLoginProcessingFilter(String defaultFilterProcessesUrl) {
        super(new AntPathRequestMatcher("/api/login"));
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {

        if (!isAjax(request)) {
            throw new IllegalStateException("인증 방식이 다름");
        }

        return null;
    }

    public boolean isAjax(HttpServletRequest request) {
        if ("XMLHttpRequest".equals(request.getHeader("x-Requested-with"))) {
            return true;
        }
        return false;
    }
}
