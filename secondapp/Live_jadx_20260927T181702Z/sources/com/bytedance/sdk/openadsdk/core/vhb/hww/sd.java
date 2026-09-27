package com.bytedance.sdk.openadsdk.core.vhb.hww;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.openadsdk.core.bs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {
    public static int hww = 20;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static volatile sd f36904tq;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final Object f36905sd = new Object();
    private final LruCache<String, hww> vy = new LruCache<String, hww>(hww) { // from class: com.bytedance.sdk.openadsdk.core.vhb.hww.sd.1
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, hww hwwVar) {
            return 1;
        }
    };

    private sd() {
    }

    public static sd hww() {
        if (f36904tq == null) {
            synchronized (sd.class) {
                try {
                    if (f36904tq == null) {
                        f36904tq = new sd();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f36904tq;
    }

    public static String sd() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)").toString();
    }

    public static String vy() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    public List<hww> tq() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.multipro.aidl.sd sdVar = new com.bytedance.sdk.openadsdk.multipro.aidl.sd(com.bytedance.sdk.openadsdk.multipro.hww.hww.hww(bs.hww(), "ugen_template", null, null, null, null, null, null));
        try {
            if (sdVar.moveToFirst()) {
                do {
                    int columnIndex = sdVar.getColumnIndex("id");
                    int columnIndex2 = sdVar.getColumnIndex("md5");
                    int columnIndex3 = sdVar.getColumnIndex("url");
                    int columnIndex4 = sdVar.getColumnIndex("data");
                    int columnIndex5 = sdVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = sdVar.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? sdVar.getString(columnIndex6) : null;
                        String string2 = sdVar.getString(columnIndex);
                        String string3 = sdVar.getString(columnIndex2);
                        String string4 = sdVar.getString(columnIndex3);
                        hww hwwVarHww = new hww().hww(string2).tq(string3).sd(string4).vy(sdVar.getString(columnIndex4)).hv(string).hww(Long.valueOf(sdVar.getLong(columnIndex5)));
                        arrayList.add(hwwVarHww);
                        synchronized (this.f36905sd) {
                            this.vy.put(string2, hwwVarHww);
                        }
                    }
                } while (sdVar.moveToNext());
            }
            sdVar.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                omn.hww("UGTmplDbHelper", "getUgenTemplate error", th2);
                return arrayList;
            } finally {
                sdVar.close();
            }
        }
    }

    public hww hww(String str, String str2) {
        hww hwwVar;
        hww hwwVarHww;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f36905sd) {
            hwwVar = this.vy.get(str);
        }
        if (hwwVar != null) {
            if (TextUtils.equals(str2, hwwVar.tq())) {
                return hwwVar;
            }
            tq(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.sd sdVar = new com.bytedance.sdk.openadsdk.multipro.aidl.sd(com.bytedance.sdk.openadsdk.multipro.hww.hww.hww(bs.hww(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (sdVar.moveToFirst()) {
                do {
                    int columnIndex = sdVar.getColumnIndex("id");
                    int columnIndex2 = sdVar.getColumnIndex("md5");
                    int columnIndex3 = sdVar.getColumnIndex("url");
                    int columnIndex4 = sdVar.getColumnIndex("data");
                    int columnIndex5 = sdVar.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = sdVar.getColumnIndex("rit");
                        String string = sdVar.getString(columnIndex);
                        String string2 = sdVar.getString(columnIndex2);
                        String string3 = sdVar.getString(columnIndex3);
                        String string4 = sdVar.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            sdVar.close();
                            return null;
                        }
                        hwwVarHww = new hww().hww(string).tq(string2).vy(string4).sd(string3).hv(columnIndex6 != -1 ? sdVar.getString(columnIndex6) : null).hww(Long.valueOf(sdVar.getLong(columnIndex5)));
                        synchronized (this.f36905sd) {
                            this.vy.put(string, hwwVarHww);
                        }
                    }
                    sdVar.close();
                    return null;
                } while (sdVar.moveToNext());
                sdVar.close();
                return hwwVarHww;
            }
        } catch (Throwable th2) {
            try {
                omn.hww("UGTmplDbHelper", "getGgenTemplate error", th2);
            } finally {
                sdVar.close();
            }
        }
        return null;
    }

    private void tq(String str) {
        if (!TextUtils.isEmpty(str) && this.vy.size() > 0) {
            synchronized (this.f36905sd) {
                this.vy.remove(str);
            }
        }
    }

    public void hww(hww hwwVar) {
        if (hwwVar == null || TextUtils.isEmpty(hwwVar.hww())) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.sd sdVar = new com.bytedance.sdk.openadsdk.multipro.aidl.sd(com.bytedance.sdk.openadsdk.multipro.hww.hww.hww(bs.hww(), "ugen_template", null, "id=?", new String[]{hwwVar.hww()}, null, null, null));
        boolean z10 = sdVar.getCount() > 0;
        try {
            sdVar.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", hwwVar.hww());
            contentValues.put("md5", hwwVar.tq());
            contentValues.put("url", hwwVar.sd());
            contentValues.put("data", hwwVar.hv());
            contentValues.put("rit", hwwVar.hu());
            contentValues.put("update_time", hwwVar.vy());
            if (z10) {
                com.bytedance.sdk.openadsdk.multipro.hww.hww.hww(bs.hww(), "ugen_template", contentValues, "id=?", new String[]{hwwVar.hww()});
            } else {
                com.bytedance.sdk.openadsdk.multipro.hww.hww.hww(bs.hww(), "ugen_template", contentValues);
            }
            synchronized (this.f36905sd) {
                try {
                    this.vy.put(hwwVar.hww(), hwwVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public Set<hww> hww(String str) {
        hww hwwVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.multipro.aidl.sd sdVar = new com.bytedance.sdk.openadsdk.multipro.aidl.sd(com.bytedance.sdk.openadsdk.multipro.hww.hww.hww(bs.hww(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (sdVar.moveToFirst()) {
                do {
                    int columnIndex = sdVar.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = sdVar.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.f36905sd) {
                                hwwVar = this.vy.get(string);
                            }
                            if (hwwVar != null) {
                                hashSet.add(hwwVar);
                            } else {
                                hww hwwVar2 = new hww();
                                int columnIndex2 = sdVar.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = sdVar.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        hwwVar2.vy(string2);
                                        hwwVar2.hww(string);
                                        hwwVar2.hv(str);
                                        int columnIndex3 = sdVar.getColumnIndex("md5");
                                        int columnIndex4 = sdVar.getColumnIndex("url");
                                        int columnIndex5 = sdVar.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            hwwVar2.tq(sdVar.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            hwwVar2.sd(sdVar.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            hwwVar2.hww(Long.valueOf(sdVar.getLong(columnIndex5)));
                                        }
                                        hashSet.add(hwwVar2);
                                        synchronized (this.f36905sd) {
                                            this.vy.put(string, hwwVar2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (sdVar.moveToNext());
            }
            sdVar.close();
            return hashSet;
        } catch (Throwable th2) {
            try {
                omn.hww("UGTmplDbHelper", "getUgenTemplateFormRit error", th2);
                return hashSet;
            } finally {
                sdVar.close();
            }
        }
    }

    public void hww(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                tq(str);
                com.bytedance.sdk.openadsdk.multipro.hww.hww.hww(bs.hww(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }
}
