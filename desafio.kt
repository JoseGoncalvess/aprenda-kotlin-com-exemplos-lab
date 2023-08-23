enum class Nivel { BASIC, INTERMEDIARY, ADVANCED }

class Usuario(var name: String, var age: Int )

data class ConteudoEducacional(var nomeConteudo: String, var Nivel: Nivel, val duration: Int = 30)

data class Formacao(val name: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Parabéns ${usuario.name} por fazer parte do curso de $name")
        println("Neste curso ${usuario.name},  Você vai aprender sobre $conteudos.!")

        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}



fun main() {
 //Users
val user1: Usuario = Usuario(name= "José", age=22)
val user2: Usuario = Usuario(name= "Gui", age=18)

//Lista de conteúdos
var listConteudos = mutableListOf<ConteudoEducacional>(ConteudoEducacional("Logica de Programação", Nivel.BASIC, 30),ConteudoEducacional("Orientação a Objeto [POO]", Nivel.INTERMEDIARY, 30))

var CursoFlutetr = Formacao("Desenvolvimento Flutter FullStack",listConteudos)
var CursoJava = Formacao("Desenvolvimento Bakend Java",listConteudos)


println(CursoFlutetr.matricular(user1))
println(CursoJava.matricular(user2))




   
   
    
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}