package org.saf4j.core.lang;

public final class _LangAssertions {

    public static FloatAssertion<?> assertSimply(final Float actual) {
        return new AbstractFloatAssertion.DefaultFloatAssertion(actual);
    }

    private _LangAssertions() {
        throw new AssertionError("instantiation is not allowed");
    }
}
