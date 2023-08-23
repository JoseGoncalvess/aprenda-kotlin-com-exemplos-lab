// Kotlin-PlayGound :(https://pl.kotl.in/2IJEbHV80)

enum class Nivel { BASIC, INTERMEDIARY, ADVANCED }

class Usuario(var name: String, var age: Int )

data class ConteudoEducacional(var NomeConteudo: String, var Nivel: Nivel, val Duration: Int = 30)

data class Formacao(val name: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(user: Usuario?) {
        when (user){
            null -> println("For cursa $name, we need your information to register!")
            user -> {
        inscritos.add(user)
        println("Hello ${user.name}, Welcome to Dio.me, Congratulations on choosing to be part of $name's course")
        println("${user.name}, Check out the list of contents you will learn:")
        for (c in conteudos){
            println(c)
        }
                
            } else ->{
                println("Are you sure you don't want to take our training $name")
            }
        }
        
       
    }
}



fun main() {
 //Users
val user1: Usuario = Usuario(name= "José", age=22)
val user2: Usuario = Usuario(name= "Gui", age=18)

//Lista de conteúdos
var listConteudos = mutableListOf<ConteudoEducacional>(ConteudoEducacional("Logica de Programação", Nivel.BASIC, 30),ConteudoEducacional("Orientação a Objeto [POO]", Nivel.INTERMEDIARY, 30))

var CursoFlutetr = Formacao("Development Flutter FullStack",listConteudos)
var CursoJava = Formacao("Development backend Java",listConteudos)


println(CursoFlutetr.matricular(user1))
println()
println(CursoJava.matricular(user2))

}