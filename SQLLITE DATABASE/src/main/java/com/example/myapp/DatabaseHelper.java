package com.example.myapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final int version=1;
    public static final String db_Name="Company.db";
    public static final String TABLE_NAME="Empdata";
    public static final  String  COL1="id";
    public static final String  COL2="name";
    public static final String  COL3="designation";
    public static final String COL4="salary";
public static final String CREATE_TABLE="CREATE TABLE IF NOT EXISTS "+TABLE_NAME+"("+
        COL1+" INTEGER PRIMARY KEY AUTOINCREMENT,"+COL2+" TEXT NOT NULL,"+COL3+" TEXT,"+
        COL4+" INTEGER)";
public static final String DROP_TABLE="DROP TABLE IF EXISTS "+TABLE_NAME;
private Context context;

    public DatabaseHelper(Context context) {
        super(context,db_Name,null,version);
        context=this.context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
try{
    db.execSQL(CREATE_TABLE);
}catch(Exception e)
{

}
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DROP_TABLE);
        onCreate(db);
    }

        public boolean InsertEmployee (Employee objEmp){
            SQLiteDatabase db  = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put(COL2, objEmp.getEmployeeName());
            cv.put(COL3, objEmp.getEmployeeDesign());
            cv.put(COL4, objEmp.getEmployeeSalary());
            long result = db.insert(TABLE_NAME, null, cv);
            if (result == -1)
                return false;
            else
                return true;

    }
}
