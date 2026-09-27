package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class J4 extends DatabaseScript {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95981a = 2000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95982b = "number";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95983c = "global_number";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f95984d = "number_of_type";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f95985e = "name";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f95986f = "value";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f95987g = "type";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f95988h = "time";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f95989i = "session_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f95990j = "error_environment";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f95991k = "session_type";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f95992l = "app_environment";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f95993m = "app_environment_revision";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f95994n = "truncated";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f95995o = "custom_type";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f95996p = "encrypting_mode";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f95997q = "profile_id";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f95998r = "first_occurrence_status";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f95999s = "source";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f96000t = "attribution_id_changed";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f96001u = "open_id";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f96002v = "extras";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f96003w = lk.g.f104710m;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C5065g7 f96004x = new C5065g7(null, 1, 0 == true ? 1 : 0);

    public static boolean a(C5039f7 c5039f7) {
        Long l10;
        EnumC4966cb enumC4966cb;
        Long l11;
        Long l12;
        Long l13 = c5039f7.f97323a;
        if (l13 == null || l13.longValue() < 10000000000L || c5039f7.f97324b == null || (l10 = c5039f7.f97325c) == null || l10.longValue() < 0 || (enumC4966cb = c5039f7.f97326d) == null || enumC4966cb == EnumC4966cb.EVENT_TYPE_UNDEFINED || (l11 = c5039f7.f97327e) == null || l11.longValue() < 0 || (l12 = c5039f7.f97328f) == null || l12.longValue() < 0) {
            return false;
        }
        Long l14 = c5039f7.f97329g.f97248d;
        if (l14 != null && l14.longValue() < 0) {
            return false;
        }
        Integer num = c5039f7.f97329g.f97253i;
        return num == null || num.intValue() >= 0;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@oy.l SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursorQuery;
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
        Cursor cursor = null;
        try {
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                cursorQuery = sQLiteDatabase2.query(this.f96003w, null, null, null, null, null, null, String.valueOf(this.f95981a));
                while (cursorQuery.moveToNext()) {
                    try {
                        C5039f7 c5039f7A = a(cursorQuery);
                        if (c5039f7A != null && a(c5039f7A)) {
                            try {
                                sQLiteDatabase2.insertOrThrow("events", null, this.f96004x.fromModel(c5039f7A));
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursorQuery = cursor;
                        }
                        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f96003w);
                    }
                }
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            sQLiteDatabase2 = sQLiteDatabase;
        }
        cursorQuery.close();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS " + this.f96003w);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0115 A[PHI: r4
      0x0115: PHI (r4v8 io.appmetrica.analytics.impl.n9) = (r4v7 io.appmetrica.analytics.impl.n9), (r4v9 io.appmetrica.analytics.impl.n9), (r4v10 io.appmetrica.analytics.impl.n9) binds: [B:38:0x0120, B:32:0x0113, B:35:0x011a] A[DONT_GENERATE, DONT_INLINE]] */
    public final C5039f7 a(Cursor cursor) {
        Wk wk2;
        J8 j10;
        EnumC5016ea enumC5016ea;
        EnumC5016ea enumC5016ea2;
        EnumC5246n9 enumC5246n9;
        EnumC5246n9 enumC5246n10;
        boolean z10;
        int i10;
        try {
            Long lValueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f95989i)));
            int i11 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f95991k));
            Wk wk3 = Wk.FOREGROUND;
            if (i11 != 0) {
                wk3 = Wk.BACKGROUND;
                wk2 = i11 == 1 ? wk3 : null;
            }
            Long lValueOf2 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f95982b)));
            EnumC4966cb enumC4966cbA = EnumC4966cb.a(cursor.getInt(cursor.getColumnIndexOrThrow(this.f95987g)));
            Long lValueOf3 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f95983c)));
            Long lValueOf4 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f95988h)));
            Integer numValueOf = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f95995o)));
            String string = cursor.getString(cursor.getColumnIndexOrThrow(this.f95985e));
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow(this.f95986f));
            Long lValueOf5 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f95984d)));
            String string3 = cursor.getString(cursor.getColumnIndexOrThrow(this.f95990j));
            String string4 = cursor.getString(cursor.getColumnIndexOrThrow(this.f95992l));
            Long lValueOf6 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(this.f95993m)));
            Integer numValueOf2 = Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(this.f95994n)));
            int i12 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f95996p));
            J8 j11 = J8.NONE;
            if (i12 == 0) {
                j10 = j11;
            } else {
                j11 = J8.AES_VALUE_ENCRYPTION;
                if (i12 != 2) {
                    j11 = J8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
                    if (i12 != 1) {
                        j10 = null;
                    }
                }
                j10 = j11;
            }
            String string5 = cursor.getString(cursor.getColumnIndexOrThrow(this.f95997q));
            try {
                int i13 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f95998r));
                enumC5016ea2 = EnumC5016ea.FIRST_OCCURRENCE;
                if (i13 != 1) {
                    enumC5016ea2 = EnumC5016ea.NON_FIRST_OCCURENCE;
                    if (i13 != 2) {
                        enumC5016ea = EnumC5016ea.UNKNOWN;
                    }
                    enumC5016ea2 = enumC5016ea;
                }
            } catch (Throwable unused) {
                enumC5016ea = EnumC5016ea.UNKNOWN;
            }
            EnumC5016ea enumC5016ea3 = enumC5016ea2;
            try {
                int i14 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f95999s));
                enumC5246n9 = EnumC5246n9.NATIVE;
                if (i14 == 0) {
                    enumC5246n10 = enumC5246n9;
                } else {
                    enumC5246n9 = EnumC5246n9.JS;
                    if (i14 == 1) {
                        enumC5246n10 = enumC5246n9;
                    } else {
                        enumC5246n10 = null;
                    }
                }
            } catch (Throwable unused2) {
                enumC5246n9 = EnumC5246n9.NATIVE;
            }
            try {
                z10 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f96000t)) == 1;
            } catch (Throwable unused3) {
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            try {
                i10 = cursor.getInt(cursor.getColumnIndexOrThrow(this.f96001u));
            } catch (Throwable unused4) {
                i10 = -1;
            }
            Integer numValueOf3 = Integer.valueOf(i10);
            int columnIndex = cursor.getColumnIndex(this.f96002v);
            return new C5039f7(lValueOf, wk2, lValueOf2, enumC4966cbA, lValueOf3, lValueOf4, new C5013e7(numValueOf, string, string2, lValueOf5, null, string3, string4, lValueOf6, numValueOf2, null, null, j10, string5, enumC5016ea3, enumC5246n10, boolValueOf, numValueOf3, columnIndex < 0 ? null : cursor.getBlob(columnIndex)));
        } catch (Throwable unused5) {
            return null;
        }
    }
}
