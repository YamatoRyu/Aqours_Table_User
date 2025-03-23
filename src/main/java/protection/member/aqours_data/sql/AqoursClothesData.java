package protection.member.aqours_data.sql;

import java.util.Date;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "member_clothes")
public class AqoursClothesData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    @NotNull
    private int birthdayDate;

    @NotNull
    private String birthdayMonth;

    @NotNull
    private String classYears;

    @NotNull
    private int age;

    @NotNull
    private int height;

    @NotNull
    private String clothesCaptionImage;

    @NotNull
    private String image;

    @NotNull
    private Date createAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserData userData;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(int birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getBirthdayMonth() {
        return birthdayMonth;
    }

    public void setBirthdayMonth(String birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }

    public String getClassYears() {
        return classYears;
    }

    public void setClassYears(String classYears) {
        this.classYears = classYears;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getClothesCaptionImage() {
        return clothesCaptionImage;
    }

    public void setClothesCaptionImage(String clothesCaptionImage) {
        this.clothesCaptionImage = clothesCaptionImage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }
}
