package org.saf4j.core.lang;

import java.util.Collection;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

@SuppressWarnings({"unchecked"})
public interface IterableAssertionTrait<
        S extends ObjectAssertion<S, A> & IterableAssertionTrait<S, A, E>,
        A extends Iterable<? extends E>,
        E> {

    default S hasSize(final int expected) {
        return ((S) this).isNotNull().is(a -> IterableAssertionTraitHelper.count(a) != expected);
    }

    default S hasSizeGreaterThan(final int expected) {
        return ((S) this).isNotNull().is(a -> IterableAssertionTraitHelper.count(a) > expected);
    }

    default S hasSizeGreaterThanOrEqualTo(final int expected) {
        return ((S) this).isNotNull().is(a -> IterableAssertionTraitHelper.count(a) >= expected);
    }

    default S hasSizeLessThan(final int expected) {
        return ((S) this).isNotNull().is(a -> IterableAssertionTraitHelper.count(a) < expected);
    }

    default S hasSizeLessThanOrEqualTo(final int expected) {
        return ((S) this).isNotNull().is(a -> IterableAssertionTraitHelper.count(a) <= expected);
    }

    default S isEmpty() {
        return hasSize(0);
    }

    default S isNotEmpty() {
        return hasSizeGreaterThan(0);
    }

    default S contains(final E o) {
        return ((S) this).isNotNull().is(a -> {
            if (a instanceof Collection<?>) {
                return ((Collection<E>) a).contains(o);
            }
            for (final E e : a) {
                if (Objects.equals(e, o)) {
                    return true;
                }
            }
            return false;
        });
    }

    default S iterate(final BiConsumer<? super Integer, ? super E> consumer) {
        Objects.requireNonNull(consumer, "consumer is null");
        return ((S) this).isNotNull().is(a -> {
            final var iterator = a.iterator();
            for (int i = 0; iterator.hasNext(); i++) {
                consumer.accept(i, iterator.next());
            }
            return true;
        });
    }

    default S iterate(final Consumer<? super E> consumer) {
        Objects.requireNonNull(consumer, "consumer is null");
        return iterate((i, e) -> consumer.accept(e));
    }
}
