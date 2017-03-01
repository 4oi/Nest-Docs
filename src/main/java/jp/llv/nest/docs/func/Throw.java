/*
 * Copyright 2017 toyblocks All rights reserved.
 */
package jp.llv.nest.docs.func;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author toyblocks
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Repeatable(Throws.class)
@Documented
@Inherited
public @interface Throw {
    
    Class<?> type();
    
    String reason();
    
}
