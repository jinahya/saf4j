package org.saf4j.core.lang;

public interface IntegerAssertion<T extends IntegerAssertion<T>>
        extends NumberAssertion<T, Integer>,
                ComparableAssertionTrait<T, Integer>,
                IntegralAssertionTrait<T, Integer> {

}
