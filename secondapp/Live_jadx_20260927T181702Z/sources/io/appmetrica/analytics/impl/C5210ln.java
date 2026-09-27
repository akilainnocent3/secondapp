package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ln, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5210ln implements InterfaceC5184kn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f97855a;

    public C5210ln(@NonNull String str, @NonNull HashMap<String, List<String>> map) {
        this.f97855a = map;
    }

    @k.h1(otherwise = 5)
    public final HashMap<String, List<String>> a() {
        return this.f97855a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5184kn
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean zEquals = true;
            for (Map.Entry entry : this.f97855a.entrySet()) {
                try {
                    SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
                    Cursor cursorQuery = sQLiteDatabase2.query((String) entry.getKey(), null, null, null, null, null, null);
                    if (cursorQuery == null) {
                        mo.a(cursorQuery);
                        return false;
                    }
                    List list = (List) entry.getValue();
                    List listAsList = Arrays.asList(cursorQuery.getColumnNames());
                    Collections.sort(listAsList);
                    zEquals &= list.equals(listAsList);
                    mo.a(cursorQuery);
                    sQLiteDatabase = sQLiteDatabase2;
                } catch (Throwable th2) {
                    mo.a((Cursor) null);
                    throw th2;
                }
            }
            return zEquals;
        } catch (Throwable unused) {
            return false;
        }
    }
}
