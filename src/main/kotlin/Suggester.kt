import domain.Entity
import reactor.core.publisher.Flux

class Suggester{
    companion object {
        fun suggest(entity: List<Entity>): Flux<Pair<Entity, Entity>> {
            if(entity.size > 1)
                return Flux.fromIterable(listOf(Pair(entity.first(), entity.last())))
            return Flux.fromIterable(listOf(Pair(entity.first(), GHOST)))
        }
    }
}