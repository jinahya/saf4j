package org.saf4j.core.lang;

abstract class AbstractFloatAssertion<S extends AbstractFloatAssertion<S>>
        extends AbstractObjectAssertion<S, Float>
        implements FloatAssertion<S> {

    static class DefaultFloatAssertion
            extends AbstractFloatAssertion<DefaultFloatAssertion> {

        DefaultFloatAssertion(final Float actual) {
            super(actual);
        }
    }

    AbstractFloatAssertion(final Float actual) {
        super(actual);
    }
}
