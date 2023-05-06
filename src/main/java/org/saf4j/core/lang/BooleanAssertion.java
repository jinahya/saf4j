package org.saf4j.core.lang;

public interface BooleanAssertion<T extends BooleanAssertion<T>>
        extends ObjectAssertion<T, Boolean>,
                ComparableAssertionTrait<T, Boolean> {

    T isTrue();

    T isFalse();
}
