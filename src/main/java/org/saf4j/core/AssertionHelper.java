package org.saf4j.core;

import org.saf4j.core.lang.AbstractObjectAssertion;

import java.lang.invoke.MethodHandles;
import java.util.Objects;

final class AssertionHelper {

//    <T extends Assertion<T>> T self(final T assertion) {
//        Objects.requireNonNull(assertion, "assertion is null");
//        if (!(assertion instanceof AbstractObjectAssertion<?, ?>)) {
//            throw new IllegalArgumentException("not an instance of AbstractObjectAssertion: " + assertion);
//        }
//        try {
//            final var methodHandle = MethodHandles.privateLookupIn(AbstractObjectAssertion.class, MethodHandles.lookup());
//            final var varHandle = methodHandle.findVarHandle(AbstractObjectAssertion.class, "actual", Object.class);
//            return null;
//        } catch (ReflectiveOperationException roe) {
//            throw new RuntimeException(roe);
//        }
//    }

    private AssertionHelper() {
        throw new AssertionError("instantiation is not allowed");
    }
}
