/*Crie uma aplicação concorrente em Java ou em Go, a qual deverá ter um servidor que pode receber concorrentemente
requisições relacionadas a uma lista predefinida de comandos. O servidor só consegue tratar uma requisição por vez,
 mas assuma que existem 10 clientes solicitando serviços desta lista. Ao receber uma requisição, o servidor deve indicar
 que está tratando uma requisição daquele cliente específico. Ao concluir a requisição, também deverá indicar que a 
 requisição foi respondida e imprimir a resposta para o pedido solicitado. Após concluir a requisição, o servidor deve resolver
 a próxima requisição na fila. Os clientes devem ser unicamente identificados e solicitar as requisições a este servidor indefinidamente.
 Abaixo segue a lista de comandos que podem ser tratados por este servidor:

- Número de processadores disponíveis

  - Java: Runtime.getRuntime().availableProcessors()

  - Go: runtime.NumCPU() (importar o pacote "runtime")

- Número de memória disponível

  - Java: Runtime.getRuntime().freeMemory()

  - Go: (importar o pacote "runtime")

          var m runtime.MemStats
          runtime.ReadMemStats(&m)
          x:= (m.Sys - m.Alloc)

- Número total de memória 

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
