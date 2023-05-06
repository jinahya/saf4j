package org.saf4j.core.lang;

abstract class NumberAssertionTest<S extends NumberAssertion<S, A>, A extends Number>
        extends ObjectAssertionTest<S, A> {

    NumberAssertionTest(final Class<S> assertionClass, final Class<A> actualClass) {
        super(assertionClass, actualClass);
    }
}
