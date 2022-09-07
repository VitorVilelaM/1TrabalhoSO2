package main;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vitor
 */
public class Diretorio {
    private Diretorio dirPai;
    private ArrayList<Diretorio> filhos;
    private ArrayList<Arquivo> arquivos;
    private Date dataCriacao;
     
    public Diretorio ( Diretorio pai){
        this.dirPai = pai;
        this.filhos = new ArrayList();
        this.arquivos = new ArrayList();
        //this.dataCricao = new Date(System.currentTimeMillis);
        //SimpleDateFormat sdf = new SimpleDateFormat("MM dd HH:mm:ss");
        //sdf.format(dataCriacao);s
    }
    
    public void addFilhos(Diretorio novoFilho){
       filhos.add(novoFilho);
    }
   
}
