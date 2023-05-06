package org.saf4j.core.lang;

import org.saf4j.core.AssertionTest;

import java.util.Objects;

public abstract class ObjectAssertionTest<S extends ObjectAssertion<S, A>, A>
        extends AssertionTest<S> {

    protected ObjectAssertionTest(final Class<S> assertionClass, final Class<A> actualClass) {
        super(assertionClass);
        this.actualClass = Objects.requireNonNull(actualClass, "actualClass is null");
    }

    protected final Class<A> actualClass;
}
