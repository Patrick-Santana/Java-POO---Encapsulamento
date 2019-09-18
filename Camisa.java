/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camisa;
/**
 *
 * @author Patric
 */
public class Camisa {
    private int tamanho;
    private String cor;
    private float preco;
    private String marca;
    
    /**
     *
     * @return 
     */
    public int getTamanho(){
    return this.tamanho;
}
    
    /**
     *
     * @param tamanho
     */
    public void setTamanho(int tamanho){
        if(tamanho < 0){
            return;
        }
        this.tamanho = tamanho;
    }
    
    /**
     *
     * @return 
     */
    public String getCor(){
        return this.cor;
}
    
    /**
     *
     * @param cor
     */
    public void setCor(String cor){
        if(cor == null || cor.length() == 0){
            return;
        }
        this.cor = cor;
    }
    
    /**
     *
     * @return 
     */
    public float getPreco(){
        return this.preco;
    }
    
    public void setPreco(float preco){
        if(preco < 0){
            return;
        }
        this.preco = preco;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        if(marca == null || cor.length() == 0){
            return;           
        }
        this.marca = marca;
    }

    public static void main(String[] args) {
        
        Camisa c1 = new Camisa();
        c1.setTamanho(14);
        c1.setCor("Grafita");
        c1.setPreco(37897);
        c1.setMarca("Supreme");
        
        System.out.println("Tamanho de c1: " + c1.getTamanho());
        System.out.println("cor de c1: " + c1.getCor());
        System.out.println("cor de c1: " + c1.getPreco());
        System.out.println("cor de c1: " + c1.getMarca());
        // TODO code application logic here
    }
    
}
