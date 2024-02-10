package br.unitins.topicos1.resource;




import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/pessoas")
public class PessoaResource {
    
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getNome() {
//        return "Paulo";
//    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List<Pessoa> gAll() {
        return Pessoa.listAll();
    }

}
