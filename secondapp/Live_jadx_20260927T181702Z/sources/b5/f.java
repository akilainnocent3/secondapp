package b5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k.i1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20676c = "ExoPlayerCacheFileMetadata";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f20677d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20678e = "name";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f20679f = "length";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f20680g = "last_touch_timestamp";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f20681h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f20682i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f20683j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f20684k = "name = ?";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f20685l = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f20686m = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4.b f20687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20688b;

    public f(z4.b bVar) {
        this.f20687a = bVar;
    }

    @i1
    public static void a(z4.b bVar, long j10) throws z4.a {
        String hexString = Long.toHexString(j10);
        try {
            String strE = e(hexString);
            SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                z4.g.c(writableDatabase, 2, hexString);
                b(writableDatabase, strE);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new z4.a(e10);
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    public static String e(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    @i1
    public Map<String, e> c() throws z4.a {
        try {
            Cursor cursorD = d();
            try {
                HashMap map = new HashMap(cursorD.getCount());
                while (cursorD.moveToNext()) {
                    map.put((String) l0.E(cursorD.getString(0)), new e(cursorD.getLong(1), cursorD.getLong(2)));
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
            throw new z4.a(e10);
        }
    }

    public final Cursor d() {
        l0.E(this.f20688b);
        return this.f20687a.getReadableDatabase().query(this.f20688b, f20685l, null, null, null, null, null);
    }

    @i1
    public void f(long j10) throws z4.a {
        try {
            String hexString = Long.toHexString(j10);
            this.f20688b = e(hexString);
            if (z4.g.b(this.f20687a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f20687a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    z4.g.d(writableDatabase, 2, hexString, 1);
                    b(writableDatabase, this.f20688b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f20688b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e10) {
            throw new z4.a(e10);
        }
    }

    @i1
    public void g(String str) throws z4.a {
        l0.E(this.f20688b);
        try {
            this.f20687a.getWritableDatabase().delete(this.f20688b, "name = ?", new String[]{str});
        } catch (SQLException e10) {
            throw new z4.a(e10);
        }
    }

    @i1
    public void h(Set<String> set) throws z4.a {
        l0.E(this.f20688b);
        try {
            SQLiteDatabase writableDatabase = this.f20687a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f20688b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new z4.a(e10);
        }
    }

    @i1
    public void i(String str, long j10, long j11) throws z4.a {
        l0.E(this.f20688b);
        try {
            SQLiteDatabase writableDatabase = this.f20687a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f20688b, null, contentValues);
        } catch (SQLException e10) {
            throw new z4.a(e10);
        }
    }
}
