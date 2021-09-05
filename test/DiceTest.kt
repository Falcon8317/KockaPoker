import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class DiceTest {

    private val dice = Dice()

    @Test
    fun checkingFiveOfAKind () {
        dice.firstDice = 5
        dice.secondDice = 5
        dice.thirdDice= 5
        dice.fourthDice = 5
        dice.fifthDice = 5

        dice.dices.add(dice.firstDice)
        dice.dices.add(dice.secondDice)
        dice.dices.add(dice.thirdDice)
        dice.dices.add(dice.fourthDice)
        dice.dices.add(dice.fifthDice)
        dice.dices.sort()
        assertEquals(15,dice.winningCheck())
    }

    @Test
    fun checkingPoker () {
        dice.firstDice = 2
        dice.secondDice = 2
        dice.thirdDice= 2
        dice.fourthDice = 1
        dice.fifthDice = 2

        dice.dices.add(dice.firstDice)
        dice.dices.add(dice.secondDice)
        dice.dices.add(dice.thirdDice)
        dice.dices.add(dice.fourthDice)
        dice.dices.add(dice.fifthDice)
        dice.dices.sort()
        assertEquals(9,dice.winningCheck())
    }

    @Test
    fun checkingFull () {
        dice.firstDice = 2
        dice.secondDice = 2
        dice.thirdDice= 2
        dice.fourthDice = 3
        dice.fifthDice = 3

        dice.dices.add(dice.firstDice)
        dice.dices.add(dice.secondDice)
        dice.dices.add(dice.thirdDice)
        dice.dices.add(dice.fourthDice)
        dice.dices.add(dice.fifthDice)
        dice.dices.sort()
        assertEquals(5,dice.winningCheck())
    }

    @Test
    fun checkingDrill () {
        dice.firstDice = 2
        dice.secondDice = 2
        dice.thirdDice= 2
        dice.fourthDice = 3
        dice.fifthDice = 4

        dice.dices.add(dice.firstDice)
        dice.dices.add(dice.secondDice)
        dice.dices.add(dice.thirdDice)
        dice.dices.add(dice.fourthDice)
        dice.dices.add(dice.fifthDice)
        dice.dices.sort()
        assertEquals(3,dice.winningCheck())
    }

    @Test
    fun checkingTwoPair () {
        dice.firstDice = 2
        dice.secondDice = 2
        dice.thirdDice= 1
        dice.fourthDice = 3
        dice.fifthDice = 3

        dice.dices.add(dice.firstDice)
        dice.dices.add(dice.secondDice)
        dice.dices.add(dice.thirdDice)
        dice.dices.add(dice.fourthDice)
        dice.dices.add(dice.fifthDice)
        dice.dices.sort()
        assertEquals(2,dice.winningCheck())
    }

    @Test
    fun checkingPair () {
        dice.firstDice = 1
        dice.secondDice = 2
        dice.thirdDice= 3
        dice.fourthDice = 5
        dice.fifthDice = 5

        dice.dices.add(dice.firstDice)
        dice.dices.add(dice.secondDice)
        dice.dices.add(dice.thirdDice)
        dice.dices.add(dice.fourthDice)
        dice.dices.add(dice.fifthDice)
        dice.dices.sort()
        assertEquals(1,dice.winningCheck())
    }

    @Test
    fun checkingLose () {
        dice.firstDice = 1
        dice.secondDice = 2
        dice.thirdDice= 3
        dice.fourthDice = 4
        dice.fifthDice = 5

        dice.dices.add(dice.firstDice)
        dice.dices.add(dice.secondDice)
        dice.dices.add(dice.thirdDice)
        dice.dices.add(dice.fourthDice)
        dice.dices.add(dice.fifthDice)
        dice.dices.sort()
        assertEquals(0,dice.winningCheck())
    }

}