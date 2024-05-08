package dev.miguel.poointerfacesrepositorio;

import dev.miguel.poointerfacesrepositorio.model.Cliente;
import dev.miguel.poointerfacesrepositorio.repository.ClienteListRepository;
import dev.miguel.poointerfacesrepositorio.repository.Direccion;
import dev.miguel.poointerfacesrepositorio.repository.OrdenableRepository;
import dev.miguel.poointerfacesrepositorio.repository.PaginableRepository;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ClienteListRepository repo = new ClienteListRepository();

        repo.create(new Cliente("Peter", "Parker"));
        repo.create(new Cliente("Steve", "Rogers"));
        repo.create(new Cliente("Tony", "Stark"));
        repo.create(new Cliente("Bruce", "Banner"));

        List<Cliente> clienteList = repo.list();
        clienteList.forEach(System.out::println);

        System.out.println("......:::::: Paginable :::::.......");
        List<Cliente> paginable = ((PaginableRepository)repo).list(1, 3);
        paginable.forEach(System.out::println);

        System.out.println("......:::::: Ordenable :::::.......");
        List<Cliente> clientesOrdenAsc = ((OrdenableRepository)repo).list("apellido", Direccion.DESC);
        clientesOrdenAsc.forEach(System.out::println);

        System.out.println("......:::::: Editar :::::.......");
        Cliente bruceActualizar = new Cliente("Bruce", "wayne");
        bruceActualizar.setId(4);
        repo.update(bruceActualizar);
        System.out.println(repo.byId(bruceActualizar.getId()));

        System.out.println("......:::::: Eliminar :::::.......");
        repo.delete(bruceActualizar.getId());
        repo.list().forEach(System.out::println);
    }
}