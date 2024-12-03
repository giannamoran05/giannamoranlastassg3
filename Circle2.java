void setup() {
    size(800, 800); // Set canvas size
    noStroke();     // No outline for shapes
    noLoop();       // Only draw once
}

void draw() {
    drawCircle(width / 2, 280, 6);  // Call with different parameters if required
}

void drawCircle(int x, int radius, int level) {
    float tt = 126 * level / 4.0;  // Color intensity based on level
    fill(tt);  // Set fill color

    // Draw the circle at the given x and y (center of canvas)
    ellipse(x, height / 2, radius * 2, radius * 2);

    // Recursive calls to draw smaller circles to the left and right
    if (level > 1) {
        level = level - 1;  // Decrease level

        // Recursively draw circles smaller and placed to the left and right
        drawCircle(x - radius / 2, radius / 2, level);  // Left
        drawCircle(x + radius / 2, radius / 2, level);  // Right
    }
}
