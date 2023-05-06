package org.saf4j.core.util;

import org.saf4j.core.lang.IterableAssertionTrait;
import org.saf4j.core.lang.ObjectAssertion;

import java.util.Collection;

@SuppressWarnings({"unchecked"})
public interface CollectionAssertionTrait<
        S extends ObjectAssertion<S, A> & CollectionAssertionTrait<S, A, E>,
        A extends Collection<E>,
        E>
        extends IterableAssertionTrait<S, A, E> {

}
