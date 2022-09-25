package br.com.api;
import br.com.api.model.UserModel;
import br.com.api.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/hello")
public class GreetingResource {
    @Inject
    private UserService userService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return userService.testeapi();
    }


    @Path("/user")

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserModel> get() {
        return userService.mostra();
    }

    @Path("/user")

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public UserModel post(UserModel userModel) {
        return userService.post(userModel);
    }


}

