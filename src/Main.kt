import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val dice = Dice()
    var money = 100
    var betMoney: Int
    var winning: Int
    var decision: Int

    println("Üdvözöllek! Ez egy kockapóker játék.")
    do{
    println("A jelenlegi pénzed: $money")
    print("Mennyit teszel meg tétnek?: ")
    betMoney = sc.nextInt()
        if(betMoney > money) {
            println("Sajnos nincs ennyi pénzed!")
            print("Mennyit teszel meg tétnek?: ")
            betMoney = sc.nextInt()
        }else if(betMoney <= money){
            println("A téted $betMoney ")
        }

    dice.throwDices()

        when(dice.winningCheck()){
            0 -> {
                money -= betMoney
                println("Sajnos vesztettél!")
                println("A jelenlegi pénzed: $money")
                if(money == 0) {
                    println("Sajnos minden pénzed elfogyott!")
                    break
                }
            }

            1 -> {
                money += betMoney
                winning = betMoney
                println("Gratulálok, párod van!")
                println("A nyereményed $winning")
            }

            2 -> {
                money += betMoney * 2
                winning = betMoney * 2
                println("Gratulálok, két párod van!")
                println("A nyereményed $winning")
            }

            3 -> {
                money += betMoney * 3
                winning = betMoney * 3
                println("Gratulálok, drilled van!")
                println("A nyereményed $winning")
            }

            5 -> {
                money += betMoney * 5
                winning = betMoney * 5
                println("Gratulálok, fullod van!")
                println("A nyereményed $winning")
            }

            9 -> {
                money += betMoney * 9
                winning = betMoney * 9
                println("Gratulálok, pókered van!")
                println("A nyereményed $winning")
            }

            15 -> {
                money += betMoney * 15
                winning = betMoney * 15
                println("Gratulálok, öt azonosod van!")
                println("A nyereményed $winning")
            }

        }
        println("Nyomj 1-t ha tovább szeretnél játszani, a kilépéshez pedig 2-t")
        dice.dices.clear()
        decision = sc.nextInt()

}
    while(decision != 2)
println("Köszönöm, hogy játszottál!")
}