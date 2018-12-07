
package com.fieb.senai.app;

import com.fieb.senai.entidades.Endereco;
import com.fieb.senai.entidades.Pessoa;


public class Colegio {

   
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", 568989,25);
        Endereco end1 = new Endereco("Rua A", "25", "Aguas Claras");
        
        p1.setEndereco(end1);
        
        Pessoa p2 = new Pessoa("Maria", 568980,20);
        Endereco end2 = new Endereco("Rua B", "5", "Paripe");
        
        p2.setEndereco(end2);
    }
    
}
