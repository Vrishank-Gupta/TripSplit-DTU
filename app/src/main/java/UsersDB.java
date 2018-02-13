import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;
import com.vrishankgupta.chatting.FirebaseUsers;
import com.vrishankgupta.chatting.Split;
import com.vrishankgupta.chatting.TableContract;

import java.util.ArrayList;

import static android.provider.ContactsContract.CommonDataKinds.Organization.TITLE;
import static com.vrishankgupta.chatting.TableContract.AMOUNT;
import static com.vrishankgupta.chatting.TableContract.ID;
import static com.vrishankgupta.chatting.TableContract.IFOWED;
import static com.vrishankgupta.chatting.TableContract.NAME;
import static com.vrishankgupta.chatting.TableContract.TABLE_NAME;

/**
 * Created by aryam on 2/13/2018.
 */

public class UsersDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "usersDB";
    public static final int DB_VERSION = 1;

    public UsersDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
    public ArrayList<FirebaseUsers> getAllUsers(){
        Cursor c = getReadableDatabase().query(
                TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null
        );
        ArrayList<FirebaseUsers> users = new ArrayList<>();
        while(c.moveToNext()){
            users.add(new FirebaseUsers(c.getString(0), c.getString(1), c.getString(2)));
        }
        return users;
    }
    public ArrayList<FirebaseUsers> getUsersWithId(int id){
        Cursor c = getReadableDatabase().query(
                TABLE_NAME,
                null,
                ID + " =? ",
                new String[] {String.valueOf(id)},
                null,
                null,
                null
        );

        ArrayList<FirebaseUsers> users = new ArrayList<>();
        while(c.moveToNext()){
            users.add(new FirebaseUsers(c.getString(0), c.getString(1), c.getString(2)));
        }
        return users;
    }

    public void insertUser(Split split){
        Float amount = 0.0F;
        Integer ifowed = 0;
        if(split.getOwedAmount() == 0) {
            amount = split.getPayedAmount();
            ifowed = 0;
        }
        else if(split.getPayedAmount() == 0){
            amount = split.getOwedAmount();
            ifowed = 1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(ID,split.getUser().getId());
        contentValues.put(NAME,split.getUser().getDisplayName());
        contentValues.put(AMOUNT,amount);
        contentValues.put(IFOWED,ifowed);
        getWritableDatabase().insert(TABLE_NAME,ID,contentValues);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TableContract.CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
