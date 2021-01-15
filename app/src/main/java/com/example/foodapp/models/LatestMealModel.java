package com.example.foodapp.models;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LatestMealModel {


  /**
   * ResultCount : 976285
   * Results : [{"RecipeID":24151,"Title":"Traditional Roll Dough","Cuisine":"American","Category":"Bread","Subcategory":"Rolls and Buns","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/traditional-roll-dough/24151","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":12,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":105147,"Title":"Latvian Herring Salad","Cuisine":"American","Category":"Salad","Subcategory":"Meat and Seafood","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/latvian-herring-salad/105147","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":8,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":548004,"Title":"Roxanne's Chicken Enchiladas","Cuisine":"","Category":"Main Dish","Subcategory":"Tacos, Burritos and Enchiladas","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/roxannes-chicken-enchiladas/548004","ReviewCount":0,"Poster":{"UserName":"JacqueSchmidt","UserID":2043501,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":8,"CreationDate":"2013-06-10T11:40:05.590Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":560963,"Title":"M&M's meatballs","Cuisine":"Italian","Category":"Main Dish","Subcategory":"Pasta","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/mms-meatballs/560963","ReviewCount":0,"Poster":{"UserName":"MeghanDiamond","UserID":1661853,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":5,"CreationDate":"2013-06-26T18:08:35.480Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":39673,"Title":"Red Curry Cambogee","Cuisine":"American","Category":"Marinades and Sauces","Subcategory":"Marinade","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/red-curry-cambogee/39673","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":20,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":2678986,"Title":"The Ultimate Smoked Turkey Recipe","Cuisine":"","Category":"","Subcategory":"","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/the-ultimate-smoked-turkey-recipe/2678986","ReviewCount":0,"Poster":{"UserName":"amazingribs","UserID":3089339,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":1,"CreationDate":"2020-11-13T05:39:14.243Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":1,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":2381079,"Title":"No-Bake Peanut Butter Protein Cookies","Cuisine":"","Category":"Other","Subcategory":"Other - Misc","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/no-bake-peanut-butter-protein-cookies/2381079","ReviewCount":0,"Poster":{"UserName":"sarahbowles","UserID":3758276,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/sarahbowles.jpg"},"IsPrivate":false,"Servings":1,"CreationDate":"2019-03-31T20:40:41.247Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":265237,"Title":"6 Layer Dip","Cuisine":"American","Category":"Appetizers","Subcategory":"Dips and Spreads","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/6-layer-dip/265237","ReviewCount":0,"Poster":{"UserName":"sfhibbs","UserID":95158,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":10,"CreationDate":"2012-04-09T15:22:22.303Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":130858,"Title":"Roasted Red Pepper Soup","Cuisine":"American","Category":"Soups, Stews and Chili","Subcategory":"Cream-style Soups","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/roasted-red-pepper-soup/130858","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":8,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":1262098,"Title":"No Fat Or Sugar Scones","Cuisine":null,"Category":"Desserts","Subcategory":"Candies","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/no-fat-or-sugar-scones/1262098","ReviewCount":0,"Poster":{"UserName":"fredkellyr2i9","UserID":2853643,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":8,"CreationDate":"2015-08-20T21:36:25.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":82954,"Title":"Ensalada De Papa (Cuban Potato Salad)","Cuisine":"American","Category":"Salad","Subcategory":"Potato Salads","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/ensalada-de-papa-cuban-potato-salad/82954","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":6,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":111894,"Title":"Mini Pate a Choux Fillings","Cuisine":"American","Category":"Appetizers","Subcategory":"Seafood","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/mini-pate-a-choux-fillings/111894","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":40,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":151908,"Title":"Bilberry Crumble Cake","Cuisine":"American","Category":"Desserts","Subcategory":"Cakes","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/bilberry-crumble-cake/151908","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":1,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":376592,"Title":"Hot and Spicy Sausage Soup","Cuisine":"","Category":"Soups, Stews and Chili","Subcategory":"Meat and Poultry","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/hot-and-spicy-sausage-soup/376592","ReviewCount":0,"Poster":{"UserName":"shannonacree","UserID":1772306,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/shannonacree.jpg"},"IsPrivate":false,"Servings":1,"CreationDate":"2012-11-17T21:47:24.573Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":1,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":1291306,"Title":"Double Cheeseburger by NANA","Cuisine":"American","Category":"Main Dish","Subcategory":"Burgers","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/double-cheeseburger-by-nana/1291306","ReviewCount":0,"Poster":{"UserName":"bliston","UserID":1992724,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":4,"CreationDate":"2015-09-25T12:50:55.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":2535140,"Title":"Keto Blackberry or Blueberry Bars","Cuisine":"","Category":"","Subcategory":"","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/keto-blackberry-or-blueberry-bars/2535140","ReviewCount":0,"Poster":{"UserName":"moreefd","UserID":1450529,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/moreefd.jpg"},"IsPrivate":false,"Servings":1,"CreationDate":"2020-01-31T16:46:31.797Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":1322545,"Title":"Curried Chicken with Peas (crock-pot freezer meal)","Cuisine":"American","Category":"Main Dish","Subcategory":"Poultry - Chicken","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/curried-chicken-with-peas-crock-pot-freezer-meal/1322545","ReviewCount":0,"Poster":{"UserName":"bkprice13","UserID":56666,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/bkprice13.jpg"},"IsPrivate":false,"Servings":0,"CreationDate":"2015-11-09T00:16:20.663Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":1,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":112172,"Title":"Miso Pesto Pasta","Cuisine":"American","Category":"Main Dish","Subcategory":"Pasta","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/miso-pesto-pasta/112172","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":5,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":116661,"Title":"Oat Date Nut Bread","Cuisine":"American","Category":"Bread","Subcategory":"Fruit Bread","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/oat-date-nut-bread/116661","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":12,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":2679133,"Title":"Vegetarian Skillet Chili With Eggs and Cheddar","Cuisine":"","Category":"Main Dish","Subcategory":"Meatless","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/vegetarian-skillet-chili-with-eggs-and-cheddar/2679133","ReviewCount":0,"Poster":{"UserName":"cookingrecipes","UserID":2787696,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":4,"CreationDate":"2020-11-13T19:06:32.080Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":1,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/vegetarian-skillet-chili-with--ebe3dd.jpg","HasVideos":false},{"RecipeID":89478,"Title":"Garlic Cheese Potato Bake","Cuisine":"American","Category":"Side Dish","Subcategory":"Potatoes","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/garlic-cheese-potato-bake/89478","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":4,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":1,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":133106,"Title":"Pickled Squab Pigeon with Walnut Oil","Cuisine":"American","Category":"Main Dish","Subcategory":"Poultry - Other","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/pickled-squab-pigeon-with-walnut-oil/133106","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":1,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":126698,"Title":"Stir-Fry Chicken Szechuan Style","Cuisine":"Chinese","Category":"Main Dish","Subcategory":"Stir-Fries","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/stir-fry-chicken-szechuan-style/126698","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":4,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":1,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":2603759,"Title":"Angry beans by Jamie Olivet","Cuisine":"","Category":"","Subcategory":"","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/angry-beans-by-jamie-olivet/2603759","ReviewCount":0,"Poster":{"UserName":"Thaifan","UserID":452879,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":1,"CreationDate":"2020-05-23T15:40:08.793Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":21061,"Title":"Twice-Baked Ratatouille-Stuffed Potatoes","Cuisine":"American","Category":"Side Dish","Subcategory":"Potatoes","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/twice-baked-ratatouille-stuffed-potatoes/21061","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":4,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":1,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false}]
   * SpellSuggest : null
   */

  @SerializedName("ResultCount")
  private int ResultCount;
  @SerializedName("SpellSuggest")
  private Object SpellSuggest;
  @SerializedName("Results")
  private List<ResultsBean> Results;

  public int getResultCount() {
    return ResultCount;
  }

  public void setResultCount(int ResultCount) {
    this.ResultCount = ResultCount;
  }

  public Object getSpellSuggest() {
    return SpellSuggest;
  }

  public void setSpellSuggest(Object SpellSuggest) {
    this.SpellSuggest = SpellSuggest;
  }

  public List<ResultsBean> getResults() {
    return Results;
  }

  public void setResults(List<ResultsBean> Results) {
    this.Results = Results;
  }

  public static class ResultsBean {
    /**
     * RecipeID : 24151
     * Title : Traditional Roll Dough
     * Cuisine : American
     * Category : Bread
     * Subcategory : Rolls and Buns
     * Microcategory :
     * StarRating : 0
     * WebURL : https://www.bigoven.com/recipe/traditional-roll-dough/24151
     * ReviewCount : 0
     * Poster : null
     * IsPrivate : false
     * Servings : 12
     * CreationDate : 2004-01-01T00:00:00.000Z
     * IsRecipeScan : false
     * IsBookmark : false
     * TotalTries : 0
     * PhotoUrl : https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg
     * HasVideos : false
     */

    @SerializedName("RecipeID")
    private int RecipeID;
    @SerializedName("Title")
    private String Title;
    @SerializedName("Cuisine")
    private String Cuisine;
    @SerializedName("Category")
    private String Category;
    @SerializedName("Subcategory")
    private String Subcategory;
    @SerializedName("Microcategory")
    private String Microcategory;
    @SerializedName("StarRating")
    private int StarRating;
    @SerializedName("WebURL")
    private String WebURL;
    @SerializedName("ReviewCount")
    private int ReviewCount;
    @SerializedName("Poster")
    private Object Poster;
    @SerializedName("IsPrivate")
    private boolean IsPrivate;
    @SerializedName("Servings")
    private int Servings;
    @SerializedName("CreationDate")
    private String CreationDate;
    @SerializedName("IsRecipeScan")
    private boolean IsRecipeScan;
    @SerializedName("IsBookmark")
    private boolean IsBookmark;
    @SerializedName("TotalTries")
    private int TotalTries;
    @SerializedName("PhotoUrl")
    private String PhotoUrl;
    @SerializedName("HasVideos")
    private boolean HasVideos;

    public int getRecipeID() {
      return RecipeID;
    }

    public void setRecipeID(int RecipeID) {
      this.RecipeID = RecipeID;
    }

    public String getTitle() {
      return Title;
    }

    public void setTitle(String Title) {
      this.Title = Title;
    }

    public String getCuisine() {
      return Cuisine;
    }

    public void setCuisine(String Cuisine) {
      this.Cuisine = Cuisine;
    }

    public String getCategory() {
      return Category;
    }

    public void setCategory(String Category) {
      this.Category = Category;
    }

    public String getSubcategory() {
      return Subcategory;
    }

    public void setSubcategory(String Subcategory) {
      this.Subcategory = Subcategory;
    }

    public String getMicrocategory() {
      return Microcategory;
    }

    public void setMicrocategory(String Microcategory) {
      this.Microcategory = Microcategory;
    }

    public int getStarRating() {
      return StarRating;
    }

    public void setStarRating(int StarRating) {
      this.StarRating = StarRating;
    }

    public String getWebURL() {
      return WebURL;
    }

    public void setWebURL(String WebURL) {
      this.WebURL = WebURL;
    }

    public int getReviewCount() {
      return ReviewCount;
    }

    public void setReviewCount(int ReviewCount) {
      this.ReviewCount = ReviewCount;
    }

    public Object getPoster() {
      return Poster;
    }

    public void setPoster(Object Poster) {
      this.Poster = Poster;
    }

    public boolean isIsPrivate() {
      return IsPrivate;
    }

    public void setIsPrivate(boolean IsPrivate) {
      this.IsPrivate = IsPrivate;
    }

    public int getServings() {
      return Servings;
    }

    public void setServings(int Servings) {
      this.Servings = Servings;
    }

    public String getCreationDate() {
      return CreationDate;
    }

    public void setCreationDate(String CreationDate) {
      this.CreationDate = CreationDate;
    }

    public boolean isIsRecipeScan() {
      return IsRecipeScan;
    }

    public void setIsRecipeScan(boolean IsRecipeScan) {
      this.IsRecipeScan = IsRecipeScan;
    }

    public boolean isIsBookmark() {
      return IsBookmark;
    }

    public void setIsBookmark(boolean IsBookmark) {
      this.IsBookmark = IsBookmark;
    }

    public int getTotalTries() {
      return TotalTries;
    }

    public void setTotalTries(int TotalTries) {
      this.TotalTries = TotalTries;
    }

    public String getPhotoUrl() {
      return PhotoUrl;
    }

    public void setPhotoUrl(String PhotoUrl) {
      this.PhotoUrl = PhotoUrl;
    }

    public boolean isHasVideos() {
      return HasVideos;
    }

    public void setHasVideos(boolean HasVideos) {
      this.HasVideos = HasVideos;
    }
  }
}
