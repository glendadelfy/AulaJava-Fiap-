package br.com.fiap.jpa.entity.dao;

public interface GenericDao <T,K> {
    T salvar(T entidade);

    void remover(X id) throws IdNaoEncontraoException;

    T buscar(K id) throws IdNaoEncontraoException;

    void commt() throws CommitException;
}