int arraymovementy = 0;
int arraymovementx = 0;
int pacposy = 9;
int pacposx = 12;
int smx = 30;
int smy = 30;
int points = 0;

void drawpacman(int pacposx, int pacposy) {
  fill(255,255,0);
  circle(pacposx*60+smx,pacposy*60+smy,50);
}

void movepacman() {
  if (backgroundsetup_grid[pacposy + arraymovementy][pacposx + arraymovementx] != 1) {
      if (arraymovementy != 0){
        pacposy = pacposy+(arraymovementy);
      }
      else if (arraymovementx != 0) {
        pacposx = pacposx + (arraymovementx);
      }
    }
  if (backgroundsetup_grid[pacposy][pacposx] == 0) {
    points = points+1000;
    backgroundsetup_grid[pacposy][pacposx] = 2;
    System.out.println("You have collected " + points + " points! ");
  }
  arraymovementy = 0;
  arraymovementx = 0;
}
