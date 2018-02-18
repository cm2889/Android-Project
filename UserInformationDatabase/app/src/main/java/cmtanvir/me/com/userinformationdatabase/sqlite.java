package cmtanvir.me.com.userinformationdatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class sqlite extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="mydatbase.db";
    private static final String TABLE_NAME ="mytable";
    private static final String COLUMN1= "ID";
    private static final String COLUMN2 = "FIRSTNAME";
    private static final String COLUMN3 = "LASTNAME";
    private static final String COLUMN4 = "EMAIL";




    public sqlite(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String quary;
        quary= "CREATE TABLE "+TABLE_NAME+"("+COLUMN1+" INTEGER PRIMARY KEY, "+COLUMN2+" TEXT, "+COLUMN3+" TEXT, "+COLUMN4+" TEXT "+")";
        sqLiteDatabase.execSQL(quary);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(sqLiteDatabase);

    }
    // Insert user input data into the tabale
    public boolean adToTable(String id,String fname, String lname, String email)
    {
      SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN1,id);
        contentValues.put(COLUMN2,fname);
        contentValues.put(COLUMN3,lname);
        contentValues.put(COLUMN4,email);
         long checker = sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
         if(checker== -1)
         {
             return false;
         }
         else{
             return true ;
         }
    }
    // Display the database
    public Cursor  display(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        Cursor res;
        res= sqLiteDatabase.rawQuery("SELECT * FROM "+TABLE_NAME, null);
        return res;
    }
    // Update The Database
    public boolean updateData(String id,String fname, String lname, String email){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN1,id);
        contentValues.put(COLUMN2,fname);
        contentValues.put(COLUMN3,lname);
        contentValues.put(COLUMN4,email);
        sqLiteDatabase.update(TABLE_NAME,contentValues,"ID =?", new String[]{id});
        return true;
    }
    // delete All information of a Raw

    public int deletedata(String id){
        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
         return sqLiteDatabase.delete(TABLE_NAME,"ID =?",new String[]{id});
    }
}
