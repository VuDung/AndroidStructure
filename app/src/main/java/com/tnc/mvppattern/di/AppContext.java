package com.tnc.mvppattern.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by CUSDungVT on 10/3/2016.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface AppContext {
}
