// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class ConteudoEducacional(var nome: String, var duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    
    fun matricular(usuario: Usuario) {
        inscritos.addAll(listOf(usuario))
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    val conteudoEducacional = ConteudoEducacional("Matematica")
    val formacao = Formacao("Tech", listOf(conteudoEducacional))
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    
    val nivel = Nivel.INTERMEDIARIO
    val message = when(nivel){
        Nivel.BASICO -> "BASICO"
        Nivel.INTERMEDIARIO -> "INTERMEDIARIO"
        Nivel.AVANCADO -> "AVANCADO"
    }
    println(message)
    println(formacao)

    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}