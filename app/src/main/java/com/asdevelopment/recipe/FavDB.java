package com.asdevelopment.recipe;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FavDB extends SQLiteOpenHelper {
    private static int DB_VERSION = 1;
    private static String DATABASE_NAME = "FoodDB";
    private static String TABLE_NAME = "favouriteTable";
    private static String KEY_ID = "id";
    private static String ITEM_TITLE = "itemTitle";
    private static String ITEM_IMAGE = "itemImage";
    private static String FAVOURITE_STATUS = "fStatus";
    private static String CREATE_TABLE = "CREATE_TABLE " + TABLE_NAME +"("
            + KEY_ID + " TEXT," + ITEM_TITLE + " TEXT,"
            + ITEM_IMAGE + " TEXT," + FAVOURITE_STATUS+ " TEXT)";
    public FavDB (Context context)
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
