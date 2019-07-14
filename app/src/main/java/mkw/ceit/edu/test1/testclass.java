package mkw.ceit.edu.test1;

public class testclass {
    private String title,desc,image,username;

    public testclass()
    {

    }
    public testclass(String title,String desc,String image,String username)
    {
        this.title=title;
        this.desc=desc;
        this.image=image;
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getImage() {
        return image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
