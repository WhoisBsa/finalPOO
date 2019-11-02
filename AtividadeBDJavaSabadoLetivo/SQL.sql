use bdaula;

create table cliente(
	id int primary key auto_increment,
    nome varchar(50),
    idade int,
    cpf varchar(14),
    endereco varchar(50),
    telefone varchar(13)
);

INSERT INTO cliente (nome,idade,cpf,endereco,telefone) VALUES ("Vaughan",74,88447820069,"Ap #933-996 Adipiscing Av.","49-3372-9463"),("Neve",2,34047608282,"720-6957 Consectetuer Street","76-9157-8997"),("Orla",11,98379377629,"466-2768 Blandit Av.","16-6595-2712"),("Laura",69,43861616230,"340-2914 Tempor Avenue","69-5700-0860"),("Dolan",62,50790513721,"P.O. Box 438, 6900 Mauris Rd.","10-3469-0507"),("Cadman",78,80885474872,"P.O. Box 448, 4554 Varius Av.","48-3883-2774"),("Moses",93,60297587271,"3361 Augue Avenue","86-9652-8535"),("Celeste",3,19025934915,"342-735 Laoreet Rd.","31-8442-6636"),("Donovan",43,30451462110,"779-4975 Ante Ave","91-4773-5781"),("Jaime",48,57574837883,"319-6950 Vivamus Rd.","65-1662-4562");
INSERT INTO cliente (nome,idade,cpf,endereco,telefone) VALUES ("Dacey",45,95928971990,"Ap #230-3399 Tincidunt, St.","16-6402-6721"),("Mufutau",8,88897778065,"P.O. Box 727, 3164 Nam Rd.","93-9631-6244"),("Patrick",24,64753029770,"P.O. Box 897, 1588 Aliquam Street","49-7829-1319"),("Xena",94,70161760449,"148-6381 Eu Av.","30-6245-3214"),("Brynn",28,27280797730,"P.O. Box 128, 6291 Aenean Ave","83-2993-4970"),("Roth",38,60172210973,"747-7537 Turpis. Street","63-7881-3838"),("Colorado",20,56836387393,"Ap #746-5403 Nisi Rd.","72-5702-0912"),("Zachery",91,55837635854,"375-1047 Donec Street","90-5688-8348"),("Blossom",22,85764378118,"P.O. Box 572, 2299 Id Street","24-7204-2303"),("Eric",68,92545828754,"4487 Eget Ave","54-2894-6395");
INSERT INTO cliente (nome,idade,cpf,endereco,telefone) VALUES ("Quintessa",37,91057121404,"7179 Risus, Avenue","47-3712-9565"),("Hasad",56,63821481983,"P.O. Box 224, 4560 Cursus. Av.","34-8416-8288"),("Macy",57,19828979535,"Ap #582-8042 Eget Rd.","37-2365-4840"),("Blake",75,46307391244,"638-1114 Ipsum. Rd.","66-5056-2536"),("Cade",60,30750717176,"Ap #374-604 Aliquam Rd.","92-1481-7299"),("Josephine",78,74314799681,"275-2170 Eleifend, Ave","88-9580-6216"),("Cassandra",82,52906515579,"8804 Tellus Ave","23-3557-6427"),("Dara",60,45250236405,"P.O. Box 688, 2405 Magna. St.","94-4162-8302"),("Mia",98,66155380550,"Ap #619-5112 Egestas. St.","34-5887-9740"),("Josephine",89,14837406957,"7560 Dui. Street","98-5265-8051");
INSERT INTO cliente (nome,idade,cpf,endereco,telefone) VALUES ("Meghan",5,44550128765,"4995 Arcu. Ave","78-9278-3281"),("Cheyenne",8,91297441883,"8715 Blandit Ave","52-7126-6055"),("Hashim",27,98721827575,"P.O. Box 540, 9220 Lectus Av.","52-3893-6713"),("Troy",99,89886548770,"4990 Vitae St.","92-3251-3079"),("Cyrus",29,93248186265,"Ap #823-8096 Ullamcorper. Av.","84-8546-8289"),("Deacon",100,72956168949,"P.O. Box 760, 2784 Volutpat. Ave","99-6882-9960"),("Noel",27,23590930146,"628-8276 Felis. Ave","15-5032-8857"),("Michelle",75,61235117265,"546-7684 Ridiculus St.","53-5146-1733"),("Harlan",95,66937947007,"1202 Duis Avenue","32-5768-2141"),("Cole",27,13666318459,"P.O. Box 113, 1193 Sed St.","17-7654-7418");
INSERT INTO cliente (nome,idade,cpf,endereco,telefone) VALUES ("Quamar",49,97761408952,"5093 Cursus. Ave","48-8350-4610"),("Quail",95,42657385142,"P.O. Box 204, 470 Eleifend Rd.","38-6401-8446"),("Kareem",15,11866358104,"Ap #633-3795 Elementum Avenue","60-2775-5858"),("Trevor",100,40202721706,"Ap #212-8558 Ridiculus Street","68-3674-8978"),("Ulysses",24,19000474256,"1755 Velit. Rd.","19-1450-0047"),("Zelda",31,88327439930,"P.O. Box 304, 1599 Massa. St.","35-3447-8085"),("Shelley",41,55777681441,"Ap #755-6198 Purus, Avenue","12-8354-0168"),("Drake",87,61994823212,"984-2516 Felis Avenue","14-8965-8233"),("Abdul",9,33223431082,"906-1357 Sapien. Rd.","34-1431-1949"),("Wang",82,27067415304,"Ap #330-6435 Accumsan Avenue","14-4308-7328");
INSERT INTO cliente (nome,idade,cpf,endereco,telefone) VALUES ("Garrett",16,84325461494,"Ap #841-4388 Cum Road","69-5247-8981"),("Hamilton",64,55785969384,"278-4543 Amet Ave","45-5399-9384"),("Elaine",18,39937871168,"7857 Donec Avenue","76-1591-6755"),("Samuel",81,46703059319,"7166 Nunc Avenue","44-8919-1762"),("Hu",55,41211230368,"P.O. Box 284, 9439 Massa. St.","90-5069-5463"),("Dora",47,57618686594,"Ap #546-1190 Nec, St.","34-7539-1116"),("Debra",2,10850739325,"P.O. Box 512, 3734 Ante Road","32-9529-1404"),("Kathleen",57,44650556831,"5832 Fusce Avenue","60-3119-0170"),("Britanney",44,66193597335,"9128 Ultrices Rd.","81-1194-9060"),("Davis",91,98595528178,"P.O. Box 506, 6985 Sapien. Road","43-6009-4754");
INSERT INTO cliente (nome,idade,cpf,endereco,telefone) VALUES ("Brielle",35,29685079725,"Ap #599-3020 Dapibus Av.","44-6957-4041"),("Cyrus",49,91164859454,"Ap #937-9584 Ac St.","50-4954-7570"),("Xanthus",5,31664780480,"8882 Vel, Road","83-2590-1089"),("Wyoming",69,66889273296,"P.O. Box 365, 8909 Aliquam St.","41-4596-1580"),("Hashim",62,60367886293,"7908 Erat, Ave","23-6777-4704"),("Damon",54,45022583706,"758-1561 Tellus Road","70-7355-7848"),("Graham",5,70874316934,"307-709 Mus. Road","41-5372-4295"),("Kitra",44,24553705928,"368-7860 Vitae St.","11-6769-2941"),("Guy",36,76206434378,"P.O. Box 179, 5905 Placerat, Avenue","10-6305-9279"),("Armand",5,41692304085,"P.O. Box 722, 1314 Semper, St.","87-5344-1033");
INSERT INTO cliente (nome,idade,cpf,endereco,telefone) VALUES ("Yasir",22,82536028809,"P.O. Box 766, 4633 Ipsum. Rd.","62-6082-8724"),("Inga",85,55392636340,"P.O. Box 766, 7589 Etiam Av.","20-6145-4195"),("Deborah",31,81922331298,"862-7697 Ornare, Rd.","45-8398-6384"),("Herrod",36,12057650275,"428-6989 Iaculis Rd.","62-1364-8521"),("Mechelle",87,51226845760,"Ap #994-2939 Nulla Av.","10-4780-6060"),("Coby",42,69603271433,"493-3909 Convallis Rd.","80-1258-6780"),("Trevor",70,14483844870,"240-7899 Ligula Ave","29-4595-3322"),("Lee",80,92124995817,"P.O. Box 829, 5151 Ligula. Avenue","21-9873-3818"),("Uriel",48,94326850157,"P.O. Box 427, 4549 Luctus Road","24-4968-8932"),("Joel",10,18440764709,"4738 Fames Street","41-3095-3248");
INSERT INTO cliente (nome,idade,cpf,endereco,telefone) VALUES ("Channing",37,69226975445,"P.O. Box 285, 1869 Mi. Rd.","58-5899-0498"),("Hermione",63,58766760397,"Ap #415-354 Posuere St.","28-7584-1152"),("Remedios",10,82989150807,"5114 Posuere, Rd.","51-9098-1317"),("Louis",82,71082086670,"3975 Et Street","71-1660-0037"),("Cedric",77,54014390571,"Ap #269-1918 Et Street","92-6598-6275"),("Kay",99,89576664948,"175-918 Enim Ave","16-9869-4989"),("Gil",66,57696822108,"P.O. Box 785, 9707 Mus. St.","96-7913-2945"),("Callie",61,97969185728,"P.O. Box 858, 5379 Et Rd.","27-5056-3249"),("Alexander",77,10528781372,"Ap #337-7388 Scelerisque Avenue","95-6756-1282"),("Josephine",98,76639028508,"Ap #572-780 Lacus. Rd.","16-9729-9286");
INSERT INTO cliente (nome,idade,cpf,endereco,telefone) VALUES ("Regan",66,31988512463,"P.O. Box 627, 4082 Laoreet, St.","30-1430-4588"),("Shay",45,43951638876,"P.O. Box 125, 5714 Sagittis St.","59-2835-8325"),("September",4,65302080260,"Ap #622-837 Sed St.","93-6081-1729"),("Kiona",56,20071218213,"5013 Tortor. St.","83-7504-8775"),("Larissa",75,72841231892,"4449 Phasellus Rd.","93-6771-7605"),("Yuli",24,41881451033,"P.O. Box 921, 5084 Consectetuer Rd.","82-5624-9795"),("Timon",65,48193298713,"1438 Egestas Street","20-4634-0560"),("Eric",32,12739791180,"P.O. Box 619, 6394 Fusce St.","60-8027-5554"),("Dillon",53,28853539987,"P.O. Box 236, 7075 Auctor Street","99-9811-7417"),("Keith",68,33738388349,"9823 Purus St.","46-1895-9487");

insert into cliente(nome, idade, cpf, endereco, telefone) values ('joao', 15, '123.456.789-00', 'rua das flores', '9999-9999');

select * from cliente;

create table usuario(
	login varchar(16) primary key,
    senha varchar(16)
);

insert into usuario (login, senha) values ('Rifadin IV', 's8fZg5xvKbj');
insert into usuario (login, senha) values ('Visipaque', 'BSit58dxTdPm');
insert into usuario (login, senha) values ('Clobetasol', 'jmntAUYH');
insert into usuario (login, senha) values ('Proactiv', 'm1aKWoIARuF');
insert into usuario (login, senha) values ('Pravastatin', 'aa2Nx6hG');
insert into usuario (login, senha) values ('Sheer', '04YgVoHk');
insert into usuario (login, senha) values ('ADSOL', '2ENar7');
insert into usuario (login, senha) values ('SERTRALINE', 'SJhe4aX');
insert into usuario (login, senha) values ('Prednisolone', 'gIHqpEFWrZII');
insert into usuario (login, senha) values ('Solaraze', '1rTutGZkF');

select * from usuario;


drop table cliente;