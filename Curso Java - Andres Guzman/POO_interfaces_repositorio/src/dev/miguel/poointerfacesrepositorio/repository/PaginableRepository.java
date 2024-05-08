package dev.miguel.poointerfacesrepositorio.repository;

import dev.miguel.poointerfacesrepositorio.model.Cliente;

import java.util.List;

public interface PaginableRepository {

    List<Cliente> list(int from, int to);

}
