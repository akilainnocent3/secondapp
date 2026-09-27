package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class K4 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96037a = "sessions";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96038b = 200;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96039c = "id";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f96040d = "start_time";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f96041e = "report_request_parameters";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f96042f = "server_time_offset";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f96043g = "type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f96044h = "obtained_before_first_sync";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C5418u7 f96045i = new C5418u7(null, 1, 0 == true ? 1 : 0);

    public final C5393t7 a(Cursor cursor) {
        try {
            Long lValueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f96039c)));
            int i10 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f96043g));
            Wk wk2 = Wk.FOREGROUND;
            boolean z10 = true;
            if (i10 != 0) {
                wk2 = Wk.BACKGROUND;
                if (i10 != 1) {
                    wk2 = null;
                }
            }
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f96041e));
            Long lValueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f96040d)));
            Long lValueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f96042f)));
            if (cursor.getInt(cursor.getColumnIndexOrThrow(this.f96044h)) != 1) {
                z10 = false;
            }
            return new C5393t7(lValueOf, wk2, string, new C5368s7(lValueOf2, lValueOf3, Boolean.valueOf(z10)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@oy.l SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursorQuery;
        Iterator it;
        Long l10;
        String str;
        Long l11;
        ArrayList arrayList = new ArrayList();
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                cursorQuery = sQLiteDatabase2.query(this.f96037a, null, null, null, null, null, null, String.valueOf(this.f96038b));
                while (cursorQuery.moveToNext()) {
                    try {
                        C5393t7 c5393t7A = a(cursorQuery);
                        if (c5393t7A != null && (l10 = c5393t7A.f98345a) != null && l10.longValue() >= 0 && c5393t7A.f98346b != null && (str = c5393t7A.f98347c) != null && str.length() != 0 && (l11 = c5393t7A.f98348d.f98288a) != null && l11.longValue() > 0) {
                            arrayList.add(this.f96045i.fromModel(c5393t7A));
                        }
                    } catch (Throwable unused) {
                        if (cursorQuery != null) {
                        }
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f96037a);
                        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            try {
                                sQLiteDatabase2.insertOrThrow("sessions", null, (ContentValues) it.next());
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
            } catch (Throwable unused3) {
                cursorQuery = null;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f96037a);
                sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
                it = arrayList.iterator();
                while (it.hasNext()) {
                    sQLiteDatabase2.insertOrThrow("sessions", null, (ContentValues) it.next());
                }
            }
        } catch (Throwable unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        cursorQuery.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f96037a);
        sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
        it = arrayList.iterator();
        while (it.hasNext()) {
            sQLiteDatabase2.insertOrThrow("sessions", null, (ContentValues) it.next());
        }
    }
}
