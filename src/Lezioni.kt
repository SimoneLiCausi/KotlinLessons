//class Lezioni {

    //    fun main() {
    //        for (i in 1..100 step 4) {
    //            println("My value: ${i} !")
    //        }
    //    }

    // Qui sopra abbiamo creato un loop for, senza la necessità di dichiarare la variabile "i", gli stiamo dicendo:
    // Variabile da 1 a 100, contando ogni 4.
    //Quindi stamperà: MyValue: 4, MyValue: 8, MyValue: 12, e così via fino ad arrivare a 100.
    //Per farlo al contrario, avremmo dovuto fare così:

    //  fun main2() {
    //      for (i in 1 downTo 100 step 4) {
    //          println("My value: ${i} !")
    //      }
    //   }

    // E partendo da 100, sarebbe sceso sempre contando ogni 4, fino al numero quattro, stampando:
    //MyValue: 100, MyValue: 96, MyValue: 92, e così via.


    //Come si dichiara una classe su Kotlin? , in questo modo:

    //Creo la classe Dado:

    // class Dado() {

    // }

    // La classe va scritta al di fuori della funzione main().
    //E' buona norma dare alla classe un nome con la prima lettera maiuscola.


    //All'interno della classe definisco una variabile "facce".

    // class Dado {
    //  var facce = 6
    // }

    //Ora lancio un'istanza dalla funzione main sul classe Dado
    //Creo un oggetto "prova" tramite la classe Dado.

    // fun main() {
    // val prova = Dado()
    // println(prova.facce)
    // }

    // class Dado {
    // var facce = 6
    // }

    //L'oggetto "prova" eredita tutte le proprietà e i metodi della classe "Dado".
    //Pertanto, quando stampo l'attributo facce nell'oggetto prova, il programma restituisce sei.

    // In questo esempio creo un metodo "lancio" nella classe Dado che mi permette di generare un numero casuale da 1 a 6.

    //  fun main() {
    //    val prova = Dado()
    //  prova.Lancio()
    // }
    // class Dado {
    //    var facce=6
    //    fun Lancio() {
    //        val numero = (1..6).random()
    //      println(numero)
    //  }
    // }

    //Quando richiamo il metodo prova.Lancio() nella riga 3 nella funzione principale,
    // Kotlin genera un numero casuale da 1 a 6 e lo stampa a video.


    //Dichiarare una classe è semplice, gli input della classe possono essere direttamente dichiarati
    //E dentro la classe possiamo dare un comando di init, che una volta richiamata la classe andrà
    // ad eseguire.


    // La dichiarazione di una classe con dentro i valori, somiglia molto al costruttore Java.
    // Utilizziamo il Get and Set.

    fun main() {
        val test = Android("marshmallow", "5.0")
        println(test.name)
        println(test.year)
        test.year = 2021
        println(test.year)


    }

    class Android(val codename: String, val version: String = "4.1") {
        val name: String
            get() = "codename: ${codename}, version: ${version}"
        var year: Int = 2009
            get() = field
            set(value) {
                field = value
            }

    }

// field ci permette di avere un campo vuoto, per poterci assegnare un valore all'interno.

// In Kotlin quindi possiamo avere: Le classi che usiamo normalmente anche in Java
// Possiamo avere le Interface che non possono contenere dati ma possono dichiararli e possono contenere funzioni
// E possiamo fare Data Class, che non hanno funzioni ma solamente dati.

