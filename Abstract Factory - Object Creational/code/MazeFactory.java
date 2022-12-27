import CommonCode;

abstract class MazeFactory {
  public MazeFactory() {}

  public Maze MakeMaze()
    { return new Maze; }
}