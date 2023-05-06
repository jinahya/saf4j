package org.saf4j.core.lang;

import java.util.Objects;
import java.util.function.Function;

public final class _LangAssertions {

    public static <A extends FloatAssertion<A>> A assertSimply(final Float actual,
                                                               final Function<? super Float, ? extends A> factory) {
        Objects.requireNonNull(factory, "factory is null");
        return factory.apply(actual);
    }

    public static FloatAssertion<?> assertSimply(final Float actual) {
        return assertSimply(actual, AbstractFloatAssertion.DefaultFloatAssertion::new);
    }

    private _LangAssertions() {
        throw new AssertionError("instantiation is not allowed");
    }
}
