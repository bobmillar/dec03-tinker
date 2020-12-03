package org.millar;

import java.util.Collection;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/widget")
public class WidgetResource {

  @Inject
  WidgetRepository widgetRepository;

  @GET
  public Collection<Widget> getWidgets() {
    return widgetRepository.getWidgets().values();
  }

  @GET
  @Path("{id}")
  public Widget getWidget(@PathParam("id") Integer id) {
    return widgetRepository.getWidgets().get(id);
  }
}
