package br.com.fiap.jpa.dao;

public class InvestimentoDaoImpl extends GenericDaoImpl<Investimento, Integer> implements InvestimentoDao {

    public InvestimentoDaoImpl(EntityManager em){
        super(em);
    }
}
