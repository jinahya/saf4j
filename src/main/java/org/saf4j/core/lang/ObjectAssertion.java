package org.saf4j.core.lang;

import org.saf4j.core.Assertion;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

@SuppressWarnings({"unchecked"})
public interface ObjectAssertion<T extends ObjectAssertion<T, A>, A>
        extends Assertion<T> {

    default T is(final Predicate<? super A> tester) {
        Objects.requireNonNull(tester, "tester is null");
        final A actual = ObjectAssertionHelper.getActual(this);
        if (!tester.test(actual)) {

        }
        return (T) this;
    }

//    default <O> T hasAsserting(final Function<? super A, ? extends O> extractor,
//                               final Function<? super O, ? extends ObjectAssertion<?, ? extends O>> factory) {
//        Objects.requireNonNull(extractor, "extractor is null");
//        Objects.requireNonNull(tester, "tester is null");
//        final A actual = ObjectAssertionHelper.getActual(isNotNull());
//        final O extracted = extractor.apply(actual);
//        if (!tester.test(extracted)) {
//
//        }
//        return (T) this;
//    }

    default <O> T hasSatisfying(final Function<? super A, ? extends O> extractor,
                                final Predicate<? super O> tester) {
        Objects.requireNonNull(extractor, "extractor is null");
        Objects.requireNonNull(tester, "tester is null");
        final A actual = ObjectAssertionHelper.getActual(isNotNull());
        final O extracted = extractor.apply(actual);
        if (!tester.test(extracted)) {

        }
        return (T) this;
    }

    default <O> T hasSatisfyingAllOf(final Function<? super A, ? extends O> extractor,
                                     final Predicate<? super O> tester1,
                                     final Predicate<? super O>... testers) {
        Objects.requireNonNull(extractor, "extractor is null");
        Objects.requireNonNull(tester1, "tester1 is null");
        Objects.requireNonNull(testers, "testers is null");
        final A actual = ObjectAssertionHelper.getActual(isNotNull());
        final O extracted = extractor.apply(actual);
        if (!tester1.test(extracted)) {
            // TODO: throw! 

        }
        for (final Predicate<? super O> t : testers) {
            if (!t.test(extracted)) {
                // TODO: throw! 
            }
        }
        return (T) this;
    }

    default <O> T hasSatisfyingAllOf(final Function<? super A, ? extends O> extractor,
                                     final Predicate<? super O> tester1,
                                     final Predicate<? super O> tester2,
                                     final Predicate<? super O>... testers) {
        Objects.requireNonNull(extractor, "extractor is null");
        Objects.requireNonNull(tester1, "tester1 is null");
        Objects.requireNonNull(testers, "testers is null");
        final A actual = ObjectAssertionHelper.getActual(isNotNull());
        final O extracted = extractor.apply(actual);
        if (!tester1.test(extracted)) {
            // TODO: throw! 
        }
        if (!tester2.test(extracted)) {
            // TODO: throw! 
        }
        for (final Predicate<? super O> t : testers) {
            if (!t.test(extracted)) {
                // TODO: throw! 
            }
        }
        return (T) this;
    }

    default <O> T hasSatisfyingAnyOf(final Function<? super A, ? extends O> extractor,
                                     final Predicate<? super O> tester1,
                                     final Predicate<? super O>... testers) {
        Objects.requireNonNull(extractor, "extractor is null");
        Objects.requireNonNull(tester1, "tester1 is null");
        Objects.requireNonNull(testers, "testers is null");
        final A actual = ObjectAssertionHelper.getActual(isNotNull());
        final O extracted = extractor.apply(actual);
        if (tester1.test(extracted)) {
            return (T) this;
        }
        for (final Predicate<? super O> t : testers) {
            if (t.test(extracted)) {
                return (T) this;
            }
        }
        // TODO: throw!
        return null;
    }

    default <O> T hasSatisfyingAnyOf(final Function<? super A, ? extends O> extractor,
                                     final Predicate<? super O> tester1,
                                     final Predicate<? super O> tester2,
                                     final Predicate<? super O>... testers) {
        Objects.requireNonNull(extractor, "extractor is null");
        Objects.requireNonNull(tester1, "tester1 is null");
        Objects.requireNonNull(testers, "testers is null");
        final A actual = ObjectAssertionHelper.getActual(isNotNull());
        final O extracted = extractor.apply(actual);
        if (tester1.test(extracted)) {
            return (T) this;
        }
        if (tester2.test(extracted)) {
            return (T) this;
        }
        for (final Predicate<? super O> t : testers) {
            if (t.test(extracted)) {
                return (T) this;
            }
        }
        // TODO: throw!
        return null;
    }

    default T isNull() {
        if (true) {
            return is(Objects::isNull);
        }
        final A actual = ObjectAssertionHelper.getActual(this);
        assert actual == null : "actual value expected to be not null but is";
        return (T) this;
    }

    @SuppressWarnings({"unchecked"})
    default T isNotNull() {
        if (true) {
            return is(Objects::nonNull);
        }
        final A actual = ObjectAssertionHelper.getActual(this);
        assert actual != null : "actual value expected to be null but is not";
        return (T) this;
    }

    @SuppressWarnings({"unchecked"})
    default T isEqualTo(final Object obj) {
        if (true) {
            return is(a -> Objects.equals(a, obj));
        }
        final A actual = ObjectAssertionHelper.getActual(this);
        if (!Objects.equals(actual, obj)) {
        }
        return (T) this;
    }

    @SuppressWarnings({"unchecked"})
    default T isLessThan(final A other, Comparator<? super A> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        final A actual = ObjectAssertionHelper.getActual(this);
        if (comparator.compare(actual, other) >= 0) {
        }
        return (T) this;
    }

    @SuppressWarnings({"unchecked"})
    default T isLessThanOrEqualTo(final A other, Comparator<? super A> comparator) {
        Objects.requireNonNull(comparator, "comparator is null");
        final A actual = ObjectAssertionHelper.getActual(this);
        if (comparator.compare(actual, other) > 0) {
        }
        return (T) this;
    }
}
