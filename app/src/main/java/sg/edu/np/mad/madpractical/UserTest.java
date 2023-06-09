package sg.edu.np.mad.madpractical;

import android.widget.ImageView;

public class UserTest {
    public String Name;
    public String Description;
    public int Id;
    public int Img;
    public static boolean Followed;

    public UserTest(String name, String description, int id, int img, boolean followed) {
        Name = name;
        Description = description;
        Id = id;
        Img = img;
        Followed = followed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }

    public static boolean isFollowed() {
        return Followed;
    }

    public static void setFollowed(boolean followed) {
        Followed = followed;
    }
}
