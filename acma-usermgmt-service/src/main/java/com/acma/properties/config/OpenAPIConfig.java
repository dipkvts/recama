/**
 * 
 */
package com.acma.properties.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

/**
 * 
 */
@Configuration
@OpenAPIDefinition(info = @Info(title = "Users Management Service",
								description = "Users Management Service",
								version = "v1",
								license = @License(name = "dipkvts",url = "https://www.vatsdeepak.in",identifier = "Copyright@2024"),
								contact = @Contact(email = "dipkvts@gmail.com")))
@SecurityScheme(name = "bearerAuth",scheme = "bearer",type = SecuritySchemeType.HTTP, bearerFormat = "JWT")
public class OpenAPIConfig {

}
