package org.daijie.jpa.cloud.service.base;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.daijie.core.controller.ApiController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;

public abstract class BaseSearchService <E,ID extends Serializable,R extends PagingAndSortingRepository<E,ID>> extends ApiController {

    @SuppressWarnings("unused")
	private Logger logger = Logger.getLogger(this.getClass());

    private R repository;

    @Autowired
    public void setRepository(R repository) {
        this.repository = repository;
    }

    protected R getRepository(){
        return repository;
    }

    public E getById(ID id) {//
        return getRepository().findOne(id);
    }

    public Iterable<E> listAll() {
        return getRepository().findAll();
    }

    public void save(E data){
        getRepository().save(data);
    }

    public void delete(E data){
        getRepository().delete(data);
    }

    public void deleteById(ID id){
        getRepository().delete(id);
    }

}
