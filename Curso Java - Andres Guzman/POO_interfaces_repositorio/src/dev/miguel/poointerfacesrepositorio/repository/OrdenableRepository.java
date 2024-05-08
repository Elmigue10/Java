package dev.miguel.poointerfacesrepositorio.repository;

import dev.miguel.poointerfacesrepositorio.model.Cliente;

import java.util.List;

public interface OrdenableRepository {

    List<Cliente> list(String campo, Direccion direccion);

}
