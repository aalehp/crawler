package crawler;

public class Cola {

    private String []Urls;
    private int inicio,end;
    private int MaxCola;

    public  Cola(){
        inicio=end=0;
        MaxCola=20;
        Urls=new String [20];
    }


    public int getSize(){
        return (MaxCola-inicio+end)%MaxCola;
    }

    public void push(String url){
        if(colallena()){
            System.out.println("La cola esta llena");
        }else{
            Urls[end]=url;
            end=end+1;
        }
    }

    public String pop(){
        String aux="";
        
        if(!colavacia()){
            
            aux = Urls[inicio];
            
            for(int i=inicio ; i < end-1; i++){
                Urls[i] = Urls[i+1];
            }
            end--;
        }
        return aux;
    }

    public void mostrarCola(){
        if(inicio<end){
            for(int i=inicio;i<end;i++) {
                System.out.println(Urls[i]);
            }
        }
        
        if(colavacia()) {
            System.out.println("Cola vacia");
        }
    } 
    
    public boolean colallena(){
        return (getSize()>=(MaxCola-1));
    }

    public boolean colavacia(){
        return (inicio==end);
    }
    
    public boolean verificar_Repetido(String verif){
        
        boolean res=false;
        
        if( !colavacia() ){
            for(int i =0; i < end; i++){
                if(Urls[i].equals(verif)){
                    res=true;
                }
            }
        }
        
        
        return res;
    }
    
    @Override
    public String toString(){
        String ActualCola = "";
        
        
        for(int i=0;i<end;i++){
            ActualCola = ActualCola + Urls[i] + "\n"; 
        }
        
        return ActualCola;
    }

}
    
