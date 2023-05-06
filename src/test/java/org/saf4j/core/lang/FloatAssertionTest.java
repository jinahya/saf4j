package org.saf4j.core.lang;

abstract class FloatAssertionTest<S extends FloatAssertion<S>>
        extends NumberAssertionTest<S, Float> {

    FloatAssertionTest(final Class<S> assertionClass) {
        super(assertionClass, Float.class);
    }
}
