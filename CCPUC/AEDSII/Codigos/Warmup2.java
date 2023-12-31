/*Na escola onde você estuda, a hora do recreio é a mais aguardada pela grande maioria dos alunos. Não só porque as vezes as aulas são cansativas, mas sim porque a merenda servida é muito boa, preparada por um chefe italiano muito caprichoso.

Quando bate o sinal para a hora do recreio, todos os alunos saem correndo da sua sala para chegar o mais cedo possível na cantina, tanta é a vontade de comer. Um de seus professores notou, porém, que havia ali uma oportunidade.

Utilizando um sistema de recompensa, seu professor de matemática disse que a ordem da fila para se servir será dada não pela ordem de chegada, mas sim pela soma das notas obtidas em sala de aula. Assim, aqueles com maior nota poderão se servir antes daqueles que tem menor nota. Sua tarefa é simples: dada a ordem de chegada dos alunos na cantina, e as suas respectivas notas na matéria de matemática, reordene a fila de acordo com as notas de matemática, e diga quantos alunos não precisaram trocar de lugar nessa reordenação.


Entrada
A primeira linha contém um inteiro N, indicando o número de casos de teste a seguir. Cada caso de teste inicia com um inteiro M (1 ≤ M ≤ 1000), indicando o número de alunos. Em seguida haverá M inteiros distintos Pi (1 ≤ Pi ≤ 1000), onde o i-ésimo inteiro indica a nota do i-ésimo aluno.
Os inteiros acima são dados em ordem de chegada, ou seja, o primeiro inteiro diz respeito ao primeiro aluno a chegar na fila, o segundo inteiro diz respeito ao segundo aluno, e assim sucessivamente.


Saída
Para cada caso de teste imprima uma linha, contendo um inteiro, indicando o número de alunos que não precisaram trocar de lugar mesmo após a fila ser reordenada.*/

public class Warmup2 {
    public static void main(String[] args) {
        int N = MyIO.readInt();
        for(int i=0;i<N;i++){
            int countNaoTrocas = 0;

            int M = MyIO.readInt();

            int[] lista = new int[M];
            //preenchendo a lista
            for(int j=0;j<M;j++){
                lista[j] = MyIO.readInt();
            }
            
            //criando uma copia da lista
            int[] listaCopia = new int[M];
            for(int j=0;j<M;j++){
                listaCopia[j] = lista[j];
            }
            
            //ordenando a listacopia com o maior numero primeiro
            for(int j=0;j<M;j++){
                for(int k=0;k<M-1;k++){
                    if(listaCopia[k]<listaCopia[k+1]){
                        int aux = listaCopia[k];
                        listaCopia[k] = listaCopia[k+1];
                        listaCopia[k+1] = aux;
                    }
                }
            }
            
            //comparando as duas listas e contando quantos numeros sao iguais
            for(int j=0;j<M;j++){
                if(lista[j]==listaCopia[j]){
                    countNaoTrocas++;
                }
            }

            MyIO.println(countNaoTrocas);

        }

    }
}
