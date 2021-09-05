import kotlin.random.Random

class Dice {
    var firstDice = 1
    var secondDice = 1
    var thirdDice = 3
    var fourthDice = 2
    var fifthDice = 2
    val dices: MutableList<Int> = ArrayList()

    fun throwDices() {
        firstDice = Random.nextInt(1,7)
        dices.add(firstDice)
        println("Eldobtad a kockákat, az első kocka értéke: $firstDice")
        secondDice = Random.nextInt(1,7)
        dices.add(secondDice)
        println("A második kocka értéke: $secondDice")
        thirdDice = Random.nextInt(1,7)
        dices.add(thirdDice)
        println("A harmadik kocka értéke: $thirdDice")
        fourthDice = Random.nextInt(1,7)
        dices.add(fourthDice)
        println("A negyedik kocka értéke: $fourthDice")
        fifthDice = Random.nextInt(1,7)
        dices.add(fifthDice)
        println("Az ötödik kocka értéke: $fifthDice")
        dices.sort()
    }

    fun winningCheck() :Int {
        if(dices[0] == dices[1] && dices[0] == dices[2] && dices[0] == dices[3] && dices[0] == dices[4] ) {
            return 15
        }
        else if(dices[0] == dices[1] && dices[0] == dices[2] && dices[0] == dices[3] ||
                dices[1] == dices[2] && dices[1] == dices[3] && dices[1] == dices[4]) {
            return  9
        }
        else if (dices[0] == dices[1] && dices[0] == dices[2] && dices[3] == dices[4]) {
            return 5
        }
        else if(dices[0] == dices[1] && dices[0] == dices[2] || dices[1] == dices[2] && dices[1] == dices[3] ||
                dices[2] == dices[3] && dices[2] == dices[4]) {
            return 3
        }
        else if(dices[0] == dices[1] && dices[2] == dices[3] ||
                dices[1] == dices[2] && dices[3] == dices[4] ||
                dices[0] == dices[1] && dices[3] == dices[4]) {
            return  2
        }else if (dices[0] == dices[1] || dices[1] == dices[2] || dices[2] == dices[3] || dices[3] == dices[4]) {
            return 1
        }
        else
            return 0
    }

}
