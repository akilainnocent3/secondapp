package com.bytedance.sdk.openadsdk.jpb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import eq.c;
import gi.j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static Context f37421hv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.jpb.sd.hww f37424sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private tq f37425tq;
    private Boolean vy;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static final long f37420hu = System.currentTimeMillis();
    public static final long hww = com.bytedance.sdk.openadsdk.jpb.vy.hww.hww();
    private int vgm = 0;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final ArrayList<vy> f37422ok = new ArrayList<>();

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final Runnable f37423rs = new Runnable() { // from class: com.bytedance.sdk.openadsdk.jpb.hww.2
        @Override // java.lang.Runnable
        public void run() {
            hww hwwVar = hww.this;
            hwwVar.vy = Boolean.valueOf(hwwVar.f37425tq.isMonitorOpen());
            if (!hww.this.vy.booleanValue() || hww.this.f37422ok.isEmpty()) {
                return;
            }
            hww hwwVar2 = hww.this;
            hwwVar2.hww(hwwVar2.f37422ok);
            hww.this.f37422ok.clear();
        }
    };
    private Runnable nod = new Runnable() { // from class: com.bytedance.sdk.openadsdk.jpb.hww.4
        @Override // java.lang.Runnable
        public void run() {
            String str = "extra";
            String str2 = "is_init";
            try {
                SQLiteDatabase sQLiteDatabaseTq = com.bytedance.sdk.openadsdk.jpb.hww.hww.tq();
                if (sQLiteDatabaseTq != null) {
                    String[] strArr = {c.f81516f, "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"};
                    String[] strArr2 = {String.valueOf(hww.this.f37425tq.getOnceLogInterval() < 86400000 ? hww.f37420hu : hww.hww)};
                    int iMax = Math.max(10, hww.this.f37425tq.getOnceLogCount());
                    int i10 = iMax > 100 ? 10 : iMax;
                    int i11 = i10;
                    Cursor cursorQuery = sQLiteDatabaseTq.query("monitor_table", strArr, "timestamp < ?", strArr2, null, null, null, String.valueOf(i10));
                    if (cursorQuery != null) {
                        ArrayList arrayList = new ArrayList();
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            while (cursorQuery.moveToNext()) {
                                ArrayList arrayList3 = arrayList;
                                com.bytedance.sdk.openadsdk.jpb.tq.hww hwwVar = new com.bytedance.sdk.openadsdk.jpb.tq.hww();
                                if (cursorQuery.getColumnIndex(c.f81516f) >= 0) {
                                    long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex(c.f81516f));
                                    hwwVar.hww(j10);
                                    arrayList2.add(String.valueOf(j10));
                                }
                                if (cursorQuery.getColumnIndex("sdk_version") >= 0) {
                                    hwwVar.hww(cursorQuery.getString(cursorQuery.getColumnIndex("sdk_version")));
                                }
                                if (cursorQuery.getColumnIndex("scene") >= 0) {
                                    hwwVar.tq(cursorQuery.getString(cursorQuery.getColumnIndex("scene")));
                                }
                                if (cursorQuery.getColumnIndex("start_count") >= 0) {
                                    hwwVar.hww(cursorQuery.getInt(cursorQuery.getColumnIndex("start_count")));
                                }
                                if (cursorQuery.getColumnIndex("success_count") >= 0) {
                                    hwwVar.tq(cursorQuery.getInt(cursorQuery.getColumnIndex("success_count")));
                                }
                                if (cursorQuery.getColumnIndex("fail_count") >= 0) {
                                    hwwVar.sd(cursorQuery.getInt(cursorQuery.getColumnIndex("fail_count")));
                                }
                                if (cursorQuery.getColumnIndex("rit") >= 0) {
                                    hwwVar.sd(cursorQuery.getString(cursorQuery.getColumnIndex("rit")));
                                }
                                if (cursorQuery.getColumnIndex("tag") >= 0) {
                                    hwwVar.vy(cursorQuery.getString(cursorQuery.getColumnIndex("tag")));
                                }
                                if (cursorQuery.getColumnIndex("label") >= 0) {
                                    hwwVar.hv(cursorQuery.getString(cursorQuery.getColumnIndex("label")));
                                }
                                if (cursorQuery.getColumnIndex("timestamp") >= 0) {
                                    hwwVar.tq(cursorQuery.getLong(cursorQuery.getColumnIndex("timestamp")));
                                }
                                if (cursorQuery.getColumnIndex("mediation") >= 0) {
                                    hwwVar.hu(cursorQuery.getString(cursorQuery.getColumnIndex("mediation")));
                                }
                                String str3 = str2;
                                if (cursorQuery.getColumnIndex(str3) >= 0) {
                                    hwwVar.vy(cursorQuery.getInt(cursorQuery.getColumnIndex(str3)));
                                }
                                String str4 = str;
                                if (cursorQuery.getColumnIndex(str4) >= 0) {
                                    hwwVar.vgm(cursorQuery.getString(cursorQuery.getColumnIndex(str4)));
                                }
                                arrayList3.add(hwwVar);
                                arrayList = arrayList3;
                                str = str4;
                                str2 = str3;
                            }
                            ArrayList arrayList4 = arrayList;
                            cursorQuery.close();
                            if (!arrayList4.isEmpty()) {
                                try {
                                    hww.this.f37425tq.onMonitorUpload(arrayList4);
                                    SQLiteDatabase sQLiteDatabaseHww = com.bytedance.sdk.openadsdk.jpb.hww.hww.hww();
                                    if (sQLiteDatabaseHww != null && sQLiteDatabaseHww.isOpen()) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("_id IN (");
                                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                            sb2.append("?");
                                            if (i12 < arrayList2.size() - 1) {
                                                sb2.append(",");
                                            }
                                        }
                                        sb2.append(j.f86771d);
                                        sQLiteDatabaseHww.delete("monitor_table", sb2.toString(), (String[]) arrayList2.toArray(new String[0]));
                                        if (hww.this.f37424sd != null) {
                                            hww.this.f37424sd.hww(hww.f37420hu);
                                        }
                                    }
                                    if (arrayList4.size() < i11 || hww.this.vgm > 1000) {
                                        return;
                                    }
                                    hww.this.hww(false);
                                } catch (Throwable unused) {
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            } catch (Throwable unused3) {
            }
        }
    };

    private hww(tq tqVar) {
        try {
            this.f37425tq = new BusMonitorDependWrapper(tqVar);
            this.f37424sd = new com.bytedance.sdk.openadsdk.jpb.sd.hww(tqVar.getContext());
            f37421hv = tqVar.getContext();
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ int hv(hww hwwVar) {
        int i10 = hwwVar.vgm;
        hwwVar.vgm = i10 + 1;
        return i10;
    }

    private boolean sd() {
        if (this.vy == null) {
            tq tqVar = this.f37425tq;
            return (tqVar == null || tqVar.getContext() == null || this.f37425tq.getHandler() == null) ? false : true;
        }
        tq tqVar2 = this.f37425tq;
        return (tqVar2 == null || tqVar2.getContext() == null || !this.f37425tq.isMonitorOpen() || this.f37425tq.getHandler() == null) ? false : true;
    }

    public static hww hww(tq tqVar) {
        return new hww(tqVar);
    }

    public static Context hww() {
        Context context = f37421hv;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void hww(final vy vyVar) {
        if (vyVar == null || !sd()) {
            return;
        }
        this.f37425tq.getHandler().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jpb.hww.1
            @Override // java.lang.Runnable
            public void run() {
                hww hwwVar = hww.this;
                hwwVar.vy = Boolean.valueOf(hwwVar.f37425tq.isMonitorOpen());
                if (hww.this.vy.booleanValue()) {
                    hww.this.f37422ok.add(vyVar);
                    if (hww.this.f37422ok.size() >= 10) {
                        hww.this.f37425tq.getHandler().removeCallbacks(hww.this.f37423rs);
                        hww hwwVar2 = hww.this;
                        hwwVar2.hww(hwwVar2.f37422ok);
                        hww.this.f37422ok.clear();
                    }
                }
            }
        });
        this.f37425tq.getHandler().removeCallbacks(this.f37423rs);
        this.f37425tq.getHandler().postDelayed(this.f37423rs, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hww(List<vy> list) {
        com.bytedance.sdk.openadsdk.jpb.tq.hww hwwVarHww;
        SQLiteDatabase sQLiteDatabase = null;
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    SQLiteDatabase sQLiteDatabaseHww = com.bytedance.sdk.openadsdk.jpb.hww.hww.hww();
                    if (sQLiteDatabaseHww != null) {
                        try {
                            sQLiteDatabaseHww.beginTransaction();
                            for (int i10 = 0; i10 < list.size(); i10++) {
                                vy vyVar = list.get(i10);
                                if (vyVar != null && (hwwVarHww = vyVar.hww()) != null) {
                                    Cursor cursorQuery = sQLiteDatabaseHww.query("monitor_table", new String[]{c.f81516f, "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", "mediation", "is_init", "extra"}, new StringBuilder("sdk_version = ? AND scene = ? AND rit = ? AND tag = ? AND label = ? AND mediation = ? AND is_init = ? AND timestamp = ? AND extra = ?").toString(), new String[]{hwwVarHww.tq(), hwwVarHww.sd(), hwwVarHww.vgm(), hwwVarHww.ok(), hwwVarHww.rs(), hwwVarHww.vhb(), String.valueOf(hwwVarHww.ny()), String.valueOf(hwwVarHww.nod()), hwwVarHww.ed()}, null, null, null);
                                    if (cursorQuery != null) {
                                        if (cursorQuery.moveToNext()) {
                                            int columnIndex = cursorQuery.getColumnIndex(c.f81516f);
                                            if (columnIndex >= 0) {
                                                hwwVarHww.hww(cursorQuery.getLong(columnIndex));
                                            }
                                            int columnIndex2 = cursorQuery.getColumnIndex("start_count");
                                            if (columnIndex2 >= 0) {
                                                hwwVarHww.hww(cursorQuery.getInt(columnIndex2) + hwwVarHww.vy());
                                            }
                                            int columnIndex3 = cursorQuery.getColumnIndex("success_count");
                                            if (columnIndex3 >= 0) {
                                                hwwVarHww.tq(cursorQuery.getInt(columnIndex3) + hwwVarHww.hv());
                                            }
                                            int columnIndex4 = cursorQuery.getColumnIndex("fail_count");
                                            if (columnIndex4 >= 0) {
                                                hwwVarHww.sd(cursorQuery.getInt(columnIndex4) + hwwVarHww.hu());
                                            }
                                        }
                                        cursorQuery.close();
                                    }
                                    ContentValues contentValues = new ContentValues();
                                    if (hwwVarHww.hww() > 0) {
                                        contentValues.put(c.f81516f, Long.valueOf(hwwVarHww.hww()));
                                    }
                                    contentValues.put("sdk_version", hwwVarHww.tq());
                                    contentValues.put("scene", hwwVarHww.sd());
                                    contentValues.put("start_count", Integer.valueOf(hwwVarHww.vy()));
                                    contentValues.put("success_count", Integer.valueOf(hwwVarHww.hv()));
                                    contentValues.put("fail_count", Integer.valueOf(hwwVarHww.hu()));
                                    contentValues.put("rit", hwwVarHww.vgm());
                                    contentValues.put("tag", hwwVarHww.ok());
                                    contentValues.put("label", hwwVarHww.rs());
                                    contentValues.put("timestamp", Long.valueOf(hwwVarHww.nod()));
                                    contentValues.put("mediation", hwwVarHww.vhb());
                                    contentValues.put("is_init", Integer.valueOf(hwwVarHww.ny()));
                                    contentValues.put("extra", hwwVarHww.ed());
                                    sQLiteDatabaseHww.insertWithOnConflict("monitor_table", null, contentValues, 5);
                                }
                            }
                            sQLiteDatabaseHww.setTransactionSuccessful();
                        } catch (Throwable unused) {
                            sQLiteDatabase = sQLiteDatabaseHww;
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                    return;
                                } catch (Throwable unused2) {
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    sQLiteDatabase = sQLiteDatabaseHww;
                }
            } catch (Throwable unused3) {
            }
        }
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused4) {
            }
        }
    }

    public void hww(final boolean z10) {
        tq tqVar = this.f37425tq;
        if (tqVar == null || tqVar.getHandler() == null || this.f37425tq.getContext() == null || this.f37424sd == null || !this.f37425tq.isMonitorOpen()) {
            return;
        }
        this.f37425tq.getHandler().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jpb.hww.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    hww.hv(hww.this);
                    if (z10) {
                        long jHww = hww.this.f37424sd.hww();
                        if (jHww == 0) {
                            hww.this.f37424sd.hww(System.currentTimeMillis());
                            return;
                        } else if (com.bytedance.sdk.openadsdk.jpb.vy.hww.hww(jHww) && System.currentTimeMillis() - jHww < hww.this.f37425tq.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    if (hww.this.f37425tq.getHandler() != null) {
                        hww.this.f37425tq.getHandler().post(hww.this.nod);
                    }
                } catch (Throwable unused) {
                }
            }
        }, Math.max(this.f37425tq.getOnceLogInterval(), 10000));
    }
}
