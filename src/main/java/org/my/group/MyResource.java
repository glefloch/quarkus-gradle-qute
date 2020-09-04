package org.my.group;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;

@Path("/hello")
public class MyResource {


    @Inject
    Template items;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public TemplateInstance hello() {
       Item i = new Item();
       i.name = "test";
       i.price = new BigDecimal(150);
       return items.data("item", i);
    }
}