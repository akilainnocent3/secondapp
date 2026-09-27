package com.ironsource;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class H4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final a f59143a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private static final Object f59144b = new Object();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        private a() {
        }
    }

    @cs.k
    @oy.m
    public final SQLiteDatabase a(@oy.l SQLiteOpenHelper sqliteOpenHelper) {
        kotlin.jvm.internal.m0.p(sqliteOpenHelper, "sqliteOpenHelper");
        return a(this, false, sqliteOpenHelper, 1, null);
    }

    public static /* synthetic */ SQLiteDatabase a(H4 h10, boolean z10, SQLiteOpenHelper sQLiteOpenHelper, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h10.a(z10, sQLiteOpenHelper);
    }

    @cs.k
    @oy.m
    public final SQLiteDatabase a(boolean z10, @oy.l SQLiteOpenHelper sqliteOpenHelper) {
        SQLiteDatabase readableDatabase;
        kotlin.jvm.internal.m0.p(sqliteOpenHelper, "sqliteOpenHelper");
        synchronized (f59144b) {
            try {
                if (z10) {
                    readableDatabase = sqliteOpenHelper.getWritableDatabase();
                } else {
                    readableDatabase = sqliteOpenHelper.getReadableDatabase();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return readableDatabase;
    }
}
