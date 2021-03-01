/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.skrbina.edunovazavrsnigalerija.controller;

import hr.skrbina.edunovazavrsnigalerija.utility.SkrbinaException;
import hr.skrbina.edunovazavrsnigalerija.utility.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Hrvoje
 * @param <T>
 */
public abstract class Obrada<T> {

    protected T entitet;
    protected Session session;

    public abstract List<T> getPodaci();

    protected abstract void kontrolaCreate() throws SkrbinaException;
    protected abstract void kontrolaUpdate() throws SkrbinaException;
    protected abstract void kontrolaDelete() throws SkrbinaException;

    public Obrada(T entitet) {
        this();
        this.entitet = entitet;
    }

    public Obrada() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    public T create() throws SkrbinaException {
        kontrolaCreate();
        save();
        return entitet;
    }

    public T createAll(List<T> lista) throws SkrbinaException {
        session.beginTransaction();
        for (T t : lista) {
            setEntitet(t);
            kontrolaCreate();
            session.save(t);
        }
        session.getTransaction().commit();
        return entitet;
    }

    public T update() throws SkrbinaException {
        kontrolaUpdate();
        save();
        return entitet;
    }

    public boolean delete() throws SkrbinaException {
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
        return true;
    }

    private void save() {
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
}