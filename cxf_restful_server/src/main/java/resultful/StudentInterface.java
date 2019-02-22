package resultful;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: jinshengyuan
 * Date: 2019-02-22
 * Time: 15:17
 * description:
 **/
@WebService
@Path("/student")
public interface StudentInterface {
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/queryById/{id}")
    Student query(@PathParam("id") long id);

   @GET
   @Produces(MediaType.APPLICATION_XML)
   @Path("/queryList/{name}")
    List<Student> queryList(@PathParam("name") String name);
}
