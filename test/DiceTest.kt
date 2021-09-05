import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import kotlin.random.Random
import kotlin.test.assertContains

class DiceTest {

    private val dice = Dice()
    private val dices: MutableList<Int> = ArrayList()

    @Before
    fun init() {
        dice.firstDice = 1
        dice.secondDice = 1
        dice.thirdDice= 1
        dice.fourthDice = 1
        dice.fifthDice = 1

        dices.add(dice.firstDice)
        dices.add(dice.secondDice)
        dices.add(dice.thirdDice)
        dices.add(dice.fourthDice)
        dices.add(dice.fifthDice)
    }

    @Test
    fun checkingFiveOfAKind () {
        assertEquals(15,dice.winningCheck())
    }

    @Test
    fun checkingPoker () {
        assertEquals(9,dice.winningCheck())
    }

    @Test
    fun checkingFull () {
        assertEquals(5,dice.winningCheck())
    }

}