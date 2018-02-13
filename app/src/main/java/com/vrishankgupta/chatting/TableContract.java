package com.vrishankgupta.chatting;

/**
 * Created by aryam on 2/13/2018.
 */

public final class TableContract {
    public static final String ID = " id ";
    public static final String NAME = " name ";
    public static final String AMOUNT = " amount ";
    public static final String IFOWED = " ifowed ";
    public static final String TABLE_NAME = " users ";
    public static final String TYPE_INT = " INTEGER ";
    public static final String TYPE_TEXT = " TEXT ";
    public static final String SELECT = " SELECT ";
    public static final String LBR = " ( ";
    public static final String RBR = " ) ";
    public static final String PK = " PRIMARY KEY ";
    public static final String COMMA = " , ";
    public static final String SEMICOLON = " ; ";
    public static final String ALL = " * ";
    public static final String FROM = " FROM ";
    public static final String WHERE = " WHERE ";
    public static final String EQUAL= " = ";

    public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + LBR + ID + TYPE_INT + PK + COMMA + NAME + TYPE_TEXT + COMMA + AMOUNT + TYPE_TEXT + COMMA + IFOWED + TYPE_INT + RBR + SEMICOLON;
    public static final String GET_ALL_USERS = SELECT + ALL + FROM + TABLE_NAME + SEMICOLON;
    public static String getUserWithId(int id){
        return SELECT + ALL + FROM + TABLE_NAME + WHERE + ID + EQUAL + id + SEMICOLON;
    }

}

