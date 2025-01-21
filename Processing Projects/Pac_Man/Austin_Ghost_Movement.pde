int ghostmovementy;
int ghostmovementx;
boolean won = true;

int ghost[][] = {
{0, 7, 13, 100},
{0, 7, 11, 200},
{0, 8, 13, 255},
{0, 8, 11, 155}
};

void drawghost(int hawk, int tuah, int hue){
  fill(hue);
  square(hawk*60+10, tuah*60+10, 40);
}

void moveghost(int n) {
  if (ghost[n][0]==0) {ghostmovementy = -1; ghostmovementx = 0;}
  else if (ghost[n][0]==1) {ghostmovementy = 1; ghostmovementx = 0;}
  else if (ghost[n][0]==2) {ghostmovementx = -1; ghostmovementy = 0;}
  else if (ghost[n][0]==3) {ghostmovementx = 1; ghostmovementy = 0;}
  
  
  
  if (backgroundsetup_grid[ghost[n][1] + ghostmovementy][ghost[n][2] + ghostmovementx] != 1) {
    ghost[n][1] = ghost[n][1]+(ghostmovementy);
    ghost[n][2] = ghost[n][2] + (ghostmovementx);
      }
  //if (n==0) System.out.println(backgroundsetup_grid[ghost[n][1]][ghost[n][2]]);
  //if (backgroundsetup_grid[ghost[n][1]][ghost[n][2]] == 4) {ghost[n][0] = int(random(0,4));}
  else {ghost[n][0] = int(random(0,4));}
    
  drawghost(ghost[n][2], ghost[n][1], ghost[n][3]);
  if (ghost[n][2] == pacposx && ghost[n][1] == pacposy) {points = 177000; won = false;}
}

void moveallghosts(){
  for (int n = 0; n < 4; n++){
    moveghost(n);
  }
}

void drawallghosts(){
  for (int k = 0; k < 4; k++){
    drawghost(ghost[k][2], ghost[k][1], ghost[k][3]);
  }
}
