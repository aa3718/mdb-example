package com.example.mdbspringboot.testsupport;

import static java.lang.String.format;

import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

public interface WithDockerizedMongo {
//
//	String PASSWORD = "password";
//    String USERNAME = "mongo";
//    String DATABASE_NAME = "mylearnerrecordstore";
//
//
//@DynamicPropertySource
//    private static void overridePostgresHostnameAndPort(DynamicPropertyRegistry registry) {
//
//        String newConnectionUrl = format("jdbc:postgresql://%s:%d/%s",
//            MongoTestContainer.INSTANCE.getHost(),
//            MongoTestContainer.INSTANCE.getFirstMappedPort(),
//            DATABASE_NAME);
//
//        overrideApplicationProperties(registry, newConnectionUrl);
//        overrideLiquibaseProperties(registry, newConnectionUrl);
//    }
//
//    private static void overrideLiquibaseProperties(DynamicPropertyRegistry registry, String newConnectionUrl) {
//        registry.add("learner.product.liquibase.url", () -> newConnectionUrl);
//        registry.add("learner.product.liquibase.password", () -> WithDockerizedPostgres.PASSWORD);
//        registry.add("learner.product.liquibase.user", () -> WithDockerizedPostgres.USERNAME);
//    }
//
//    private static void overrideApplicationProperties(DynamicPropertyRegistry registry, String newConnectionUrl) {
//        registry.add("learner.product.datasource.url", () -> newConnectionUrl);
//        registry.add("learner.product.datasource.password", () -> WithDockerizedPostgres.PASSWORD);
//        registry.add("learner.product.datasource.username", () -> WithDockerizedPostgres.USERNAME);
//    }
//
//    @Slf4j
//    class MongoTestContainer {
//        private static final GenericContainer<?> INSTANCE = createContainer();
//
//        @SneakyThrows
//        private static GenericContainer<?> createContainer() {
//            final GenericContainer<?> container = new MongoDBContainer<>(DockerImageName.parse("mongo:latest"))
//                .withUsername(USERNAME)
//                .withDatabaseName(DATABASE_NAME)
//                .withPassword(PASSWORD)
//                .withLogConsumer(outputFrame -> log.trace(outputFrame.getUtf8String()))
//                .withReuse(true);
//
//            container.start();
//            container
//                .execInContainer("createdb", format("--owner=%s", USERNAME),
//                    DATABASE_NAME, format("--username=%s", USERNAME));
//            return container;
//        }
//    }
}
