package yads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f157484c = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w30 f157485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f157486b;

    public wr(jn0 jn0Var) {
        this.f157485a = jn0Var;
    }

    public final HashMap a() throws v30 {
        try {
            this.f157486b.getClass();
            Cursor cursorQuery = this.f157485a.getReadableDatabase().query(this.f157486b, f157484c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new vr(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } catch (Throwable th2) {
                if (cursorQuery == null) {
                    throw th2;
                }
                try {
                    cursorQuery.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            throw new v30(th4);
        }
    }

    public final void a(long j10) throws v30 {
        try {
            String hexString = Long.toHexString(j10);
            this.f157486b = "ExoPlayerCacheFileMetadata" + hexString;
            if (qd3.a(this.f157485a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f157485a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    qd3.a(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f157486b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f157486b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }

    public final void a(Set set) throws v30 {
        this.f157486b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f157485a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f157486b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }

    public final void a(String str, long j10, long j11) throws v30 {
        this.f157486b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f157485a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f157486b, null, contentValues);
        } catch (Throwable th2) {
            throw new v30(th2);
        }
    }
}
