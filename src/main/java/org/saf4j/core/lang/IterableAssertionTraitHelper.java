package org.saf4j.core.lang;

import java.util.Collection;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;

final class IterableAssertionTraitHelper {

    static long count(final Iterable<?> iterable) {
        Objects.requireNonNull(iterable, "iterable is null");
        if (iterable instanceof Collection<?>) {
            return ((Collection<?>) iterable).size();
        }
        return StreamSupport.stream(iterable.spliterator(), false).count();
    }

    static <E> void iterate(final Iterable<? extends E> iterable, final Consumer<? super E> consumer) {
        iterable.forEach(consumer);
    }

    private IterableAssertionTraitHelper() {
        throw new AssertionError("instantiation is not allowed");
    }
}
