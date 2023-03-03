fun main() {
val benz = Car("Mercedez benz","E300","KCC 153T",0)
    val toyota = Car("toyota","hilux","KCC 768G",0)
    val car = Car("Mazda","Demio","KCC 690H",0)
   println(benz.model)
    benz.start()
    println(benz.speed)
    benz.accelerate(45)
    benz.accelerate(72)
    println(benz.speed)
    println(toyota.registration)
    toyota.start()
    benz.decelerate(60)
    println(benz.speed)
    benz.stop()
    println(benz.speed)
    benz.sound()

val myBook = Book ("Born a Crime","Trevor Noah", 300, "John well")
    println(myBook.author)
    println(myBook.publisher)
    println(myBook.title)
    println(myBook.pages)
}
class Car (var make: String, var model: String, var registration: String, var speed : Int) {
    fun start() {
        println("vrooom vrooom")

    }

    fun accelerate(acceleration: Int): Int {
        speed += acceleration
        return speed
    }
    fun decelerate(decelaration: Int): Int{
        speed -= decelaration
        return speed
    }
    fun stop(){
        speed -= speed
    }
    fun sound(){
        println("pii pii")
    }

}
data class Book(var title:String, var author: String, var pages: Int, var publisher : String)

data class AgeStats(var maxAge: Int, var minAge:Int, var avgAge: Double)
fun calculatestats(ages :Array<Int>):AgeStats{
    val min =ages.min()
    val max =ages.max()
    val age =ages.average()

    val stats= AgeStats(min,max,age)
    return stats
}








