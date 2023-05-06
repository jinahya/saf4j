package org.saf4j.core.lang;

@SuppressWarnings({"unchecked"})
public interface CountableAssertionTrait<
        S extends ObjectAssertion<S, ?> & CountableAssertionTrait<S>> {

    S hasCount(final int expected);

    S hasCountGreaterThan(final int expected);

    S hasCountGreaterThanOrEqualTo(final int expected);

    S hasCountLessThan(final int expected);

    S hasCountLessThanOrEqualTo(final int expected);
}
