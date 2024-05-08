package dev.miguel.poointerfacesrepositorio.repository;

import dev.miguel.poointerfacesrepositorio.model.Cliente;

import java.util.List;

public interface CrudRepository {

    List<Cliente> list();

    Cliente byId(Integer id);

    void create(Cliente cliente);

    void update(Cliente cliente);

    void delete(Integer id);

}
