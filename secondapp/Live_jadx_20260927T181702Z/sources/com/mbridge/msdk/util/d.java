package com.mbridge.msdk.util;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public static boolean a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                if (sQLiteDatabase.isOpen() && !sQLiteDatabase.isReadOnly()) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
