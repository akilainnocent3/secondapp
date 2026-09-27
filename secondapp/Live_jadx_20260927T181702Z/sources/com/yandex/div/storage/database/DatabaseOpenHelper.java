package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface DatabaseOpenHelper {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface CreateCallback {
        void onCreate(@l Database database);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Database extends Closeable {
        void beginTransaction();

        @l
        SQLiteStatement compileStatement(@l String str);

        void endTransaction();

        void execSQL(@l String str);

        @l
        Cursor query(@l String str, @m String[] strArr, @m String str2, @m String[] strArr2, @m String str3, @m String str4, @m String str5, @m String str6);

        @l
        Cursor rawQuery(@l String str, @m String[] strArr);

        void setTransactionSuccessful();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface UpgradeCallback {
        void onUpgrade(@l Database database, int i10, int i11);
    }

    @l
    Database getReadableDatabase();

    @l
    Database getWritableDatabase();
}
