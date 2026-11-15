# Sistema de Gestão de Manutenção

Projeto desenvolvido em Java com o objetivo de simular o gerenciamento de solicitações e serviços de manutenção de equipamentos em uma empresa.

O sistema busca organizar o processo de manutenção, desde a abertura de uma solicitação por um funcionário até a execução e conclusão do serviço por um técnico responsável.

**Status:** Em desenvolvimento.

## Objetivo do projeto

Desenvolver um sistema capaz de controlar equipamentos, funcionários, técnicos e solicitações de manutenção, permitindo acompanhar o andamento dos serviços e manter um histórico das atividades realizadas.

## Funcionalidades planejadas

- Cadastro e gerenciamento de equipamentos.
- Cadastro de funcionários e técnicos.
- Registro de solicitações de manutenção.
- Definição de prioridades para as solicitações.
- Controle de status das solicitações.
- Designação de técnicos responsáveis.
- Registro de diagnósticos e serviços realizados.
- Controle de materiais utilizados durante as manutenções.
- Cálculo dos custos das manutenções.
- Histórico de manutenções realizadas.

## Tecnologias utilizadas

- **Java:** desenvolvimento da aplicação e implementação da lógica de negócio.
- **Programação Orientada a Objetos (POO):** encapsulamento, herança, abstração e composição.
- **Git e GitHub:** versionamento e gerenciamento do código-fonte.

## Estrutura do projeto

O projeto está sendo desenvolvido utilizando uma organização baseada em classes e enums.

**Classes já implementadas:**

- `Equipamento`
- `Pessoa`
- `Funcionario`
- `Tecnico`
- `Solicitacao`

**Enums já implementados:**

- `TipoEquipamento`
- `StatusEquipamento`
- `SetorEmpresa`
- `Prioridade`
- `StatusSolicitacao`

## O que ainda falta implementar

As próximas etapas de desenvolvimento incluem:

- [ ] Implementar a classe `Manutencao`.
- [ ] Implementar a classe `Material`.
- [ ] Desenvolver o gerenciamento das solicitações e manutenções.
- [ ] Implementar a atribuição de técnicos às solicitações.
- [ ] Controlar a disponibilidade dos técnicos.
- [ ] Impedir que um equipamento possua duas manutenções simultâneas.
- [ ] Implementar as regras de transição dos status.
- [ ] Impedir a conclusão de uma manutenção sem diagnóstico.
- [ ] Registrar materiais utilizados e calcular os custos.
- [ ] Gerar histórico de manutenções concluídas.
- [ ] Desenvolver o menu de interação no terminal.
- [ ] Implementar testes das funcionalidades e regras de negócio.

## Regras de negócio planejadas

- Uma solicitação deve possuir um equipamento e um funcionário responsável pela abertura.
- Toda solicitação deve começar com o status `ABERTA`.
- Solicitações canceladas não podem iniciar uma manutenção.
- Um equipamento não pode possuir duas manutenções simultâneas.
- Uma manutenção não pode ser concluída sem diagnóstico.
- O custo total da manutenção deve considerar os materiais utilizados.
- Manutenções concluídas devem permanecer registradas no histórico.

## Organização do desenvolvimento

O projeto utiliza Git para controle de versão, com a branch `main` destinada às versões estáveis e branches específicas para o desenvolvimento de novas funcionalidades.

---

Projeto desenvolvido para fins de aprendizado e construção de portfólio acadêmico na área de Análise e Desenvolvimento de Sistemas.
