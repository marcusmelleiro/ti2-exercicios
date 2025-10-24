 class ArvoreBInaria {
    private raiz;
//-------------------------------------------------------
//CRIAÇÃO DA ARVORE 
    public ArvoreBInaria()
    {
        raiz = null;
    }
    public void inserir (int x)
    {
        raiz = inserir(x , raiz)
    }
    private No inserir(int x , No i)
    {
        if(i == null)
        {
            i = new No(x);
        }
        else if (x < i.elemento)
        {
            i.esq = inserir(x,i.esq);
        }
        else if ( x > i.elemento)
        {
            i.dir = inserir(x,i.dir);
            
        }

        return i;
    }

    //-----------------------------------------
    //PESQUISAR

    public boolean pesquisar(x,raiz)
    {
        return pesquisar(x,raiz);
    }

    private boolean pesquisar(int x , No i)
    {
        boolean resp;
        if(i == null)
        {
            resp = false;
        }
        else if ( x == i.elemento)
        {
            resp = true;
        }
        else if(x < i.elemento)
        {
            resp = pesquisar(x,i.esq)

        }
        else if(x > i.elemento)
        {
           resp = pesquisar(x,i.dir)
        }

        return resp;
    }    public class void caminharPos(No i)
    {
        pesquisar(raiz);

    }

    //---------------------------------------
    //CAMINHAR PRE
    public  void caminharPre(No raiz)
    {
        caminharPre(raiz);

    }
    private void caminharPre(No i)
    {
        if(i != null)
        {
            System.out.print(i.elemento + " ");
            caminharPre(i.esq);
            caminharPre(i.dir);
        }
    }

    //---------------------------------------
    //CAMINHAR PRE
    public  void caminharPos(No raiz)
    {
        caminharPos(raiz);

    }
    private void caminharPos(No i)
    {
        caminharPos(i.esq);
        caminharPos(i.dir);
        System.out.print(i.elemento + " ");
    }

    //----------------------------------------
    //CAMINHAR EM

    private void caminharEM(No raiz)
    {
        caminharEM(raiz);

    }
    public void caminharEM(No i)
    {
        caminharEM(i.esq);
        System.out.print(i.elemento + " ");
        caminharEM(i.dir);
    }

    
}
