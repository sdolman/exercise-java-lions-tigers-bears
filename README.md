# Building an iterator

<img src="images/ohMy.jpg" title="Oh My!" width="50%" />

## Interfaces

`java.lang.Iterable` and `java.lang.Iterator` are related interfaces commonly seen in Java. An *iterable* is simply an object which can be iterated over. An *iterator* is the object responsible for this iteration.

### Iterator

This exercise will focus on creating your own iterator, `OhMyIterator`. Find `java.lang.Iterator` in Eclipse (hot key `<Shift-Ctrl-T>`) and use the Javadoc view to read its documentation.

There are only a few methods that need to be implemented: `next()`, `hasNext()`, and `remove()`. The tests for these methods have been provided. Your assignment is to make them pass. Many iterators do not support removing elements, so our iterator will throw `UnsupportedOperationException` if the `remove()` method is called. (If you are using Java 8, you won't need to implement `remove()`, since the default implementation provided will satisfy the test.)

### Iterable

This interface only requires one method to be implemented, `iterator()`, which returns an `Iterator` instance. (This interface only comes into play in the extension.)

### Notes

- Remember the diamond operator.

### Extensions

Create your own class that implements `Iterable` and creates a new instance of `OhMyIterator` whenever `iterator()` is called.