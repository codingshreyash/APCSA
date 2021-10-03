/* 
Constuctor Triangle -
Assigns the given size and default character to a new Triangle
@param size - identifies the size of the triangle 
*/

public class Triangle {
  private int size;
  private char ch;

/*
Method setSize - 
Assigns a given value to a size if it is between 1 and 50, otherwise assigns 10 
@param size - identifies the desired size
*/

  public void setSize(int size) {
    if (size >= 1 && size <= 50)
      this.size = size;
    else
      this.size = 10;
  }

/*
Method setChar - 
Assigns a given value to a char which is * 
@param ch - identifies the desired symbol for the triangle 
*/

  public void setChar(char ch) {
    if (ch == ' ')
      this.ch = '*';
    else
      this.ch = ch;
  }

  public Triangle() { 
    size = 10;
    ch = '*';
  }

  public Triangle(int s, char c) { 
    size = s;
    ch = c;
  }

  public Triangle(int s) { // Constructor 3
    size = s;
    ch = '*';
  }

  public Triangle(char c) { // Constructor 4
    size = 10;
    ch = c;
  }

  // DISPLAYS
  public void displaySolidUL() { // This displays a solid triangle in the Upper Left
    int c = 0;
    String tri = "";
    for (int r = 1; r <= size; r++) {
      for (c = r; c <= size; c++) {
        tri += ch;
      }
      tri += "\n";
    }
    System.out.println("Solid Upper Left \n" + tri);
  }

  public void displaySolidUR() { // This displays a solid triangle in the Upper Right
    int c = 0;
    String tri = "";
    for (int r = 0; r <= size; r++) {
      for (c = 1; c <= size; c++) {
        if (c <= r)
          tri += " ";
        else
          tri += ch;
      }
      tri += "\n";
    }
    System.out.println("Solid Upper Right \n" + tri);
  }

  public void displaySolidLL() { // This displays a solid triangle in the Lower Left
    int c = 0;
    String tri = "";
    for (int r = 0; r <= size; r++) {
      for (c = 1; c <= size; c++) {
        if (c <= r)
          tri += ch;
        else
          tri += " ";
      }
      tri += "\n";
    }
    System.out.println("Solid Lower Left \n" + tri);
  }

  public void displaySolidLR() { // This displays a solid triangle in the Upper Right
    int c = 0;
    String tri = "";
    for (int r = 0; r <= size; r++) {
      for (c = 1; c <= size; c++) {
        if (c <= size - r)
          tri += " ";
        else
          tri += ch;
      }
      tri += "\n";
    }
    System.out.println("Solid Lower Right \n" + tri);
  }

  public void displayHollowLR() { // This displays a Triangle in the Lower Right that is Hollow
    int c = 0;
    String tri = "";
    for (int r = 0; r <= size; r++) {
      for (c = 1; c <= size; c++) {
        if (r == size) {
          tri += ch;
        } else if (c < size - r) {
          tri += " ";
        } else if (c == size - r || c == size) {
          tri += ch;
        } else {
          tri += " ";
        }
      }
      tri += "\n";
    }
    System.out.println("Hollow Lower Right \n" + tri);
  }

  //
  public void displayHollowLL() { // This displays a Triangle in the Lower Left that is Hollow
    int c = 0;
    String tri = "";
    for (int r = 0; r <= size; r++) {
      for (c = 1; c <= size; c++) {
        if (c == size) {
          tri += ch;
        } else if (r < size - c) {
        } else if (r == size - c || r == size) {
          tri += ch;
        } else {
          tri += " ";
        }
      }
      tri += "\n";
    }
    System.out.println("Hollow Lower Left \n" + tri);
  }

  public void displayHollowUL() { // This displays a Triangle in the Upper Left that is Hollow
    int c = 0;
    String tri = "";
    for (int r = 1; r <= size; r++) {
      for (c = 1; c <= size; c++) {
        if (r == 1) {
          tri += ch;
        } else if (c == 1 || c == size - r + 1) {
          tri += ch;
        } else {
          tri += " ";
        }

      }
      tri += "\n";
    }
    System.out.println("Hollow Upper Left \n" + tri);
  }

  public void displayHollowUR() { // This dispalys a hollow upper right
    int c = 0;
    String tri = "";
    for (int r = 1; r <= size; r++) {
      for (c = 1; c <= size; c++) {
        if (r == 1) {
          tri += ch;
        } else if (c == size || c == r) {
          tri += ch;
        } else {
          tri += " ";
        }
      }
      tri += "\n";
    }
    System.out.println("Hollow Upper Right \n" + tri);
  }
}
