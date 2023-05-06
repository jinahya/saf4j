package org.saf4j.core.util;

import org.saf4j.core.lang.AbstractObjectAssertion;

import java.util.List;

@SuppressWarnings({"unchecked"})
public class ListAssertion<S extends ListAssertion<S, E>, E>
        extends AbstractObjectAssertion<S, List<E>>
        implements CollectionAssertionTrait<S, List<E>, E> {

    public ListAssertion(final List<E> actual) {
        super(actual);
    }
}
