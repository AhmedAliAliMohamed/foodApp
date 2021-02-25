package com.example.foodapp.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemsFromCategoryModel {

    /**
     * ResultCount : 74698
     * Results : [{"RecipeID":1962892,"Title":"Spicy Roasted Potato Salad","Cuisine":"American","Category":"Salad","Subcategory":"Potato Salads","Microcategory":"","StarRating":5,"WebURL":"https://www.bigoven.com/recipe/spicy-roasted-potato-salad/1962892","ReviewCount":1,"Poster":{"UserName":"EgglandsBestEggs","UserID":3882933,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/egglandsbesteggs=35f938.jpg"},"IsPrivate":false,"Servings":10,"CreationDate":"2017-06-14T17:41:35.403Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":252,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/spicy-roasted-potato-salad-44b1d8.jpg","HasVideos":false},{"RecipeID":157535,"Title":"Caesar Salad","Cuisine":"American","Category":"Salad","Subcategory":"Green Salads","Microcategory":"","StarRating":4.647058823529412,"WebURL":"https://www.bigoven.com/recipe/caesar-salad/157535","ReviewCount":51,"Poster":{"UserName":"stevemur","UserID":29,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/stevemur.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2004-10-04T17:17:29.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":552,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/caesar-salad-ala-steve-3.jpg","HasVideos":false},{"RecipeID":1629636,"Title":"Bacon Potato Salad","Cuisine":"American","Category":"Salad","Subcategory":"Potato Salads","Microcategory":"","StarRating":4.5,"WebURL":"https://www.bigoven.com/recipe/bacon-potato-salad/1629636","ReviewCount":4,"Poster":{"UserName":"BluePlateMayonnaise","UserID":3262557,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/blueplatemayo=922e1f.jpg"},"IsPrivate":false,"Servings":6,"CreationDate":"2016-05-10T20:16:53.030Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":347,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/bacon-potato-salad-5965cf.jpg","HasVideos":false},{"RecipeID":1629231,"Title":"Southern Potato Salad","Cuisine":"Southern","Category":"Salad","Subcategory":"Potato Salads","Microcategory":"","StarRating":3.5,"WebURL":"https://www.bigoven.com/recipe/southern-potato-salad/1629231","ReviewCount":6,"Poster":{"UserName":"BluePlateMayonnaise","UserID":3262557,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/blueplatemayo=922e1f.jpg"},"IsPrivate":false,"Servings":6,"CreationDate":"2016-05-09T23:44:19.800Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":638,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/southern-potato-salad-85f2fa.jpg","HasVideos":false},{"RecipeID":1626259,"Title":"Charred Broccoli Salad","Cuisine":"Greek","Category":"Salad","Subcategory":"Vegetable Salads","Microcategory":"","StarRating":4,"WebURL":"https://www.bigoven.com/recipe/charred-broccoli-salad/1626259","ReviewCount":1,"Poster":{"UserName":"BluePlateMayonnaise","UserID":3262557,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/blueplatemayo=922e1f.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2016-05-04T23:20:19.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":186,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/charred-broccoli-salad-a82d2c.jpg","HasVideos":false},{"RecipeID":1117253,"Title":"Asian Potato Salad","Cuisine":"Asian","Category":"Salad","Subcategory":"Potato Salads","Microcategory":"","StarRating":3,"WebURL":"https://www.bigoven.com/recipe/asian-potato-salad/1117253","ReviewCount":1,"Poster":{"UserName":"USPotatoBoardRecipes","UserID":2738059,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/dw4neywlzbemd5taaqkz.png"},"IsPrivate":false,"Servings":8,"CreationDate":"2015-02-12T13:09:22.687Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":112,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/asian-potato-salad-7.jpg","HasVideos":false},{"RecipeID":848204,"Title":"Healthy Egg Salad","Cuisine":"American","Category":"Salad","Subcategory":"Egg Salads","Microcategory":"","StarRating":3.8,"WebURL":"https://www.bigoven.com/recipe/healthy-egg-salad/848204","ReviewCount":5,"Poster":{"UserName":"ees55","UserID":2033008,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/ees55.jpg"},"IsPrivate":false,"Servings":1,"CreationDate":"2014-04-16T21:02:03.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":916,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/healthy-egg-salad-f83e14.jpg","HasVideos":false},{"RecipeID":632640,"Title":"Bug Salad","Cuisine":null,"Category":"Salad","Subcategory":"Green Salads","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/bug-salad/632640","ReviewCount":0,"Poster":{"UserName":"MyRecipesRecipes","UserID":2057269,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/myrecipesrecipes.jpg"},"IsPrivate":false,"Servings":8,"CreationDate":"2013-09-10T17:47:24.000Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":76,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/bug-salad-2.jpg","HasVideos":false},{"RecipeID":177172,"Title":"Salad: Beet & Walnut Salad","Cuisine":"American","Category":"Salad","Subcategory":"Vegetable Salads","Microcategory":"","StarRating":4.66666666666667,"WebURL":"https://www.bigoven.com/recipe/salad-beet-walnut-salad/177172","ReviewCount":3,"Poster":{"UserName":"katehandel","UserID":58067,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/katehandel.jpg"},"IsPrivate":false,"Servings":8,"CreationDate":"2009-12-22T00:13:49.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":240,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/salad-beet-walnut-salad.jpg","HasVideos":false},{"RecipeID":1917928,"Title":"Panzanella Bread Salad","Cuisine":"Mediterranean","Category":"Salad","Subcategory":"Salads - Other","Microcategory":"","StarRating":5,"WebURL":"https://www.bigoven.com/recipe/panzanella-bread-salad/1917928","ReviewCount":2,"Poster":{"UserName":"NatureSweet","UserID":3902379,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/naturesweettomatoes=3019f1.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2017-03-29T18:36:28.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":69,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/panzanella-bread-salad-eebf23.jpg","HasVideos":false},{"RecipeID":194496,"Title":"Strawberry Chicken Salad Salad","Cuisine":"American","Category":"Salad","Subcategory":"Meat and Seafood","Microcategory":"","StarRating":4.75,"WebURL":"https://www.bigoven.com/recipe/strawberry-chicken-salad-salad/194496","ReviewCount":4,"Poster":{"UserName":"Loshebo","UserID":999668,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/loshebo.jpg"},"IsPrivate":false,"Servings":2,"CreationDate":"2011-03-29T17:45:06.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":135,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/strawberry-chicken-salad-salad-2.jpg","HasVideos":false},{"RecipeID":432218,"Title":"Pistachio Cinnamon Chicken Salad","Cuisine":null,"Category":"Salad","Subcategory":"Meat and Seafood","Microcategory":"","StarRating":4,"WebURL":"https://www.bigoven.com/recipe/pistachio-cinnamon-chicken-salad/432218","ReviewCount":6,"Poster":{"UserName":"darrinrich","UserID":1721301,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/hwdnrvpumeatheya2mfj.jpg"},"IsPrivate":false,"Servings":6,"CreationDate":"2013-01-23T16:30:26.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":1161,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/pistachio-cinnamon-chicken-salad.jpg","HasVideos":false},{"RecipeID":757584,"Title":"Salad","Cuisine":"","Category":"Salad","Subcategory":"Vegetable Salads","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/salad/757584","ReviewCount":0,"Poster":{"UserName":"havenbornhoft","UserID":2301131,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/havenbornhoft.jpg"},"IsPrivate":false,"Servings":1,"CreationDate":"2014-01-07T12:32:13.397Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":30,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/salad-2.jpg","HasVideos":false},{"RecipeID":891488,"Title":"Wedge Salad","Cuisine":"American","Category":"Salad","Subcategory":"Green Salads","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/wedge-salad/891488","ReviewCount":0,"Poster":{"UserName":"sfhibbs","UserID":95158,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":4,"CreationDate":"2014-06-27T15:08:24.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":341,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/wedge-salad-8.jpg","HasVideos":false},{"RecipeID":193565,"Title":"Linguine Salad","Cuisine":"American","Category":"Salad","Subcategory":"Pasta Salads","Microcategory":"","StarRating":3.5,"WebURL":"https://www.bigoven.com/recipe/linguine-salad/193565","ReviewCount":2,"Poster":{"UserName":"Loshebo","UserID":999668,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/loshebo.jpg"},"IsPrivate":false,"Servings":8,"CreationDate":"2011-03-14T12:28:09.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":115,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/linguine-salad.jpg","HasVideos":false},{"RecipeID":177894,"Title":"Ham Salad & Ham Salad Sandwich","Cuisine":"American","Category":"Main Dish","Subcategory":"Sandwiches and Wraps","Microcategory":"","StarRating":4,"WebURL":"https://www.bigoven.com/recipe/ham-salad-ham-salad-sandwich/177894","ReviewCount":1,"Poster":{"UserName":"ladybugplus","UserID":38013,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/26100603580238013.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2010-01-11T03:28:45.243Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":18,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/ham-salad-ham-salad-sandwich-2.jpg","HasVideos":false},{"RecipeID":588259,"Title":"Macaroni Salad","Cuisine":"American","Category":"Salad","Subcategory":"Pasta Salads","Microcategory":"","StarRating":5,"WebURL":"https://www.bigoven.com/recipe/macaroni-salad/588259","ReviewCount":1,"Poster":{"UserName":"SchmeerShirley","UserID":969428,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/schmeershirley.jpg"},"IsPrivate":false,"Servings":12,"CreationDate":"2013-07-26T14:29:07.640Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":27,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/macaroni-salad-16.jpg","HasVideos":false},{"RecipeID":196583,"Title":"Brocolli Salad","Cuisine":"American","Category":"Salad","Subcategory":"Vegetable Salads","Microcategory":"","StarRating":4.6,"WebURL":"https://www.bigoven.com/recipe/brocolli-salad/196583","ReviewCount":5,"Poster":{"UserName":"NancyGranade","UserID":34104,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/nancygranade.jpg"},"IsPrivate":false,"Servings":6,"CreationDate":"2011-04-18T18:35:03.780Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":202,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/brocolli-salad.jpg","HasVideos":false},{"RecipeID":188736,"Title":"Watermelon Salad","Cuisine":"Italian","Category":"Salad","Subcategory":"Fruit Salads","Microcategory":"","StarRating":3.6666666666666665,"WebURL":"https://www.bigoven.com/recipe/watermelon-salad/188736","ReviewCount":6,"Poster":{"UserName":"MamaJoRen","UserID":580076,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":6,"CreationDate":"2010-12-17T21:58:45.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":474,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/watermelon-salad-3.jpg","HasVideos":false},{"RecipeID":179533,"Title":"Salad - Antipasta","Cuisine":"Italian","Category":"Salad","Subcategory":"Vegetable Salads","Microcategory":"","StarRating":5,"WebURL":"https://www.bigoven.com/recipe/salad-antipasta/179533","ReviewCount":1,"Poster":{"UserName":"kimjorna","UserID":395847,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/kimjorna=5df68d.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2010-02-21T09:36:16.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":25,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/salad-antipasta-582e7f.jpg","HasVideos":false},{"RecipeID":168046,"Title":"Craisins Salad","Cuisine":"American","Category":"Salad","Subcategory":"Green Salads","Microcategory":"","StarRating":5,"WebURL":"https://www.bigoven.com/recipe/craisins-salad/168046","ReviewCount":2,"Poster":{"UserName":"WhiteRaven","UserID":158057,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/221008022939158057.jpg"},"IsPrivate":false,"Servings":12,"CreationDate":"2008-11-24T15:43:29.203Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":35,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/craisins-salad.jpg","HasVideos":false},{"RecipeID":159781,"Title":"Mushroom Salad","Cuisine":"Asian","Category":"Side Dish","Subcategory":"Grains","Microcategory":"","StarRating":4.25,"WebURL":"https://www.bigoven.com/recipe/mushroom-salad/159781","ReviewCount":4,"Poster":{"UserName":"cera82v","UserID":23034,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/15070909582623034.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2005-10-11T16:49:39.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":98,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/mushroom-salad-5.jpg","HasVideos":false},{"RecipeID":1111370,"Title":"Greek Salad","Cuisine":"Greek","Category":"Salad","Subcategory":"Green Salads","Microcategory":"","StarRating":4.5,"WebURL":"https://www.bigoven.com/recipe/greek-salad/1111370","ReviewCount":2,"Poster":{"UserName":"ees55","UserID":2033008,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/ees55.jpg"},"IsPrivate":false,"Servings":6,"CreationDate":"2015-02-07T21:36:01.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":156,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/greek-salad-371c37.jpg","HasVideos":false},{"RecipeID":92972,"Title":"Greek Salad","Cuisine":"Greek","Category":"Salad","Subcategory":"Green Salads","Microcategory":"","StarRating":4.14285714285714,"WebURL":"https://www.bigoven.com/recipe/greek-salad/92972","ReviewCount":7,"Poster":null,"IsPrivate":false,"Servings":4,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":103,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/greek-salad-6.jpg","HasVideos":false},{"RecipeID":658752,"Title":"Chicken Salad","Cuisine":null,"Category":"Salad","Subcategory":"Meat and Seafood","Microcategory":"","StarRating":3.8,"WebURL":"https://www.bigoven.com/recipe/chicken-salad/658752","ReviewCount":5,"Poster":null,"IsPrivate":false,"Servings":8,"CreationDate":"2013-10-09T23:39:26.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":353,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/chicken-salad-5158d5.jpg","HasVideos":false}]
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
        private int StarRating;
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
