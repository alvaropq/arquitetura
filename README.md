####

<img height="300" src="https://github.com/rafael19888cruz/arquitetura/blob/main/imgclc/amostra%20cloc%20java%20antes.png"/>
Figura 1 - Código antes da alteração
                          
                          
                         

Meu código possui três classes, onde a classe ‘Correct’ contém toda a minha classe main, onde verifico os valores para realizar as validações e equações dos valores, nela se encontra 151 linha escritas de códigos,19 comentários e 44 linhas em branco, nessa classe se encontra apenas três estruturas condicionais, porém se um nome de alguma variável que é passada por parâmetro precisa ser mudado, também terá que ser mudado na sua  respectiva classe aonde contém suas inicializações de valores e seus gets, ou seja, existem dois lugares para se fazer alterações. Na classe ‘FosforoCorrect’ possui toda a estrutura que recebe e retorna os valores necessários para a correção do Fosforo, possuindo em sua estrutura 101 linhas de códigos escritos, nenhum comentário e 7 linhas em banco. Já na classe ‘PotassioCorrect’ possui toda estrutura que recebe e retorna os valores necessários para a realização da correção do potássio, em sua estrutura possui 59 linha de códigos escritos, 0 comentários e 8 linhas em branco. Após analisar meu trabalho percebi que os nomes que foi dado as variáveis estão confusas, pois é precisar pesquisar de onde vem as informações necessárias para as equações que são utilizadas non processo. Também foi natado que a estrutura do código está complexa, dificultando o sua compreensão e entendimento, pois as classe Correct carrega sozinha toda estrutura das equações de correção de solo. 
Com base na investigação que foi feita e com o apoio dos materiais complementares disponibilizados pelo professor,  foi decidido que a forma de melhorar a estrutura do código, foi fazendo o uso da estrutura de criação ‘builder’ no projeto, aonde as classe aonde ocorrem as equações necessárias para análise dos Fosforo e do Potássio foram divididas, mostrando que melhorou a flexibilidade do código e sua manutenção futuramente. Com essas alterações o código aumentou em número de linhas, mas sua compreensão também cresceu, possibilitando assim uma maior flexibilidade. Todas essas mudanças pode ser vistas no commit  ‘utilizando builder’.

<img height ="400" src = "https://github.com/rafael19888cruz/arquitetura/blob/main/imgclc/depois%20da%20alteracao.png"/>
Figura 2 - Código depois das alterações


# Atividade 4 - Desenvolvido por Alvaro Pedroso Queiroz

## Considerações iniciais
O presente tabalho possui erros gravíssimos de lógica de programação, orientação a objeto, arquitetura mal definida e principalmente do problema de negócio abordado, deixando o código com uma complexidade altíssima de entendimento.

De forma a exemplificar a complexidade encontrada, é mostrado na Figura 1, o diagrama de classes do presente trabalho:
<img height="600" src="https://github.com/alvaropq/arquitetura/blob/main/imagesCode/Diagrama_Classes.png"/>
Figura 1 - Diagram de classes

Pode se notar que as classes desenvolvidas não possuem relação nenhuma uma com as outras, e ainda assim, são chamadas em métodos de outras classes. Ficando evidente no caso da classe Correct, onde para a utilização de seus métodos, é preciso passar por parâmetro, um objeto da classe EquilibrioCorrect (onde ambas não estão possuindo relação). Para aumentar mais ainda a complexidade, a classe EquilibrioCorrect possui em seu método construtor a presença de outra classe, a EquilibrioCorrectBuilder.

Dessa forma, fica nítido a não utilização de conceitos utilizados em programação orientado a objeto.

Tal complexidade também é encontrada nas outras classes, como a AnalisaPotassio, que necessita de objetos da classe PotassioCorrect e consequentemente a PotassioCorrectBuilder e a classe Analisa Fosforo, onde necessita-se de objetos da classe FosforoCorrect e FosforoCorrectBuilder.

## Detalhamento das dificuldades encontradas em cada quadro

### i - Teores do solo

Após minucioso esforço de entender a lógica desenvolvida, além da verificação de commits antigos e formulação de teorias para o entendimento do código, foi-se notado que para a representação dos resultados do quadro de teores do solo, é utilizado as classes de Correct, EquilibrioCorrect e EquilibrioCorrectBuilder. Nisso, tem-se as principais dificuldades:

* **Estrutura complexa para desenvolvimento dos métodos**: A estrutura desenvolvida para as realizações dos métodos que necessitavam ser utilizados para o quadro esta em uma complexidade muito grande. Os métodos estão localizados na classe Correct, que por sua vez precisam de atributos da classe EquilibrioCorrect e EquilibrioCorrectBuilder, sem possuir nenhuma ligação entre eles, logo, para a utilização da mesma teria que se utilizar 3 objetos diferentes, para fazer algo simples que somente uma classe seria necessário. 

No [commit](https://github.com/alvaropq/arquitetura/commit/24c2c9adcd9a69cdb4bca0e1641a1fc5c55994d0#diff-2da96005839970f3ae7829a233e48fc08a236dc1139660e94d98e0d250d36b1a) no teste testTeoresDoSolo(), é mostrado como a complexidade dessa estrutura afeta na realização do teste, além de a calsse EquilibrioCorrectBuilder não possuir um construtor com todos os atributos necessários, tendo que se utilizar métodos set separadamente.

* **Uso inadequado de métodos e classes**: Como já foi dito e pode ser vizualizado na Figura 1, a forma que está sendo utlizado as classes está de forma indevida, onde a classe EquilibrioCorrect e EquilibrioCorrectBuilder possuem os mesmos atributos, onde a primeira se utiliza de atributos atribuídos no objeto de classe EquilibrioCorrectBuilder. Logo, é possível perceber, que não era necessário a classe builder, e ela só está dificultando ainda mais o entendimento e a clareza do código.

Também é possível estabelecer que o código possui métodos que calculam um determinado resultado, e deveriam ser utilizado para outros métodos da mesma classe. Porém, o presente código não reutiliza desses métodos, e sim atribui um paramêtro esperando esse valor, como é demonstrado na Figura 2.
<img height="150" src="https://github.com/alvaropq/arquitetura/blob/main/imagesCode/Complex_Methods.png"/>

Figura 2 - Métodos complexos

* **Não implementação de métodos cruciais**: O quadro também possui informações que são cruciais para o desenvovimento dos demais métodos presentes nos quadros posteriores, que não foram implementados nos métodos destinados ao quadro atual, como no caso os métodos que trazem os valores ideiais de cada nutriente.

* **Pouca flexibilidade no código**: Também é possível denotar métodos que trazem como resultado valores que são mostrados somente no console e são retornados valores sem sentido algum, como por exemplo na Figura 3. É possível encontrar mais casos dessa forma ao longo do código.

<img height="150" src="https://github.com/alvaropq/arquitetura/blob/main/imagesCode/Fail_Methods.png"/>
Figura 3 - Métodos não flexíveis


### ii - Correção/recuperação de fósforo e iii - Correção/recuperação de potássio
As dificuldades encontradas para os quadros ii  e iii são similares e ainda trazem consigo as dificuldades encontradas para o quadro i. Os quadros ii e iii possuem problemas de compreensão do problema que são gravíssimos para todo o projeto, onde toda a sua estrutura é comprometida e o produto desse código não está viável a ser utilizado. Destacam-se as seguintes problemáticas:

* **Métodos com nomes diferentes da planilha**: Os métodos realizados possuem nomes que não estão sendo apresentados na planilha, dificultando o discernimento da utilização do método, tendo que comparar o que está sendo feito no método e olhar para qual das funções da planilha estão aparentemente semelhantes, aumentando ainda mais a complexidade de entendimento do código. 

* **Informações básicas do projeto não realizadas**: O código não possui informações básicas e totalmente necessárias para a realização dos métodos. Onde possuindo conhecimento prévio sobre o determinado problema de negócio, é de conhecimento que as as diferentes fontes de correção possuem valores constantes que serão utilizadas para os cálculos dos métodos necessários para esses quadros. Essas informações comprometem todo o código desenvolvido, já que é necessário que essas informações estivessem no programa e fossem utilizadas.

* **Métodos cruciais de cálculo faltante**: De maneira análoga, a falta de informações citadas acima, comprometem nesses métodos cruciais de cálculo que estão faltante no código desenvolvido. Por exemplo, na Figura 4, pode-se inferir, por assimilação de que o método Aproveita(), trata-se do método correspondente a parte inicial do quantidade a aplicar da planilha. Assim, o código não está realizando um cálculo que é muito importante para a realização do método, e o invés disso, está esperando um valor que é passado na classe potassio, utilizando potassio.getDadoPotassio(), porém esse dado não é um dado de entrada e deveria ser implementado. Em outras palavras, o programa não está fazendo os cálculos para o usuário, e sim, esperando que o usuário faça o cálculo e passe o valor, fugindo totalmente do intuito da resolução do problema de negócio.

<img height="50" src="https://github.com/alvaropq/arquitetura/blob/main/imagesCode/Not_calculated_Methods.png"/>
Figura 4 - Métodos de cálculo faltantes

Dessa forma se torna inviável a realização de "pequenos ajustes", já que esses ajustes não seriam pequenos, e sim por conta das amplas questões mencionadas acima, deveriam mudar toda a estrutura do código. Para todo caso, os métodos desses quadros não possuem forma de arrumar ou implementar algo faltante, haja vista, que já possui informações prévias faltantes e a lógica utilizada não corresponde ao modelo de negócio adotado. Então os referidos "ajustes", necessariamente irão mudar completamente a forma de implementação adotada.

### Classes de testes
As classes de testes deveriam se tornar uma fonte de ajuda para validar a forma de pensamento realizado. Porém os testes presentes na classe de teste  NewEmptyJUnitTest possui erros. Além disso, também possui testes que utilizam métodos que não existem nas classes, conforme denotado na Figura 5.

<img height="150" src="https://github.com/alvaropq/arquitetura/blob/main/imagesCode/Fail_test.png"/>
Figura 4 - Métodos de cálculo faltantes

## Considerações finais
O presente trabalho denota a grande dificuldade encontrada para o entendimento da arquitetura de um código, onde tive que utilizar de diversos tipos de recursos (diagrama de classes, commits, analise de código, assimilação com a planilha) para poder formular hipóteses e obter visões mais gerais a respeito do código. As conclusões que obtenho sobre o código são as seguintes:
* **Faltou uma maior abstração do problema de negócio**: O problema de negócio não foi abstraído de forma coerente, no que impactou significativamente na arquitetura realizada, pois acabou faltando informações relevantes, cálculos necessários, não se abstraiu o que era informações que seriam passadas pelo usuário ou não, quais as informações que teriam que se obter como resultado, quais os atributos que deveriam ser utilizados.
* **Faltou domínio com linguagem orientado a objetos**: Passa-se a impressão de que o código está bastante procedural, não tendo relações entre as classes, não utilizando métodos da própria classe, métodos com retornos sem sentido.
* **Ajustes do código**: No [commit](https://github.com/alvaropq/arquitetura/commit/24c2c9adcd9a69cdb4bca0e1641a1fc5c55994d0#diff-2da96005839970f3ae7829a233e48fc08a236dc1139660e94d98e0d250d36b1a) é passado a classe de teste realizada, onde possui somente os métodos que conforme a arquitetura adotada funcionariam sem burlar o problema de negócio adotado. Dessa forma, a realização de métodos falantes e ajustes, implicaria numa mudança drástica no código atual, mudando totalmente a arquitetura adotada, o que foge do objetivo dessa atividade.

Portanto, o presente relatório relata as dificuldades encontradas, exemplos dessas dificuldades, e minha visão sobre a arquitetura adotada.
