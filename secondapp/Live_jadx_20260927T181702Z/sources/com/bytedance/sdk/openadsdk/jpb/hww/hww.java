package com.bytedance.sdk.openadsdk.jpb.hww;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.omn;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static volatile hww f37428tq;
    final Context hww;

    private hww(Context context) {
        super(context, "pag_monitor.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.hww = context;
    }

    public static SQLiteDatabase hww() {
        try {
            hww hwwVarSd = sd();
            if (hwwVarSd == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = hwwVarSd.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th2) {
            Log.i("MonitorSQLiteOpenHelper", th2.getMessage());
            return null;
        }
    }

    private static hww sd() {
        if (f37428tq == null) {
            synchronized (hww.class) {
                try {
                    if (f37428tq == null) {
                        f37428tq = new hww(com.bytedance.sdk.openadsdk.jpb.hww.hww());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f37428tq;
    }

    public static SQLiteDatabase tq() {
        try {
            hww hwwVarSd = sd();
            if (hwwVarSd == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = hwwVarSd.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th2) {
            Log.i("MonitorSQLiteOpenHelper", th2.getMessage());
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(new StringBuilder("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )").toString());
        } catch (Throwable th2) {
            Log.e("MonitorSQLiteOpenHelper", th2.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (i10 <= i11) {
                onCreate(sQLiteDatabase);
            } else {
                hww(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    private void hww(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListTq = tq(sQLiteDatabase);
        if (arrayListTq == null || arrayListTq.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayListTq.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    private ArrayList<String> tq(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                cursorRawQuery.close();
            }
            return arrayList;
        } catch (Exception e10) {
            omn.sd("MonitorSQLiteOpenHelper", e10.getMessage());
            return arrayList;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
