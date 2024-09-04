# Vaga de Estágio em Desenvolvimento na Target Sistemas
<p align="center">
  <img src="https://github.com/user-attachments/assets/abd26826-622f-41dc-8579-2cd286f2efcb" alt="Imagem">
</p>

## ✅ Descrição do Desafio Técnico 

Este projeto envolve a resolução de desafios de lógica de programação, abordando problemas matemáticos e lógicos. O foco está em aplicar raciocínio crítico para encontrar soluções eficazes. Para os desafios que requerem programação, são utilizadas a linguagem Java e a IDE Eclipse. 
O projeto oferece uma experiência prática significativa na criação de algoritmos e na implementação de soluções, contribuindo para o aprimoramento das habilidades em lógica e desenvolvimento de código.

### 🔗 Desafios Propostos 

## 1) Fibonacci

A sequência de Fibonacci é uma famosa sequência matemática que começa com os números 0 e 1, e cada número subsequente é a soma dos dois números anteriores. A sequência pode ser descrita com essa fórmula

![image](https://github.com/user-attachments/assets/723bce0f-bf6f-4c7b-913a-b6c58f85b2cc) 

onde F(0)=0 𝐹(1)=1 Isso significa, os primeiros termos da sequência de Fibonacci são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

### Estrutura do Código realizada
Este programa em Java permite ao usuário verificar se um número pertence à sequência de Fibonacci. Ao executar o programa, o usuário é solicitado a inserir um número. O programa, então, calcula a sequência de Fibonacci até o número fornecido e verifica se o número informado está na sequência.
Se o número digitado pelo usuário pertence à sequência de Fibonacci, o programa retornará uma mensagem confirmando isso. Caso contrário, será exibida uma mensagem informando que o número não faz parte da sequência. Este processo é realizado através da geração da sequência até que o número seja encontrado ou ultrapassado, garantindo uma verificação precisa e eficiente.

### Classe UML do código

![image](https://github.com/user-attachments/assets/0144fc80-ea35-4e5b-9a53-f31ae17a93af)

## 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

Este programa Java permite que o usuário insira uma palavra ou frase, e em seguida, verifica a presença da letra 'a' (tanto maiúscula quanto minúscula) dentro da string fornecida. O objetivo do programa é contar e informar o número de vezes que a letra 'a' aparece na string.

O fluxo do programa é o seguinte:

O usuário é solicitado a digitar uma palavra ou frase.
O programa lê a entrada e converte toda a string para minúsculas para garantir que a verificação seja feita de forma insensível a maiúsculas e minúsculas.
A função countLetterA é então utilizada para contar as ocorrências da letra 'a'.
Finalmente, o programa exibe a quantidade de vezes que a letra 'a' que ocorre na string, ou uma mensagem informando que a letra não está presente.

### Classe UML do código
![image](https://github.com/user-attachments/assets/ae0713c4-c138-489a-b3fc-21eb83d6a5e8)


## 3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA); Ao final do processamento, qual será o valor da variável SOMA?

Algumas informações importantes nesse desafio 
#### INDICE = 12 
Define um valor constante para o índice máximo da soma.
#### SOMA = 0 
Inicializa a variável SOMA com o valor 0, que será utilizada para armazenar o resultado da soma.
### K = 1
Inicializa a variável K com 1. Esta variável será usada no loop para iterar e acumular valores em SOMA.
### Enquanto K < INDICE 
Podemos substituir o Enquanto pelo While, ou seja, enquanto o valor de K for menor que o valor de INDICE.

### faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
O bloco de código entre {} é executado enquanto a condição do loop for verdadeira
Este comando adiciona o valor atual de K à variável SOMA. Assim, SOMA acumula a soma de todos os valores de K a cada iteração do loop.

Resultando no valor final de 77 

### Classe UML do código

![image](https://github.com/user-attachments/assets/e9bb12ab-d55e-4568-8a2f-0ed4798e29e3)

### 4) Descubra a lógica e complete o próximo elemento:
## a) 1, 3, 5, 7, 
Próximo: 9
Números ímpares consecutivos

## b) 2, 4, 8, 16, 32, 64,
Próximo: 128
Cada número é o dobro do anterior (potências de 2)

## c) 0, 1, 4, 9, 16, 25, 36, 
Próximo: 49
Quadrados perfeitos (0², 1², 2², ...)

## d) 4, 16, 36, 64,
Próximo: 100
Quadrados de números pares (2², 4², 6², ...).

## e) 1, 1, 2, 3, 5, 8,
Próximo: 13
Sequência de Fibonacci (cada número é a soma dos dois anteriores).

## f) 2,10, 12, 16, 17, 18, 19,
Próximo: 20
Adicionar um número incremental após cada grupo de variação. 


### 5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

Pimeira Visita:

Liguo dois interruptores e mantenho o terceiro desligado.
Motivo:
Se duas lâmpadas estiverem acesas, os interruptores ligados controlam essas lâmpadas.
Se uma lâmpada estiver acesa, o interruptor ligado controla essa lâmpada, e o outro interruptor ligado não controla nenhuma lâmpada.
Se nenhuma lâmpada estiver acesa, o interruptor que controla a lâmpada acesa é o que você deixou desligado.

Segunda Visita:

Desligo um dos interruptores ligados e vá verificar as lâmpadas.
Motivo:
Lâmpada que estava acesa e agora está apagada: O interruptor que desliguei controla essa lâmpada.
Lâmpada que estava acesa e continua acesa: O outro interruptor ligado controla essa lâmpada.
Lâmpada que estava apagada e continua apagada: O interruptor que você deixou desligado na primeira visita controla essa lâmpada.

Exemplo:

Na primeira visita, liguei os interruptores A e B e mantive C desligado.
Ao verificar, encontrei uma lâmpada acesa na sala 1 e outra acesa na sala 2.
Na segunda visita, desliguei o interruptor A.
A lâmpada na sala 1 agora está apagada.

### Conclusão:

O interruptor A controla a lâmpada da sala 1.
O interruptor B controla a lâmpada da sala 2.
O interruptor C controla a lâmpada da sala 3 (que estava sempre apagada).


## 💻 Tecnologias usadas

![Java](https://img.shields.io/badge/-Java-0D1117?style=for-the-badge&logo=java&logoColor=F7DF1E&labelColor=0D1117)

## 📌 Como executar o projeto

```
# clonar o repositório
git clone https://github.com/Rayane-Souza/DesafioTargetSistemas.git

# Abra o Eclipse ou a IDE que deseja 

# Importe o Projeto

# Clique no o menu File (Arquivo)

# Selecione Import (Importar)

# Escolha Existing Projects into Workspace (Projetos existentes no Workspace) e clique em Next (Próximo).

# Clique em Browse (Procurar) e navegue até a pasta onde o projeto foi clonado.

# Selecione a pasta do projeto e clique em Finish (Concluir). Isso importará o projeto para o seu workspace do Eclipse.
Verifique a Estrutura do Projeto

# No Project Explorer (Explorador de Projetos) no Eclipse, você deve ver seu projeto listado.

# Certifique-se de que a estrutura do projeto está correta e que todos os arquivos necessários estão presentes.
Configure o JDK

# Certifique-se de que o JDK (Java Development Kit) está corretamente configurado no Eclipse.

#Entre em  Window > Preferences (Preferências) Selecione Java > Installed JREs (JREs Instalados) e verifique se o JDK correto está selecionado.

# Compile o Projeto

```
## Author

<table>
  <tr>
    <td>
      Rayane Souza<br>
      <a href="https://www.linkedin.com/in/rayanekelly/" target="_blank">
        <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank">
      </a>
    </td>
    
</table>



