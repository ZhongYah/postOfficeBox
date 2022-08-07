package box;

import java.io.File;

public class BoxSet {
    float length;
    float width;
    float height;

    public BoxSet(float length, float width, float height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public boolean validate(float length, float width, float height){
        boolean box  = false;
        if (this.length > length && this.width > width
                && this.height > height){
            box = true;
        }
        return box;
    }
}
