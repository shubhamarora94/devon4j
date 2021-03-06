package com.devonfw.module.test.common.base;

import org.junit.jupiter.api.Tag;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.devonfw.module.test.common.api.category.TagSubsystemTest;

/**
 * This is the abstract base class for an integrative test of a sub-system (e.g. your application backend). You are free
 * to create your integration tests as you like just by annotating {@link TagSubsystemTest} using {@link Tag}. However,
 * in most cases it will be convenient just to extend this class. Also we recommend to use the {@code spring} framework
 * and utilize {@code spring-boot-test}. In such case create an abstract base-class for the {@link SubsystemTest}s of
 * your application as following:
 *
 * <pre>
 * &#64;{@link org.springframework.boot.test.context.SpringBootTest} (webEnvironment =
 * {@link org.springframework.boot.test.context.SpringBootTest.WebEnvironment#RANDOM_PORT}, classes =
 * MyApplication.class) public abstract class MyApplicationSubsystemTest {
 * }
 * </pre>
 *
 * @see TagSubsystemTest
 */
@SpringJUnitConfig
@TestExecutionListeners({ TransactionalTestExecutionListener.class, DependencyInjectionTestExecutionListener.class })
@TagSubsystemTest
public abstract class SubsystemTest extends BaseTest {

}
