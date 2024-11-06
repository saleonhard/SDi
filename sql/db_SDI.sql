CREATE DATABASE db_SDI;

USE db_SDI;

#
# Structure for table "campus"
#

CREATE TABLE `campus` (
  `cod` varchar(45) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `local` varchar(45) NOT NULL,
  PRIMARY KEY (`cod`),
  UNIQUE KEY `idcampus_UNIQUE` (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for table "noticias"
#

CREATE TABLE `noticias` (
  `cod` varchar(45) NOT NULL,
  `assunto` longtext NOT NULL,
  `noticia` longtext NOT NULL,
  `status` varchar(45) NOT NULL DEFAULT 'Pendente',
  `destinatario` longtext NOT NULL,
  PRIMARY KEY (`cod`),
  UNIQUE KEY `idnoticias_UNIQUE` (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for table "servidores"
#

CREATE TABLE `servidores` (
  `cod` varchar(45) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `campus` varchar(45) NOT NULL,
  PRIMARY KEY (`cod`),
  UNIQUE KEY `idservidores_UNIQUE` (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for table "solicitacoes"
#

CREATE TABLE `solicitacoes` (
  `cod` varchar(45) NOT NULL,
  `assunto` longtext NOT NULL,
  `conteudo` longtext NOT NULL,
  `status` varchar(45) NOT NULL DEFAULT 'Pendente',
  PRIMARY KEY (`cod`),
  UNIQUE KEY `idsolicitacoes_UNIQUE` (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for table "usuarios"
#

CREATE TABLE `usuarios` (
  `cod` varchar(45) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  PRIMARY KEY (`cod`),
  UNIQUE KEY `cod_UNIQUE` (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- Inserir dados na tabela 'campus' com localizações na Bahia
INSERT INTO campus (cod, nome, local)
VALUES
    ('CC01', 'Campus Central', 'Av. Sete de Setembro, 123, Salvador, Bahia'),
    ('CC02', 'Campus Norte', 'Rua das Flores, 456, Feira de Santana, Bahia'),
    ('CC03', 'Campus Sul', 'Rua do Sol, 789, Ilhéus, Bahia'),
    ('CC04', 'Campus Leste', 'Rua do Rio, 101, Itabuna, Bahia');  

-- Inserir dados na tabela 'servidores' com os novos tipos
INSERT INTO servidores (cod, nome, email, tipo, campus)
VALUES
    ('SS01', 'João Silva', 'joao.silva@instituicao.com', 'Representante', 'Campus Central'),
    ('SS02', 'Maria Oliveira', 'maria.oliveira@instituicao.com', 'Sindicalizado', 'Campus Norte'),
    ('SS03', 'Carlos Souza', 'carlos.souza@instituicao.com', 'Não Sindicalizado', 'Campus Sul'),
    ('SS04', 'Ana Costa', 'ana.costa@instituicao.com', 'Representante', 'Campus Central'),
    ('SS05', 'Fernanda Pereira', 'fernanda.pereira@instituicao.com', 'Sindicalizado', 'Campus Norte'),
    ('SS06', 'Roberto Lima', 'roberto.lima@instituicao.com', 'Não Sindicalizado', 'Campus Leste'),  
    ('SS07', 'Luciana Gomes', 'luciana.gomes@instituicao.com', 'Representante', 'Campus Leste'),  
    ('SS08', 'Rafael Martins', 'rafael.martins@instituicao.com', 'Sindicalizado', 'Campus Sul'),  
    ('SS09', 'Patrícia Alves', 'patricia.alves@instituicao.com', 'Não Sindicalizado', 'Campus Norte');  

-- Inserir dados na tabela 'usuarios' com tipos 'Diretor' e 'Editor'
INSERT INTO usuarios (cod, nome, email, login, senha, tipo)
VALUES
    ('UU01', 'João Silva', 'joao.silva@instituicao.com', 'jsilva', 'senha123', 'Diretor'),
    ('UU02', 'Maria Oliveira', 'maria.oliveira@instituicao.com', 'mariaO', 'senha456', 'Editor'),
    ('UU03', 'Carlos Souza', 'carlos.souza@instituicao.com', 'carlosS', 'senha789', 'Editor'),
    ('UU04', 'Ana Costa', 'ana.costa@instituicao.com', 'anaC', 'senha000', 'Diretor'),
    ('UU05', 'Fernanda Pereira', 'fernanda.pereira@instituicao.com', 'fernandaP', 'senha1234', 'Editor'),
    ('UU06', 'Roberto Lima', 'roberto.lima@instituicao.com', 'robertoL', 'senha987', 'Editor'),  
    ('UU07', 'Luciana Gomes', 'luciana.gomes@instituicao.com', 'lucianaG', 'senha1111', 'Diretor'),  
    ('UU08', 'Rafael Martins', 'rafael.martins@instituicao.com', 'rafaelM', 'senha2222', 'Editor'),  
    ('UU09', 'Patrícia Alves', 'patricia.alves@instituicao.com', 'patriciaA', 'senha3333', 'Diretor');  

-- Inserir dados na tabela 
INSERT INTO solicitacoes (cod, assunto, conteudo, status)
VALUES
    ('AA01', 'Inauguração do novo campus no interior', 'A Alicitação para criar uma notícia sobre a inauguração do novo campus da universidade, localizado na cidade de Feira de Santana.', 'Atendida'),
    ('AA02', 'Lançamento do curso de Biotecnologia', 'Notícia proposta sobre o lançamento do curso de Biotecnologia no campus Central, com ênfase em pesquisa e inovação científica.', 'Atendida'),
    ('AA03', 'Novos programas de bolsas de estudo', 'A Alicitação de criação de notícia sobre a abertura de novas bolsas de estudo para alunos de baixa renda.', 'Pendente'),
    ('AA04', 'Concurso de redação no campus Sul', 'Notícia sobre o concurso de redação promovido no campus Sul, com participação de alunos e prêmios para os melhores textos.', 'Atendida'),
    ('AA05', 'Eventos de integração para alunos de medicina', 'Notícia sobre eventos de integração entre alunos do curso de Medicina, com atividades de lazer e confraternização.', 'Pendente'),
    ('AA06', 'Criação do novo centro de empreendedorismo', 'Proposta para a criação de uma notícia sobre o lançamento do novo centro de empreendedorismo, que irá apoiar ideias inovadoras de alunos e ex-alunos.', 'Atendida'),
    ('AA07', 'Problema no sistema de gestão acadêmica', 'Notícia sobre um problema técnico no sistema de gestão acadêmica da universidade que afetou o acesso aos boletins e notas dos alunos.', 'Pendente'),
    ('AA08', 'Abertura de novo centro de idiomas no campus Norte', 'A Alicitação de notícia sobre a inauguração de um centro de idiomas no campus Norte, com cursos gratuitos para a comunidade local.', 'Atendida'),
    ('AA09', 'Semana de integração entre cursos', 'Notícia sobre a semana de integração entre os diversos cursos oferecidos pela universidade, com palestras e workshops.', 'Pendente'),
    ('AA10', 'Novos recursos para pesquisa no campus Leste', 'A Alicitação de uma notícia sobre os novos recursos de pesquisa disponibilizados no campus Leste, com novos laboratórios e equipamentos de ponta.', 'Atendida'),
    ('AA11', 'Campanha de arrecadação de alimentos', 'A Alicitação para criar uma notícia sobre a campanha de arrecadação de alimentos que será realizada nos próximos dias no campus Central.', 'Atendida'),
    ('AA12', 'Construção de uma nova quadra esportiva', 'Notícia sobre a construção de uma nova quadra esportiva no campus Sul, destinada a atender a demanda crescente de alunos interessados em esportes.', 'Pendente'),
    ('AA13', 'Visita de universidade internacional ao campus Central', 'Notícia sobre a visita de uma universidade internacional ao campus Central para discutir parcerias e intercâmbios de alunos.', 'Atendida'),
    ('AA14', 'Criação de um aplicativo institucional', 'A Alicitação para criar uma notícia sobre a criação de um novo aplicativo institucional para facilitar a comunicação entre alunos e professores.', 'Pendente'),
    ('AA15', 'Parceria com empresas para estágios', 'Notícia sobre a nova parceria da universidade com diversas empresas para oferecer estágios remunerados para os alunos de todos os cursos.', 'Atendida');

-- Inserir dados na tabela 'noticias' para as solicitações que foram atendidas
INSERT INTO noticias (cod, assunto, noticia, status, destinatario)
VALUES
    ('NN01', 'Inauguração do novo campus no interior', 'O novo campus da universidade foi inaugurado em Feira de Santana, oferecendo infraestrutura moderna e novas oportunidades de ensino para a comunidade local. A inauguração contou com a presença de autoridades e líderes educacionais.', 'Pendente', ''),
    ('NN02', 'Lançamento do curso de Biotecnologia', 'O campus Central acaba de lançar o curso de Biotecnologia, com foco em inovação e pesquisa científica. O curso será um marco para a universidade e tem vagas limitadas.', 'Pendente', ''),
    ('NN03', 'Concurso de redação no campus Sul', 'O campus Sul realizou com sucesso o concurso de redação, com o tema "O futuro da ciência e da tecnologia". Os vencedores receberam prêmios e as redações serão publicadas no site oficial da universidade.', 'Pendente', ''),
    ('NN04', 'Criação do novo centro de empreendedorismo', 'A universidade está inaugurando o Centro de Empreendedorismo, que vai oferecer apoio a alunos e ex-alunos com ideias inovadoras. O centro contará com mentoria, oficinas e eventos de networking.', 'Pendente', ''),
    ('NN05', 'Abertura de novo centro de idiomas no campus Norte', 'O campus Norte acaba de abrir um Centro de Idiomas com cursos gratuitos para a comunidade. As inscrições estão abertas e os cursos incluirão inglês, espanhol, francês e outros idiomas.', 'Pendente', ''),
    ('NN06', 'Novos recursos para pesquisa no campus Leste', 'O campus Leste investiu em novos recursos para pesquisa, incluindo laboratórios modernos e equipamentos de última geração. Agora, alunos e professores terão acesso a ferramentas inovadoras para seus estudos.', 'Pendente', ''),
    ('NN07', 'Campanha de arrecadação de alimentos', 'O campus Central iniciou uma grande campanha de arrecadação de alimentos para ajudar as famílias em situação de vulnerabilidade social. A campanha ocorrerá ao longo do mês de novembro e contará com a participação de alunos e funcionários.', 'Pendente', ''),
    ('NN08', 'Visita de universidade internacional ao campus Central', 'Uma delegação de professores e pesquisadores de uma universidade internacional visitou o campus Central para discutir novas parcerias de intercâmbio e colaboração acadêmica.', 'Pendente', ''),
    ('NN09', 'Parceria com empresas para estágios', 'A universidade firmou uma nova parceria com diversas empresas para oferecer estágios remunerados aos alunos de todos os cursos. Essa iniciativa visa aumentar a empregabilidade dos nossos graduados.', 'Pendente', '');
