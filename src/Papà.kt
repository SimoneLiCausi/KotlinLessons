
//                                                  CLASSI IN KOTLIN:

//In Kotlin, una classe è un costrutto fondamentale che rappresenta un modello o un'astrazione di un oggetto, ad esempio Padre.
// Puoi definire una classe utilizzando la parola chiave class.
// All'interno di una classe, puoi dichiarare proprietà (variabili associate alla classe, ad esempio nome, età del padre)
// e metodi (funzioni associate alla classe, ad esempio "il Padre si presenta")
// Una classe può anche avere un costruttore primario e, se necessario, costruttori secondari.


class Padre {
    var fatherName = "Francesco"
    var fatherAge = 56

    fun fatherHello() {
        println("Ciao, mi chiamo ${fatherName} ed ho ${fatherAge} anni.")
    }
}

    //Nell'esempio sopra, la classe Padre ha due proprietà (nome e età)
    // e un metodo fatherHello() che stampa un messaggio di saluto utilizzando i valori delle proprietà.



//                                                 INTERFACE IN KOTLIN

//Un'interfaccia in Kotlin definisce un contratto che specifica i comportamenti che una classe deve implementare.
// Può contenere dichiarazioni di metodi, proprietà e metodi astratti (senza implementazione).
// Una classe può implementare una o più interfacce utilizzando la parola chiave implement.

interface Esempio {
    fun metodo1()
    fun metodo2(): String
}

// Nell'esempio sopra, l'interfaccia Esempio definisce due metodi, metodo1() che non restituisce alcun valore
// e metodo2() che restituisce una stringa.
// Una classe che implementa questa interfaccia dovrà fornire l'implementazione di entrambi i metodi.


//                                                 METODI IN KOTLIN


//In Kotlin, un metodo è una funzione definita all'interno di una classe o di un'altra struttura.
// Un metodo può essere chiamato per eseguire un'operazione specifica su un oggetto di quella classe.
// Può accettare parametri, eseguire alcune istruzioni e restituire un valore.

class Calcolatrice {
    fun somma(a: Int, b: Int): Int {
        return a + b
    }
}

//Nell'esempio sopra, la classe Calcolatrice ha un metodo somma() che accetta due parametri a + b,
// esegue l'operazione di somma e restituisce il risultato come un intero.



//                                                 EREDITARIETA' IN KOTLIN


//L'ereditarietà è un concetto chiave della programmazione orientata agli oggetti che consente di creare nuove classi basate su classi esistenti.
// In Kotlin, puoi definire una classe figlia che eredita da una classe padre utilizzando la parola chiave ":", seguita dal nome della classe padre.

open class Veicolo {
    fun avvia() {
        println("Il veicolo è stato avviato.")
    }
}

class Automobile : Veicolo() {
    fun guidare() {
        println("Sto guidando l'automobile.")
    }
}

//Nell'esempio sopra, la classe Veicolo è la classe padre, dichiarata con open, e ha un metodo avvia().
// La classe Automobile è una classe figlia che eredita dalla classe Veicolo utilizzando : Veicolo().
// La classe figlia Automobile ha anche un metodo guidare() specifico per le automobili.
//L'ereditarietà consente alla classe figlia di ereditare i membri (proprietà e metodi) dalla classe padre
// e di aggiungere nuovi membri o sovrascrivere con "override" i membri esistenti se necessario.


//                                                 CLASSI ASTRATTE IN KOTLIN

//Una classe astratta è una classe che non può essere istanziata direttamente,
// ma viene utilizzata come base per le classi derivate.
// In altre parole, una classe astratta fornisce un modello o un'astrazione comune
// da cui altre classi possono ereditare e implementare il proprio comportamento specifico.
//In Kotlin, puoi dichiarare una classe astratta utilizzando la parola chiave abstract.
// Una classe astratta può contenere sia metodi con implementazione concreta
// sia metodi dichiarati senza implementazione (metodi astratti).
// I metodi astratti sono dichiarati senza un corpo e devono essere implementati dalle classi derivate.


abstract class Forma {
    abstract fun calcolaArea(): Double

    fun stampaDescrizione() {
        println("Questa è una forma.")
    }
}

class Rettangolo(private val lunghezza: Double, private val larghezza: Double) : Forma() {
    override fun calcolaArea(): Double {
        return lunghezza * larghezza
    }
}

//Nell'esempio sopra, la classe Forma è una classe astratta con un metodo astratto calcolaArea()
// e un metodo concreto stampaDescrizione().
// La classe Rettangolo estende la classe Forma utilizzando : Forma() e fornisce
// un'implementazione concreta del metodo calcolaArea().
//La classe astratta Forma fornisce un'interfaccia comune e una funzionalità di base condivisa
// che le classi derivate possono utilizzare. Le classi derivate come Rettangolo ereditano i metodi concreti
// dalla classe astratta e forniscono l'implementazione specifica dei metodi astratti.
// In questo modo, puoi definire un comportamento generale in una classe astratta e specializzarlo nelle classi derivate.
//Le classi astratte sono spesso utilizzate per creare una gerarchia di classi condividendo funzionalità comuni.
// Possono fornire un modo per definire metodi che devono essere implementati in tutte le classi derivate,
// consentendo una maggiore coerenza e facilitando l'estensione del codice.
//È importante notare che non è possibile creare un'istanza diretta di una classe astratta.
// Tuttavia, è possibile dichiarare variabili o parametri di tipo di classe astratta e assegnarvi istanze di classi derivate.





//                                                 IMPLEMENTAZIONI IN KOTLIN


//In Kotlin, il termine "implementazioni" si riferisce all'atto di fornire un'implementazione concreta
// dei metodi dichiarati in un'interfaccia (<- comportamenti che una classe deve implementare) o in una classe astratta.
// Quando una classe implementa un'interfaccia o estende una classe astratta,
// è necessario fornire un'implementazione per tutti i metodi definiti in quella struttura.


interface Esempio1 {
    fun metodo1()
    fun metodo2(): String
}

class ClasseConcreta : Esempio1 {
    override fun metodo1() {
        println("Implementazione del metodo1()")
    }

    override fun metodo2(): String {
        return "Implementazione del metodo2()"
    }
}

//Nell'esempio sopra, l'interfaccia Esempio definisce due metodi, metodo1() e metodo2(), senza fornire un'implementazione.
// La classe ClasseConcreta implementa questa interfaccia utilizzando il token : Esempio.
// È necessario fornire l'implementazione concreta per entrambi i metodi dichiarati nell'interfaccia.
// All'interno della classe ClasseConcreta, si utilizza l'annotazione override per indicare
// che si sta sovrascrivendo l'implementazione dei metodi dell'interfaccia. Successivamente,
// viene fornita un'implementazione specifica per ciascun metodo.
//Le implementazioni sono importanti perché consentono alle classi di conformarsi ai contratti definiti dalle interfacce
// o dalle classi astratte. Ciò consente di creare strutture modulari
// e di definire il comportamento comune da utilizzare in diverse classi.
//È possibile avere molteplici classi che implementano la stessa interfaccia o che estendono la stessa classe astratta,
// ciascuna fornendo la propria implementazione dei metodi dichiarati.
// Questo offre flessibilità nella progettazione del software e promuove la riusabilità del codice.



//                                                 SEALED CLASS (SIGILLATE) IN KOTLIN


//In Kotlin, una sealed class (classe sigillata) è una classe che permette una gerarchia di classi limitata,
// in cui tutte le sottoclassi devono essere annidate all'interno della classe sigillata stessa.
// Le sealed class sono spesso utilizzate per rappresentare un insieme finito di opzioni
// o stati che possono assumere determinati tipi.
//Le sealed class sono dichiarate utilizzando la parola chiave sealed davanti alla definizione della classe.
// Possono contenere sia dati che funzioni, come una classe normale,
// ma differiscono nelle restrizioni imposte sulla gerarchia delle classi figlio.

sealed class Risultato {
    data class Successo(val messaggio: String) : Risultato()
    data class Errore(val errore: String) : Risultato()
    object InCorso : Risultato()
}

//Nell'esempio sopra, la sealed class Risultato ha tre classi figlio annidate: Successo, Errore e InCorso.
// Le classi figlio possono essere dichiarate come data class, object o classi normali.
// Ogni classe figlio ha un comportamento specifico e può contenere proprietà o funzioni aggiuntive.
//Una delle caratteristiche distintive delle sealed class è che tutte le possibili sottoclassi devono
// essere dichiarate all'interno dello stesso file.
// Questo vincolo consente al compilatore di conoscere tutte le possibili sottoclassi di una sealed class
// e rende le istruzioni when più robuste, in quanto devono coprire tutti i casi possibili.
//Le sealed class sono spesso utilizzate in combinazione con le istruzioni when per eseguire una logica condizionale
// in base al tipo specifico di istanza della sealed class.
// Un when che copre tutti i casi possibili può essere considerato completo e non richiede un'istruzione else.

fun processaRisultato(risultato: Risultato) {
    when (risultato) {
        is Risultato.Successo -> println("Successo: ${risultato.messaggio}")
        is Risultato.Errore -> println("Errore: ${risultato.errore}")
        Risultato.InCorso -> println("In corso...")
    }
}

//Nell'esempio sopra, la funzione processaRisultato accetta un'istanza di Risultato e utilizza un'istruzione when
// per eseguire azioni diverse in base al tipo di istanza.
// Le sealed class rendono facile gestire tutti i casi possibili in modo sicuro durante la compilazione.
//Le sealed class offrono una struttura potente per la gestione di gerarchie di classi limitate
// e sono particolarmente utili quando si lavora con tipi che rappresentano stati o risultati discreti.






//                                                 DATA CLASS IN KOTLIN


//In Kotlin, una data class è una classe predefinita fornita dal linguaggio che è ottimizzata
// per rappresentare e gestire dati immutabili. Le data class sono spesso utilizzate per modellare oggetti
// che contengono solo dati, senza comportamenti o logica aggiuntiva.
// Il compilatore Kotlin genera automaticamente diversi metodi utili per le data class,
// come equals(), hashCode(), toString(), copy(), che semplificano l'uso delle data class.
//Per dichiarare una data class, devi utilizzare la parola chiave data prima della definizione della classe.
// In una data class, puoi dichiarare proprietà, che sono automaticamente generate come immutabili (val)
// e possono essere lette direttamente senza bisogno di metodi getter.
// Puoi anche fornire un corpo vuoto o definire metodi aggiuntivi, se necessario.

data class Persona(val nome: String, val eta: Int) {

//Nell'esempio sopra, la data class Persona ha due proprietà (nome e età) dichiarate come parametri
// nel costruttore primario della classe. Le proprietà sono automaticamente generate come immutabili
// e vengono forniti i metodi equals(), hashCode(), toString(), copy() dal compilatore.
//L'utilizzo di una data class semplifica la creazione di oggetti immutabili,
// l'equivalenza strutturale (due istanze con gli stessi valori di proprietà sono considerate uguali),
// la copia di oggetti con modifiche parziali e la rappresentazione testuale dell'oggetto tramite il metodo toString().


    val persona1 = Persona("Alice", 25)
    val persona2 = Persona("Alice", 25)

    println(persona1 == persona2) // Output: true (uguaglianza strutturale)
    println(persona1.hashCode() == persona2.hashCode()) // Output: true (hashCode corrispondenti)
    println(persona1.toString()) // Output: Persona(nome=Alice, età=25)

    val persona3 = persona1.copy(eta = 30)
    println(persona3) // Output: Persona(nome=Alice, età=30)

//Nell'esempio sopra, vengono create due istanze di Persona con gli stessi valori di proprietà (persona1 e persona2).
// Grazie all'implementazione automatica del metodo equals(), la condizione persona1 == persona2 è valutata come true.
// Inoltre, i metodi hashCode() e toString() generano i corrispondenti valori di hash e rappresentazioni testuali.
// La funzione copy() permette di creare una copia di un oggetto con la possibilità di modificare solo alcune proprietà.
//Le data class sono particolarmente utili per semplificare la manipolazione dei dati e migliorare la leggibilità
// e la manutenibilità del codice. Tuttavia, è importante notare che le data class sono progettate per oggetti immutabili,
// quindi le proprietà devono essere dichiarate come val, e non var.
}



//                                                 MAP IN KOTLIN

// La sintassi generale di map è la seguente:

fun <T, R> Iterable<T>.map(transform: (T) -> R): List<R>

//Iterable<T> rappresenta il tipo di collezione (ad esempio una lista) contenente gli elementi da trasformare.

//transform è una lambda function che definisce la trasformazione da applicare a ciascun elemento della collezione.

//<R> rappresenta il tipo di dato del risultato trasformato.

//List<R> è il tipo di collezione restituito che contiene i risultati trasformati.

//Ecco un esempio che utilizza map per trasformare una lista di interi in una lista di stringhe:

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val strings = numbers.map { it.toString() }

    println(strings) // Stampa: [1, 2, 3, 4, 5]
}

// In questo esempio, numbers è una lista di interi.
// La lambda function { it.toString() } viene applicata a ciascun elemento della lista,
// trasformando ogni intero in una stringa corrispondente. Il risultato è una nuova lista di stringhe strings,
// che viene quindi stampata con println.
