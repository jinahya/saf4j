package org.saf4j.core.lang;

import org.saf4j.core.AbstractAssertion;

public abstract class AbstractObjectAssertion<T extends AbstractObjectAssertion<T, A>, A>
        extends AbstractAssertion<T>
        implements ObjectAssertion<T, A> {

    protected AbstractObjectAssertion(final A actual) {
        super();
        this.actual = actual;
    }

    protected final A actual() {
        return actual;
    }

    final A actual;
}
