//package com.dojo.app.configuration;
//
//import io.opentelemetry.api.trace.Span;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class OpentelemetryConfig implements WebMvcConfigurer {
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new ModuleTracingInterceptor());
//    }
//
//    private static class ModuleTracingInterceptor implements HandlerInterceptor {
//        @Override
//        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//            Span span = Span.current();
//            String path = request.getRequestURI();
//
//            if (path.startsWith("/order")) {
////                span.updateName("order." + span.getName());
//                span.setAttribute("service.module", "order");
//                span.setAttribute("module.name", "order-domain");
//            } else if (path.startsWith("/customer")) {
////                span.updateName("customer." + span.getName());
//                span.setAttribute("service.module", "customer");
//                span.setAttribute("module.name", "customer-domain");
//            }
//
//            return true;
//        }
//    }
//}
