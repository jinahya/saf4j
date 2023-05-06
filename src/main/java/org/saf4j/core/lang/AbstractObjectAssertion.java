package org.saf4j.core.lang;

import org.saf4j.core.AbstractAssertion;

/**
 * An interface for verifying specific type of {@link Object}.
 *
 * @param <S> self type parameter
 * @param <A> type of actual value to verify
 * @author Jin Kwon &lt;onacit_at_gmail.com&gt;
 */
public abstract class AbstractObjectAssertion<S extends AbstractObjectAssertion<S, A>, A>
        extends AbstractAssertion<S>
        implements ObjectAssertion<S, A> {

    protected AbstractObjectAssertion(final A actual) {
        super();
        this.actual = actual;
    }

    protected final A actual() {
        return actual;
    }

    final A actual;
}
