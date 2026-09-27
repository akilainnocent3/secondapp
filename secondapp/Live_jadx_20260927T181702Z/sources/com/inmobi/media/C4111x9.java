package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;

/* JADX INFO: renamed from: com.inmobi.media.x9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4111x9 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3783k5 f58101a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4111x9(C3783k5 databaseConfig) {
        super(databaseConfig.f56793a, "com.im_11.1.0.db", (SQLiteDatabase.CursorFactory) null, 1);
        kotlin.jvm.internal.m0.p(databaseConfig, "databaseConfig");
        this.f58101a = databaseConfig;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, Nj nj2) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + nj2.f55235a + " " + nj2.f55236b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final String getDatabaseName() {
        this.f58101a.getClass();
        return "com.im_11.1.0.db";
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (this.f58101a.f56795c != 2 || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.disableWriteAheadLogging();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            Iterator it = this.f58101a.f56794b.iterator();
            while (it.hasNext()) {
                a(sQLiteDatabase, (Nj) it.next());
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
