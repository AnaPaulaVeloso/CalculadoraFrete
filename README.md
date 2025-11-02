Tarefa 1: Módulo de Cálculo de Frete 

● Contexto: Você foi encarregado de desenvolver um módulo para 
uma plataforma de e-commerce que calcula o custo do frete com base 
no peso do pacote e na região de destino. As regras de negócio são 
cruciais para a lucratividade da empresa. 

● Requisitos Funcionais:
 
1. Crie uma classe CalculadoraFrete com um 
método calcular(double pesoKg, String regiao). 
2. O método deve retornar o valor do frete com base nas 
seguintes regras:

● Região - "Sudeste": Custo fixo de R10,00 mais R2,00 
por quilo adicional acima de 1 kg. Pacotes com 1 kg ou 
menos têm apenas o custo fixo. 

● Região - "Sul": Custo fixo de R15,00 mais R2,50 por 
quilo adicional acima de 1 kg. 

● Região - "Centro-Oeste": Custo fixo de R20,00 mais 
R3,00 por quilo adicional acima de 1 kg. 
● Outras
 
Regiões: Custo fixo de R30,00 mais R5,00 por 
quilo adicional acima de 1 kg. 
3. O método deve lançar uma exceção IllegalArgumentException se o pesoKg for menor ou 
igual a zero ou se a regiao for nula ou vazia. 

● Requisitos de Teste:
 
1. Implemente uma suíte de testes unitários que valide todos 
os cenários de negócio. 
2. Crie testes para cada região, incluindo casos de limite (ex: 
peso exatamente 1 kg e peso ligeiramente acima de 1 kg). 
3. Valide os caminhos de exceção (peso negativo/zero e 
região inválida). 
4. Utilize nomes de métodos de teste descritivos e siga o 
padrão Arrange-Act-Assert (AAA). 
● Entregáveis:

1. Código-fonte da classe CalculadoraFrete. 
2. Código-fonte da classe de testes. 
3. Relatório de cobertura de código (gerado por ferramentas 
como JaCoCo, Karma, etc.), com o objetivo de atingir 
100% de cobertura de linhas e ramos 
(branches)
 
