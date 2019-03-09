package appendixA;

public class ClassWithThreadingProblem {
  int nextId;

  public int takeNextId() {
    return nextId++;
  }
}