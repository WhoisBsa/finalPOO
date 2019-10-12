
package exercicioarraylist;

import Classes.Comparador2000;
import Classes.Produto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioArrayList {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        
        produtos.add(new Produto("cueca", "sorba", 5.0));
        produtos.add(new Produto("meia", "DonMarcos", 2.0));
        produtos.add(new Produto("chinela", "avaiana", 35.0));
        produtos.add(new Produto("meia", "FuradaÉMaisBunita", 3.0));
        produtos.add(new Produto("brusa", "okidoqui", 50.0));
        produtos.add(new Produto("chinela", "bêraRio", 15.0));
        produtos.add(new Produto("brusa", "calvoKrai", 500.0));
        
        
        
        
        while(true){
            limpaTerminal();
            System.out.println("Selecione a opção: ");
            System.out.println("\t 1 - Visualizar ordem alfabética(nome);");
            System.out.println("\t 2 - Visualizar ordem crescente(preço);");
            System.out.println("\t 3 - Visualizar ordem decrescente(preço);");
            System.out.println("\t 4 - Buscar produto;");
            System.out.println("\t 5 - Excluir produto;");
            System.out.println("\t 6 - Editar produto;");
            System.out.println("\t 7 - SAIR;");
            
//            s.next();
            
            int op = 0;
//            op = Integer.parseInt(s.nextLine());
            op = s.nextInt();
            
            switch(op){
                case 1:
                    limpaTerminal();
                    Collections.sort(produtos, new Comparador2000(Comparador2000.POR_NOME));
                    exibirProdutos(produtos);
                    
                    break;
                case 2:
                    limpaTerminal();
                    Collections.sort(produtos, new Comparador2000(Comparador2000.POR_ASCE));
                    exibirProdutos(produtos);
                    break;
                case 3:
                    limpaTerminal();
                    Collections.sort(produtos, new Comparador2000(Comparador2000.POR_DESC));
                    exibirProdutos(produtos);
                    break;
                case 4:
                    limpaTerminal();
                    System.out.println("Nome ou marca do produto:");
                    String entrada = s.next();
                    buscaProduto(produtos, entrada);
                    break;
                case 5:
                    limpaTerminal();
                    excluirProduto(produtos);
                    break;
                case 6:
                    limpaTerminal();
                    editarProduto(produtos);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Opção inválida");
            }
            System.out.println("");
            System.in.read();
            
        }
        
        
    }
    
    public static int buscaProduto(ArrayList<Produto> produtos, String entrada){
        int qtd = 0;
        int posicao = 0;
        
        for(Produto u : produtos){
            
            if(u.getNome().equalsIgnoreCase(entrada) || u.getMarca().equalsIgnoreCase(entrada)){
                if(qtd == 0){
                    System.out.println("PRODUTOS ENCONTRADOS:");
                }
                
                qtd += 1;
                
                System.out.println(
                        "\n"
                        + "Item " + (posicao) + ":"
                        + "\n\tNome: " + u.getNome() 
                        + "\n\tMarca:" + u.getMarca() 
                        + "\n\tPreço: " + u.getValor()
                );
            }
            
            posicao += 1;
        }
        
        if(qtd == 0){
            System.out.println("Não foi encontrado nenhum produto com nome ou marca informada!");
            return 0;
        }
        
        return 1;
    }
    
    public static void excluirProduto(ArrayList<Produto> produtos){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Procurar item: ");
        
        String pesquisa = scanner.nextLine().toString();
        
        int a = buscaProduto(produtos, pesquisa);
        
        if(a == 1){
            System.out.println("Qual será o item a excluir?");
        
            int item = scanner.nextInt();

            if(item > produtos.size())
                System.out.println("Número do item incorreto");
            else{
                if(produtos.get(item).getNome().equalsIgnoreCase(pesquisa) || produtos.get(item).getMarca().equalsIgnoreCase(pesquisa)){
                    produtos.remove(item);
                    System.out.println("Excluido com sucesso!");
                }
                else{
                    System.out.println("Número do item incorreto!");
                }
            }
        }
        
        
    }
    
    public static void editarProduto(ArrayList<Produto> produtos){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Procurar item: ");
        
        String pesquisa = scanner.nextLine().toString();
        
        int a = buscaProduto(produtos, pesquisa);
        
        if(a == 1){
            System.out.println("Qual será o item a editar?");
        
            int item = scanner.nextInt();

            if(item > produtos.size())
                System.out.println("Número do item incorreto!");
            else{
                if(produtos.get(item).getNome().equalsIgnoreCase(pesquisa) || produtos.get(item).getMarca().equalsIgnoreCase(pesquisa)){
                    System.out.print("Novo nome: ");
                    String nome = scanner.next().toString();
                    System.out.print("Nova marca: ");
                    String marca = scanner.next().toString();
                    System.out.print("Novo valor: ");
                    double valor = scanner.nextDouble();


                    produtos.get(item).setNome(nome);
                    produtos.get(item).setMarca(marca);
                    produtos.get(item).setValor(valor);

                    System.out.println("Editado com sucesso!");
                }
                else{
                    System.out.println("Número do item incorreto!");
                }
            }
        }
        
        
        
    }
    
   public static void exibirProdutos(ArrayList<Produto> produtos){
       for(Produto u : produtos){
           System.out.println(
                        "\n"
                        + "\nNome: " + u.getNome() 
                        + "\nMarca:" + u.getMarca() 
                        + "\nPreço: " + u.getValor()
                );
       }
   }
   
   public static void limpaTerminal(){
       for (int i = 0; i < 100; i++) {
           System.out.println("");
       }
   }
}
