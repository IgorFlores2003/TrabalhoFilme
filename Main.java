package Main;


import java.util.Scanner;
import java.util.Random;
import i.o.Cadastro;
import i.o.Cadastro2;
import java.util.ArrayList;

public class Main {
    public static void main(String[]args) {
        Scanner x=new Scanner(System.in);

        int Close=0;
        int Choose;
        Cadastro2 movie=new Cadastro2();
        Cadastro player=new Cadastro();
        Random random=new Random();
        int c=0;
        ArrayList Filme1=new ArrayList();
        ArrayList Site1=new ArrayList();

        ArrayList titulo=new ArrayList();
        ArrayList Tipo=new ArrayList();
        ArrayList Faixa=new ArrayList();
        ArrayList Elen=new ArrayList();
        ArrayList Desc=new ArrayList();
        ArrayList Ge=new ArrayList();
        ArrayList Di=new ArrayList();
        ArrayList Plat=new ArrayList();
        String title,type,Elenco,Descricao,Genero,Diretor,Plataforma;
        int age;
        do {
            MENU();
            Choose=Leitor(x);

            if(Choose==1) {

                Player(player,Filme1,Site1,x);
            }
            else if(Choose==2) {
                System.out.println("Nome do Filme OU Série:");
                title=x.nextLine();
                movie.SetTitulo(title);
                titulo.add(movie.GetTitulo());

                System.out.println("Filme ou série:");
                type=x.nextLine();
                movie.SetTipo(type);
                Tipo.add(movie.GetTipo());

                System.out.println("Faixa etária:");
                age=Leitor(x);
                movie.SetIdade(age);
                Faixa.add(movie.GetIdade());

                System.out.println("Elenco:");
                Elenco=x.nextLine();
                movie.SetElenco(Elenco);
                Elen.add(movie.GetElenco());

                System.out.println("Descrição:");
                Descricao=x.nextLine();
                movie.SetDescricao(Descricao);
                Desc.add(movie.GetDescricao());

                System.out.println("Gênero:");
                Genero=x.nextLine();
                movie.SetGenero(Genero);
                Ge.add(movie.GetGenero());

                System.out.println("Diretor:");
                Diretor=x.nextLine();
                movie.SetDiretor(Diretor);
                Di.add(movie.GetDiretor());

                System.out.println("Streaming:");
                Plataforma =x.nextLine();
                movie.SetPlataforma(Plataforma);
                Plat.add(movie.GetPlataforma());

            }
            else if(Choose==3) {
                busca(Tipo,titulo,Faixa,Elen,Desc,Ge,Di,Plat,x);
            }
            else if(Choose==4) {

Random(random,Tipo,titulo,Faixa,Elen,Desc,Ge,Di,Plat,x);
            }
            else if(Choose==5) {
                Close++;
            }
        }while(Close==0);
        x.close();
    }

    public static void MENU() {
        System.out.println("--------------MENU--------------");
        System.out.println("1-Cadastro de Player");
        System.out.println("2-Cadastro de Título");
        System.out.println("3-Buscar Título");
        System.out.println("4-Recomendações de Títulos");
        System.out.println("5-Sair");
    }

    public static int Leitor(Scanner x){
        int aux;
        aux=x.nextInt();
        x.nextLine();
        return aux;
    }
    public static void Player(Cadastro player, ArrayList Filme1,ArrayList Site1 ,Scanner x) {
        System.out.println("Nome do Filme/Série:");
        player.SetNome(x.nextLine());
        Filme1.add(player);
        System.out.println("Site Que o Filme se Encontra:");
        player.setSite(x.nextLine());
        Site1.add(player);

    }
    public static void busca(ArrayList Tipo,ArrayList Titulo,ArrayList Faixa,ArrayList Elen,ArrayList Desc,ArrayList Ge,ArrayList Di,ArrayList Plat,Scanner x){
        int choose;
        System.out.println("Escolha um dos Filtro abaixo");

        System.out.println("1-Filmes ou séries");
        System.out.println("2-Título");
        System.out.println("3-Elenco");
        System.out.println("4-Descrição");
        System.out.println("5-Gênero");
        System.out.println("6-Site");
        System.out.println("7-Diretor");
        choose=Leitor(x);
        if(choose==1) {
            String Ler;
            System.out.println("\nEstá procurando uma Série ou um Filme:");
            Ler=x.nextLine();
            for(int i=0; i<Tipo.size();i++) {
                if(Ler.equals(Tipo.get(i))) {
                    System.out.println("---------------Resultado da sua Pesquisa---------------");
                    System.out.println(Tipo.get(i));
                    System.out.println("TÍTULO:"+Titulo.get(i)+"\n");
                    System.out.println("Classificação Indicativa:"+Faixa.get(i)+"\n");
                    System.out.println("Elenco:"+Elen.get(i)+"\n");
                    System.out.println("Descrição:"+Desc.get(i)+"\n");
                    System.out.println("Gênero:"+Ge.get(i)+"\n");
                    System.out.println("Diretor:"+Di.get(i)+"\n");
                    System.out.println("Streaming:"+Plat.get(i)+"\n");
                    System.out.println("-------------------------------------------------------");

                }
            } }else if(choose==2) {
            String Ler2;
            System.out.println("\nTítulo que está procurando:");
            Ler2=x.nextLine();
            for(int i=0; i<Titulo.size();i++) {
                if(Ler2.equals(Titulo.get(i))) {
                    System.out.println("---------------Resultado da sua Pesquisa---------------");
                    System.out.println(Tipo.get(i));
                    System.out.println("TÍTULO:"+Titulo.get(i)+"\n");
                    System.out.println("Classificação Indicativa:"+Faixa.get(i)+"\n");
                    System.out.println("Elenco:"+Elen.get(i)+"\n");
                    System.out.println("Descrição:"+Desc.get(i)+"\n");
                    System.out.println("Gênero:"+Ge.get(i)+"\n");
                    System.out.println("Diretor:"+Di.get(i)+"\n");
                    System.out.println("Streaming:"+Plat.get(i)+"\n");
                    System.out.println("-------------------------------------------------------");

                }}} else if(choose==3) {
            String Ler3;
            System.out.println("\nElenco que está procurando:");
            Ler3=x.nextLine();
            for(int i=0; i<Elen.size();i++) {
                if(Ler3.equals(Elen.get(i))) {
                    System.out.println("---------------Resultado da sua Pesquisa---------------");
                    System.out.println(Tipo.get(i));
                    System.out.println("TÍTULO:"+Titulo.get(i)+"\n");
                    System.out.println("Classificação Indicativa:"+Faixa.get(i)+"\n");
                    System.out.println("Elenco:"+Elen.get(i)+"\n");
                    System.out.println("Descrição:"+Desc.get(i)+"\n");
                    System.out.println("Gênero:"+Ge.get(i)+"\n");
                    System.out.println("Diretor:"+Di.get(i)+"\n");
                    System.out.println("Streaming:"+Plat.get(i)+"\n");
                    System.out.println("-------------------------------------------------------");

                }
            }}else if(choose==4) {
            String Ler4;
            System.out.println("\nDescrição que está procurando:");
            Ler4=x.nextLine();
            for(int i=0; i<Desc.size();i++) {
                if(Ler4.equals(Desc.get(i))) {
                    System.out.println("---------------Resultado da sua Pesquisa---------------");
                    System.out.println(Tipo.get(i));
                    System.out.println("TÍTULO:"+Titulo.get(i)+"\n");
                    System.out.println("Classificação Indicativa:"+Faixa.get(i)+"\n");
                    System.out.println("Elenco:"+Elen.get(i)+"\n");
                    System.out.println("Descrição:"+Desc.get(i)+"\n");
                    System.out.println("Gênero:"+Ge.get(i)+"\n");
                    System.out.println("Diretor:"+Di.get(i)+"\n");
                    System.out.println("Streaming:"+Plat.get(i)+"\n");
                    System.out.println("-------------------------------------------------------");

                }
            }}else if(choose==5) {
            String Ler5;
            System.out.println("\nGênero que está procurando:");
            Ler5=x.nextLine();
            for(int i=0; i<Ge.size();i++) {
                if(Ler5.equals(Ge.get(i))) {
                    System.out.println("---------------Resultado da sua Pesquisa---------------");
                    System.out.println(Tipo.get(i));
                    System.out.println("TÍTULO:"+Titulo.get(i)+"\n");
                    System.out.println("Classificação Indicativa:"+Faixa.get(i)+"\n");
                    System.out.println("Elenco:"+Elen.get(i)+"\n");
                    System.out.println("Descrição:"+Desc.get(i)+"\n");
                    System.out.println("Gênero:"+Ge.get(i)+"\n");
                    System.out.println("Diretor:"+Di.get(i)+"\n");
                    System.out.println("Streaming:"+Plat.get(i)+"\n");
                    System.out.println("-------------------------------------------------------");

                }

            }
            }else if(choose==6) {
            String Ler7;
            System.out.println("\nStreaming que está procurando:");
            Ler7=x.nextLine();
            for(int i=0; i<Plat.size();i++) {
                if(Ler7.equals(Plat.get(i))) {
                    System.out.println("---------------Resultado da sua Pesquisa---------------");
                    System.out.println(Tipo.get(i));
                    System.out.println("TÍTULO:"+Titulo.get(i)+"\n");
                    System.out.println("Classificação Indicativa:"+Faixa.get(i)+"\n");
                    System.out.println("Elenco:"+Elen.get(i)+"\n");
                    System.out.println("Descrição:"+Desc.get(i)+"\n");
                    System.out.println("Gênero:"+Ge.get(i)+"\n");
                    System.out.println("Diretor:"+Di.get(i)+"\n");
                    System.out.println("Streaming:"+Plat.get(i)+"\n");
                    System.out.println("-------------------------------------------------------");

                }

            }}else if(choose==7) {
            String Ler8;
            System.out.println("\nDiretor que está procurando:");
            Ler8=x.nextLine();
            for(int i=0; i<Di.size();i++) {
                if(Ler8.equals(Di.get(i))) {
                    System.out.println("---------------Resultado da sua Pesquisa---------------");
                    System.out.println(Tipo.get(i));
                    System.out.println("TÍTULO:" + Titulo.get(i) + "\n");
                    System.out.println("Classificação Indicativa:" + Faixa.get(i) + "\n");
                    System.out.println("Elenco:" + Elen.get(i) + "\n");
                    System.out.println("Descrição:" + Desc.get(i) + "\n");
                    System.out.println("Gênero:" + Ge.get(i) + "\n");
                    System.out.println("Diretor:" + Di.get(i) + "\n");
                    System.out.println("Streaming:" + Plat.get(i) + "\n");
                    System.out.println("-------------------------------------------------------");

                }}}
    }
public static void Random(Random random,ArrayList Tipo,ArrayList Titulo,ArrayList Faixa,ArrayList Elen,ArrayList Desc,ArrayList Ge,ArrayList Di,ArrayList Plat, Scanner x) {
    int aux3=Ge.size();
    if(Tipo.size()!=0){
    int a = random.nextInt(0,aux3);
    String read;

    System.out.println("1-Título Aleatório");
    System.out.println("2-Título Aleatório por Gênero");
    int aux=Leitor(x);
    if (aux == 1) {
        System.out.println("---------------Resultado da sua Pesquisa---------------");
        System.out.println(Tipo.get(a));
        System.out.println("TÍTULO:" + Titulo.get(a) + "\n");
        System.out.println("Classificação Indicativa:" + Faixa.get(a) + "\n");
        System.out.println("Elenco:" + Elen.get(a) + "\n");
        System.out.println("Descrição:" + Desc.get(a) + "\n");
        System.out.println("Gênero:" + Ge.get(a) + "\n");
        System.out.println("Diretor:" + Di.get(a) + "\n");
        System.out.println("Streaming:" + Plat.get(a) + "\n");
        System.out.println("-------------------------------------------------------");
    }else if (aux == 2) {
        System.out.println("Qual gêrero você deseja:");
        String aux2=x.nextLine();

        if(aux2.equals(Ge.get(a))) {
            System.out.println("---------------Resultado da sua Pesquisa---------------");
            System.out.println(Tipo.get(a));
            System.out.println("TÍTULO:"+Titulo.get(a)+"\n");
            System.out.println("Classificação Indicativa:"+Faixa.get(a)+"\n");
            System.out.println("Elenco:"+Elen.get(a)+"\n");
            System.out.println("Descrição:"+Desc.get(a)+"\n");
            System.out.println("Gênero:"+Ge.get(a)+"\n");
            System.out.println("Diretor:"+Di.get(a)+"\n");
            System.out.println("Streaming:"+Plat.get(a)+"\n");
            System.out.println("-------------------------------------------------------");

    }

        }}
    else{
    System.out.println("Não Possui Filmes Cadastrados");}
}

    public static int leitor (Scanner x){
        int aux = x.nextInt();
        x.nextLine();
        return aux;
    }}
