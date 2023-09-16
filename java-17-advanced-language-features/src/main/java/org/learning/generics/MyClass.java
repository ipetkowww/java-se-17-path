package org.learning.generics;

import java.util.List;

public record MyClass<T>(List<T> values) {
}
