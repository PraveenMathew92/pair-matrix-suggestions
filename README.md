# pair-matrix-suggestions
A command line application that would suggest the pairs to be formed by the even or odd number of entities given the history of pairing.

**Technogolies used**
* Kotlin
* Spring Webflux
* Gradle

**Algorithm**
An adaptation of [Gale–Shapley algorithm](https://en.wikipedia.org/wiki/Stable_marriage_problem) to pair the entities in such a way that the entities having paired the least are paired together.

**Architecture**
[Hexagonal Architecture by Alistair Cockburn](https://blog.octo.com/en/hexagonal-architecture-three-principles-and-an-implementation-example/).
