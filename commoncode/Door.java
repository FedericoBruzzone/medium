package commoncode;

public class Door extends MapSite {

  private Room _room1;
  private Room _room2;
  private boolean isOpen;
  
  public Door(Room room1, Room room2) {
    this._room1 = room1;
    this._room2 = room2;
    this.isOpen = false;
  }
  
  public Room OtherSideFrom(Room r) { return null; }

  public void Enter() {}
}
