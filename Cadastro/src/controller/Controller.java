/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.LinkedList;
import model.Administrador;
import model.Carro;
import model.Piloto;
import model.Usuario;
import util.LerArquivo;

/**
 *
 * @author victo
 */
public class Controller {
    String[] config;
    LinkedList<Piloto> pilotos = new LinkedList<>();
    LinkedList<Carro> carros = new LinkedList<>();
    LinkedList<Usuario> usuarios = new LinkedList<>();
    LinkedList<Administrador> administradores = new LinkedList<>(); 
    private boolean conexao = true;
    
    
     //Ler configurações de conexão com o servidor (ip e porta)
    private void lerConfig() throws IOException{
        LerArquivo read = new LerArquivo();
        config = read.lerArquivo();
    }
    
    public void adicionarPiloto(String nome,String equipe, int idade){
        Piloto piloto = new Piloto(nome,equipe,idade);
        pilotos.add(piloto);
    }
    
    public void adicionarCarro(int numero, String cor, String equipe){
        Carro carro = new Carro(numero,cor,equipe);
        carros.add(carro);
    }
    
    public void adicionarUsuario(int identificador, String nome){
        Usuario usuario = new Usuario(identificador,nome); 
        usuarios.add(usuario);
    }
    
    public void adicionarAdministrador (int identificador, String usuario, String senha){
        Administrador administrador = new Administrador(identificador,usuario,senha);
        administradores.add(administrador);
    }

}
