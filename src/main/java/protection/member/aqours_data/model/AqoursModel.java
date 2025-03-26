package protection.member.aqours_data.model;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class AqoursModel {
    @NotEmpty
    private String name;

    @NotEmpty
    private int birthdayDate;

    @NotEmpty
    private String birthdayMonth;

    @NotEmpty
    private String classYear;

    @NotEmpty
    private int age;

    @NotEmpty
    private int height;

    @Size(min = 10)
    @Size(max = 1000)
    private String clothesCaptionImage;

    private MultipartFile imageFile;

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

    public String getClassYear() {
        return classYear;
    }

    public void setClassYear(String classYear) {
        this.classYear = classYear;
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

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }
}
