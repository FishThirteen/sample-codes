package thymeleafexamples.stsm.business.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import thymeleafexamples.stsm.business.entities.repositories.SeedStarterRepository;
import thymeleafexamples.stsm.business.entities.SeedStarter;

@Service
public class SeedStarterService {

  @Autowired
  private SeedStarterRepository seedsStarterRepository;

  public List<SeedStarter> findAll() {
    return this.seedsStarterRepository.findAll();
  }

  public void add(SeedStarter seedStarter) {
    this.seedsStarterRepository.add(seedStarter);
  }
}
