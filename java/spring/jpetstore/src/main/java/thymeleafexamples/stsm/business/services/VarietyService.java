package thymeleafexamples.stsm.business.services;


import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import thymeleafexamples.stsm.business.entities.repositories.VarietyRepository;
import thymeleafexamples.stsm.business.entities.Variety;


@Service
public class VarietyService {
  @Autowired
  private VarietyRepository varietyRepository;

  public List<Variety> findAll() {
    return this.varietyRepository.findAll();
  }

  public Variety findById(final Integer id) {
    return this.varietyRepository.findById(id);
  }
}
