void setup() {
size(1500,900);

}

void draw() {
  if (points != 177000){
    drawmap();
    drawpacman(pacposx, pacposy);
    movepacman();
    delay(100);
    moveallghosts();
    
    drawmap();
    drawpacman(pacposx, pacposy);
    movepacman();
    delay(100);
    drawallghosts();
    
    drawmap();
    drawpacman(pacposx, pacposy);
    movepacman();
    delay(100);
    drawallghosts();
  }
  if (won == false) System.out.println("You lose! Play Again?");
  else System.out.println("You beat the game! Play Again?");
}

void keyPressed() {
  if (keyCode == DOWN) {arraymovementy = 1;}
  else if (keyCode == UP) {arraymovementy = -1;}
  else if (keyCode == RIGHT) {arraymovementx = 1;}
  else if (keyCode == LEFT) {arraymovementx = -1;}
}
