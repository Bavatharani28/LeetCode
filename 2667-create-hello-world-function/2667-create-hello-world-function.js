/**
 * @return {Function}
 */
var createHelloWorld = function() {
    a="Hello World";
    return function(...args) {
        return a;
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */