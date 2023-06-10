package com.example.aquaculture;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "aquaculture_db";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_GENERAL = "General";
    public static final String TABLE_POOLS = "Pools";
    public static final String TABLE_TYPES_FEED = "Types_feed";
    public static final String KEY_NUMBER_OF_POOLS = "number_of_pools"; // INT
    public static final String KEY_GENERAL_FISH_MASS = "general_fish_mass"; //FLOAT
    public static final String KEY_FARM_POWER = "farm_power"; //FLOAT
    public static final String KEY_FARM_START_TIME = "farm_start_time"; //DATE
    public static final String KEY_TEMPERATURE_WATERS = "temperature_waters"; //FLOAT
    public static final String KEY_OXYGEN_QUANTITY = "oxygen_quantity"; //FLOAT
    public static final String KEY_NUMBER_NH3 = "number_NH3"; //FLOAT
    public static final String KEY_PH_WATERS = "pH_waters"; //FLOAT
    public static final String KEY_CRITICAL_INDICATORS = "critical_inicators"; //TEXT
    public static final String KEY_FARM_ID = "farm_id"; //int, foreign key general
    public static final String KEY_POOL_NUMBER = "pool_number"; //INT
    public static final String KEY_FISH_MASS = "fish_mass"; //FLOAT
    public static final String KEY_DENSITY_SEAT = "density_seat"; //FLOAT
    public static final String KEY_AVERAGE_SIGN = "average_sign"; //FLOAT
    public static final String KEY_TEMPERATURE = "temperature"; //FLOAT
    public static final String KEY_ID_TYPE_FEED = "id_type_feed"; //int, foreign key types feed
    public static final String KEY_ACTUAL_FEED_CF = "actual_feed_cf"; //FLOAT
    public static final String KEY_THEORETICAL_FEED_CF = "theoretical_feed_cf"; //FLOAT
    public static final String KEY_FEEDING_FREQUENCY = "feeding_frequency"; //TEXT
    public static final String KEY_OPERATING_TIME = "operating_time"; //DATE
    public static final String KEY_FEED_DOSE = "feed_dose"; //FLOAT
    public static final String KEY_HISTORY_POPULATION_FISH = "history_population_fish"; //TEXT
    public static final String KEY_FEED_NAME = "feed_name"; //TEXT
    public static final String KEY_FROM_SUSPENSION_FISH = "from_suspension_fish"; //FLOAT
    public static final String KEY_BEFORE_SUSPENSION_FISH = "before_suspension_fish"; //FLOAT
    public static final String KEY_FEED_CF = "feed_cf"; //FLOAT
    public static final String KEY_FEEDING_DOSE = "feeding_dose"; //FLOAT
    public static final String KEY_TOTAL_WEIGHT_FEED_IN_STOCK = "total_weight_feed_in_stock"; //FLOAT
    public static final String KEY_PROTEINS = "proteins"; //FLOAT
    public static final String KEY_FATS = "fats"; //FLOAT
    public static final String KEY_CARBOHYDRATES = "carbohydrates"; //FLOAT
    public static final String KEY_CALORIES = "calories"; //FLOAT
    public static final String KEY_EXPIRATION_DATE = "expiration_date"; //DATE
    public static final String KEY_COMPOSITION_DESCRIPTION = "composition_description"; //TEXT
    public static final String KEY_STORAGE_CONDITIONS = "storage_conditions"; //TEXT
    public  static final String CREATE_GENERAL = "create table " + TABLE_GENERAL +
            "(_id integer primary key autoincrement," + KEY_NUMBER_OF_POOLS + " integer," +
            KEY_GENERAL_FISH_MASS + " real," + KEY_FARM_POWER + " real," + KEY_FARM_START_TIME +
            " text," + KEY_TEMPERATURE_WATERS + " real," + KEY_OXYGEN_QUANTITY + " real," +
            KEY_NUMBER_NH3 + " real," + KEY_PH_WATERS + " real," + KEY_CRITICAL_INDICATORS +
            " text)";
    public  static final String CREATE_POOLS = "create table " + TABLE_POOLS +
            "(_id integer primary key autoincrement," + KEY_FARM_ID + " integer," +
            KEY_POOL_NUMBER + " integer," + KEY_FISH_MASS + " real," + KEY_DENSITY_SEAT + " real," +
            KEY_AVERAGE_SIGN + " real," + KEY_TEMPERATURE + " real," + KEY_ID_TYPE_FEED +
            " integer," + KEY_ACTUAL_FEED_CF + " real," + KEY_THEORETICAL_FEED_CF + " real," +
            KEY_FEEDING_FREQUENCY + " text," + KEY_OPERATING_TIME + " text," + KEY_FEED_DOSE +
            " real," + KEY_HISTORY_POPULATION_FISH + " text," + "foreign key(" + KEY_FARM_ID +
            ") references " + TABLE_GENERAL + "(_id)," + "foreign key(" + KEY_ID_TYPE_FEED +
            ") references " + TABLE_TYPES_FEED + "(_id))";
    public  static final String CREATE_TYPES_FEED = "create table " + TABLE_TYPES_FEED +
            "(_id integer primary key autoincrement," + KEY_FEED_NAME + " text," +
            KEY_FROM_SUSPENSION_FISH + " real," + KEY_BEFORE_SUSPENSION_FISH + " real," +
            KEY_FEED_CF + " real," + KEY_FEEDING_DOSE + " real," + KEY_TOTAL_WEIGHT_FEED_IN_STOCK +
            " real," + KEY_PROTEINS + " real," + KEY_FATS + " real," + KEY_CARBOHYDRATES +
            " real," + KEY_CALORIES + " real," + KEY_EXPIRATION_DATE + " text," +
            KEY_COMPOSITION_DESCRIPTION + " text," + KEY_STORAGE_CONDITIONS + " text)";

    public DBHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_GENERAL);
        db.execSQL(CREATE_POOLS);
        db.execSQL(CREATE_TYPES_FEED);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists " + TABLE_GENERAL);
        db.execSQL("drop table if exists " + TABLE_POOLS);
        db.execSQL("drop table if exists " + TABLE_TYPES_FEED);
        onCreate(db);
    }
}
