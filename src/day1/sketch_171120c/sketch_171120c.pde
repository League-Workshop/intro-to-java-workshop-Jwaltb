PImage Mustache;
PImage Trump;
boolean stick=false;
void setup(){
  Trump = loadImage("Trump.jpg");
  size(800,600);
  Trump.resize(width,height);
  background(Trump);
  Mustache = loadImage("Mustache.png");
}
int mx;
int my;
void draw(){
  background(Trump);
  if(stick == true){
    image(Mustache,mx,my,100,100);
  }else{
  image(Mustache, mouseX, mouseY, 100, 100);
  if(mousePressed){
  stick=true;
  mx=mouseX;
  my=mouseY;
}}}