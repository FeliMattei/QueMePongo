public class Color {
    int red;
    int green;
    int blue;

    public Color(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String getColorHex(){
        String redHex = Integer.toHexString(red);
        String greenHex = Integer.toHexString(green);
        String blueHex = Integer.toHexString(blue);

        String colorHex = "#" + redHex + greenHex + blueHex;

        return colorHex;
    }
}
