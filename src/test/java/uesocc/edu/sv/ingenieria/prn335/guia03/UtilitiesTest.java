/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.guia03;

import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author GF15006
 */
@RunWith(Arquillian.class)
public class UtilitiesTest {
    @Deployment
    public static WebArchive desplegar(){
        WebArchive salida = ShrinkWrap.create(WebArchive.class)
                .addClass(Utilities.class)
                .addAsWebInfResource(EmptyAsset.INSTANCE,"beans.xml");
        System.err.println(salida.toString(true));
        return salida;
    }
    @Inject
    private Utilities utilidades;
    
   @Test
    public void getResumeTest1(){
    String texto ="Bienvenidos a la materia de Programacion 3 Ciclo II 2017";
    String esperado="Bienvenidos a la mat";
    String resultado=utilidades.getResume(texto);
        Assert.assertEquals(resultado, esperado);
        
 
    }
    @Test
    public void getResumeTest2(){
    String texto="Hola Mundo!";
    String esperado="Hola Mundo!";
    String resultado=utilidades.getResume(texto);
        Assert.assertEquals(resultado, esperado);
      
    }
    @Test
    public void getResumeTest3(){
        
    String texto=null;
    String esperado=null;
    String resultadoEsperado=utilidades.getResume(texto);
        Assert.assertEquals(resultadoEsperado, esperado);
    }
    @Test
    public void capitalizarTest1(){
    String texto ="prueBas de UNIDAD con  JUnit & arQuillian";
    String esperado="Pruebas De Unidad Con Junit & Arquillian";
    String resultado=utilidades.capitalizar(texto);
        Assert.assertEquals(resultado, esperado);
       
    }
    @Test
    public void capitalizarTest2(){
    String texto="";
    String esperado="";
    String resultado=utilidades.capitalizar(texto);
   Assert.assertEquals(resultado, esperado);
        
     
    }
    @Test
    public void capitalizarTest3(){
    String texto=null;
    String esperado=null;
    String resultado=utilidades.capitalizar(texto);
   Assert.assertEquals(resultado, esperado); 
    }
    
    @Test
    public void contarCoincidenciasTesT1(){
    int esperado=1;
    String frase="2017";
    String texto = "Bienvenidos a la materia de Programacion 3 Ciclo II 2017";
    int resultado=utilidades.contarCoincidencias(frase,texto);
    Assert.assertEquals(resultado, esperado);
   
    
    }
   @Test
   public void contarCoincidenciasTest2(){
    int esperado=2;
    String frase="Ma";
    String texto= "Bienvenidos a la materia de Programacion 3 Ciclo II 2017";
    int resultado=utilidades.contarCoincidencias(frase,texto);
    Assert.assertEquals(resultado, esperado);
    
    
   }
   @Test
   public void contarCoincidenciasTest3(){
       
    int esperado=0;
    String frase="Bienvenido";
    String texto = null;
    int resultado=utilidades.contarCoincidencias(frase,texto);
    Assert.assertEquals(resultado, esperado);
   }
    
}
