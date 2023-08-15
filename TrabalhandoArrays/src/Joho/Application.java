
package Joho;

import java.util.List;
import java.util.ArrayList;
import Joho.views.StoreFrame;

public class Application {

    private Integer ID_CONTROL = 0;
    private List<Account> accountList;
    private final ArrayList<Product> products = new ArrayList<>();

    public void init() {
        this.accountList = new ArrayList<>();
        this.accountList.add(new Account("001", "test", "100"));

        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Allstate", 49.18, "Brinco Pingo de Luz Zircônia Grande F", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "AMARO", 99.90, "Brinco AMARO Essential Argola Tripla Dourado", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Anjo da mamãe", 34.99, "Brincos Placa Preto Dourado Sobrepor Del", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Tommy Hilfiger", 799.99, "Relógio Tommy Hilfiger Feminino Aço", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Tommy Hilfiger", 599.99, "Corrente Feminina Tommy Hilfiger M", "corrente"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Santa Lolla", 79.99, "Cinto Santa Lolla Texturizado Vinho", "bracelete"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Lança Perfume", 299.99, "Cinto Lança Perfume Monograma Preto", "cinto"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Lauren by Ralph Lauren", 459.99, "Cinto Lauren by Ralph Lauren Croco ", "cinto"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Ray-Ban", 699.99, "Óculos de Sol Ray-Ban Mega Clubmaster Preto", "oculos"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Colcci", 219.99, "Óculos de Sol Colcci Karen Preto", "oculos"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Nike", 189.99, "Bolsa Nike One Club Preta", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Griffazzi", 329.99, "Mochila de Couro Griffazzi Nude", "machila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Cavalera", 259.99, "Mochila Cavalera Original Urban Resistente", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "adidas Performance", 139.99, "Mochila Estampada Essentials Seaso", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "New Era", 64.99, "Boné Aberto New Era Aba Curva 920 ", "bone"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Olympikus", 119.99, "Mochila Olympikus Puff Preta", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Pingente", 6200.99, "Pingente Com Quartzo Fumê E Diamantes Em Ouro Amarelo 18k", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Anel Quartzo", 5200.99, "Anel Com Quartzo Fumê E Diamantes Em Ouro Amarelo 18k", "anel"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "BluenPi", 15.99, "Anel Em Ouro Rosé Com Iolita", "anel"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 699.99, "Relógio Monte Carlo Feminino Em Aço Rosé E Couro Marrom", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 1359.99, "Relógio Monte Carlo Masculino Automático Em Aço Prateado", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Wenger", 3729.99, "Relógio Wenger Seaforce Cronógrafo Masculino Em Aço Bicolor", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Michael", 2099.99, "RELÓGIO MICHAEL KORS FEMININO EM COURO MARROM", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 5850.99, "Colar Em Ouro Amarelo Com Ametista, Citrino, Topázio Incolor, Turmalina Rosa", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 899.99, "Colar Escapulário N Senhora Carmo/Sagrado Coração Jesus Em Prata 925", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Allstate", 49.18, "Brinco Pingo de Luz Zircônia Grande F", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "AMARO", 99.90, "Brinco AMARO Essential Argola Tripla Dourado", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Anjo da mamãe", 34.99, "Brincos Placa Preto Dourado Sobrepor Del", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Tommy Hilfiger", 799.99, "Relógio Tommy Hilfiger Feminino Aço", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Tommy Hilfiger", 599.99, "Corrente Feminina Tommy Hilfiger M", "corrente"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Santa Lolla", 79.99, "Cinto Santa Lolla Texturizado Vinho", "bracelete"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Lança Perfume", 299.99, "Cinto Lança Perfume Monograma Preto", "cinto"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Lauren by Ralph Lauren", 459.99, "Cinto Lauren by Ralph Lauren Croco ", "cinto"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Ray-Ban", 699.99, "Óculos de Sol Ray-Ban Mega Clubmaster Preto", "oculos"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Colcci", 219.99, "Óculos de Sol Colcci Karen Preto", "oculos"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Nike", 189.99, "Bolsa Nike One Club Preta", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Griffazzi", 329.99, "Mochila de Couro Griffazzi Nude", "machila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Cavalera", 259.99, "Mochila Cavalera Original Urban Resistente", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "adidas Performance", 139.99, "Mochila Estampada Essentials Seaso", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "New Era", 64.99, "Boné Aberto New Era Aba Curva 920 ", "bone"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Olympikus", 119.99, "Mochila Olympikus Puff Preta", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Pingente", 6200.99, "Pingente Com Quartzo Fumê E Diamantes Em Ouro Amarelo 18k", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Anel Quartzo", 5200.99, "Anel Com Quartzo Fumê E Diamantes Em Ouro Amarelo 18k", "anel"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "BluenPi", 15.99, "Anel Em Ouro Rosé Com Iolita", "anel"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 699.99, "Relógio Monte Carlo Feminino Em Aço Rosé E Couro Marrom", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 1359.99, "Relógio Monte Carlo Masculino Automático Em Aço Prateado", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Wenger", 3729.99, "Relógio Wenger Seaforce Cronógrafo Masculino Em Aço Bicolor", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Michael", 2099.99, "RELÓGIO MICHAEL KORS FEMININO EM COURO MARROM", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 5850.99, "Colar Em Ouro Amarelo Com Ametista, Citrino, Topázio Incolor, Turmalina Rosa", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 899.99, "Colar Escapulário N Senhora Carmo/Sagrado Coração Jesus Em Prata 925", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Allstate", 49.18, "Brinco Pingo de Luz Zircônia Grande F", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "AMARO", 99.90, "Brinco AMARO Essential Argola Tripla Dourado", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Anjo da mamãe", 34.99, "Brincos Placa Preto Dourado Sobrepor Del", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Tommy Hilfiger", 799.99, "Relógio Tommy Hilfiger Feminino Aço", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Tommy Hilfiger", 599.99, "Corrente Feminina Tommy Hilfiger M", "corrente"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Santa Lolla", 79.99, "Cinto Santa Lolla Texturizado Vinho", "bracelete"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Lança Perfume", 299.99, "Cinto Lança Perfume Monograma Preto", "cinto"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Lauren by Ralph Lauren", 459.99, "Cinto Lauren by Ralph Lauren Croco ", "cinto"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Ray-Ban", 699.99, "Óculos de Sol Ray-Ban Mega Clubmaster Preto", "oculos"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Colcci", 219.99, "Óculos de Sol Colcci Karen Preto", "oculos"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Nike", 189.99, "Bolsa Nike One Club Preta", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Griffazzi", 329.99, "Mochila de Couro Griffazzi Nude", "machila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Cavalera", 259.99, "Mochila Cavalera Original Urban Resistente", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "adidas Performance", 139.99, "Mochila Estampada Essentials Seaso", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "New Era", 64.99, "Boné Aberto New Era Aba Curva 920 ", "bone"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Olympikus", 119.99, "Mochila Olympikus Puff Preta", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Pingente", 6200.99, "Pingente Com Quartzo Fumê E Diamantes Em Ouro Amarelo 18k", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Anel Quartzo", 5200.99, "Anel Com Quartzo Fumê E Diamantes Em Ouro Amarelo 18k", "anel"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "BluenPi", 15.99, "Anel Em Ouro Rosé Com Iolita", "anel"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 699.99, "Relógio Monte Carlo Feminino Em Aço Rosé E Couro Marrom", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 1359.99, "Relógio Monte Carlo Masculino Automático Em Aço Prateado", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Wenger", 3729.99, "Relógio Wenger Seaforce Cronógrafo Masculino Em Aço Bicolor", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Michael", 2099.99, "RELÓGIO MICHAEL KORS FEMININO EM COURO MARROM", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 5850.99, "Colar Em Ouro Amarelo Com Ametista, Citrino, Topázio Incolor, Turmalina Rosa", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 899.99, "Colar Escapulário N Senhora Carmo/Sagrado Coração Jesus Em Prata 925", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Allstate", 49.18, "Brinco Pingo de Luz Zircônia Grande F", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "AMARO", 99.90, "Brinco AMARO Essential Argola Tripla Dourado", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Anjo da mamãe", 34.99, "Brincos Placa Preto Dourado Sobrepor Del", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Tommy Hilfiger", 799.99, "Relógio Tommy Hilfiger Feminino Aço", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Tommy Hilfiger", 599.99, "Corrente Feminina Tommy Hilfiger M", "corrente"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Santa Lolla", 79.99, "Cinto Santa Lolla Texturizado Vinho", "bracelete"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Lança Perfume", 299.99, "Cinto Lança Perfume Monograma Preto", "cinto"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Lauren by Ralph Lauren", 459.99, "Cinto Lauren by Ralph Lauren Croco ", "cinto"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Ray-Ban", 699.99, "Óculos de Sol Ray-Ban Mega Clubmaster Preto", "oculos"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Colcci", 219.99, "Óculos de Sol Colcci Karen Preto", "oculos"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Nike", 189.99, "Bolsa Nike One Club Preta", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Griffazzi", 329.99, "Mochila de Couro Griffazzi Nude", "machila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Cavalera", 259.99, "Mochila Cavalera Original Urban Resistente", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "adidas Performance", 139.99, "Mochila Estampada Essentials Seaso", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "New Era", 64.99, "Boné Aberto New Era Aba Curva 920 ", "bone"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Olympikus", 119.99, "Mochila Olympikus Puff Preta", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Pingente", 6200.99, "Pingente Com Quartzo Fumê E Diamantes Em Ouro Amarelo 18k", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Anel Quartzo", 5200.99, "Anel Com Quartzo Fumê E Diamantes Em Ouro Amarelo 18k", "anel"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "BluenPi", 15.99, "Anel Em Ouro Rosé Com Iolita", "anel"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 699.99, "Relógio Monte Carlo Feminino Em Aço Rosé E Couro Marrom", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 1359.99, "Relógio Monte Carlo Masculino Automático Em Aço Prateado", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Wenger", 3729.99, "Relógio Wenger Seaforce Cronógrafo Masculino Em Aço Bicolor", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Michael", 2099.99, "RELÓGIO MICHAEL KORS FEMININO EM COURO MARROM", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 5850.99, "Colar Em Ouro Amarelo Com Ametista, Citrino, Topázio Incolor, Turmalina Rosa", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 899.99, "Colar Escapulário N Senhora Carmo/Sagrado Coração Jesus Em Prata 925", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Allstate", 49.18, "Brinco Pingo de Luz Zircônia Grande F", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "AMARO", 99.90, "Brinco AMARO Essential Argola Tripla Dourado", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Anjo da mamãe", 34.99, "Brincos Placa Preto Dourado Sobrepor Del", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Tommy Hilfiger", 799.99, "Relógio Tommy Hilfiger Feminino Aço", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Tommy Hilfiger", 599.99, "Corrente Feminina Tommy Hilfiger M", "corrente"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Santa Lolla", 79.99, "Cinto Santa Lolla Texturizado Vinho", "bracelete"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Lança Perfume", 299.99, "Cinto Lança Perfume Monograma Preto", "cinto"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Lauren by Ralph Lauren", 459.99, "Cinto Lauren by Ralph Lauren Croco ", "cinto"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Ray-Ban", 699.99, "Óculos de Sol Ray-Ban Mega Clubmaster Preto", "oculos"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Colcci", 219.99, "Óculos de Sol Colcci Karen Preto", "oculos"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Nike", 189.99, "Bolsa Nike One Club Preta", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Griffazzi", 329.99, "Mochila de Couro Griffazzi Nude", "machila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Cavalera", 259.99, "Mochila Cavalera Original Urban Resistente", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "adidas Performance", 139.99, "Mochila Estampada Essentials Seaso", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "New Era", 64.99, "Boné Aberto New Era Aba Curva 920 ", "bone"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Olympikus", 119.99, "Mochila Olympikus Puff Preta", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Pingente", 6200.99, "Pingente Com Quartzo Fumê E Diamantes Em Ouro Amarelo 18k", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Anel Quartzo", 5200.99, "Anel Com Quartzo Fumê E Diamantes Em Ouro Amarelo 18k", "anel"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "BluenPi", 15.99, "Anel Em Ouro Rosé Com Iolita", "anel"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 699.99, "Relógio Monte Carlo Feminino Em Aço Rosé E Couro Marrom", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 1359.99, "Relógio Monte Carlo Masculino Automático Em Aço Prateado", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Wenger", 3729.99, "Relógio Wenger Seaforce Cronógrafo Masculino Em Aço Bicolor", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Michael", 2099.99, "RELÓGIO MICHAEL KORS FEMININO EM COURO MARROM", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 5850.99, "Colar Em Ouro Amarelo Com Ametista, Citrino, Topázio Incolor, Turmalina Rosa", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 899.99, "Colar Escapulário N Senhora Carmo/Sagrado Coração Jesus Em Prata 925", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Allstate", 49.18, "Brinco Pingo de Luz Zircônia Grande F", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "AMARO", 99.90, "Brinco AMARO Essential Argola Tripla Dourado", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Anjo da mamãe", 34.99, "Brincos Placa Preto Dourado Sobrepor Del", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Tommy Hilfiger", 799.99, "Relógio Tommy Hilfiger Feminino Aço", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Tommy Hilfiger", 599.99, "Corrente Feminina Tommy Hilfiger M", "corrente"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Santa Lolla", 79.99, "Cinto Santa Lolla Texturizado Vinho", "bracelete"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Lança Perfume", 299.99, "Cinto Lança Perfume Monograma Preto", "cinto"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Lauren by Ralph Lauren", 459.99, "Cinto Lauren by Ralph Lauren Croco ", "cinto"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Ray-Ban", 699.99, "Óculos de Sol Ray-Ban Mega Clubmaster Preto", "oculos"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Colcci", 219.99, "Óculos de Sol Colcci Karen Preto", "oculos"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Nike", 189.99, "Bolsa Nike One Club Preta", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Griffazzi", 329.99, "Mochila de Couro Griffazzi Nude", "machila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Cavalera", 259.99, "Mochila Cavalera Original Urban Resistente", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "adidas Performance", 139.99, "Mochila Estampada Essentials Seaso", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "New Era", 64.99, "Boné Aberto New Era Aba Curva 920 ", "bone"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Olympikus", 119.99, "Mochila Olympikus Puff Preta", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Pingente", 6200.99, "Pingente Com Quartzo Fumê E Diamantes Em Ouro Amarelo 18k", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Anel Quartzo", 5200.99, "Anel Com Quartzo Fumê E Diamantes Em Ouro Amarelo 18k", "anel"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "BluenPi", 15.99, "Anel Em Ouro Rosé Com Iolita", "anel"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 699.99, "Relógio Monte Carlo Feminino Em Aço Rosé E Couro Marrom", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 1359.99, "Relógio Monte Carlo Masculino Automático Em Aço Prateado", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Wenger", 3729.99, "Relógio Wenger Seaforce Cronógrafo Masculino Em Aço Bicolor", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Michael", 2099.99, "RELÓGIO MICHAEL KORS FEMININO EM COURO MARROM", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 5850.99, "Colar Em Ouro Amarelo Com Ametista, Citrino, Topázio Incolor, Turmalina Rosa", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 899.99, "Colar Escapulário N Senhora Carmo/Sagrado Coração Jesus Em Prata 925", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Allstate", 49.18, "Brinco Pingo de Luz Zircônia Grande F", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "AMARO", 99.90, "Brinco AMARO Essential Argola Tripla Dourado", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Anjo da mamãe", 34.99, "Brincos Placa Preto Dourado Sobrepor Del", "brinco"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Tommy Hilfiger", 799.99, "Relógio Tommy Hilfiger Feminino Aço", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Tommy Hilfiger", 599.99, "Corrente Feminina Tommy Hilfiger M", "corrente"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Santa Lolla", 79.99, "Cinto Santa Lolla Texturizado Vinho", "bracelete"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Lança Perfume", 299.99, "Cinto Lança Perfume Monograma Preto", "cinto"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Lauren by Ralph Lauren", 459.99, "Cinto Lauren by Ralph Lauren Croco ", "cinto"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Ray-Ban", 699.99, "Óculos de Sol Ray-Ban Mega Clubmaster Preto", "oculos"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Colcci", 219.99, "Óculos de Sol Colcci Karen Preto", "oculos"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Nike", 189.99, "Bolsa Nike One Club Preta", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Griffazzi", 329.99, "Mochila de Couro Griffazzi Nude", "machila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Cavalera", 259.99, "Mochila Cavalera Original Urban Resistente", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "adidas Performance", 139.99, "Mochila Estampada Essentials Seaso", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "New Era", 64.99, "Boné Aberto New Era Aba Curva 920 ", "bone"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Olympikus", 119.99, "Mochila Olympikus Puff Preta", "mochila"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Pingente", 6200.99, "Pingente Com Quartzo Fumê E Diamantes Em Ouro Amarelo 18k", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Anel Quartzo", 5200.99, "Anel Com Quartzo Fumê E Diamantes Em Ouro Amarelo 18k", "anel"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "BluenPi", 15.99, "Anel Em Ouro Rosé Com Iolita", "anel"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 699.99, "Relógio Monte Carlo Feminino Em Aço Rosé E Couro Marrom", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 1359.99, "Relógio Monte Carlo Masculino Automático Em Aço Prateado", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Wenger", 3729.99, "Relógio Wenger Seaforce Cronógrafo Masculino Em Aço Bicolor", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Michael", 2099.99, "RELÓGIO MICHAEL KORS FEMININO EM COURO MARROM", "relogio"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 5850.99, "Colar Em Ouro Amarelo Com Ametista, Citrino, Topázio Incolor, Turmalina Rosa", "colar"));
        this.products.add(new Product(String.valueOf(++this.ID_CONTROL), "Monte Carlo", 899.99, "Colar Escapulário N Senhora Carmo/Sagrado Coração Jesus Em Prata 925", "colar"));

    }

    public Account findUser(String ownerName, String numberAccount) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getOwnerAccount().equals(ownerName)
                    && accountList.get(i).getNumberAccount().equals(numberAccount)) {
                return accountList.get(i);
            }
        }
        return null;
    }

    public void store(Account currentUser) {
        SessionAuth session = new SessionAuth(currentUser);

        StoreFrame store = new StoreFrame(session, products);
        store.setVisible(true);
    }

    public void createAccount(String name, String password) {
        this.accountList.add(new Account("00" + ID_CONTROL++, name, ID_CONTROL + "f" + ID_CONTROL * 3 + "ac"));
    }
}