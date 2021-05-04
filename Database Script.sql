create database dbpredmeti_18;

use dbpredmeti_18;

create table Korisnik(
    korisnikID int not null primary key auto_increment,
    ime nvarchar(40),
    lozinka nvarchar(60),
    uloga nvarchar(40)
);

create table Predmet(
	predmetID int not null primary key auto_increment,
	naziv nvarchar(40),
    odsjek nvarchar(40),
	nastavnik nvarchar(40),
	opis nvarchar(200),
	korisnikID int,
	constraint FK_Predmet_Korisnik foreign key(korisnikID) references Korisnik(korisnikID)
);

insert into Korisnik(ime,lozinka,uloga)  values ("Adnan","$2a$10$c3oEuimjjI8ZEo4N0kOrAeiolt.pp/eOjvaRef97dceh.FdBiyWj.","user");
insert into Korisnik(ime,lozinka,uloga)  values ("Djulaga","$2a$10$7ZylVzC0Wrfni0XeT1SLtuniV6LOElaatkGDaMoD4yP6Co2S8t05.","user");

select * from Korisnik;
select * from Predmet