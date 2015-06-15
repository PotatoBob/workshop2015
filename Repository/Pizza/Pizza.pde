void setup()
{
  size(800, 800);
  fill(300, 200, 50);
  ellipse(400, 400, 750, 750);
  fill(255, 0, 0);
  ellipse(400, 400, 700, 700);
}
void draw()
{
  PImage pepperoni = loadImage("curly.ppm.gif");
  pepperoni.resize(50, 50);
  if(mousePressed)
  {
    image(pepperoni, mouseX, mouseY);
  }
}
