package thymeleafexamples.stsm.business.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import thymeleafexamples.stsm.business.entities.Type;
import thymeleafexamples.stsm.business.entities.Feature;
import thymeleafexamples.stsm.business.entities.Row;

public class SeedStarter {
  private Integer id;
  private Date datePlanted;
  private Boolean covered;
  private Type type = Type.PLASTIC;
  private Feature[] features;

  private List<Row> rows = new ArrayList<Row>();

  public SeedStarter() {
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }


  public Date getDatePlanted() {
    return this.datePlanted;
  }

  public void setDatePlanted(final Date datePlanted) {
    this.datePlanted = datePlanted;
  }


  public Boolean getCovered() {
    return this.covered;
  }

  public void setCoverted(final Boolean covered) {
    this.covered = covered;
  }

  public Type getType() {
    return this.type;
  }

  public void setType(final Type type) {
    this.type = type;
  }

  public Feature[] getFeatures() {
    return this.features;
  }

  public void setFeatures(final Feature[] features) {
    this.features = features;
  }

  public List<Row> getRows() {
    return this.rows;
  }

  @Override
  public String toString() {
    return "SeedStarter [ id =" + this.id + ", datePlanted = " + this.datePlanted
      + ", covered = " + this.covered + ", type = " + this.type + ", features = "
      + Arrays.toString(this.features) + ", rows = " + this.rows + " ]";
  }

}
