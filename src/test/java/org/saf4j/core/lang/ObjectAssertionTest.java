package org.saf4j.core.lang;

import org.junit.jupiter.api.Test;
import org.saf4j.core.AssertionTest;

import java.util.Objects;

public abstract class ObjectAssertionTest<S extends ObjectAssertion<S, A>, A>
        extends AssertionTest<S> {

    protected ObjectAssertionTest(final Class<S> assertionClass, final Class<A> actualClass) {
        super(assertionClass);
        this.actualClass = Objects.requireNonNull(actualClass, "actualClass is null");
    }

    @Test
    void isNull__() {
        assertionInstance(null).isNull();
    }

    protected S assertionInstance(final A actual) {
        try {
            final var constructor = assertionClass.getConstructor(actualClass);
            if (constructor.canAccess(this)) {
                constructor.setAccessible(true);
            }
            return constructor.newInstance(actual);
        } catch (final ReflectiveOperationException roe) {
            throw new RuntimeException(roe);
        }
    }

    protected final Class<A> actualClass;
}
