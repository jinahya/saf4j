package org.saf4j.core.lang;

public interface FloatAssertion<T extends FloatAssertion<T>>
        extends NumberAssertion<T, Float>,
                ComparableAssertionTrait<T, Float>,
                FloatingPointAssertionTrait<T, Float> {

}
