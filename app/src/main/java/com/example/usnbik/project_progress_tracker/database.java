package com.example.usnbik.project_progress_tracker;

import android.provider.BaseColumns;

/**
 * Created by usnbik on 6/6/2015.
 */
public class database {

    public database ()
    {

    }
    public static abstract class userTable implements BaseColumns
    {
        public static final String USER_NAME = "user name";
        public static final String USER_PASSWORD = "user password";
        public static final String DATABASE_NAME = "project_progress";
        public static final String TABLE_NAME = "user_table";
    }
}
