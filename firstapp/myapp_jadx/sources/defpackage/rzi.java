package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class rzi implements vfe0 {
    public static final String[] b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] c = new String[0];
    public static final ttr<Method> d;
    public static final ttr<Method> e;
    public final SQLiteDatabase a;

    static {
        a1s a1sVar = a1s.c;
        d = hwr.a(a1sVar, new pzi());
        e = hwr.a(a1sVar, new qzi());
    }

    public rzi(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        this.a = sQLiteDatabase;
    }

    @Override // defpackage.vfe0
    public final int E1(ContentValues contentValues, Object[] objArr) {
        int i = 0;
        if (contentValues.size() == 0) {
            hb5.a("Empty values");
            return 0;
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(b[3]);
        sb.append("WorkSpec SET ");
        int i2 = 0;
        for (String str : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str);
            objArr2[i2] = contentValues.get(str);
            sb.append("=?");
            i2++;
        }
        for (int i3 = size; i3 < length; i3++) {
            objArr2[i3] = objArr[i3 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        bge0 bge0VarJ0 = J0(sb.toString());
        int length2 = objArr2.length;
        while (i < length2) {
            Object obj = objArr2[i];
            i++;
            if (obj == null) {
                bge0VarJ0.r(i);
            } else if (obj instanceof byte[]) {
                bge0VarJ0.Z0(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                bge0VarJ0.i(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                bge0VarJ0.i(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                bge0VarJ0.q(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                bge0VarJ0.q(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                bge0VarJ0.q(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                bge0VarJ0.q(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                bge0VarJ0.C0(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                bge0VarJ0.q(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return ((wzi) bge0VarJ0).b.executeUpdateDelete();
    }

    @Override // defpackage.vfe0
    public final bge0 J0(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.a.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new wzi(sQLiteStatementCompileStatement);
    }

    @Override // defpackage.vfe0
    public final void M0() throws IllegalAccessException, InvocationTargetException {
        ttr<Method> ttrVar = e;
        if (ttrVar.getValue() != null) {
            ttr<Method> ttrVar2 = d;
            if (ttrVar2.getValue() != null) {
                Method value = ttrVar.getValue();
                value.getClass();
                Method value2 = ttrVar2.getValue();
                value2.getClass();
                Object objInvoke = value2.invoke(this.a, null);
                if (objInvoke != null) {
                    value.invoke(objInvoke, 0, null, 0, null);
                    return;
                } else {
                    ib5.a("Required value was null.");
                    return;
                }
            }
        }
        v();
    }

    @Override // defpackage.vfe0
    public final void N() {
        this.a.setTransactionSuccessful();
    }

    @Override // defpackage.vfe0
    public final void O() {
        this.a.beginTransactionNonExclusive();
    }

    @Override // defpackage.vfe0
    public final void U0(Object[] objArr) {
        this.a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // defpackage.vfe0
    public final void W() {
        this.a.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.vfe0
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // defpackage.vfe0
    public final boolean s() {
        return this.a.inTransaction();
    }

    @Override // defpackage.vfe0
    public final void v() {
        this.a.beginTransaction();
    }

    @Override // defpackage.vfe0
    public final Cursor w(yfe0 yfe0Var) {
        final nzi nziVar = new nzi(yfe0Var);
        Cursor cursorRawQueryWithFactory = this.a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: ozi
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) nziVar.d(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, yfe0Var.d(), c, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // defpackage.vfe0
    public final boolean y1() {
        return this.a.isWriteAheadLoggingEnabled();
    }

    @Override // defpackage.vfe0
    public final void z(String str) {
        this.a.execSQL(str);
    }
}
