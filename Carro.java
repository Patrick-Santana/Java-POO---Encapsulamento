/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author AlunoIFPE
 */
public class Carro {
    private String marca;
    private String chassi;
    private String motor;
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        if(marca == null  ||  marca.length() == 0) {
            return;
        }
        this.marca = marca;
    }
    
    public String getChassi(){
        return this.chassi;
    } 
    
    public void setChassi(String chassi){
        if(chassi == null || chassi.length() == 0){
            return; 
        }
        this.chassi = chassi;
    }
    
    public String getMotor(){
        return this.motor;
    } 
    
    public void setMotor(String motor){ //atributo com letra minuscula, if null
        if (motor == null || motor.length() == 0){
            return; 
        }
        this.motor = motor;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        
        c1.setChassi("marcopolo");
        c1.setMarca("Mercedes");
        c1.setMotor("Renault");
        
        System.out.println("chassi de c1: " + c1.getChassi());
        System.out.println("marca de c1: " + c1.getMarca());
        System.out.println("motor de c1: " + c1.getMotor());

    }
}
