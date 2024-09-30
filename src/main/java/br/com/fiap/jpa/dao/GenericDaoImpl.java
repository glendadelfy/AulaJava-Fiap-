package br.com.fiap.jpa.dao;

import java.lang.reflect.ParameterizedType;

public abstract class GenericDaoImpl <T,K> implements GenericDao<T, K> {
    private EntityManeger em;

    private class <T> clazz; //Atibuto que recebe o .class em T (Entidade)

    @SuppressWarnings("all")
    public GenericDaoImpl (EntityManeger em) {
        this.em = em;
        //Obter em todo o tempo de execusão o .class da classe
        this.clazz = (Class<T>) ((ParameterizedType)
                getClass().getGenericSuperclass().getActualTypeArguments()[0]);
    }

    @Override
    public T salvar(T entidade) {
        return em.merge(entidade);
    }
    public void remover(>id) throws IdNaoEncontraoException{
        T entidade = buscar(id);
        em.remove(entidade);

    }
    public T buscar (K id) throws IdNaoEncontraoException{
        T entidade = em.find(clazz, id);
        if(entidade ==null) {
            throw new IdNaoEncontraoException("Entidade não encontrada");
        }
        return entidade;

        }
        public void commit() throws CommitException{
        try{
            em.getTransaction().begin();
            em.getTransaction().commit);
    }catch (Exception e){
            e.printStackTrace();
            em.getTransaction().rollback();
            throw new CommitException();

        }

    }
}

