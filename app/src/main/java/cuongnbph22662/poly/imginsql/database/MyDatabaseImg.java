package cuongnbph22662.poly.imginsql.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabaseImg extends SQLiteOpenHelper {
    static final String NAME_DB = "imginsql.db";
    static final int VERSION_DB = 1;
    static final String CREATE_TABLE_IMG = "CREATE TABLE IMG(" +
            "tenImg TEXT PRIMARY KEY," +
            "linkImg TEXT NOT NULL)";

    public MyDatabaseImg(@Nullable Context context) {
        super(context, NAME_DB, null, VERSION_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Tạo bảng
        db.execSQL(CREATE_TABLE_IMG);
        //insert dữ liệu sẵn

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String DropTableImg = "DROP TABLE IF EXISTS IMG";
        db.execSQL(DropTableImg);

        onCreate(db);
    }
}
