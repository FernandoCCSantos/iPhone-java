# Descrição do Projeto

Este projeto se trata de uma simulação conceitual e um tanto simplificada do funcionamento de um iPhone. Inspirado pela apresentação feita por Steve Jobs em 2007 da primeira geração do iPhone, e com o intuito de praticar o
uso básico de interfaces e suas implementações, faço uma representação do modo como o iPhone uniu em apenas um dispositivo as funções de telefone, reprodutor musical e navegaor de internet, antes exercidas por dispositvos
especializados distintos.

## Planejamento e diagramação do projeto (UML)

Primeiro de tudo, criei três interfaces: **IPod**, **Telefone** e **NavegadorInternet** contendo a declaração abstrata de cada uma das funções exigidas pela atividade. Em seguida, criei as classes **IPhone** e **Usuario**.
A classe **IPhone** implementa todos os métodos das três interfaces mencionadas acima, reunindo-as em um único objeto, ainda a ser instanciado. Já a classe **Usuario** serve apenas propósitos de ilustração, sendo através 
dela que é instanciado de fato o objeto **IPhone** e seus métodos executados (como se fosse realmente um iPhone sendo utilizado por um usuário).

- segue abaixo o diagrama de classes UML para a estrutura dos arquivos principais do projeto:

![iPhoneDiagram](https://github.com/user-attachments/assets/38df2d21-0241-46d7-bfec-cf91c0316d89)
