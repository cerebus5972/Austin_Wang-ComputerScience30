// Austin Wang
// Mr. Fox
// Computer Science 30
// January 2025

// Pac-Man Setup
// Goal 1: Create a functioning map for the pac-man to navigate through.
// Goal 2: Draw the pellets

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// The backgroundsetup_grid array allows the setup of the grid. Each value determines the kind of tile that will be drawn in the 15 by 25 grid.
// 0: Represents the pellets and the places that the pac man can move through
// 1: Represents blue squares; the impassable sections of the map.
// 2: Represents the ghost spawn, where the player cannot pass through but the ghosts can.

int[][] backgroundsetup_grid = {
    
{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},

{1,0,0,0,0,4,0,4,0,0,0,0,1,0,0,0,0,4,0,4,0,0,0,0,1},

{1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1},

{1,0,1,1,1,0,1,4,0,0,0,4,1,4,0,0,0,4,0,4,0,0,1,0,1},

{1,4,0,0,4,4,0,4,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1},

{1,0,1,1,0,1,1,0,1,0,0,4,0,4,0,4,0,0,0,4,0,4,0,0,1},

{1,0,1,1,0,1,0,0,1,0,1,3,3,3,1,0,1,1,1,0,1,0,1,0,1},

{1,0,1,1,0,1,0,1,1,0,1,2,2,2,1,0,1,1,1,0,1,0,1,0,1},

{1,4,0,0,4,0,4,0,0,4,1,1,1,1,1,0,1,1,1,0,1,0,1,0,1},

{1,0,1,1,1,0,1,1,1,4,0,0,4,0,4,4,0,0,4,4,0,4,0,0,1},

{1,4,0,0,0,4,0,0,0,4,1,1,0,1,0,1,1,1,0,1,1,1,1,0,1},

{1,0,1,1,1,1,1,1,1,0,1,0,0,1,0,1,0,0,4,0,0,0,1,0,1},

{1,0,1,1,1,1,1,1,1,0,1,0,1,1,0,1,0,1,1,1,1,0,1,0,1},

{1,0,0,0,0,0,0,0,0,4,0,4,0,0,4,0,4,0,0,0,0,4,0,0,1},

{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
};

int GRID_H = backgroundsetup_grid.length;
int GRID_W = backgroundsetup_grid[0].length;

// The square() function draws a blue square based on given parameters.
void square(int squarex, int squarey) {
  fill(6, 133, 158);
  square(squarex*60,squarey*60,60);
}

// The drawpellet() function draws a yellow pellet based on given parameters. 
void drawpellet(int pelletx, int pellety) {
  fill(255, 242, 59);
  circle(pelletx*60+30,pellety*60+30,15);
}


// The drawmap() function is used on setup to create the map. 
void drawmap(){
  background(0); // Sets the backround color as black.
  int xcount = 0;
  int ycount = 0;
  for (int squarey = 0; squarey<GRID_H; squarey++){ // Loops through all possible y values and increases by 60 every time the x finishes a cycle, which moves the square in question down one. 
    for (int squarex = 0; squarex<GRID_W; squarex++){ // Loops through all possible x values and increases by 60 every time, which loops through the grid horizontally. 
      if (backgroundsetup_grid[squarey][squarex] == 1) { // Draws a square if needed. 
        square(squarex,squarey);      
      }
      else if (backgroundsetup_grid[squarey][squarex] == 0) drawpellet(squarex, squarey); // Draws a pellet if needed. 
    
    }
  }
}
