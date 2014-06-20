package thymeleafexamples.stsm.business.entities;

public class Row {
  private Variety variety;
  private Integer seedsPerCell;

  public Row() {
  }


  public Variety getVariety() {
    return this.variety;
  }

  public void setVariety(final Variety variety) {
    this.variety = variety;
  }


  public Integer getSeedsPerCell() {
    return this.seedsPerCell;
  }

  public void setSeedsPerCell(Integer seedsPerCell) {
    this.seedsPerCell = seedsPerCell;
  }

  @Override
  public String toString() {
    return "Row [ variety = " + this.variety + ", seedsPerCell = " + this.seedsPerCell + "]";
  }

}


