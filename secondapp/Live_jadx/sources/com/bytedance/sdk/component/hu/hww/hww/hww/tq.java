package com.bytedance.sdk.component.hu.hww.hww.hww;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.sdk.component.hu.hww.ok;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
class tq {
    private C0322tq hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private Context f34546tq;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class hww extends AbstractCursor {
        private hww() {
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

    public tq(Context context) {
        try {
            this.f34546tq = context.getApplicationContext();
            if (this.hww == null) {
                this.hww = new C0322tq();
            }
        } catch (Throwable unused) {
        }
    }

    public C0322tq hww() {
        return this.hww;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.hu.hww.hww.hww.tq$tq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0322tq {

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private volatile SQLiteDatabase f34547tq = null;

        public C0322tq() {
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x000d */
        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void hww() {
            /*
                r2 = this;
                android.database.sqlite.SQLiteDatabase r0 = r2.f34547tq     // Catch: java.lang.Throwable -> Ld
                if (r0 == 0) goto Lf
                android.database.sqlite.SQLiteDatabase r0 = r2.f34547tq     // Catch: java.lang.Throwable -> Ld
                boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> Ld
                if (r0 != 0) goto L45
                goto Lf
            Ld:
                r0 = move-exception
                goto L3f
            Lf:
                monitor-enter(r2)     // Catch: java.lang.Throwable -> Ld
                android.database.sqlite.SQLiteDatabase r0 = r2.f34547tq     // Catch: java.lang.Throwable -> L1d
                if (r0 == 0) goto L1f
                android.database.sqlite.SQLiteDatabase r0 = r2.f34547tq     // Catch: java.lang.Throwable -> L1d
                boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L1d
                if (r0 != 0) goto L3b
                goto L1f
            L1d:
                r0 = move-exception
                goto L3d
            L1f:
                com.bytedance.sdk.component.hu.hww.ok r0 = com.bytedance.sdk.component.hu.hww.ok.vgm()     // Catch: java.lang.Throwable -> L1d
                com.bytedance.sdk.component.hu.hww.hww.hv r0 = r0.vy()     // Catch: java.lang.Throwable -> L1d
                com.bytedance.sdk.component.hu.hww.ok r1 = com.bytedance.sdk.component.hu.hww.ok.vgm()     // Catch: java.lang.Throwable -> L1d
                android.content.Context r1 = r1.hu()     // Catch: java.lang.Throwable -> L1d
                android.database.sqlite.SQLiteDatabase r0 = r0.hww(r1)     // Catch: java.lang.Throwable -> L1d
                r2.f34547tq = r0     // Catch: java.lang.Throwable -> L1d
                android.database.sqlite.SQLiteDatabase r0 = r2.f34547tq     // Catch: java.lang.Throwable -> L1d
                r1 = 0
                r0.setLockingEnabled(r1)     // Catch: java.lang.Throwable -> L1d
            L3b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
                return
            L3d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
                throw r0     // Catch: java.lang.Throwable -> Ld
            L3f:
                boolean r1 = r2.tq()
                if (r1 != 0) goto L46
            L45:
                return
            L46:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.hu.hww.hww.hww.tq.C0322tq.hww():void");
        }

        private boolean tq() {
            SQLiteDatabase sQLiteDatabase = this.f34547tq;
            return sQLiteDatabase != null && sQLiteDatabase.inTransaction();
        }

        public void hww(String str) throws SQLException {
            try {
                hww();
                this.f34547tq.execSQL(str);
            } catch (Throwable th2) {
                if (tq()) {
                    throw th2;
                }
            }
        }

        public Cursor hww(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            try {
                hww();
                return this.f34547tq.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th2) {
                hww hwwVar = new hww();
                if (tq()) {
                    throw th2;
                }
                return hwwVar;
            }
        }

        public int hww(String str, ContentValues contentValues, String str2, String[] strArr) throws Exception {
            try {
                hww();
                return this.f34547tq.update(str, contentValues, str2, strArr);
            } catch (Exception e10) {
                if (tq()) {
                    throw e10;
                }
                return 0;
            }
        }

        public long hww(String str, String str2, ContentValues contentValues) throws Exception {
            try {
                hww();
                return this.f34547tq.insert(str, str2, contentValues);
            } catch (Exception e10) {
                if (tq()) {
                    throw e10;
                }
                return -1L;
            }
        }

        public synchronized void hww(String str, String str2, List<com.bytedance.sdk.component.hu.hww.vy.hww> list) {
            JSONObject jSONObjectVgm;
            try {
                try {
                    hww();
                    this.f34547tq.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        com.bytedance.sdk.component.hu.hww.vy.hww hwwVar = list.get(i10);
                        if (hwwVar != null && (jSONObjectVgm = hwwVar.vgm()) != null) {
                            contentValues.put("id", hwwVar.sd());
                            String strTq = ok.vgm().wgt().tq(jSONObjectVgm.toString());
                            if (!TextUtils.isEmpty(strTq)) {
                                contentValues.put("value", strTq);
                                contentValues.put("gen_time", Long.valueOf(System.currentTimeMillis()));
                                contentValues.put("retry", (Integer) 0);
                                contentValues.put("encrypt", (Integer) 1);
                                if (com.bytedance.sdk.component.hu.hww.sd.hww.vy() && hwwVar.nod() > 0 && (hwwVar.vy() == 0 || hwwVar.vy() == 3)) {
                                    contentValues.put("channel", Integer.valueOf(hwwVar.nod()));
                                }
                                this.f34547tq.insert(str, str2, contentValues);
                            }
                            contentValues.clear();
                        }
                    }
                    this.f34547tq.setTransactionSuccessful();
                    list.size();
                    if (this.f34547tq != null) {
                        this.f34547tq.endTransaction();
                    }
                } catch (Exception e10) {
                    list.size();
                    if (!tq()) {
                        if (this.f34547tq != null) {
                            this.f34547tq.endTransaction();
                        }
                    } else {
                        throw e10;
                    }
                }
            } catch (Throwable th2) {
                if (this.f34547tq != null) {
                    this.f34547tq.endTransaction();
                }
                throw th2;
            }
        }

        public int hww(String str, String str2, String[] strArr) throws Exception {
            try {
                hww();
                return this.f34547tq.delete(str, str2, strArr);
            } catch (Exception e10) {
                if (tq()) {
                    throw e10;
                }
                return 0;
            }
        }
    }
}
