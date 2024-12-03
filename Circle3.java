void setup() {
    size(800, 800);
    noStroke();
    noLoop(); // Stops the draw loop after one frame
}

void draw() {
    drawCircle(width / 2, 280, 6);  // Calling the drawCircle function with initial parameters
}

void drawCircle(int x, int radius, int level) {
    float tt = 126 * level / 4.0;   // Color intensity based on level
    fill(tt);  // Set the color based on the level

    // Draw the current circle at the given x and radius
    ellipse(x, height / 2, radius * 2, radius * 2);

    if (level > 1) {  // Base case for recursion
        level = level - 1;  // Decrease the level
        drawCircle(x - radius / 2, radius / 2, level);  // Left circle
        drawCircle(x + radius / 2, radius / 2, level);  // Right circle
    }
}
