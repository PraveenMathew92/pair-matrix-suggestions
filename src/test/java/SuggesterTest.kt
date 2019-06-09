import domain.Entity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SuggesterTest{
    @Test
    fun `should pair the entity with ghost when only one entity is present`() {
        val loneWolf = Entity("Lone Wolf")
        val onlyOneEntity = listOf(loneWolf)

        Suggester.suggest(onlyOneEntity).subscribe {
            assertEquals(Pair(loneWolf, GHOST), it)
        }
    }

    @Test
    fun `should return the Pair when only two entities are present`() {
        val someEntity = Entity("Some Entity")
        val anotherEntity = Entity("Another Entity")
        val availableEntities = listOf(someEntity, anotherEntity)

        Suggester.suggest(availableEntities).subscribe {
            assertEquals(Pair(someEntity, anotherEntity), it)
        }
    }
}