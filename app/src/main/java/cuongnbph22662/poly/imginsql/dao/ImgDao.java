package cuongnbph22662.poly.imginsql.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import cuongnbph22662.poly.imginsql.database.MyDatabaseImg;
import cuongnbph22662.poly.imginsql.model.ImageInSQL;

public class ImgDao {
    private SQLiteDatabase db;
    public ImgDao(Context context){
        MyDatabaseImg dbImg = new MyDatabaseImg(context);
        db = dbImg.getWritableDatabase();
    }

    public long insertImg(ImageInSQL obj){
        ContentValues values = new ContentValues();
        values.put("tenImg", obj.getTenImg());
        values.put("linkImg", obj.getLinkImg());
        return db.insert("IMG", null, values);
    }



}
