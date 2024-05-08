package dev.miguel.poointerfacesrepositorio.repository;

import dev.miguel.poointerfacesrepositorio.model.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static dev.miguel.poointerfacesrepositorio.repository.Direccion.ASC;
import static dev.miguel.poointerfacesrepositorio.repository.Direccion.DESC;

public class ClienteListRepository implements CrudRepository, OrdenableRepository, PaginableRepository {

    private List<Cliente> dataSource;

    public ClienteListRepository(){
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> list() {
        return dataSource;
    }

    @Override
    public Cliente byId(Integer id) {
        Cliente cliente = null;
        for(Cliente c : dataSource){
            if(c.getId().equals(id)){
                cliente = c;
                break;
            }
        }
        return cliente;
    }

    @Override
    public void create(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void update(Cliente cliente) {
        Cliente cli = this.byId(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }

    @Override
    public void delete(Integer id) {
        this.dataSource.remove(this.byId(id));
    }

    @Override
    public List<Cliente> list(String campo, Direccion direccion) {
        dataSource.sort((a, b) -> {
            int result = 0;
            if(direccion == ASC){
                switch (campo){
                    case "id" -> result = a.getId().compareTo(b.getId());
                    case "nombre" -> result = a.getNombre().compareTo(b.getNombre());
                    case "apellido" -> result = a.getNombre().compareTo(b.getApellido());
                }
            } else if(direccion == DESC){
                switch (campo){
                    case "id" -> result = b.getId().compareTo(a.getId());
                    case "nombre" -> result = b.getNombre().compareTo(a.getNombre());
                    case "apellido" -> result = b.getNombre().compareTo(a.getApellido());
                }
            }
            return result;
        });
        return dataSource;
    }

    @Override
    public List<Cliente> list(int from, int to) {
        return dataSource.subList(from, to);
    }
}
