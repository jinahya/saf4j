package org.saf4j.core.lang;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

abstract class AbstractFloatAssertionTest<S extends AbstractFloatAssertion<S>>
        extends FloatAssertionTest<S> {

    AbstractFloatAssertionTest(final Class<S> assertionClass) {
        super(assertionClass);
    }

    @Test
    void __() {
    }

    @Nested
    class DefaultFloatAssertTest
            extends AbstractFloatAssertionTest<AbstractFloatAssertion.DefaultFloatAssertion> {

        DefaultFloatAssertTest() {
            super(AbstractFloatAssertion.DefaultFloatAssertion.class);
        }
    }
}
