package org.millar;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class WidgetRepository {
  
  private Map<Integer,Widget> widgets;
  
  @PostConstruct
  public void init() {
    widgets = new HashMap<>();
    widgets.put(1, new Widget("Coffee Cup", 1));
    widgets.put(2, new Widget("Python Machine Learning Book", 2));
  }

  public Map<Integer, Widget> getWidgets() {
    return widgets;
  }
  
}
