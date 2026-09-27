package com.startapp.sdk.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class l6 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SQLiteDatabase f75113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f75114b;

    public l6(Context context) {
        super(context, "StartApp-d6864f2502af7851", (SQLiteDatabase.CursorFactory) null, 1);
        this.f75114b = new Object();
    }

    public final SQLiteDatabase a() {
        SQLiteDatabase writableDatabase;
        SQLiteDatabase sQLiteDatabase = this.f75113a;
        if (sQLiteDatabase != null) {
            return sQLiteDatabase;
        }
        synchronized (this.f75114b) {
            try {
                writableDatabase = this.f75113a;
                if (writableDatabase == null) {
                    writableDatabase = getWritableDatabase();
                    this.f75113a = writableDatabase;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return writableDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
