package org.saf4j.core.lang;

import org.opentest4j.AssertionFailedError;

import java.util.Comparator;

public interface ComparableAssertionTrait<
        S extends ObjectAssertion<S, A> & ComparableAssertionTrait<S, A>,
        A extends Comparable<? super A>> {

    @SuppressWarnings({"unchecked"})
    default S isGreaterThan(final A other) {
        final A actual = ObjectAssertionHelper.getActual((AbstractObjectAssertion<?, A>) this);
        var comparator = Comparator.<A>naturalOrder();
        if (actual == null || other == null) {
            comparator = Comparator.nullsFirst(comparator);
        }
        if (comparator.compare(actual, other) <= 0) {
            throw new AssertionFailedError("");
        }
        return (S) this;
    }

    @SuppressWarnings({"unchecked"})
    default S isGreaterThanOrEqualTo(final A other) {
        final A actual = ObjectAssertionHelper.getActual((AbstractObjectAssertion<?, A>) this);
        var comparator = Comparator.<A>naturalOrder();
        if (actual == null || other == null) {
            comparator = Comparator.nullsFirst(comparator);
        }
        if (comparator.compare(actual, other) < 0) {

        }
        return (S) this;
    }
}
