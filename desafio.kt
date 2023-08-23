enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(var name: String, var age: Int )

data class ConteudoEducacional(var nome: String, val duracao: Int = 30)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        inscritos.count()
        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

 val dioCursos = mutableListOf<Formacao>()

fun main() {
    var Listconteudos = List<ConteudoEducacional> = (ConteudoEducacional("Logica de porgramação");
                                                     ConteudoEducacional("Introdução a coleções");
                                                    )
 dioCursos.add(Formacao(nome="Flutter developer", conteudos=Listconteudos))
   
   
    
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}