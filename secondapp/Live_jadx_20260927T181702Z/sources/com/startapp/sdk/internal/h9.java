package com.startapp.sdk.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONTokener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class h9 extends l6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f74944d = {"rowid", "timestamp", "sdkVersion", "category", "appActivity", "value", to.c.channelApi, "detailsJson", "dParam", NotificationCompat.CATEGORY_SERVICE, "tag"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f74945c;

    public h9(Context context) {
        super(context);
        this.f74945c = new LinkedList();
    }

    public static boolean a(d9 d9Var, j9 j9Var, SQLiteDatabase sQLiteDatabase, HashMap map, long j10) {
        if (j9Var.f75035a.size() > 0 && !j9Var.f75035a.contains(d9Var.f74675d)) {
            return false;
        }
        if (j9Var.f75036b.size() > 0 && j9Var.f75036b.contains(d9Var.f74675d)) {
            return false;
        }
        if (j9Var.f75037c.size() > 0 && !j9Var.f75037c.contains(d9Var.f74680i)) {
            return false;
        }
        if (j9Var.f75038d.size() > 0 && j9Var.f75038d.contains(d9Var.f74680i)) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map.containsKey("sdkVersion")) {
            linkedHashMap.put("sdkVersion", (String) map.get("sdkVersion"));
        }
        if (map.containsKey("category")) {
            linkedHashMap.put("category", (String) map.get("category"));
        }
        for (String str : j9Var.f75039e) {
            if (map.containsKey(str)) {
                linkedHashMap.put(str, (String) map.get(str));
            }
        }
        int size = linkedHashMap.size();
        if (size < 1) {
            throw new IllegalArgumentException();
        }
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList(size);
        String str2 = "";
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            sb2.append(str2);
            sb2.append((String) entry.getKey());
            if (entry.getValue() == null) {
                sb2.append(" IS NULL");
            } else {
                sb2.append(" = ?");
                arrayList.add((String) entry.getValue());
            }
            str2 = " AND ";
        }
        Pair pair = new Pair(sb2.toString(), (String[]) arrayList.toArray(new String[0]));
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("events", new String[]{"sendSuccess"}, (String) pair.first, (String[]) pair.second, null, null, "sendSuccess DESC");
            if (cursorQuery.moveToFirst()) {
                long j11 = cursorQuery.getLong(0);
                if (j11 <= 0) {
                    return true;
                }
                long j12 = j10 - j11;
                long j13 = j9Var.f75040f;
                if (j13 > 0 && j12 < j13) {
                    a(cursorQuery);
                    return true;
                }
            }
            return false;
        } finally {
            a(cursorQuery);
        }
    }

    public static d9 b(Cursor cursor) {
        long j10 = cursor.getLong(0);
        long j11 = cursor.getLong(1);
        a(j10, j11);
        String string = cursor.getString(2);
        e9 e9Var = (e9) e9.f74720c.get(cursor.getString(3));
        String string2 = cursor.getString(4);
        String string3 = cursor.getString(5);
        String string4 = cursor.getString(6);
        String string5 = cursor.getString(7);
        String string6 = cursor.getString(8);
        boolean z10 = cursor.getInt(9) == 1;
        String string7 = cursor.getString(10);
        if (string == null || string.trim().length() < 1) {
            throw new IllegalArgumentException();
        }
        if (e9Var == null) {
            throw new IllegalArgumentException();
        }
        Object objNextValue = null;
        if (string5 != null) {
            try {
                objNextValue = new JSONTokener(string5).nextValue();
            } catch (JSONException unused) {
            }
        }
        d9 d9Var = new d9(e9Var, j10);
        d9Var.f74679h = Long.valueOf(j11);
        d9Var.f74674c = string;
        d9Var.f74680i = string2;
        d9Var.f74675d = string3;
        d9Var.f74676e = string4;
        d9Var.f74677f = objNextValue;
        d9Var.f74678g = string6;
        d9Var.f74681j = z10;
        d9Var.f74682k = string7;
        return d9Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events ( timestamp INTEGER NOT NULL, validTill INTEGER NOT NULL, sdkVersion TEXT NOT NULL, category TEXT NOT NULL, appActivity TEXT, value TEXT, details TEXT, detailsJson TEXT, dParam TEXT, service INTEGER NOT NULL DEFAULT 0, tag TEXT, priority INTEGER NOT NULL, attempt INTEGER NOT NULL DEFAULT 0, send INTEGER NOT NULL DEFAULT 0, sendFailure INTEGER NOT NULL DEFAULT 0, sendSuccess INTEGER NOT NULL DEFAULT 0, CHECK (attempt >= 0), CHECK (send >= 0), CHECK (sendFailure >= 0), CHECK (sendSuccess >= 0));");
    }

    public final void a(s9 s9Var, int i10, int i11) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = a().query("events", f74944d, "attempt < " + i10 + " AND validTill >= " + System.currentTimeMillis() + " AND sendSuccess = 0  AND send <= sendFailure", null, null, null, "priority DESC, timestamp ASC", String.valueOf(Math.max(1, i11)));
            while (cursorQuery.moveToNext()) {
                s9Var.a(b(cursorQuery));
            }
            a(cursorQuery);
        } catch (Throwable th2) {
            a(cursorQuery);
            throw th2;
        }
    }

    public final boolean a(d9 d9Var, g9 g9Var) {
        long jLongValue;
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = g9Var.f74868e + jCurrentTimeMillis;
            Long l10 = d9Var.f74679h;
            if (l10 != null) {
                jLongValue = l10.longValue();
            } else {
                d9Var.f74679h = Long.valueOf(jCurrentTimeMillis);
                jLongValue = jCurrentTimeMillis;
            }
            Object obj = d9Var.f74677f;
            String string = obj != null ? obj.toString() : null;
            String str = d9Var.f74674c;
            if (str == null) {
                str = "5.3.0";
            }
            String str2 = str;
            List list = g9Var.f74870g;
            if (list.size() > 0) {
                HashMap map = new HashMap();
                map.put("sdkVersion", str2);
                map.put("category", d9Var.f74672a.f74734a);
                map.put("appActivity", d9Var.f74680i);
                map.put("value", d9Var.f74675d);
                map.put(to.c.channelApi, d9Var.f74676e);
                map.put("detailsJson", string);
                map.put("dParam", d9Var.f74678g);
                map.put(NotificationCompat.CATEGORY_SERVICE, d9Var.f74681j ? "1" : "0");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (a(d9Var, (j9) it.next(), sQLiteDatabaseA, map, jCurrentTimeMillis)) {
                        sQLiteDatabaseA.endTransaction();
                        return false;
                    }
                }
            }
            sQLiteDatabaseA.delete("events", "validTill < " + jCurrentTimeMillis, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("timestamp", Long.valueOf(jLongValue));
            contentValues.put("validTill", Long.valueOf(j10));
            contentValues.put("sdkVersion", str2);
            contentValues.put("category", d9Var.f74672a.f74734a);
            contentValues.put("appActivity", d9Var.f74680i);
            contentValues.put("value", d9Var.f74675d);
            contentValues.put(to.c.channelApi, d9Var.f74676e);
            contentValues.put("detailsJson", string);
            contentValues.put("dParam", d9Var.f74678g);
            contentValues.put(NotificationCompat.CATEGORY_SERVICE, Integer.valueOf(d9Var.f74681j ? 1 : 0));
            contentValues.put("tag", d9Var.f74682k);
            contentValues.put("priority", Integer.valueOf(g9Var.f74866c));
            sQLiteDatabaseA.insertOrThrow("events", null, contentValues);
            sQLiteDatabaseA.setTransactionSuccessful();
            sQLiteDatabaseA.endTransaction();
            synchronized (this) {
                Iterator it2 = this.f74945c.iterator();
                while (it2.hasNext()) {
                    ((i7) it2.next()).a();
                }
            }
            return true;
        } catch (Throwable th2) {
            sQLiteDatabaseA.endTransaction();
            throw th2;
        }
    }

    public static void a(long j10, long j11) {
        if (j10 <= 0) {
            throw new IllegalArgumentException();
        }
        if (j11 <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static int a(SQLiteDatabase sQLiteDatabase, long j10) {
        try {
            Cursor cursorQuery = sQLiteDatabase.query("events", new String[]{"attempt"}, "rowid = ?", new String[]{String.valueOf(j10)}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                int i10 = cursorQuery.getInt(0);
                a(cursorQuery);
                return i10;
            }
            throw new IllegalStateException();
        } catch (Throwable th2) {
            a(null);
            throw th2;
        }
    }

    public static void a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }
}
