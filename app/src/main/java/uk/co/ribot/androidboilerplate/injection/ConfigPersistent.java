package uk.co.ribot.androidboilerplate.injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

import uk.co.ribot.androidboilerplate.injection.component.ConfigPersistentComponent;

/**
 *允许相关性依赖于生命周期的范围注释。
 * {@link ConfigPersistentComponent}
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigPersistent {
}
