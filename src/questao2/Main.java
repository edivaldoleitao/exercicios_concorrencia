/*
Crie um programa concorrente em Java ou em Go que ilustre liga��es sendo realizadas para um Call Center.
Neste problema teremos um Call Center onde somente 5 operadores est�o trabalhando e existem diversos clientes (15 no m�nimo)
tentando ligar para o mesmo. Cada cliente ao entrar em contato com o Call Center pode ser atendido caso exista um operador
dispon�vel ou ele deve entrar numa fila de espera e aguardar at� que um atendente esteja dispon�vel. Assim que for atendido
o cliente poder� ficar em atendimento durante um tempo entre 1 a 5 min (use segundos na sua simula��o). Em seguida, ele deve
encerrar a liga��o e liberar o atendente para o pr�ximo cliente. Fa�a com que os 15 clientes fiquem indefinidamente tentando
entrar em contato com o Call Center. Use mecanismos de sincroniza��o para resolver este problema e lembre-se de imprimir mensagens
na sa�da padr�o para indicar o que est� acontendo.

Crie uma solu��o concorrente definindo corretamente as entidades candidatas a serem threads.
 Utilize a impress�o na sa�da padr�o para ilustrar o processo acontecendo e o sleep() para fazer
  as threads dormirem quando necess�rio. Submeta o c�digo fonte. Caso seja mais de um arquivo, compacte-os em uma arquivo .
  ZIP e envie o arquivo compactado.
*/
package questao2;

import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) {

		Semaphore sem = new Semaphore(5);
		Operador operadores = new Operador(sem);
		ThreadClient cl1 = new ThreadClient(operadores);
		ThreadClient cl2 = new ThreadClient(operadores);
		ThreadClient cl3 = new ThreadClient(operadores);
		ThreadClient cl4 = new ThreadClient(operadores);
		ThreadClient cl5 = new ThreadClient(operadores);
		ThreadClient cl6 = new ThreadClient(operadores);
		ThreadClient cl7 = new ThreadClient(operadores);
		ThreadClient cl8 = new ThreadClient(operadores);
		ThreadClient cl9 = new ThreadClient(operadores);
		ThreadClient cl10 = new ThreadClient(operadores);
		ThreadClient cl11 = new ThreadClient(operadores);
		ThreadClient cl12 = new ThreadClient(operadores);
		ThreadClient cl13 = new ThreadClient(operadores);
		ThreadClient cl14 = new ThreadClient(operadores);
		ThreadClient cl15 = new ThreadClient(operadores);

		cl1.start();
		cl2.start();
		cl3.start();
		cl4.start();
		cl5.start();
		cl6.start();
		cl7.start();
		cl8.start();
		cl9.start();
		cl10.start();
		cl11.start();
		cl12.start();
		cl13.start();
		cl14.start();
		cl15.start();

		try {
			cl1.join();
			cl2.join();
			cl3.join();
			cl4.join();
			cl5.join();
			cl6.join();
			cl7.join();
			cl8.join();
			cl9.join();
			cl10.join();
			cl11.join();
			cl12.join();
			cl13.join();
			cl14.join();
			cl15.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
