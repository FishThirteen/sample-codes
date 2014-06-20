package thymeleafexamples.stsm.business.entities.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import thymeleafexamples.stsm.business.entities.SeedStarter;

@Repository
public class SeedStarterRepository {
  private final List<SeedStarter> seedStarters = new ArrayList<SeedStarter>();

  public SeedStarterRepository() {
  }

  public List<SeedStarter> findAll() {
    return this.seedStarters; 
  }

  public void add(final SeedStarter seedStarter) {
    this.seedStarters.add(seedStarter);
  }
}
