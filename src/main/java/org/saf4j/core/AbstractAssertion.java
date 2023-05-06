package org.saf4j.core;

public abstract class AbstractAssertion<S extends AbstractAssertion<S>>
        implements Assertion<S> {

    protected AbstractAssertion() {
        super();
    }

    @SuppressWarnings({"unchecked"})
    protected final S self() {
        return (S) this;
    }
}
