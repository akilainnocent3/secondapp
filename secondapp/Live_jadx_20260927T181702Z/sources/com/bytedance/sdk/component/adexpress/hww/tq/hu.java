package com.bytedance.sdk.component.adexpress.hww.tq;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu {
    public static int hww = 20;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static volatile hu f34428tq;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.hww.sd.sd> f34430hv;
    private final Object vy = new Object();

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private AtomicBoolean f34429hu = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.hww.sd.tq> vgm = new LruCache<String, com.bytedance.sdk.component.adexpress.hww.sd.tq>(hww) { // from class: com.bytedance.sdk.component.adexpress.hww.tq.hu.1
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.hww.sd.tq tqVar) {
            return 1;
        }
    };

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private Set<String> f34431sd = Collections.synchronizedSet(new HashSet());

    private hu() {
    }

    public static void hww(int i10) {
        hww = i10;
    }

    private void vy(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.hww.sd.tq> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.vgm) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.vy) {
            this.vgm.remove(str);
        }
    }

    public void sd(String str) {
        com.bytedance.sdk.component.adexpress.hww.sd.sd sdVar;
        try {
            if (this.f34430hv != null && !this.f34430hv.isEmpty() && (sdVar = this.f34430hv.get(str)) != null) {
                if (!TextUtils.isEmpty(sdVar.hww()) && com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().hu() != null) {
                    com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().hu();
                }
                this.f34430hv.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public Set<String> tq(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().tq() != null) {
            HashSet hashSet = new HashSet();
            Cursor cursorHww = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().tq().hww("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            if (cursorHww != null) {
                try {
                    try {
                        if (cursorHww.moveToFirst()) {
                            do {
                                hashSet.add(cursorHww.getString(cursorHww.getColumnIndex("id")));
                            } while (cursorHww.moveToNext());
                            return hashSet;
                        }
                    } catch (Exception e10) {
                        Log.e("TmplDbHelper", "", e10);
                    }
                } finally {
                    cursorHww.close();
                }
            }
        }
        return null;
    }

    public static hu hww() {
        if (f34428tq == null) {
            synchronized (hu.class) {
                try {
                    if (f34428tq == null) {
                        f34428tq = new hu();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f34428tq;
    }

    public static String sd() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)").toString();
    }

    public com.bytedance.sdk.component.adexpress.hww.sd.tq hww(String str) {
        com.bytedance.sdk.component.adexpress.hww.sd.tq tqVar;
        com.bytedance.sdk.component.adexpress.hww.sd.tq tqVarHww;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().tq() == null) {
            return null;
        }
        synchronized (this.vy) {
            tqVar = this.vgm.get(String.valueOf(str));
        }
        if (tqVar != null) {
            return tqVar;
        }
        Cursor cursorHww = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().tq().hww("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (cursorHww != null) {
            try {
                if (cursorHww.moveToFirst()) {
                    do {
                        String string = cursorHww.getString(cursorHww.getColumnIndex("rit"));
                        String string2 = cursorHww.getString(cursorHww.getColumnIndex("id"));
                        String string3 = cursorHww.getString(cursorHww.getColumnIndex("md5"));
                        String string4 = cursorHww.getString(cursorHww.getColumnIndex("url"));
                        String string5 = cursorHww.getString(cursorHww.getColumnIndex("data"));
                        String string6 = cursorHww.getString(cursorHww.getColumnIndex("version"));
                        tqVarHww = new com.bytedance.sdk.component.adexpress.hww.sd.tq().hww(string).tq(string2).sd(string3).vy(string4).hv(string5).hu(string6).hww(Long.valueOf(cursorHww.getLong(cursorHww.getColumnIndex("update_time"))));
                        synchronized (this.vy) {
                            this.vgm.put(string2, tqVarHww);
                        }
                        this.f34431sd.add(string2);
                    } while (cursorHww.moveToNext());
                    cursorHww.close();
                    return tqVarHww;
                }
            } catch (Throwable unused) {
            }
            cursorHww.close();
        }
        return null;
    }

    public List<com.bytedance.sdk.component.adexpress.hww.sd.tq> tq() {
        if (com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().tq() == null) {
            return null;
        }
        boolean z10 = this.f34429hu.get();
        this.f34429hu.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor cursorHww = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().tq().hww("template_diff_new", null, null, null, null, null, null);
        if (cursorHww != null) {
            while (cursorHww.moveToNext()) {
                try {
                    String string = cursorHww.getString(cursorHww.getColumnIndex("rit"));
                    String string2 = cursorHww.getString(cursorHww.getColumnIndex("id"));
                    String string3 = cursorHww.getString(cursorHww.getColumnIndex("md5"));
                    String string4 = cursorHww.getString(cursorHww.getColumnIndex("url"));
                    String string5 = cursorHww.getString(cursorHww.getColumnIndex("data"));
                    String string6 = cursorHww.getString(cursorHww.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.hww.sd.tq().hww(string).tq(string2).sd(string3).vy(string4).hv(string5).hu(string6).hww(Long.valueOf(cursorHww.getLong(cursorHww.getColumnIndex("update_time")))));
                    synchronized (this.vy) {
                        this.vgm.put(string2, (com.bytedance.sdk.component.adexpress.hww.sd.tq) arrayList.get(arrayList.size() - 1));
                    }
                    this.f34431sd.add(string2);
                    if (!z10 && com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().hu() != null) {
                        if (this.f34430hv == null) {
                            this.f34430hv = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.f34430hv.contains(string2)) {
                            this.f34430hv.put(string2, new com.bytedance.sdk.component.adexpress.hww.sd.sd(string, string2, string3));
                        }
                    }
                } catch (Throwable unused) {
                    cursorHww.close();
                }
            }
            cursorHww.close();
            return arrayList;
        }
        return arrayList;
    }

    public void hww(com.bytedance.sdk.component.adexpress.hww.sd.tq tqVar, boolean z10) {
        if (tqVar == null || com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().tq() == null || TextUtils.isEmpty(tqVar.tq())) {
            return;
        }
        Cursor cursorHww = com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().tq().hww("template_diff_new", null, "id=?", new String[]{tqVar.tq()}, null, null, null);
        boolean z11 = cursorHww != null && cursorHww.getCount() > 0;
        String string = null;
        if (cursorHww != null) {
            try {
                string = cursorHww.moveToFirst() ? cursorHww.getString(cursorHww.getColumnIndex("rit")) : null;
                cursorHww.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", tqVar.hww());
        contentValues.put("id", tqVar.tq());
        contentValues.put("md5", tqVar.sd());
        contentValues.put("url", tqVar.vy());
        contentValues.put("data", tqVar.hv());
        contentValues.put("version", tqVar.hu());
        contentValues.put("update_time", tqVar.vgm());
        if (z11) {
            com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().tq().hww("template_diff_new", contentValues, "id=?", new String[]{tqVar.tq()});
        } else {
            com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().tq().hww("template_diff_new", contentValues);
        }
        synchronized (this.vy) {
            this.vgm.put(tqVar.tq(), tqVar);
        }
        this.f34431sd.add(tqVar.tq());
        if (z10) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().hu() == null) {
                return;
            }
            if (this.f34430hv == null) {
                this.f34430hv = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.hww.sd.sd sdVar = new com.bytedance.sdk.component.adexpress.hww.sd.sd(tqVar.hww(), tqVar.tq(), tqVar.sd());
            this.f34430hv.put(tqVar.tq(), sdVar);
            if (string != null) {
                com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().hu();
                sdVar.tq();
            }
            com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().hu();
            tqVar.hww();
        } catch (Throwable unused2) {
        }
    }

    public void hww(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().tq() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                vy(strArr[i10]);
                com.bytedance.sdk.component.adexpress.hww.hww.hww.hww().tq().hww("template_diff_new", "id=?", new String[]{strArr[i10]});
                sd(strArr[i10]);
            }
        }
    }
}
