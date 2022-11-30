package cuongnbph22662.poly.imginsql.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import cuongnbph22662.poly.imginsql.dao.ImageDao;
import cuongnbph22662.poly.imginsql.model.ImageInSQL;

@Database(entities = {ImageInSQL.class}, version = 1)
public abstract class DBHelperImg extends RoomDatabase {
    public static final String NAME_DB = "imginsql.db";
    public abstract ImageDao imageDao();
    public static DBHelperImg instance;
    public static synchronized DBHelperImg getInstance(Context mContext){
        if(instance == null){
            instance = Room.databaseBuilder(mContext, DBHelperImg.class, NAME_DB).allowMainThreadQueries().build();
        }
        return instance;
    }
}
