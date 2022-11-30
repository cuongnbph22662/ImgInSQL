package cuongnbph22662.poly.imginsql.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class ImageInSQL {
    @PrimaryKey
    private String tenImg;

    private String linkImg;

    public ImageInSQL(String tenImg, String linkImg) {
        this.tenImg = tenImg;
        this.linkImg = linkImg;
    }

    public ImageInSQL() {
    }

    public String getTenImg() {
        return tenImg;
    }

    public void setTenImg(String tenImg) {
        this.tenImg = tenImg;
    }

    public String getLinkImg() {
        return linkImg;
    }

    public void setLinkImg(String linkImg) {
        this.linkImg = linkImg;
    }
}
