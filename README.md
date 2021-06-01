# AutomacaoWebPetz

#Pre requisitos para rodar em Windows:

1 - Java 8 instalado na máquina com a variavel de ambiente configurada

2 - Maven configurado como variavel de ambiente

3 - Uma IDE que tenha compatibilidade com java caso queira rodar os testes pela IDE (Recomento o intellij)

4 - Navegador Google Chrome instalado na versao: 91.0.4472.77

#Descrição

O projeto consome uma massa de testes de um arquivo .csv que está na raiz e ao executar os testes salva as screenshots dentro da pasta "screenshots"

#Executando o projeto

Para rodar o projeto depois de configurado os requisitos citados acima, basta clicar no botão "play" dentro da classe AddProductTest ou se quiser rodar por linha de comando. basta executar o seguinte comando: mvn clean test -Dtest=tests.AddProduct
