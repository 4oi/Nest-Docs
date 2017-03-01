/*
 * Copyright 2017 toyblocks All rights reserved.
 */
package jp.llv.nest.docs;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author toyblocks
 */

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Permission {
    
    String value();
    
}
