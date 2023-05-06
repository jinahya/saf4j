package org.saf4j.core.lang;

import java.lang.invoke.MethodHandles;
import java.util.Objects;

final class ObjectAssertionHelper {

    static <T extends ObjectAssertion<? extends T, A>, A> A getActual(final T assertion) {
        Objects.requireNonNull(assertion, "assertion is null");
        if (!(assertion instanceof AbstractObjectAssertion<?, ?>)) {
            throw new IllegalArgumentException("not an instance of AbstractObjectAssertion: " + assertion);
        }
        try {
            final var methodHandle = MethodHandles.privateLookupIn(AbstractObjectAssertion.class, MethodHandles.lookup());
            final var varHandle = methodHandle.findVarHandle(AbstractObjectAssertion.class, "actual", Object.class);
            @SuppressWarnings({"unchecked"})
            final A value = (A) varHandle.get((AbstractObjectAssertion<?, ?>) assertion);
            return value;
        } catch (ReflectiveOperationException roe) {
            throw new RuntimeException(roe);
        }
    }

    private ObjectAssertionHelper() {
        throw new AssertionError("instantiation is not allowed");
    }
}
