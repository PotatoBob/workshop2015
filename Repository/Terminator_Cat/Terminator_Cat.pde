import ddf.minim.*;
AudioSample sound;
int x = 418;
int y = 222;
int acceleration = 1;
void setup()
{
  Minim minim = new Minim(this);
  sound = minim.loadSample("Pew_Pew-DKnight556-1379997159.wav");
  size(960, 540);
  PImage cat = loadImage("Grumpy Cat 2.jpg");
  background(cat);
}
void draw()
{
  noStroke();
  fill(0, 230, 190);
  //ellipse(418, 222, 60, 60);
  ellipse(x, y, 60, 60);
  //ellipse(750, 205, 60, 60);
  ellipse(x+332, y-17, 60, 60);
}
void keyPressed()
{
  if (acceleration == 1)
  {
    sound.trigger();
  }
  x+=acceleration;
  y+=acceleration;
  acceleration = acceleration + 1;
}
