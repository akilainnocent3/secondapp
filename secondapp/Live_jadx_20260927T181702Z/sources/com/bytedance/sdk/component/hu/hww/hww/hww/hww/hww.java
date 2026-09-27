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
public class hww extends sd {
    protected List<String> hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final Context f34538sd;
    private com.bytedance.sdk.component.hu.hww.vy.tq.hww vy;

    public hww(Context context, com.bytedance.sdk.component.hu.hww.vy.tq.hww hwwVar) {
        super(context);
        this.hww = new ArrayList();
        this.f34538sd = context;
        this.vy = hwwVar;
        if (hwwVar == null) {
            this.vy = com.bytedance.sdk.component.hu.hww.vy.tq.hww.sd();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0027 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r0 r1
      0x0027: PHI (r0v3 int) = (r0v0 int), (r0v5 int) binds: [B:15:0x0031, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r1v3 android.database.Cursor) = (r1v2 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:15:0x0031, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public int hww() {
        Cursor cursorHww = null;
        int i10 = 0;
        try {
            cursorHww = com.bytedance.sdk.component.hu.hww.hww.hww.sd.hww(hv(), tq(), new String[]{"count(1)"}, null, null, null, null, null);
            if (cursorHww != null) {
                cursorHww.moveToFirst();
                i10 = cursorHww.getInt(0);
            }
        } catch (Exception unused) {
        } finally {
            if (cursorHww != null) {
                try {
                    cursorHww.close();
                } catch (Exception unused2) {
                }
            }
        }
        return i10;
    }

    public byte sd() {
        return (byte) 2;
    }

    @Override // com.bytedance.sdk.component.hu.hww.hww.hww.hww.sd
    public String tq() {
        com.bytedance.sdk.component.hu.hww.hww.hv hvVarVy = ok.vgm().vy();
        if (hvVarVy != null) {
            return hvVarVy.tq();
        }
        return null;
    }

    public byte vy() {
        return (byte) 0;
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

    public List<com.bytedance.sdk.component.hu.hww.vy.hww> hww(int i10, String str) {
        String str2;
        String[] strArr;
        String str3;
        byte b10;
        Cursor cursorHww;
        long jHww = com.bytedance.sdk.component.hu.hww.tq.hww.hww(i10, hv());
        tq();
        if (jHww <= 0) {
            jHww = 1;
        } else if (jHww > 100) {
            jHww = 100;
        }
        String str4 = str + " DESC limit " + jHww;
        ArrayList arrayList = new ArrayList();
        this.hww.clear();
        long jBs = ok.vgm().bs();
        if (jBs > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - jBs)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (com.bytedance.sdk.component.hu.hww.sd.hww.vy() && vy() == 3) {
            str3 = "id";
            b10 = 3;
            cursorHww = com.bytedance.sdk.component.hu.hww.hww.hww.sd.hww(hv(), tq(), new String[]{"id", "value", "encrypt", "channel"}, str2, strArr, null, null, str4);
        } else {
            str3 = "id";
            b10 = 3;
            cursorHww = com.bytedance.sdk.component.hu.hww.hww.hww.sd.hww(hv(), tq(), new String[]{str3, "value", "encrypt"}, str2, strArr, null, null, str4);
        }
        Cursor cursor = cursorHww;
        if (cursor != null) {
            try {
                com.bytedance.sdk.component.hu.hww.hv hvVarWgt = ok.vgm().wgt();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex("value"));
                        int i11 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i12 = (com.bytedance.sdk.component.hu.hww.sd.hww.vy() && vy() == b10) ? cursor.getInt(cursor.getColumnIndex("channel")) : 0;
                        if (i11 == 1) {
                            try {
                                string2 = hvVarWgt.hww(string2);
                            } catch (Throwable th2) {
                                th = th2;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.hww.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            JSONObject jSONObject = new JSONObject(string2);
                            com.bytedance.sdk.component.hu.hww.vy.hww.hww hwwVar = new com.bytedance.sdk.component.hu.hww.vy.hww.hww(string, jSONObject);
                            hwwVar.hww(vy());
                            hwwVar.tq(sd());
                            if (com.bytedance.sdk.component.hu.hww.sd.hww.vy() && vy() == b10) {
                                hwwVar.hww(i12);
                            }
                            com.bytedance.sdk.component.hu.hww.sd.hww.hww(jSONObject, hwwVar);
                            arrayList.add(hwwVar);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                try {
                    cursor.close();
                    if (!this.hww.isEmpty()) {
                        hww(this.hww);
                        this.hww.clear();
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th4) {
                try {
                    cursor.close();
                    if (!this.hww.isEmpty()) {
                        hww(this.hww);
                        this.hww.clear();
                    }
                } catch (Exception unused2) {
                }
                throw th4;
            }
        }
        tq();
        arrayList.size();
        return arrayList;
    }

    private void tq(int i10, long j10) {
        if (j10 > 0 || i10 > 0) {
            com.bytedance.sdk.component.hu.hww.hww.hww.sd.hww(hv(), tq(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)});
            tq();
        }
    }

    public static String tq(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    public List<com.bytedance.sdk.component.hu.hww.vy.hww> hww(String str) {
        com.bytedance.sdk.component.hu.hww.vy.tq.hww hwwVar = this.vy;
        if (hwwVar == null) {
            return new ArrayList();
        }
        return hww(hwwVar.tq(), str);
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
        if (this.vy == null) {
            return false;
        }
        int iHww = hww();
        int iHww2 = this.vy.hww();
        tq();
        if (com.bytedance.sdk.component.hu.hww.sd.hww.sd() && (i10 == 1 || i10 == 2)) {
            return iHww > 0;
        }
        return iHww >= iHww2;
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
