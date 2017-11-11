package c4q.com.new_recycler_view;

import android.support.annotation.DrawableRes;

/**
 * Created by D on 11/11/17.
 */

public class Model {

         int model;
         String name;
         String age;
         String rating;

        public Model(  @DrawableRes int model ,String name, String age, String rating ) {
            this.model = model;
            this.name = name;
            this.age = age;
            this.rating = rating;
        }
        public String getName() {
            return name;
        }
        public String getAge() {
            return age;
        }
        public String getRating() {
            return rating;
        }


        @DrawableRes
        public int getModel(){
            return model;
        }




}
