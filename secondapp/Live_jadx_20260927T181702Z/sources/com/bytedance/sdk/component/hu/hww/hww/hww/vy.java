package com.bytedance.sdk.component.hu.hww.hww.hww;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.hu.hww.ok;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy extends SQLiteOpenHelper {
    final Context hww;

    public vy(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.hww = context;
    }

    private void hww(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.hu.hww.hww.hww.hww.hww.tq(ok.vgm().vy().tq()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.hu.hww.hww.hww.hww.vy.sd(ok.vgm().vy().hww()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.hu.hww.hww.hww.hww.vgm.sd(ok.vgm().vy().vy()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.hu.hww.hww.hww.hww.hu.hww(ok.vgm().vy().hv()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.hu.hww.hu.hu.tq());
    }

    private ArrayList<String> sd(SQLiteDatabase sQLiteDatabase) {
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
        } catch (Exception unused) {
        }
        return arrayList;
    }

    private void tq(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayListSd = sd(sQLiteDatabase);
        if (arrayListSd == null || arrayListSd.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayListSd.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            hww(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (i10 <= i11) {
                hww(sQLiteDatabase);
            } else {
                tq(sQLiteDatabase);
                hww(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }
}
