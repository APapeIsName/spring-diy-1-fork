package com.diy.framework.web.interceptor;

import com.diy.framework.web.mvc.view.ModelAndView;
import org.apache.tomcat.util.buf.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthorizationHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(final HttpServletRequest req, final HttpServletResponse resp) {
        String authorizationHeader = req.getHeader("Authorization");
        if (authorizationHeader == null || authorizationHeader.isBlank()) {
            resp.setStatus(401);
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(final HttpServletRequest req, final HttpServletResponse resp, ModelAndView mv) {

    }

    @Override
    public void afterCompletion(final HttpServletRequest req, final HttpServletResponse resp) {

    }
}
