package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5397tb implements Ia, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f98352a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f98353b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98354c = "preferences";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C5372sb f98355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f98356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC5542z6 f98357f;

    public C5397tb(InterfaceC5542z6 interfaceC5542z6) {
        this.f98357f = interfaceC5542z6;
        C5372sb c5372sb = new C5372sb(this, String.format(Locale.US, "IAA-DW-%s", Integer.valueOf(Ad.a())));
        this.f98355d = c5372sb;
        c5372sb.start();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    public static void a(C5397tb c5397tb) {
        SQLiteDatabase sQLiteDatabaseA;
        Object obj;
        c5397tb.getClass();
        Cursor cursor = null;
        try {
            sQLiteDatabaseA = c5397tb.f98357f.a();
            if (sQLiteDatabaseA != null) {
                try {
                    Cursor cursorQuery = sQLiteDatabaseA.query(c5397tb.f98354c, new String[]{"key", "value", "type"}, null, null, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        try {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("key"));
                            String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("value"));
                            int i10 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("type"));
                            if (!TextUtils.isEmpty(string)) {
                                if (i10 != 1) {
                                    if (i10 == 2) {
                                        obj = ParseUtils.parseInt(string2);
                                    } else if (i10 == 3) {
                                        obj = ParseUtils.parseLong(string2);
                                    } else if (i10 != 4) {
                                        if (i10 != 5) {
                                            obj = string2;
                                            obj = null;
                                        } else {
                                            obj = string2;
                                            obj = ParseUtils.parseFloat(string2);
                                        }
                                    }
                                } else if ("true".equals(string2)) {
                                    obj = Boolean.TRUE;
                                } else if ("false".equals(string2)) {
                                    obj = Boolean.FALSE;
                                } else {
                                    obj = string2;
                                    obj = null;
                                }
                                if (obj != null) {
                                    c5397tb.f98352a.put(string, obj);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    cursor = cursorQuery;
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
            sQLiteDatabaseA = null;
        }
        mo.a(cursor);
        c5397tb.f98357f.a(sQLiteDatabaseA);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void b() {
        synchronized (this.f98355d) {
            this.f98355d.notifyAll();
        }
    }

    public final void c() {
        if (this.f98356e) {
            return;
        }
        try {
            this.f98352a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f98355d.isRunning()) {
            this.f98355d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final boolean getBoolean(String str, boolean z10) {
        Object objB = b(str);
        return objB instanceof Boolean ? ((Boolean) objB).booleanValue() : z10;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final int getInt(String str, int i10) {
        Object objB = b(str);
        return objB instanceof Integer ? ((Integer) objB).intValue() : i10;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final long getLong(String str, long j10) {
        Object objB = b(str);
        return objB instanceof Long ? ((Long) objB).longValue() : j10;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final String getString(String str, String str2) {
        Object objB = b(str);
        return objB instanceof String ? (String) objB : str2;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia remove(String str) {
        synchronized (this.f98352a) {
            c();
            this.f98352a.remove(str);
        }
        synchronized (this.f98355d) {
            this.f98353b.put(str, this);
            this.f98355d.notifyAll();
        }
        return this;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.f98352a) {
            c();
            obj = this.f98352a.get(str);
        }
        return obj;
    }

    public static void a(C5397tb c5397tb, HashMap map) {
        SQLiteDatabase sQLiteDatabaseA;
        c5397tb.getClass();
        int size = map.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c5397tb) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i10] = contentValues;
            i10++;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = c5397tb.f98357f.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.beginTransaction();
                    for (int i11 = 0; i11 < size; i11++) {
                        ContentValues contentValues2 = contentValuesArr[i11];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabaseA.delete(c5397tb.f98354c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabaseA.insertWithOnConflict(c5397tb.f98354c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabaseA = sQLiteDatabase;
                }
            }
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        c5397tb.f98357f.a(sQLiteDatabaseA);
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final synchronized Ia a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final synchronized Ia a(int i10, String str) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Ia a(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final boolean a(String str) {
        boolean zContainsKey;
        synchronized (this.f98352a) {
            c();
            zContainsKey = this.f98352a.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Set a() {
        HashSet hashSet;
        synchronized (this.f98352a) {
            hashSet = new HashSet(this.f98352a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.f98352a) {
            c();
            this.f98352a.put(str, obj);
        }
        synchronized (this.f98355d) {
            this.f98353b.put(str, obj);
            this.f98355d.notifyAll();
        }
    }
}
