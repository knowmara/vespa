// Copyright 2017 Yahoo Holdings. Licensed under the terms of the Apache 2.0 license. See LICENSE in the project root.
package com.yahoo.language.provider;

import com.yahoo.language.simple.SimpleLinguistics;
import com.yahoo.container.di.componentgraph.Provider;
import com.yahoo.language.Linguistics;

/**
 * Provides simple linguistics if no linguistics component has been explicitly configured
 * (dependency injection will fallback to providers if no components of the requested type is found).
 *
 * @author bratseth
 */
public class SimpleLinguisticsProvider implements Provider<Linguistics> {

    private final Linguistics linguistics;

    public SimpleLinguisticsProvider() {
        linguistics = new SimpleLinguistics();
    }

    @Override
    public Linguistics get() { return linguistics; }

    @Override
    public void deconstruct() {}

}
