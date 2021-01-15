package com.example.foodapp.models;

import com.google.gson.annotations.SerializedName;

public class HomeCategoriesModel {


    /**
     * ID : 1
     * Category : Appetizers
     * ParentID : 0
     * ShortDescription : Searching for a fancy first course or finger foods to fill party platters?  Our range of appetizer recipes will make your guests forget that anything comes after the hours d'ouevre.

     Prepare elegant salads that complement your main dish, take bruschetta to your friend's cocktail party or get meatballs ready for the Super Bowl.  Discover recipes so easy that even the kids can lend a hand in making them (and eating them!).

     Whether you're seeking something healthy or decadent, simple or elaborate, for the grownups or for the kids, our starter ideas offer the best first bites for every taste bud.
     * PrimaryImage : null
     * DefaultTotalMinutes : 30
     * DefaultActiveMinutes : 30
     */

    @SerializedName("ID")
    private int ID;
    @SerializedName("Category")
    private String Category;
    @SerializedName("ParentID")
    private int ParentID;
    @SerializedName("ShortDescription")
    private String ShortDescription;
    @SerializedName("PrimaryImage")
    private String PrimaryImage = "";
    @SerializedName("DefaultTotalMinutes")
    private int DefaultTotalMinutes;
    @SerializedName("DefaultActiveMinutes")
    private int DefaultActiveMinutes;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getParentID() {
        return ParentID;
    }

    public void setParentID(int ParentID) {
        this.ParentID = ParentID;
    }

    public String getShortDescription() {
        return ShortDescription;
    }

    public void setShortDescription(String ShortDescription) {
        this.ShortDescription = ShortDescription;
    }

    public String getPrimaryImage() {
        return  PrimaryImage;
    }

    public void setPrimaryImage(String PrimaryImage) {
        this.PrimaryImage = PrimaryImage;
    }

    public int getDefaultTotalMinutes() {
        return DefaultTotalMinutes;
    }

    public void setDefaultTotalMinutes(int DefaultTotalMinutes) {
        this.DefaultTotalMinutes = DefaultTotalMinutes;
    }

    public int getDefaultActiveMinutes() {
        return DefaultActiveMinutes;
    }

    public void setDefaultActiveMinutes(int DefaultActiveMinutes) {
        this.DefaultActiveMinutes = DefaultActiveMinutes;
    }
}
