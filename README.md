# Building an iterator

<img src="images/ohMy.jpg" title="Oh My!" width="50%" />

## Interfaces

`java.lang.Iterable` and `java.lang.Iterator` are related interfaces commonly seen in Java land. An *iterable* is simply an object which can be iterated over. An *iterator* is the object responsible for this iteration.

### Iterator

This exercise will focus on creating your own iterator. Find `java.lang.Iterator` in Eclipse (hot key `<Shift-Ctrl-T>`) and use the Javadoc view to examine its documentation.

There are xxx methods that should be implemented. The tests for these methods have already been written. Your assignment is to make them pass. Many iterators do not support removing elements, so our iterator will thrown `UnsupportedOperationException` if the `remove()` method is called.

### Iterable

Interface consists of one method..... example of **Factory Method** design pattern.

### Extension

Create your own class that implements `Iterable` and creates a new instance of the `Iterator` {use specific iterator class name}  { factory method } you created when `iterator()` is called.