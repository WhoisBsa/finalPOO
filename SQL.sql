create database tupi;

use tupi;

create table funcionario (
	matricula varchar(5) primary key,
    nome varchar(30),
    turno varchar(10),
	funcao varchar(15),
	salario decimal(10,2),
    pwd varchar(16)
);

create table relatorio (
	id integer primary key auto_increment,
	aplicacao varchar(10),
	matricula varchar(5),
    inicio datetime,
    fim datetime,
    observacoes varchar(350),
    codMaterial varchar(10),
    qtdMaterial integer,
    numOs varchar(10),
    dataLancamento timestamp default current_timestamp(),

    constraint fk_matricula foreign key (matricula) references tupi.funcionario(matricula)
);

insert into funcionario
	(matricula, nome, turno, pwd, funcao, salario)
values
	('5705', 'hemílio lindo', '07h - 17h', 'hemilio123', 'eletricista', 120.00);

insert into relatorio
	(aplicacao, matricula,
    inicio, fim, observacoes,
    codMaterial, qtdMaterial, numOs)
values
	('M0702M','5705','2019-11-20 15:57:00',
    '2019-11-20 16:30:00','limpando o salão',
    'E021312', 13, '0254321');


select * from funcionario;






insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (4442, 'Lotte Perren', '18h - 04h', 'mecânico', '2114.49', 'wYurf9');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (3125, 'Allie Dalgarno', '18h - 04h', 'eletricista', '1079.40', '4Na6BKxph');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (4516, 'Tirrell Joscelin', '18h - 04h', 'mecânico', '2477.11', 'M24eivs2Fb');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (2333, 'Hadley Cullington', '18h - 04h', 'mecânico', '1835.43', 'zGdNMgfMK');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (4277, 'Toby How to preserve', '18h - 04h', 'mecânico', '2617.06', 'cOnTVwMpl');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (3801, 'Ambrosius Dresser', '18h - 04h', 'eletricista', '2184.77', 'N3TBaSa');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8067, 'Dominga Augar', '18h - 04h', 'eletricista', '1969.08', 'knwvPPXXHG');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (7894, 'Merrili Boss', '07h - 17h', 'mecânico', '2142.27', 'zILIgl');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8347, 'Karel Tyler', '18h - 04h', 'mecânico', '2357.16', '4tWiHoGIKB2');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8170, 'Celina Clutterham', '18h - 04h', 'eletricista', '2734.35', '59uz08');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (5904, 'Michell Glanz', '18h - 04h', 'eletricista', '2792.35', 'l0eRS1R7Qd7g');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (6325, 'Laughton Treamayne', '07h - 17h', 'mecânico', '1668.23', 'YG3DG1m8slkN');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8146, 'Josi Witton', '18h - 04h', 'eletricista', '1559.13', 'XHqBlBSU3b');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (6422, 'Kliment Hillitt', '18h - 04h', 'eletricista', '1623.52', 'iA8yZRtv');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (3176, 'Flinn Sheals', '18h - 04h', 'mecânico', '1354.14', 'c0mk1DNb');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (6801, 'Cherilynn McKibben', '07h - 17h', 'eletricista', '1984.63', '8PphZxkzLQCi');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (2540, 'Rodrick Playdon', '18h - 04h', 'eletricista', '1138.46', 'PmmCKGNGbEPm');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (1718, 'Jocelyn Redparth', '18h - 04h', 'mecânico', '2706.72', 'BPaqj2p7');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (9649, 'Malanie Trobey', '18h - 04h', 'mecânico', '2743.63', 'PiEjdbu');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8678, 'Rennie Brockway', '18h - 04h', 'eletricista', '2438.66', 'WXXYXFJY6');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (1379, 'Kissie O''Loughnan', '18h - 04h', 'eletricista', '1100.53', 'CdDK0h');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (9319, 'Hewitt Goulter', '07h - 17h', 'eletricista', '1820.08', 'rlnBww');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (7204, 'Cassandry Sinncock', '18h - 04h', 'mecânico', '1243.76', 'kZPDPEU');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (5569, 'Donny McBay', '07h - 17h', 'eletricista', '2532.72', 'B8VQISl1SSKA');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (9369, 'Benjamen Emby', '18h - 04h', 'mecânico', '2906.34', 'LWGQWbYb');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (4964, 'Silvana Duxbarry', '07h - 17h', 'eletricista', '2161.64', 'XnYzhXbI9gF');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (7010, 'Melany Lauchlan', '18h - 04h', 'eletricista', '1052.57', 'PHPeZN');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (2304, 'Justino Yaxley', '18h - 04h', 'eletricista', '2598.35', 'KHEpSGmgiJid');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (7675, 'Candi Mingo', '07h - 17h', 'eletricista', '1593.94', '73Wbh46');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (7041, 'Koren Vasyatkin', '07h - 17h', 'mecânico', '1334.65', 'Ag2Lk933');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (5488, 'Julian Morpeth', '18h - 04h', 'mecânico', '2063.30', 'dWMc6ha5');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (1914, 'Alfonso Heffy', '07h - 17h', 'mecânico', '1102.95', 'WEFVJFZuyRC');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (5420, 'Calli Cadagan', '18h - 04h', 'eletricista', '1550.55', 'U7z5FUQk4M');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (9753, 'Morse Cluitt', '18h - 04h', 'eletricista', '1253.31', 'CCCOI2R');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (3318, 'Phillipe Minshull', '07h - 17h', 'mecânico', '2271.47', 'dAsObi');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8056, 'Ingrim Yushkov', '07h - 17h', 'eletricista', '2158.61', 'pjiCBOC5NEBA');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8266, 'Lyndy MacGillreich', '07h - 17h', 'mecânico', '1642.19', 'dwzVNdn43');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8183, 'Merlina Matherson', '18h - 04h', 'mecânico', '1552.57', 'beap0Ffu');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (6553, 'Alidia Fritchley', '18h - 04h', 'eletricista', '2601.69', 'CHsmZr2');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (6661, 'Patty Haylands', '18h - 04h', 'mecânico', '2108.80', 'N9hXDu');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (1664, 'Dallon Scuffham', '07h - 17h', 'mecânico', '2265.66', 'TQ5Q8CRRE88X');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (3456, 'Lawton Bellefonte', '07h - 17h', 'mecânico', '1097.35', 'gvSTIzel6jS');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8407, 'Lannie Shea', '18h - 04h', 'mecânico', '2567.04', 'Dcx9u89');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (6994, 'Marcille Rigts', '18h - 04h', 'eletricista', '2533.00', '7DaUOoFTGN');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (3767, 'Addy Gierth', '18h - 04h', 'mecânico', '1281.69', 'mbAeCVV5qpxK');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (7618, 'Caitlin Schwandt', '07h - 17h', 'mecânico', '2652.69', 'JNOGZmqSXVr');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (6268, 'Libbey Budd', '18h - 04h', 'mecânico', '2973.77', '8lWyUeaSvhFW');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (2821, 'Claude Lavender', '07h - 17h', 'eletricista', '2940.64', 'ah1BYE');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (6166, 'Shari Turpie', '18h - 04h', 'eletricista', '2779.49', '9hbt8OV');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (2118, 'Natale Digby', '18h - 04h', 'mecânico', '2197.46', 'MsJM0T1fzZ');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (7680, 'Hannis Leamy', '18h - 04h', 'mecânico', '2661.34', '7hsglpoIggeW');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8743, 'Isadore Izchaki', '07h - 17h', 'mecânico', '2193.58', 'vuDq6L9ns');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (4714, 'Catie Lau', '07h - 17h', 'eletricista', '1238.20', 'Zs4PljHI41');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (7985, 'Lamar Ithell', '18h - 04h', 'eletricista', '2283.84', 'inkAjPGs');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (9737, 'Cheston Furst', '18h - 04h', 'mecânico', '2666.23', '3jFWkoQ');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (4280, 'Buddie Sloley', '07h - 17h', 'eletricista', '2568.03', 'nJFXhYF');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8032, 'Ebba Starkings', '18h - 04h', 'eletricista', '1851.49', 'VJUHii');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (6526, 'Jacob Marrington', '18h - 04h', 'eletricista', '1010.88', '9Zd3eJlc');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8356, 'Brenden Cacacie', '07h - 17h', 'mecânico', '2925.30', 'H0gK0Gv');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8159, 'Marianne Iskower', '07h - 17h', 'mecânico', '2096.93', 'cVu9DPR');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (1700, 'Guenna Arney', '07h - 17h', 'mecânico', '2241.46', 'zNSVyI');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8761, 'Joice Freeberne', '07h - 17h', 'mecânico', '2155.32', '9P6Q2dX');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (1108, 'Bellina Craigs', '07h - 17h', 'mecânico', '2766.95', 'kkGFyqFc');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (2491, 'Ruthe Turnpenny', '18h - 04h', 'mecânico', '1965.79', 'sfL7Gic');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (6360, 'Mandi Yokley', '07h - 17h', 'mecânico', '1959.92', '8S6VgIvmsZxc');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (6332, 'Truman Sealand', '18h - 04h', 'eletricista', '1306.03', '0MpIxCcTRa2');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (7157, 'Hanan Garlic', '18h - 04h', 'eletricista', '2788.29', 'BCCM81GV');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (2796, 'Melonie Twelftree', '07h - 17h', 'mecânico', '1699.84', 'a3OAQ5');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (9824, 'Mufinella Dahl', '18h - 04h', 'eletricista', '1800.69', 'iocFwyGy3');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (6400, 'Hanan Gilbert', '07h - 17h', 'eletricista', '1184.93', 'yZv2Qy5FMFe');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (5968, 'Lovell Cuffe', '07h - 17h', 'eletricista', '1733.09', 'tIcMVtsmM');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8664, 'Adelle Pohls', '18h - 04h', 'eletricista', '1310.67', 'Z9FUOS');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (1166, 'Maurice Creane', '18h - 04h', 'eletricista', '1651.49', 'eCVu1pXauL');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (7480, 'Flossi Guarin', '07h - 17h', 'mecânico', '2173.08', 'xW5pZ8m');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (9605, 'Hana Powton', '07h - 17h', 'eletricista', '1960.69', 'AGowb87C');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (3083, 'Corabelle McEvay', '07h - 17h', 'mecânico', '1760.53', '9VuxGozrvk');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (9858, 'Linn Kelso', '07h - 17h', 'mecânico', '1395.44', 'ExVjNgN0fBiK');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (5696, 'Steffi Mussilli', '07h - 17h', 'mecânico', '1120.04', 'Au733kkaS');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8892, 'Wallace Clynman', '18h - 04h', 'eletricista', '1262.73', 'Uv7Bx8WjpP');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (5606, 'Ash Lifsey', '07h - 17h', 'eletricista', '2718.90', 'lQYsErODtP');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (2251, 'Rozalie Pirkis', '07h - 17h', 'eletricista', '2565.34', 'XtHQi1N');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (7570, 'Lilyan Oman', '07h - 17h', 'eletricista', '1637.80', '2HKGjrShx2');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (5386, 'Linoel Escott', '07h - 17h', 'eletricista', '1879.31', 'TArtscN');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8073, 'Mufinella Beverage', '18h - 04h', 'mecânico', '1909.06', 'M3voDHIclZBR');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8448, 'Berenice Fortie', '07h - 17h', 'eletricista', '1508.82', '7rK0FU3DtD');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (3692, 'Karina Dunnion', '18h - 04h', 'eletricista', '2598.50', 'j3Qxjy6');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (9350, 'Ransell Basindale', '07h - 17h', 'eletricista', '2301.38', 'EQa3dFjzkb5');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (2410, 'Miles Mahood', '07h - 17h', 'mecânico', '2447.46', 'NAuBw5eE2t');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (4825, 'Norry Bissett', '07h - 17h', 'mecânico', '2965.02', 'XvGG89yaOl3P');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (1471, 'Barret Axton', '18h - 04h', 'eletricista', '1677.62', 'LyEmg07');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (6153, 'Ruperto Ianson', '07h - 17h', 'mecânico', '1107.26', 'DZC0I91fNf9');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (3861, 'Frants Beastall', '18h - 04h', 'mecânico', '2446.17', 'axlqdsf3cwSg');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (6675, 'Eugene Verner', '07h - 17h', 'eletricista', '2520.99', 'M8BJNq');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (6784, 'Ninon Issacoff', '07h - 17h', 'eletricista', '2945.92', 'wGsA1wsB3F');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (2003, 'Julie Conville', '18h - 04h', 'mecânico', '2712.22', '87tM4c');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8869, 'Adore Burde', '18h - 04h', 'eletricista', '2313.52', 'jkuUK6NNsHK');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (8212, 'Bartholomeo Speer', '18h - 04h', 'eletricista', '1178.11', 'W1qLHxG');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (3567, 'Sarine Aldcorne', '07h - 17h', 'mecânico', '1286.03', 'JLZ6iiQe');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (3950, 'Kermy Chevin', '18h - 04h', 'eletricista', '2705.51', 'W8eUaoEt');
insert into funcionario (matricula, nome, turno, funcao, salario, pwd) values (4793, 'Vikky Woodvine', '07h - 17h', 'mecânico', '1399.55', 'bll2pJ');

