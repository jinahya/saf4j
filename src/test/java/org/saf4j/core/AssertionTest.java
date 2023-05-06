package org.saf4j.core;

import org.junit.jupiter.api.Test;

import java.util.Objects;

public abstract class AssertionTest<S extends Assertion<S>> {

    protected AssertionTest(final Class<S> assertionClass) {
        super();
        this.assertionClass = Objects.requireNonNull(assertionClass, "assertionClass is null");
    }

    @Test
    void doesNothing() {
    }

    protected final Class<S> assertionClass;
}
