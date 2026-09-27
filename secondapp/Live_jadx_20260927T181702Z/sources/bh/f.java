package bh;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k.i1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f21373c = "ExoPlayerCacheFileMetadata";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21374d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f21375e = "name";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f21376f = "length";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f21377g = "last_touch_timestamp";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f21378h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f21379i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f21380j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f21381k = "name = ?";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f21382l = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f21383m = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xe.c f21384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21385b;

    public f(xe.c cVar) {
        this.f21384a = cVar;
    }

    @i1
    public static void a(xe.c cVar, long j10) throws xe.b {
        String hexString = Long.toHexString(j10);
        try {
            String strE = e(hexString);
            SQLiteDatabase writableDatabase = cVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                xe.h.c(writableDatabase, 2, hexString);
                b(writableDatabase, strE);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new xe.b(e10);
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    public static String e(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    @i1
    public Map<String, e> c() throws xe.b {
        try {
            Cursor cursorD = d();
            try {
                HashMap map = new HashMap(cursorD.getCount());
                while (cursorD.moveToNext()) {
                    map.put((String) eh.a.g(cursorD.getString(0)), new e(cursorD.getLong(1), cursorD.getLong(2)));
                }
                cursorD.close();
                return map;
            } catch (Throwable th2) {
                if (cursorD != null) {
                    try {
                        cursorD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (SQLException e10) {
            throw new xe.b(e10);
        }
    }

    public final Cursor d() {
        eh.a.g(this.f21385b);
        return this.f21384a.getReadableDatabase().query(this.f21385b, f21382l, null, null, null, null, null);
    }

    @i1
    public void f(long j10) throws xe.b {
        try {
            String hexString = Long.toHexString(j10);
            this.f21385b = e(hexString);
            if (xe.h.b(this.f21384a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f21384a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    xe.h.d(writableDatabase, 2, hexString, 1);
                    b(writableDatabase, this.f21385b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f21385b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e10) {
            throw new xe.b(e10);
        }
    }

    @i1
    public void g(String str) throws xe.b {
        eh.a.g(this.f21385b);
        try {
            this.f21384a.getWritableDatabase().delete(this.f21385b, "name = ?", new String[]{str});
        } catch (SQLException e10) {
            throw new xe.b(e10);
        }
    }

    @i1
    public void h(Set<String> set) throws xe.b {
        eh.a.g(this.f21385b);
        try {
            SQLiteDatabase writableDatabase = this.f21384a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f21385b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new xe.b(e10);
        }
    }

    @i1
    public void i(String str, long j10, long j11) throws xe.b {
        eh.a.g(this.f21385b);
        try {
            SQLiteDatabase writableDatabase = this.f21384a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f21385b, null, contentValues);
        } catch (SQLException e10) {
            throw new xe.b(e10);
        }
    }
}
