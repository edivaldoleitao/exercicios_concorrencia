/*Crie uma aplica��o concorrente em Java ou em Go, a qual dever� ter um servidor que pode receber concorrentemente
requisi��es relacionadas a uma lista predefinida de comandos. O servidor s� consegue tratar uma requisi��o por vez,
 mas assuma que existem 10 clientes solicitando servi�os desta lista. Ao receber uma requisi��o, o servidor deve indicar
 que est� tratando uma requisi��o daquele cliente espec�fico. Ao concluir a requisi��o, tamb�m dever� indicar que a 
 requisi��o foi respondida e imprimir a resposta para o pedido solicitado. Ap�s concluir a requisi��o, o servidor deve resolver
 a pr�xima requisi��o na fila. Os clientes devem ser unicamente identificados e solicitar as requisi��es a este servidor indefinidamente.
 Abaixo segue a lista de comandos que podem ser tratados por este servidor:

- N�mero de processadores dispon�veis

  - Java: Runtime.getRuntime().availableProcessors()

  - Go: runtime.NumCPU() (importar o pacote "runtime")

- N�mero de mem�ria dispon�vel

  - Java: Runtime.getRuntime().freeMemory()

  - Go: (importar o pacote "runtime")

          var m runtime.MemStats
          runtime.ReadMemStats(&m)
          x:= (m.Sys - m.Alloc)

- N�mero total de mem�ria 

  - Java: Runtime.getRuntime().totalMemory()

  - Go:(importar o pacote "runtime")

          var m runtime.MemStats
          runtime.ReadMemStats(&m)
          x:= m.Sys

- Retornar a data/hora atual

  - Java: Calendar.getInstance().getTime()

  - Go: time.Now() (importar o pacote "time")
*/

package questao1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
