package com.example.foodapp.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemsFromCategoryModel {


    /**
     * ResultCount : 41748
     * Results : [{"RecipeID":1962892,"Title":"Spicy Roasted Potato Salad","Cuisine":"American","Category":"Salad","Subcategory":"Potato Salads","Microcategory":"","StarRating":5,"WebURL":"https://www.bigoven.com/recipe/spicy-roasted-potato-salad/1962892","ReviewCount":1,"Poster":{"UserName":"EgglandsBestEggs","UserID":3882933,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/egglandsbesteggs=35f938.jpg"},"IsPrivate":false,"Servings":10,"CreationDate":"2017-06-14T17:41:35.403Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":252,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/spicy-roasted-potato-salad-44b1d8.jpg","HasVideos":false},{"RecipeID":1629231,"Title":"Southern Potato Salad","Cuisine":"Southern","Category":"Salad","Subcategory":"Potato Salads","Microcategory":"","StarRating":3.5,"WebURL":"https://www.bigoven.com/recipe/southern-potato-salad/1629231","ReviewCount":6,"Poster":{"UserName":"BluePlateMayonnaise","UserID":3262557,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/blueplatemayo=922e1f.jpg"},"IsPrivate":false,"Servings":6,"CreationDate":"2016-05-09T23:44:19.800Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":639,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/southern-potato-salad-85f2fa.jpg","HasVideos":false},{"RecipeID":1629636,"Title":"Bacon Potato Salad","Cuisine":"American","Category":"Salad","Subcategory":"Potato Salads","Microcategory":"","StarRating":4.5,"WebURL":"https://www.bigoven.com/recipe/bacon-potato-salad/1629636","ReviewCount":4,"Poster":{"UserName":"BluePlateMayonnaise","UserID":3262557,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/blueplatemayo=922e1f.jpg"},"IsPrivate":false,"Servings":6,"CreationDate":"2016-05-10T20:16:53.030Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":347,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/bacon-potato-salad-5965cf.jpg","HasVideos":false},{"RecipeID":157535,"Title":"Caesar Salad","Cuisine":"American","Category":"Salad","Subcategory":"Green Salads","Microcategory":"","StarRating":4.647058823529412,"WebURL":"https://www.bigoven.com/recipe/caesar-salad/157535","ReviewCount":51,"Poster":{"UserName":"stevemur","UserID":29,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/stevemur.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2004-10-04T17:17:29.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":552,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/caesar-salad-ala-steve-3.jpg","HasVideos":false},{"RecipeID":1626259,"Title":"Charred Broccoli Salad","Cuisine":"Greek","Category":"Salad","Subcategory":"Vegetable Salads","Microcategory":"","StarRating":4,"WebURL":"https://www.bigoven.com/recipe/charred-broccoli-salad/1626259","ReviewCount":1,"Poster":{"UserName":"BluePlateMayonnaise","UserID":3262557,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/blueplatemayo=922e1f.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2016-05-04T23:20:19.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":187,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/charred-broccoli-salad-a82d2c.jpg","HasVideos":false},{"RecipeID":432218,"Title":"Pistachio Cinnamon Chicken Salad","Cuisine":null,"Category":"Salad","Subcategory":"Meat and Seafood","Microcategory":"","StarRating":4,"WebURL":"https://www.bigoven.com/recipe/pistachio-cinnamon-chicken-salad/432218","ReviewCount":6,"Poster":{"UserName":"darrinrich","UserID":1721301,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/hwdnrvpumeatheya2mfj.jpg"},"IsPrivate":false,"Servings":6,"CreationDate":"2013-01-23T16:30:26.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":1164,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/pistachio-cinnamon-chicken-salad.jpg","HasVideos":false},{"RecipeID":1117253,"Title":"Asian Potato Salad","Cuisine":"Asian","Category":"Salad","Subcategory":"Potato Salads","Microcategory":"","StarRating":3,"WebURL":"https://www.bigoven.com/recipe/asian-potato-salad/1117253","ReviewCount":1,"Poster":{"UserName":"USPotatoBoardRecipes","UserID":2738059,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/dw4neywlzbemd5taaqkz.png"},"IsPrivate":false,"Servings":8,"CreationDate":"2015-02-12T13:09:22.687Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":112,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/asian-potato-salad-7.jpg","HasVideos":false},{"RecipeID":1732105,"Title":"Couscous & Shrimp Salad with Garlic Dressing","Cuisine":"American","Category":"Salad","Subcategory":"Grains","Microcategory":"","StarRating":4,"WebURL":"https://www.bigoven.com/recipe/couscous-shrimp-salad-with-garlic-dressing/1732105","ReviewCount":1,"Poster":{"UserName":"RiceSelect","UserID":1928683,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/riceselect=a5a68d.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2016-08-24T21:56:03.990Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":66,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/couscous-shrimp-salad-with-gar-06ac81.jpg","HasVideos":false},{"RecipeID":1116587,"Title":"Roasted Fingerling Potato Salad with Lemon and Thyme","Cuisine":"American","Category":"Salad","Subcategory":"Potato Salads","Microcategory":"","StarRating":4.166666666666667,"WebURL":"https://www.bigoven.com/recipe/roasted-fingerling-potato-salad-with-lemon-and-thyme/1116587","ReviewCount":6,"Poster":{"UserName":"USPotatoBoardRecipes","UserID":2738059,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/dw4neywlzbemd5taaqkz.png"},"IsPrivate":false,"Servings":6,"CreationDate":"2015-02-11T17:30:38.853Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":339,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/roasted-fingerling-potato-salad-wit.jpg","HasVideos":false},{"RecipeID":848204,"Title":"Healthy Egg Salad","Cuisine":"American","Category":"Salad","Subcategory":"Egg Salads","Microcategory":"","StarRating":3.8,"WebURL":"https://www.bigoven.com/recipe/healthy-egg-salad/848204","ReviewCount":5,"Poster":{"UserName":"ees55","UserID":2033008,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/ees55.jpg"},"IsPrivate":false,"Servings":1,"CreationDate":"2014-04-16T21:02:03.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":916,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/healthy-egg-salad-f83e14.jpg","HasVideos":false},{"RecipeID":1626185,"Title":"Strawberry Couscous Summer Salad","Cuisine":"American","Category":"Salad","Subcategory":"Salads - Other","Microcategory":"","StarRating":4.666666666666667,"WebURL":"https://www.bigoven.com/recipe/strawberry-couscous-summer-salad/1626185","ReviewCount":3,"Poster":{"UserName":"RiceSelect","UserID":1928683,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/riceselect=a5a68d.jpg"},"IsPrivate":false,"Servings":2,"CreationDate":"2016-05-04T20:43:44.807Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":262,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/strawberry-couscous-summer-sal-0fec94.jpg","HasVideos":false},{"RecipeID":1917928,"Title":"Panzanella Bread Salad","Cuisine":"Mediterranean","Category":"Salad","Subcategory":"Salads - Other","Microcategory":"","StarRating":5,"WebURL":"https://www.bigoven.com/recipe/panzanella-bread-salad/1917928","ReviewCount":2,"Poster":{"UserName":"NatureSweet","UserID":3902379,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/naturesweettomatoes=3019f1.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2017-03-29T18:36:28.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":70,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/panzanella-bread-salad-eebf23.jpg","HasVideos":false},{"RecipeID":1579898,"Title":"Pea & Carrot Salad with Carrot Top Pesto","Cuisine":null,"Category":"Salad","Subcategory":"Vegetable Salads","Microcategory":"","StarRating":4,"WebURL":"https://www.bigoven.com/recipe/pea-carrot-salad-with-carrot-top-pesto/1579898","ReviewCount":1,"Poster":{"UserName":"halfbakedharvestrecipes","UserID":2782649,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/halfbakedharvestrecipes.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2016-03-24T13:03:53.000Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":112,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/spring-pea-and-carrot-salad-wi-07fa01.jpg","HasVideos":false},{"RecipeID":1200513,"Title":"Blackened Shrimp, Asparagus & Avocado Salad w/ Lemon Pepper Yogurt Dressing","Cuisine":null,"Category":"Salad","Subcategory":"Meat and Seafood","Microcategory":"","StarRating":3.8333333333333335,"WebURL":"https://www.bigoven.com/recipe/blackened-shrimp-asparagus-avocado-salad-w-lemon-pepper-yogurt-dressing/1200513","ReviewCount":6,"Poster":{"UserName":"cafedelitesrecipes","UserID":2786099,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/cafedelitesrecipes.jpg"},"IsPrivate":false,"Servings":2,"CreationDate":"2015-05-18T22:56:15.000Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":510,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/blackenedshrimpasparagusandavo-d52254.jpg","HasVideos":false},{"RecipeID":165580,"Title":"Poached Egg On Spinach, Warm Dressing","Cuisine":"American","Category":"Salad","Subcategory":"Green Salads","Microcategory":"","StarRating":4.571428571428571,"WebURL":"https://www.bigoven.com/recipe/poached-egg-on-spinach-warm-dressing/165580","ReviewCount":7,"Poster":{"UserName":"laurence","UserID":96524,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/05050801573596524.jpg"},"IsPrivate":false,"Servings":2,"CreationDate":"2008-06-01T02:45:23.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":529,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/poached-egg-on-spinach-warm-dr-926ccf.jpg","HasVideos":false},{"RecipeID":64844,"Title":"Spinach and Strawberry Salad with Pepper Vinaigrette","Cuisine":"American","Category":"Salad","Subcategory":"Vegetable Salads","Microcategory":"","StarRating":4.722222222222222,"WebURL":"https://www.bigoven.com/recipe/spinach-and-strawberry-salad-with-pepper-vinaigrette/64844","ReviewCount":18,"Poster":null,"IsPrivate":false,"Servings":4,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":987,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/spinach-and-strawberry-salad-with-p-5.jpg","HasVideos":false},{"RecipeID":1630203,"Title":"Tomato Salad with Remoulade Sauce","Cuisine":"American","Category":"Salad","Subcategory":"Fruit Salads","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/tomato-salad-with-remoulade-sauce/1630203","ReviewCount":0,"Poster":{"UserName":"BluePlateMayonnaise","UserID":3262557,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/blueplatemayo=922e1f.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2016-05-11T19:05:32.730Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":74,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/tomato-salad-with-remoulade-sa-34b486.jpg","HasVideos":false},{"RecipeID":1769404,"Title":"Fall Harvest Quinoa Salad","Cuisine":null,"Category":"Salad","Subcategory":"Grains","Microcategory":"","StarRating":4.4,"WebURL":"https://www.bigoven.com/recipe/fall-harvest-quinoa-salad/1769404","ReviewCount":5,"Poster":{"UserName":"halfbakedharvestrecipes","UserID":2782649,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/halfbakedharvestrecipes.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2016-10-06T23:58:41.000Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":188,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/fall-harvest-quinoa-salad-1769404.jpg","HasVideos":false},{"RecipeID":641677,"Title":"Spinach Pomegranate Salad With Pears and Hazelnuts","Cuisine":null,"Category":"Salad","Subcategory":"Green Salads","Microcategory":"","StarRating":4,"WebURL":"https://www.bigoven.com/recipe/spinach-pomegranate-salad-with-pears-and-hazelnuts/641677","ReviewCount":1,"Poster":{"UserName":"MyRecipesRecipes","UserID":2057269,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/myrecipesrecipes.jpg"},"IsPrivate":false,"Servings":6,"CreationDate":"2013-09-20T21:39:20.000Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":366,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/spinach-pomegranate-salad-with-pear-2.jpg","HasVideos":false},{"RecipeID":1363382,"Title":"Maple-Roasted Beet and Carrot Spinach Salad","Cuisine":null,"Category":"Salad","Subcategory":"Vegetable Salads","Microcategory":"","StarRating":4,"WebURL":"https://www.bigoven.com/recipe/maple-roasted-beet-and-carrot-spinach-salad/1363382","ReviewCount":2,"Poster":{"UserName":"wholeandheavenlyovenrecipes","UserID":2800493,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/wholeandheavenlyovenrecipes=a0c453.jpg"},"IsPrivate":false,"Servings":6,"CreationDate":"2016-01-02T16:14:46.000Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":388,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/maple-roasted-beet-and-carrot-spinach-salad-1363382.jpg","HasVideos":false},{"RecipeID":572571,"Title":"Spinach, Apple and Pecan Salad","Cuisine":"American","Category":"Salad","Subcategory":"Green Salads","Microcategory":"","StarRating":4.52,"WebURL":"https://www.bigoven.com/recipe/spinach-apple-and-pecan-salad/572571","ReviewCount":25,"Poster":{"UserName":"FoodWebRecipes","UserID":2091204,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/foodwebrecipes.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2013-07-10T17:51:08.000Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":2276,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/spinach-apple-and-pecan-salad-2.jpg","HasVideos":false},{"RecipeID":183592,"Title":"Spicy Quinoa, Cucumber & Tomato Salad","Cuisine":"American","Category":"Salad","Subcategory":"Grains","Microcategory":"","StarRating":4.129032258064516,"WebURL":"https://www.bigoven.com/recipe/spicy-quinoa-cucumber-tomato-salad/183592","ReviewCount":31,"Poster":{"UserName":"tchocoatl","UserID":578051,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/thekevinjohnson.jpg"},"IsPrivate":false,"Servings":6,"CreationDate":"2010-07-14T19:54:52.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":2312,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/spicy-quinoa-cucumber-and-toma-c86daf.jpg","HasVideos":false},{"RecipeID":1240364,"Title":"Chicken Watermelon Salad","Cuisine":"American","Category":"Salad","Subcategory":"Fruit Salads","Microcategory":"","StarRating":4.5,"WebURL":"https://www.bigoven.com/recipe/chicken-watermelon-salad/1240364","ReviewCount":4,"Poster":{"UserName":"glutenfreeyummsrecipes","UserID":2799619,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/glutenfreeyummsrecipes.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2015-07-21T23:09:40.000Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":653,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/chicken-watermelon-salad-fae203.jpg","HasVideos":false},{"RecipeID":169874,"Title":"Fresh Made Caesar Salad","Cuisine":"American","Category":"Salad","Subcategory":"Green Salads","Microcategory":"","StarRating":4.416666666666667,"WebURL":"https://www.bigoven.com/recipe/fresh-made-caesar-salad/169874","ReviewCount":12,"Poster":{"UserName":"cncmike","UserID":333680,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/190109110222333680.jpg"},"IsPrivate":false,"Servings":6,"CreationDate":"2009-01-26T13:34:44.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":1190,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/fresh-made-ceasar-salad-3.jpg","HasVideos":false},{"RecipeID":121357,"Title":"Pasta with Sugar Snap Peas, Asparagus and Parmesan","Cuisine":"American","Category":"Salad","Subcategory":"Pasta Salads","Microcategory":"","StarRating":4.153846153846154,"WebURL":"https://www.bigoven.com/recipe/pasta-with-sugar-snap-peas-asparagus-and-parmesan/121357","ReviewCount":13,"Poster":null,"IsPrivate":false,"Servings":4,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":1508,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/pasta-with-sugar-snap-peas-asparagu-a.jpg","HasVideos":false}]
     * SpellSuggest : null
     */

    @SerializedName("ResultCount")
    private int ResultCount;
    @SerializedName("Results")
    private List<ResultsBean> Results;
    @SerializedName("SpellSuggest")
    private Object SpellSuggest;

    public int getResultCount() {
        return ResultCount;
    }

    public void setResultCount(int ResultCount) {
        this.ResultCount = ResultCount;
    }

    public List<ResultsBean> getResults() {
        return Results;
    }

    public void setResults(List<ResultsBean> Results) {
        this.Results = Results;
    }

    public Object getSpellSuggest() {
        return SpellSuggest;
    }

    public void setSpellSuggest(Object SpellSuggest) {
        this.SpellSuggest = SpellSuggest;
    }

    public static class ResultsBean {
        /**
         * RecipeID : 1962892
         * Title : Spicy Roasted Potato Salad
         * Cuisine : American
         * Category : Salad
         * Subcategory : Potato Salads
         * Microcategory :
         * StarRating : 5
         * WebURL : https://www.bigoven.com/recipe/spicy-roasted-potato-salad/1962892
         * ReviewCount : 1
         * Poster : {"UserName":"EgglandsBestEggs","UserID":3882933,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/egglandsbesteggs=35f938.jpg"}
         * IsPrivate : false
         * Servings : 10
         * CreationDate : 2017-06-14T17:41:35.403Z
         * IsRecipeScan : false
         * IsBookmark : false
         * TotalTries : 252
         * PhotoUrl : https://photos.bigoven.com/recipe/hero/spicy-roasted-potato-salad-44b1d8.jpg
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
        private float StarRating;
        @SerializedName("WebURL")
        private String WebURL;
        @SerializedName("ReviewCount")
        private int ReviewCount;
        @SerializedName("Poster")
        private PosterBean Poster;
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

        public float getStarRating() {
            return StarRating;
        }

        public void setStarRating(float StarRating) {
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

        public PosterBean getPoster() {
            return Poster;
        }

        public void setPoster(PosterBean Poster) {
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

        public static class PosterBean {
            /**
             * UserName : EgglandsBestEggs
             * UserID : 3882933
             * FirstName : null
             * LastName : null
             * PhotoUrl : https://photos.bigoven.com/avatar/photo/egglandsbesteggs=35f938.jpg
             */

            @SerializedName("UserName")
            private String UserName;
            @SerializedName("UserID")
            private int UserID;
            @SerializedName("FirstName")
            private Object FirstName;
            @SerializedName("LastName")
            private Object LastName;
            @SerializedName("PhotoUrl")
            private String PhotoUrl;

            public String getUserName() {
                return UserName;
            }

            public void setUserName(String UserName) {
                this.UserName = UserName;
            }

            public int getUserID() {
                return UserID;
            }

            public void setUserID(int UserID) {
                this.UserID = UserID;
            }

            public Object getFirstName() {
                return FirstName;
            }

            public void setFirstName(Object FirstName) {
                this.FirstName = FirstName;
            }

            public Object getLastName() {
                return LastName;
            }

            public void setLastName(Object LastName) {
                this.LastName = LastName;
            }

            public String getPhotoUrl() {
                return PhotoUrl;
            }

            public void setPhotoUrl(String PhotoUrl) {
                this.PhotoUrl = PhotoUrl;
            }
        }
    }
}
