package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu {

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static final Object f36153sd = new Object();
    private sd hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private Context f36154tq;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class tq extends AbstractCursor {
        private tq() {
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i10) {
            return 0.0d;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i10) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i10) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i10) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i10) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i10) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i10) {
            return true;
        }
    }

    public hu(Context context) {
        try {
            this.f36154tq = context == null ? bs.hww() : context.getApplicationContext();
            if (this.hww == null) {
                this.hww = new sd();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context sd() {
        Context context = this.f36154tq;
        return context == null ? bs.hww() : context;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class sd {

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private SQLiteDatabase f36156tq = null;

        public sd() {
        }

        private synchronized boolean hu() {
            SQLiteDatabase sQLiteDatabase = this.f36156tq;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        private synchronized void hv() {
            try {
                synchronized (hu.f36153sd) {
                    try {
                        SQLiteDatabase sQLiteDatabase = this.f36156tq;
                        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                            hu huVar = hu.this;
                            SQLiteDatabase writableDatabase = huVar.new hww(huVar.sd()).getWritableDatabase();
                            this.f36156tq = writableDatabase;
                            writableDatabase.setLockingEnabled(false);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                com.bytedance.sdk.component.utils.omn.sd("DBHelper", th3.getMessage());
                if (hu()) {
                    throw th3;
                }
            }
        }

        public SQLiteDatabase hww() {
            hv();
            return this.f36156tq;
        }

        public synchronized void sd() {
            hv();
            SQLiteDatabase sQLiteDatabase = this.f36156tq;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void tq() {
            hv();
            SQLiteDatabase sQLiteDatabase = this.f36156tq;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public synchronized void vy() {
            hv();
            SQLiteDatabase sQLiteDatabase = this.f36156tq;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        public synchronized void hww(String str) throws SQLException {
            try {
                hv();
                this.f36156tq.execSQL(str);
            } catch (Throwable th2) {
                if (hu()) {
                    throw th2;
                }
            }
        }

        public synchronized Cursor hww(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                hv();
                cursorQuery = this.f36156tq.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.omn.sd("DBHelper", th2.getMessage());
                tq tqVar = new tq();
                if (hu()) {
                    throw th2;
                }
                cursorQuery = tqVar;
            }
            return cursorQuery;
        }

        public synchronized int hww(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                hv();
                iUpdate = this.f36156tq.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.omn.sd("DBHelper", e10.getMessage());
                if (hu()) {
                    throw e10;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        public synchronized long hww(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                hv();
                jReplace = this.f36156tq.replace(str, str2, contentValues);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.omn.sd("DBHelper", e10.getMessage());
                if (hu()) {
                    throw e10;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        public synchronized int hww(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                hv();
                iDelete = this.f36156tq.delete(str, str2, strArr);
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.omn.sd("DBHelper", e10.getMessage());
                if (hu()) {
                    throw e10;
                }
                iDelete = 0;
            }
            return iDelete;
        }
    }

    public sd hww() {
        return this.hww;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class hww extends SQLiteOpenHelper {
        final Context hww;

        public hww(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 11);
            this.hww = context;
        }

        private void hww(SQLiteDatabase sQLiteDatabase, Context context) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.vy.vy.hww());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.vy.vhb.sd());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.vy.wgt.hww());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.vy.weu.hww());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.grv.tq.hww());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.vy.jpb.sd());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.hww.tq.tq.sd());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.vhb.hww.sd.sd());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.vy.bs.hww());
        }

        private void sd(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayListVy = vy(sQLiteDatabase);
            if (arrayListVy == null || arrayListVy.size() <= 0) {
                return;
            }
            Iterator<String> it = arrayListVy.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }

        private void tq(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.vhb.hww.sd.vy());
        }

        private ArrayList<String> vy(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        String string = cursorRawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                    return arrayList;
                }
            } catch (Exception unused) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th2) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th2;
            }
            return arrayList;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                hww(sQLiteDatabase, this.hww);
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.omn.sd("DBHelper", th2.getMessage());
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 > i11) {
                try {
                    sd(sQLiteDatabase);
                    hww(sQLiteDatabase, hu.this.f36154tq);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.omn.vy(th2.getMessage(), new Object[0]);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:11:0x0037 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:12:0x0040 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:6:0x0011 A[DONT_GENERATE] */
        /* JADX WARN: Code duplicated, block: B:7:0x0012 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:8:0x0016 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Code duplicated, block: B:9:0x0021 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            if (i10 <= i11) {
                hww(sQLiteDatabase, hu.this.f36154tq);
                switch (i10) {
                    case 1:
                        hww(sQLiteDatabase);
                        break;
                    case 2:
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                        hww(sQLiteDatabase);
                        break;
                    case 3:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.vy.wgt.hww());
                        hww(sQLiteDatabase);
                        break;
                    case 4:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.hww.tq.tq.sd());
                        hww(sQLiteDatabase);
                        break;
                    case 5:
                        sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.vy.weu.hww());
                        hww(sQLiteDatabase);
                        break;
                    case 6:
                        hww(sQLiteDatabase);
                        break;
                }
            } else {
                try {
                    sd(sQLiteDatabase);
                    hww(sQLiteDatabase, hu.this.f36154tq);
                    switch (i10) {
                        case 1:
                            hww(sQLiteDatabase);
                            break;
                        case 2:
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'ad_video_info';");
                            hww(sQLiteDatabase);
                            break;
                        case 3:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.vy.wgt.hww());
                            hww(sQLiteDatabase);
                            break;
                        case 4:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.hww.tq.tq.sd());
                            hww(sQLiteDatabase);
                            break;
                        case 5:
                            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.vy.weu.hww());
                            hww(sQLiteDatabase);
                            break;
                        case 6:
                            hww(sQLiteDatabase);
                            break;
                    }
                } catch (Throwable unused) {
                }
            }
            if (i10 < 11) {
                try {
                    tq(sQLiteDatabase);
                    com.bytedance.sdk.openadsdk.grv.tq.hww(sQLiteDatabase);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.omn.sd("DBHelper", th2.getMessage());
                }
            }
        }

        private void hww(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.vy.vy.tq());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.vy.vhb.vy());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.vy.wgt.tq());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.vy.weu.tq());
        }
    }
}
