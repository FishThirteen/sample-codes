package thymeleafexamples.stsm.web.controller;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import thymeleafexamples.stsm.business.entities.Feature;
import thymeleafexamples.stsm.business.entities.Row;
import thymeleafexamples.stsm.business.entities.SeedStarter;
import thymeleafexamples.stsm.business.entities.Type;
import thymeleafexamples.stsm.business.entities.Variety;
import thymeleafexamples.stsm.business.services.SeedStarterService;
import thymeleafexamples.stsm.business.services.VarietyService;


@Controller
public class SeedStarterMngController {
  @Autowired
  private SeedStarterService seedStarterService;

  @Autowired
  private VarietyService varietyService;


  @ModelAttribute("allTypes") 
  public List<Type> populateTypes() {
    return Arrays.asList(Type.ALL);
  }

  @ModelAttribute("allFeatures")
  public List<Feature> populateFeatures() {
    return Arrays.asList(Feature.ALL);
  }

  @ModelAttribute("allVarieties")
  public List<Variety> populateVarieties() {
    return this.varietyService.findAll();
  }

  @ModelAttribute("allSeedStarters")
  public List<SeedStarter> populateSeedStarters() {
    return this.seedStarterService.findAll();
  }

  @RequestMapping({"/", "/seedstartermng"})
  public String showSeedstarters(final SeedStarter seedStarter) {
    seedStarter.setDatePlanted(Calendar.getInstance().getTime());
    return "seedstartermng";
  }

  @RequestMapping(value = "/seedstartermng", params = {"save"}) 
  public String saveSeedstarter(final SeedStarter seedStarter, final BindingResult bindingResult, final ModelMap model) {
    if (bindingResult.hasErrors()) {
      return "seedstartermng";
    }

    this.seedStarterService.add(seedStarter);
    model.clear();

    return "redirect:/seendstartermng";
  }


}

