package com.example.foodapp.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelSearch {

    /**
     * ResultCount : 20005
     * Results : [{"RecipeID":2620141,"Title":"Sausage stir fri","Cuisine":"","Category":"","Subcategory":"","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/sausage-stir-fri/2620141","ReviewCount":0,"Poster":{"UserName":"kasselin","UserID":4762423,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/kasselin.png"},"IsPrivate":false,"Servings":1,"CreationDate":"2020-06-25T23:39:38.430Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":266795,"Title":"Haitian Fried Chicken (Poul Fri)","Cuisine":"Haitian","Category":"Main Dish","Subcategory":"Poultry - Chicken","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/haitian-fried-chicken-poul-fri/266795","ReviewCount":0,"Poster":{"UserName":"unruhmissions","UserID":852279,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/unruhmissions=cb74ab.jpg"},"IsPrivate":false,"Servings":6,"CreationDate":"2012-04-13T18:05:29.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":7,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/haitian-fried-chicken-poul-fri.jpg","HasVideos":false},{"RecipeID":266776,"Title":"Haitian Fried Potatoes (Pomdetè Fri)","Cuisine":"Haitian","Category":"Side Dish","Subcategory":"French Fries","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/haitian-fried-potatoes-pomdet-fri/266776","ReviewCount":0,"Poster":{"UserName":"unruhmissions","UserID":852279,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/unruhmissions=cb74ab.jpg"},"IsPrivate":false,"Servings":6,"CreationDate":"2012-04-13T17:27:15.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":1,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/haitian-fried-potatoes-pomdete-fri.jpg","HasVideos":false},{"RecipeID":246346,"Title":"Low fat coconut friand fri(and/ors)","Cuisine":null,"Category":"Desserts","Subcategory":"Cakes","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/low-fat-coconut-friand-friandors/246346","ReviewCount":0,"Poster":{"UserName":"SassySW","UserID":46355,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/sassysw.jpg"},"IsPrivate":false,"Servings":12,"CreationDate":"2012-02-19T05:18:50.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":2,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/low-fat-coconut-friand-friandors.jpg","HasVideos":false},{"RecipeID":94058,"Title":"Grilled Frankfurter W/fri","Cuisine":"American","Category":"Main Dish","Subcategory":"Meat - Other","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/grilled-frankfurter-wfri/94058","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":100,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":87245,"Title":"Fri-Dinner- Exotic Green Salad","Cuisine":"American","Category":"Salad","Subcategory":"Vegetable Salads","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/fri-dinner-exotic-green-salad/87245","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":6,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":2539534,"Title":"Kyllingelår     (Ben- og Skind-fri)","Cuisine":null,"Category":"Main Dish","Subcategory":"Poultry - Chicken","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/kyllingelr-ben-og-skind-fri/2539534","ReviewCount":0,"Poster":{"UserName":"pvschilling","UserID":2000826,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/pvschilling=eb106a.jpg"},"IsPrivate":false,"Servings":2,"CreationDate":"2020-02-04T10:58:44.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":2182951,"Title":"Heavenly Rice/Fri Chik Casserole","Cuisine":null,"Category":"Main Dish","Subcategory":"","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/heavenly-ricefri-chik-casserole/2182951","ReviewCount":0,"Poster":{"UserName":"sallijenks","UserID":1666965,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/sallijenks.jpg"},"IsPrivate":false,"Servings":1,"CreationDate":"2018-05-19T17:39:03.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":87244,"Title":"Fri-Dinner- Bananas in Caramel Sauce","Cuisine":"American","Category":"Desserts","Subcategory":"Liqueur Flavored Desserts","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/fri-dinner-bananas-in-caramel-sauce/87244","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":6,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":1,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":87247,"Title":"Fri-Dinner- Make-Ahead Plan","Cuisine":"American","Category":"Other","Subcategory":"Other - Misc","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/fri-dinner-make-ahead-plan/87247","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":1,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":87248,"Title":"Fri-Dinner- Sesame Chive Tortilla Triangles","Cuisine":"American","Category":"Appetizers","Subcategory":"Appetizers - Other","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/fri-dinner-sesame-chive-tortilla-triangles/87248","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":6,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":0,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":2009231,"Title":"<img src=\"images/fricase_de_pollo-cuban.jpg\" class=\"photo\" alt=\"Chicken Fri","Cuisine":"","Category":"","Subcategory":"","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/img-srcimagesfricasedepollo-cubanjpg-classphoto-altchicken-fri/2009231","ReviewCount":0,"Poster":{"UserName":"icubanrecipes","UserID":2818108,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":4,"CreationDate":"2017-08-23T23:32:57.650Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":1,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/img-srcimages-fricase_de_pollo-cuban-jpg-classphoto-altchicken-fri-2009231.jpg","HasVideos":false},{"RecipeID":980018,"Title":"Loaded Potato Fritters  &rarr; http://www.allthecooks.com/loaded-potato-fri","Cuisine":"","Category":"Side Dish","Subcategory":"Potatoes","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/loaded-potato-fritters-httpwwwallthecookscomloaded-potato-fri/980018","ReviewCount":0,"Poster":{"UserName":"Poppysangel","UserID":30621,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/harveysangel.jpg"},"IsPrivate":false,"Servings":0,"CreationDate":"2014-10-29T16:16:53.547Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":5,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/loaded-potato-fritters-rarr-http-ww-2.jpg","HasVideos":false},{"RecipeID":1278106,"Title":"Grilled Portobello Steaks with Sundried Tomato Aioli and Baked Zucchini Fri","Cuisine":"","Category":"Main Dish","Subcategory":"Grill and BBQ","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/grilled-portobello-steaks-with-sundried-tomato-aioli-and-baked-zucchini-fri/1278106","ReviewCount":0,"Poster":{"UserName":"DelishRecipes","UserID":2487279,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/delishrecipes.jpg"},"IsPrivate":false,"Servings":4,"CreationDate":"2015-09-09T19:24:50.390Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":2,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/grilled-portobello-steaks-with-db1f6c.jpg","HasVideos":false},{"RecipeID":87249,"Title":"Fri-Dinner- Stirfry Noodles with Chicken,peanut-Orange Sau","Cuisine":"American","Category":"Main Dish","Subcategory":"Pasta","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/fri-dinner-stirfry-noodles-with-chickenpeanut-orange-sau/87249","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":4,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":3,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":87246,"Title":"Fri-Dinner- Hot-And-Sour Shrimp Soup","Cuisine":"American","Category":"Soups, Stews and Chili","Subcategory":"Seafood non-chowder","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/fri-dinner-hot-and-sour-shrimp-soup/87246","ReviewCount":0,"Poster":null,"IsPrivate":false,"Servings":4,"CreationDate":"2004-01-01T00:00:00.000Z","IsRecipeScan":false,"IsBookmark":false,"TotalTries":1,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":2406795,"Title":"Barbecued Pulled Pork Sandwiches With Homemade Bbq Sauce, Cole Slaw And Fri","Cuisine":"","Category":"","Subcategory":"","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/barbecued-pulled-pork-sandwiches-with-homemade-bbq-sauce-cole-slaw-and-fri/2406795","ReviewCount":0,"Poster":{"UserName":"emerilsrecipes","UserID":2790348,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":0,"CreationDate":"2019-05-26T20:39:02.797Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":1,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/barbecued-pulled-pork-sandwich-2390a4-9c971b6bd236c511cc30acbc.gif","HasVideos":false},{"RecipeID":2379638,"Title":"Lomo Saltado (Peruvian Stir-Fried Beef With Onion, Tomatoes, and French Fri","Cuisine":"","Category":"","Subcategory":"","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/lomo-saltado-peruvian-stir-fried-beef-with-onion-tomatoes-and-french-fri/2379638","ReviewCount":0,"Poster":{"UserName":"SeriousEatsRecipes","UserID":2057280,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/seriouseatsrecipes.jpg"},"IsPrivate":false,"Servings":2,"CreationDate":"2019-03-28T13:07:55.723Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":2,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/lomo-saltado-peruvian-stir-fried-beef-with-onion-tomatoes-and-french-...-2379638.jpg","HasVideos":false},{"RecipeID":2017660,"Title":"Lentil & Sweet Potato Soft Tacos with Nacho Cheese (Low-Histamine Vegan Fri","Cuisine":"","Category":"","Subcategory":"","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/lentil-sweet-potato-soft-tacos-with-nacho-cheese-low-histamine-vegan-fri/2017660","ReviewCount":0,"Poster":{"UserName":"beautifullybohemian","UserID":4066728,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":0,"CreationDate":"2017-09-03T08:23:51.933Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":2,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/lentil-sweet-potato-soft-tacos-with-nacho-cheese-low-histamine-vegan-...-2017660.jpg","HasVideos":false},{"RecipeID":2708871,"Title":"Healthy Funnel Cakes in an Air Fryer Recipe","Cuisine":"","Category":"","Subcategory":"","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/healthy-funnel-cakes-in-an-air-fryer-recipe/2708871","ReviewCount":0,"Poster":{"UserName":"air-fried","UserID":4842549,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":6,"CreationDate":"2021-01-02T22:36:19.227Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":1,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":845472,"Title":"Mike's Crab Rangoon Pizza","Cuisine":"Asian","Category":"Main Dish","Subcategory":"Pizza and Calzones","Microcategory":"","StarRating":5,"WebURL":"https://www.bigoven.com/recipe/mikes-crab-rangoon-pizza/845472","ReviewCount":1,"Poster":{"UserName":"OBRIENBESS","UserID":2485048,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":0,"CreationDate":"2014-04-13T08:19:57.000Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":5,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/mikes-crab-rangoon-pizza-rarr-http-.jpg","HasVideos":false},{"RecipeID":2053219,"Title":"Easy Fried Green Tomatoes","Cuisine":"","Category":"Appetizers","Subcategory":"Vegetable","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/easy-fried-green-tomatoes/2053219","ReviewCount":0,"Poster":{"UserName":"southernbiterecipes","UserID":2788187,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":0,"CreationDate":"2017-10-30T21:56:09.560Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":2,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/easy-fried-green-tomatoes-2053219.jpg","HasVideos":false},{"RecipeID":599188,"Title":"Frank Zane\u2019s Protein Powder Piña Colada","Cuisine":"","Category":"Drinks","Subcategory":"Smoothies","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/frank-zanes-protein-powder-pia-colada/599188","ReviewCount":0,"Poster":{"UserName":"ElanasPantryRecipes","UserID":2095655,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/elanaspantryrecipes.jpg"},"IsPrivate":false,"Servings":1,"CreationDate":"2013-08-07T23:19:29.437Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":3,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/recipe-no-image.jpg","HasVideos":false},{"RecipeID":1328329,"Title":"The Best Fried Okra","Cuisine":"","Category":"Side Dish","Subcategory":"Vegetables","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/the-best-fried-okra/1328329","ReviewCount":0,"Poster":{"UserName":"southernbiterecipes","UserID":2788187,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/avatar-default.png"},"IsPrivate":false,"Servings":0,"CreationDate":"2015-11-17T06:32:26.493Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":8,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/the-best-fried-okra-1328329.jpg","HasVideos":false},{"RecipeID":2193124,"Title":"Fried Crawfish Salad","Cuisine":"","Category":"","Subcategory":"","Microcategory":"","StarRating":0,"WebURL":"https://www.bigoven.com/recipe/fried-crawfish-salad/2193124","ReviewCount":0,"Poster":{"UserName":"McCormickRecipes","UserID":2179856,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/mccormickrecipes.jpg"},"IsPrivate":false,"Servings":0,"CreationDate":"2018-06-07T16:51:32.183Z","IsRecipeScan":false,"IsBookmark":true,"TotalTries":2,"PhotoUrl":"https://photos.bigoven.com/recipe/hero/fried-crawfish-salad-2193124.jpg","HasVideos":false}]
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
         * RecipeID : 2620141
         * Title : Sausage stir fri
         * Cuisine :
         * Category :
         * Subcategory :
         * Microcategory :
         * StarRating : 0
         * WebURL : https://www.bigoven.com/recipe/sausage-stir-fri/2620141
         * ReviewCount : 0
         * Poster : {"UserName":"kasselin","UserID":4762423,"FirstName":null,"LastName":null,"PhotoUrl":"https://photos.bigoven.com/avatar/photo/kasselin.png"}
         * IsPrivate : false
         * Servings : 1
         * CreationDate : 2020-06-25T23:39:38.430Z
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
             * UserName : kasselin
             * UserID : 4762423
             * FirstName : null
             * LastName : null
             * PhotoUrl : https://photos.bigoven.com/avatar/photo/kasselin.png
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
