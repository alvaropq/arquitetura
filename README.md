####

<img height="300" src="https://github.com/rafael19888cruz/arquitetura/blob/main/imgclc/amostra%20cloc%20java%20antes.png"/>
Figura 1 - Código antes da alteração
                          
                          
                         

Meu código possui três classes, onde a classe ‘Correct’ contém toda a minha classe main, onde verifico os valores para realizar as validações e equações dos valores, nela se encontra 151 linha escritas de códigos,19 comentários e 44 linhas em branco, nessa classe se encontra apenas três estruturas condicionais, porém se um nome de alguma variável que é passada por parâmetro precisa ser mudado, também terá que ser mudado na sua  respectiva classe aonde contém suas inicializações de valores e seus gets, ou seja, existem dois lugares para se fazer alterações. Na classe ‘FosforoCorrect’ possui toda a estrutura que recebe e retorna os valores necessários para a correção do Fosforo, possuindo em sua estrutura 101 linhas de códigos escritos, nenhum comentário e 7 linhas em banco. Já na classe ‘PotassioCorrect’ possui toda estrutura que recebe e retorna os valores necessários para a realização da correção do potássio, em sua estrutura possui 59 linha de códigos escritos, 0 comentários e 8 linhas em branco. Após analisar meu trabalho percebi que os nomes que foi dado as variáveis estão confusas, pois é precisar pesquisar de onde vem as informações necessárias para as equações que são utilizadas non processo. Também foi natado que a estrutura do código está complexa, dificultando o sua compreensão e entendimento, pois as classe Correct carrega sozinha toda estrutura das equações de correção de solo. 
Com base na investigação que foi feita e com o apoio dos materiais complementares disponibilizados pelo professor,  foi decidido que a forma de melhorar a estrutura do código, foi fazendo o uso da estrutura de criação ‘builder’ no projeto, aonde as classe aonde ocorrem as equações necessárias para análise dos Fosforo e do Potássio foram divididas, mostrando que melhorou a flexibilidade do código e sua manutenção futuramente. Com essas alterações o código aumentou em número de linhas, mas sua compreensão também cresceu, possibilitando assim uma maior flexibilidade. Todas essas mudanças pode ser vistas no commit  ‘utilizando builder’.

<img height ="400" src = "https://github.com/rafael19888cruz/arquitetura/blob/main/imgclc/depois%20da%20alteracao.png"/>
Figura 2 - Código depois das alterações
