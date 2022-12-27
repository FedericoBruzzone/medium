package CommonCode;

public class Room extends MapSite {
    
  private MapSite[] _sides;
  private int _roomNumber;
  
  public Room(int roomNo) {
    this._roomNumber = roomNo;
    this._sides = new MapSite[4];
  }

  public MapSite GetSide(Direction d) { return null; }

  public void SetSide(Direction d, MapSite ms) { /* ... */ }
  
  public void Enter() { /* ... */ }

}
