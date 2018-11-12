/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Television;

/**
 *
 * @author Luisa María González Ordóñez
 */
public class Television {
    private boolean encendido=false;
    private int canal=1;
    private int canal2;
    private int volumen=0;
    private int volumen2;
    private boolean mute=false;
    
    public void prender(){
        encendido = true;
    }
    
    public void apagar(){
        encendido = false;
    }
    
    public void activarMute(){
        mute=true;
    }
    
    public void desactMute(){
        mute=false;
    }

    public void setCanal(int canal) {
        this.canal=canal;
    }
    
    public void avanzarCanal(){
        if(encendido=true){
            if(canal>=1||canal<=999){
                canal=canal+1;
            }
        }
    }
    
    public void retrocederCanal(){
        if(encendido=true){
            if(canal>=1||canal<=999){
                canal=canal-1;
            }
        }
    }
    
    public void penultimoCanal(){
        
    }
    
    public void avanzarVol(){
        if(encendido=true){
            if(volumen>=1||volumen<=100){
                volumen=volumen+1;
            }
        }
    }
    
    public void retrocederVol(){
        if(encendido=true){
            if(volumen>=0||volumen<=100){
                volumen=volumen-1;
            }
        }
    }
    
    public void silenciarVol(){
        if(mute!=true){
            volumen2=volumen;
            if(encendido=true){
                volumen=0;
            }
            mute=true;
        }    
    }
    
    public void activarVol(){
        if(mute=true){
            volumen=volumen2;
            mute=false;
        }  
    }
    
}
