package org.saf4j.core;

import java.util.Objects;

public abstract class AssertionTest<S extends Assertion<S>> {

    protected AssertionTest(final Class<S> assertionClass) {
        super();
        this.assertionClass = Objects.requireNonNull(assertionClass, "assertionClass is null");
    }

    protected final Class<S> assertionClass;
}
