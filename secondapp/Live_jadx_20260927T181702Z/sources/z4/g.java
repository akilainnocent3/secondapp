package z4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import u4.h1;
import x4.b2;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f160304a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f160305b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f160306c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f160307d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f160308e = 1000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f160309f = "ExoPlayerVersions";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f160310g = "feature";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f160311h = "instance_uid";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f160312i = "version";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f160313j = "feature = ? AND instance_uid = ?";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f160314k = "PRIMARY KEY (feature, instance_uid)";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f160315l = "CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))";

    static {
        h1.a("media3.database");
    }

    public static String[] a(int i10, String str) {
        return new String[]{Integer.toString(i10), str};
    }

    public static int b(SQLiteDatabase sQLiteDatabase, int i10, String str) throws a {
        try {
            if (!b2.G2(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", a(i10, str), null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    cursorQuery.close();
                    return -1;
                }
                cursorQuery.moveToNext();
                int i11 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i11;
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
            throw new a(e);
        } catch (SQLException e10) {
            throw new a(e10);
        }
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i10, String str) throws a {
        try {
            if (b2.G2(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", a(i10, str));
            }
        } catch (SQLException e10) {
            throw new a(e10);
        }
    }

    public static void d(SQLiteDatabase sQLiteDatabase, int i10, String str, int i11) throws a {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i10));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i11));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e10) {
            throw new a(e10);
        }
    }
}
