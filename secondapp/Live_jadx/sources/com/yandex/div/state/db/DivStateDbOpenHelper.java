package com.yandex.div.state.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStateDbOpenHelper extends SQLiteOpenHelper {
    public DivStateDbOpenHelper(@l Context context, @l String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@l SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(StateSchema.SQL_CREATE_TABLE_QUERY);
        sQLiteDatabase.execSQL(StateSchema.SQL_CREATE_INDICES_TABLE_QUERY);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@m SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
