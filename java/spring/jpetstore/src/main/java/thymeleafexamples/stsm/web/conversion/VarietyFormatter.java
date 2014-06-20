package thymeleafexamples.stsm.web.conversion;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import thymeleafexamples.stsm.business.entities.Variety;
import thymeleafexamples.stsm.business.services.VarietyService;

public class VarietyFormatter implements Formatter<Variety> {
  @Autowired
  private VarietyService varietyService;


  public Variety parse(String text, Locale locale) throws ParseException {
    final Integer varietyId = Integer.valueOf(text);
    return this.varietyService.findById(varietyId);
  }

  public String print(Variety object, Locale locale) {
    return ((object != null) ? object.getId().toString() : "");
  }
}
