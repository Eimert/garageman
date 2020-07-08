//package nl.eimertvink.garageman.configuration;
//
//
//import com.fasterxml.classmate.TypeResolver;
//import nl.eimertvink.garageman.controller.InventoryController;
//import nl.eimertvink.garageman.util.Endpoints;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.data.domain.Pageable;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import springfox.documentation.builders.*;
//import springfox.documentation.schema.AlternateTypeRule;
//import springfox.documentation.schema.AlternateTypeRuleConvention;
//import springfox.documentation.schema.ModelRef;
//import springfox.documentation.service.*;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spi.service.contexts.SecurityContext;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.lang.reflect.Type;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Stream;
//
//import static springfox.documentation.schema.AlternateTypeRules.newRule;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfiguration implements WebMvcConfigurer {
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//
//            .apiInfo(apiInfo())
//            .securitySchemes(createSecuritySchemes("basicAuth"))
//            .securityContexts(createSecurityContexts("basicAuth"))
//            .select()
//
//            .apis(RequestHandlerSelectors.basePackage(getBasePackage()))
//            .paths(PathSelectors.ant(Endpoints.REST_BASE + "/**/*"))
//
//            .build()
//
//            .globalOperationParameters(createParameters());
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("swagger-ui.html")
//            .addResourceLocations("classpath:/META-INF/resources/");
//
//        registry.addResourceHandler("/webjars/**")
//            .addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }
//
//    private String getBasePackage() {
//        return InventoryController.class.getPackage().getName();
//    }
//
//    private List<Parameter> createParameters() {
//        return Collections.emptyList();
////      return Stream.of(
////         createHeaderParam("X-Requested-With", "CSRF01: a X-Requested-With is required in the header", "XMLHttpRequest"),
////         createHeaderParam("Referer", "CSRF02: a Referer is required in the header", "https://ace{-development/test/acceptance}.ic.ing.net/")
////      ).collect(Collectors.toList());
//    }
//
//    private List<SecurityScheme> createSecuritySchemes(String name) {
//        return Collections.singletonList(createBasicAuthHeader(name));
//    }
//
//    private BasicAuth createBasicAuthHeader(String name) {
//        return new BasicAuth(name);
//    }
//
//
//    private List<SecurityContext> createSecurityContexts(String reference) {
//        return Collections.singletonList(SecurityContext.builder()
//            .securityReferences(createSecurityReferences(reference))
//            .build());
//    }
//
//    private List<SecurityReference> createSecurityReferences(String reference) {
//        return Collections.singletonList(SecurityReference.builder()
//            .reference(reference)
//            .scopes(createAuthorizationScopes()).build());
//    }
//
//    private AuthorizationScope[] createAuthorizationScopes() {
//        final AuthorizationScope authScope = new AuthorizationScopeBuilder()
//            .scope("global")
//            .description("full access")
//            .build();
//        return Stream.of(authScope).toArray(AuthorizationScope[]::new);
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder().title("Garageman API")
//            .description("Exposes inventory data of the garageman dealership.")
//            .version("1.0.0")
//            .build();
//    }
//
//    private Parameter createHeaderParam(String name, String description, String defaultValue) {
//
//        return new ParameterBuilder()
//            .name(name)
//            .description(description)
//            .required(true)
//            .defaultValue(defaultValue)
//            .allowEmptyValue(false)
//            .allowMultiple(true)
//            .modelRef(new ModelRef("string"))
//            .parameterType("header")
//            .build();
//    }
//
//    @Bean
//    public AlternateTypeRuleConvention pageableConvention(final TypeResolver resolver) {
//        return new AlternateTypeRuleConvention() {
//
//            @Override
//            public int getOrder() {
//                return Ordered.HIGHEST_PRECEDENCE;
//            }
//
//            @Override
//            public List<AlternateTypeRule> rules() {
//                return Collections.singletonList(
//                    newRule(resolver.resolve(Pageable.class), resolver.resolve(pageableMixin()))
//                );
//            }
//        };
//    }
//
//    private Type pageableMixin() {
//        return new AlternateTypeBuilder()
//            .fullyQualifiedClassName(
//                String.format("%s.generated.%s",
//                    Pageable.class.getPackage().getName(),
//                    Pageable.class.getSimpleName()))
//            .withProperties(Arrays.asList(
//                property(Integer.class, "page"),
//                property(Integer.class, "size"),
//                property(String.class, "sort")
//            ))
//            .build();
//    }
//
//    private AlternateTypePropertyBuilder property(Class<?> type, String name) {
//        return new AlternateTypePropertyBuilder()
//            .withName(name)
//            .withType(type)
//            .withCanRead(true)
//            .withCanWrite(true);
//    }
//}