package org.saf4j.core.lang;

import org.junit.jupiter.api.Nested;

abstract class AbstractFloatAssertionTest<S extends AbstractFloatAssertion<S>>
        extends FloatAssertionTest<S> {

    AbstractFloatAssertionTest(final Class<S> assertionClass) {
        super(assertionClass);
    }

    @Nested
    class DefaultFloatAssertTest
            extends AbstractFloatAssertionTest<AbstractFloatAssertion.DefaultFloatAssertion> {

        DefaultFloatAssertTest() {
            super(AbstractFloatAssertion.DefaultFloatAssertion.class);
        }
    }
}
