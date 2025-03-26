package cc.greenit.mis.common.error.exception;

import cc.greenit.cms.common.error.ErrorCode;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * packageName    : cc.greenit.cms.globlas.error.exception
 * fileName       : AccessDeniedHandlerException
 * author         : zaid
 * date           : 2023/06/30
 * description    :
 */
public class AccessDeniedHandlerException implements AccessDeniedHandler {
     @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        response.setStatus(ErrorCode.WRONG_APPROACH.getStatus());
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");

        PrintWriter printWriter = response.getWriter();

        printWriter.flush();
        printWriter.close();
    }
}
