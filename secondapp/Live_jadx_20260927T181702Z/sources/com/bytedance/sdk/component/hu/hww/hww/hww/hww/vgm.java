package com.bytedance.sdk.component.hu.hww.hww.hww.hww;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.hu.hww.ok;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vgm extends sd {
    protected List<String> hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private com.bytedance.sdk.component.hu.hww.vy.tq.hww f34545sd;

    public vgm(Context context, com.bytedance.sdk.component.hu.hww.vy.tq.hww hwwVar) {
        super(context);
        this.hww = new ArrayList();
        this.f34545sd = hwwVar;
        if (hwwVar == null) {
            this.f34545sd = com.bytedance.sdk.component.hu.hww.vy.tq.hww.sd();
        }
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hww.hww.sd
    public long hu() {
        return com.bytedance.sdk.component.hu.hww.vgm.hww.tq();
    }

    public byte hww() {
        return (byte) 1;
    }

    public byte sd() {
        return (byte) 2;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hww.hww.sd
    public String tq() {
        return ok.vgm().vy().vy();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0023 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0023: PHI (r0v2 int) = (r0v0 int), (r0v6 int) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int vy() {
        Cursor cursorHww;
        int i10 = 0;
        try {
            cursorHww = com.bytedance.sdk.component.hu.hww.hww.hww.sd.hww(hv(), tq(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorHww != null) {
                try {
                    cursorHww.moveToFirst();
                    i10 = cursorHww.getInt(0);
                } catch (Throwable unused) {
                    if (cursorHww != null) {
                        try {
                            cursorHww.close();
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            if (cursorHww != null) {
                cursorHww.close();
            }
        } catch (Throwable unused3) {
            cursorHww = null;
        }
        return i10;
    }

    public static String sd(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public List<com.bytedance.sdk.component.hu.hww.vy.hww> hww(int i10, String str) {
        long jHww = com.bytedance.sdk.component.hu.hww.tq.hww.hww(i10, hv());
        if (jHww <= 0) {
            jHww = 1;
        } else if (jHww > 100) {
            jHww = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.hww.clear();
        Cursor cursorHww = com.bytedance.sdk.component.hu.hww.hww.hww.sd.hww(hv(), tq(), new String[]{"id", "value", "encrypt"}, null, null, null, null, str + " DESC limit " + jHww);
        if (cursorHww != null) {
            while (cursorHww.moveToNext()) {
                try {
                    try {
                        String string = cursorHww.getString(cursorHww.getColumnIndex("id"));
                        String string2 = cursorHww.getString(cursorHww.getColumnIndex("value"));
                        if (cursorHww.getInt(cursorHww.getColumnIndex("encrypt")) == 1) {
                            string2 = ok.vgm().wgt().hww(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.hww.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.hu.hww.vy.hww.hww hwwVar = new com.bytedance.sdk.component.hu.hww.vy.hww.hww(string, new JSONObject(string2));
                            hwwVar.tq(sd());
                            hwwVar.hww(hww());
                            arrayList.add(hwwVar);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                    try {
                        cursorHww.close();
                        if (!this.hww.isEmpty()) {
                            hww(this.hww);
                            this.hww.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
    }

    public List<com.bytedance.sdk.component.hu.hww.vy.hww> tq(String str) {
        com.bytedance.sdk.component.hu.hww.vy.tq.hww hwwVar = this.f34545sd;
        return hwwVar == null ? new ArrayList() : hww(hwwVar.tq(), str);
    }

    public void tq(List<com.bytedance.sdk.component.hu.hww.vy.hww> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.hu.hww.vy.hww hwwVar : list) {
            linkedList.add(hwwVar.sd());
            com.bytedance.sdk.component.hu.hww.sd.hww.nod(hwwVar);
        }
        tq();
        linkedList.size();
        com.bytedance.sdk.component.hu.hww.hww.hww.sd.hww(hv(), "DELETE FROM " + tq() + " WHERE " + hww("id", linkedList, 1000, true));
        sd(linkedList);
    }

    private void tq(int i10, long j10) {
        com.bytedance.sdk.component.hu.hww.hww.hww.sd.hww(hv(), tq(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)});
    }

    public void hww(List<String> list) {
        tq();
        list.size();
        com.bytedance.sdk.component.hu.hww.hww.hww.sd.hww(hv(), "DELETE FROM " + tq() + " WHERE " + hww("id", list, 1000, true));
        com.bytedance.sdk.component.hu.hww.sd.tq.hww(com.bytedance.sdk.component.hu.hww.tq.vy.vy.ep(), list.size());
        sd(list);
    }

    public void hww(int i10, long j10) {
        tq(i10, j10);
    }

    public boolean hww(int i10) {
        return this.f34545sd != null && vy() >= this.f34545sd.hww();
    }

    private static String hww(String str, List<?> list, int i10, boolean z10) {
        int i11;
        String str2 = z10 ? " IN " : " NOT IN ";
        String str3 = z10 ? " OR " : " AND ";
        int iMin = Math.min(i10, 1000);
        int size = list.size();
        if (size % iMin == 0) {
            i11 = size / iMin;
        } else {
            i11 = (size / iMin) + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * iMin;
            String strHww = hww(TextUtils.join("','", list.subList(i13, Math.min(i13 + iMin, size))), "");
            if (i12 != 0) {
                sb2.append(str3);
            }
            sb2.append(str);
            sb2.append(str2);
            sb2.append("('");
            sb2.append(strHww);
            sb2.append("')");
        }
        return hww(sb2.toString(), str + str2 + "('')");
    }

    private static String hww(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
