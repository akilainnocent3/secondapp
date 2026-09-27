package com.bytedance.sdk.openadsdk.core.vhb.hww;

import android.text.TextUtils;
import com.bytedance.sdk.component.ok.ok;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.rs;
import com.bytedance.sdk.openadsdk.utils.syb;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import lk.e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {
    private static volatile tq hww;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hww {
        void hww(int i10, String str, String str2);

        void hww(JSONObject jSONObject, String str);
    }

    private void tq(String str, String str2, String str3, String str4, String str5) {
        com.bytedance.sdk.openadsdk.core.vhb.hww.hww hwwVar = new com.bytedance.sdk.openadsdk.core.vhb.hww.hww();
        hwwVar.sd(str).hv(str3).vy(str4).tq(str2).hww(str5).hww(Long.valueOf(System.currentTimeMillis()));
        sd.hww().hww(hwwVar);
        tq();
    }

    public static tq hww() {
        if (hww == null) {
            synchronized (tq.class) {
                try {
                    if (hww == null) {
                        hww = new tq();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hww;
    }

    public void hww(com.bytedance.sdk.openadsdk.core.vhb.ok.hww hwwVar, String str) {
        if (hwwVar == null || TextUtils.isEmpty(hwwVar.hww())) {
            return;
        }
        final String str2 = str + e.f104695m + hwwVar.hww();
        final String strSd = hwwVar.sd();
        final String strTq = hwwVar.tq();
        final String strVy = hwwVar.vy();
        String strHv = hwwVar.hv();
        if (TextUtils.isEmpty(strHv)) {
            if (str.equals("ad")) {
                strHv = rs.tq().vy();
            } else if (str.equals("adv3")) {
                strHv = rs.tq().vy() + "_v3";
            }
        }
        final String str3 = strHv;
        syb.hww(new ok("saveUGenTemplate") { // from class: com.bytedance.sdk.openadsdk.core.vhb.hww.tq.1
            @Override // java.lang.Runnable
            public void run() {
                tq.this.hww(str2, strSd, strTq, strVy, str3);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tq() {
        int iHu = bs.vy().hu();
        if (iHu <= 0) {
            iHu = 100;
        }
        List<com.bytedance.sdk.openadsdk.core.vhb.hww.hww> listTq = sd.hww().tq();
        if (listTq == null || listTq.isEmpty() || iHu >= listTq.size()) {
            if (listTq == null) {
                return;
            }
            listTq.size();
            return;
        }
        int size = (int) (listTq.size() - (iHu * 0.75f));
        if (size <= 0) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (com.bytedance.sdk.openadsdk.core.vhb.hww.hww hwwVar : listTq) {
            treeMap.put(hwwVar.vy(), hwwVar);
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            if (entry != null && i10 < size) {
                i10++;
                com.bytedance.sdk.openadsdk.core.vhb.hww.hww hwwVar2 = (com.bytedance.sdk.openadsdk.core.vhb.hww.hww) entry.getValue();
                if (hwwVar2 != null) {
                    hashSet.add(hwwVar2.hww());
                }
            }
        }
        hww(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hww(String str, String str2, String str3, String str4, String str5) {
        if (hww(str, str3) != null) {
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                return;
            }
            tq(str2, str3, str5, str4, str);
            return;
        }
        if (TextUtils.isEmpty(str4)) {
            hww(str2, str, str3, str5, (hww) null);
        } else {
            tq(str2, str3, str5, str4, str);
        }
    }

    public void hww(String str, String str2, String str3, String str4, String str5, final hww hwwVar) {
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (hwwVar != null) {
                hwwVar.hww(1, "id  or md5 is empty", "net");
                return;
            }
            return;
        }
        String str6 = str + e.f104695m + str3;
        com.bytedance.sdk.openadsdk.core.vhb.hww.hww hwwVarHww = hww(str6, str4);
        if (hwwVarHww != null && !TextUtils.isEmpty(hwwVarHww.hv())) {
            hww(hwwVarHww);
            if (hwwVar != null) {
                try {
                    hwwVar.hww(new JSONObject(hwwVarHww.hv()), "local");
                    return;
                } catch (JSONException unused) {
                    hwwVar.hww(2, "parse json exception data is " + hwwVarHww.hv(), "local");
                    return;
                }
            }
            return;
        }
        hww(str2, str6, str4, str5, new hww() { // from class: com.bytedance.sdk.openadsdk.core.vhb.hww.tq.2
            @Override // com.bytedance.sdk.openadsdk.core.vhb.hww.tq.hww
            public void hww(JSONObject jSONObject, String str7) {
                hww hwwVar2 = hwwVar;
                if (hwwVar2 != null) {
                    hwwVar2.hww(jSONObject, str7);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.vhb.hww.tq.hww
            public void hww(int i10, String str7, String str8) {
                hww hwwVar2 = hwwVar;
                if (hwwVar2 != null) {
                    hwwVar2.hww(i10, str7, str8);
                }
            }
        });
    }

    private void hww(final String str, final String str2, final String str3, final String str4, final hww hwwVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (hwwVar != null) {
                hwwVar.hww(1, "template url or id  or md5 is empty", "net");
            }
        } else {
            com.bytedance.sdk.component.vgm.tq.tq tqVarSd = com.bytedance.sdk.openadsdk.mrs.tq.tq().sd().sd();
            tqVarSd.tq(str);
            tqVarSd.hww(7);
            tqVarSd.hww("load_ug_t");
            tqVarSd.hww(new com.bytedance.sdk.component.vgm.hww.hww() { // from class: com.bytedance.sdk.openadsdk.core.vhb.hww.tq.3
                @Override // com.bytedance.sdk.component.vgm.hww.hww
                public void hww(com.bytedance.sdk.component.vgm.tq.sd sdVar, com.bytedance.sdk.component.vgm.tq tqVar) {
                    if (tqVar == null) {
                        return;
                    }
                    if (!tqVar.hu()) {
                        hww hwwVar2 = hwwVar;
                        if (hwwVar2 != null) {
                            hwwVar2.hww(3, "net code error code is " + tqVar.hww() + " message is " + tqVar.tq(), "net");
                            return;
                        }
                        return;
                    }
                    String strVy = tqVar.vy();
                    if (TextUtils.isEmpty(strVy)) {
                        hww hwwVar3 = hwwVar;
                        if (hwwVar3 != null) {
                            hwwVar3.hww(3, "net data is null", "net");
                            return;
                        }
                        return;
                    }
                    sd.hww().hww(new com.bytedance.sdk.openadsdk.core.vhb.hww.hww().hww(str2).tq(str3).sd(str).hv(str4).vy(strVy).hww(Long.valueOf(System.currentTimeMillis())));
                    tq.this.tq();
                    if (hwwVar != null) {
                        try {
                            hwwVar.hww(new JSONObject(strVy), "net");
                        } catch (JSONException unused) {
                            hwwVar.hww(2, "parse json exception data is".concat(String.valueOf(strVy)), "net");
                        }
                    }
                }

                @Override // com.bytedance.sdk.component.vgm.hww.hww
                public void hww(com.bytedance.sdk.component.vgm.tq.sd sdVar, IOException iOException) {
                    hww hwwVar2 = hwwVar;
                    if (hwwVar2 != null) {
                        hwwVar2.hww(3, "net error " + iOException.getMessage(), "net");
                    }
                }
            });
        }
    }

    public Set<com.bytedance.sdk.openadsdk.core.vhb.hww.hww> hww(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return sd.hww().hww(str);
    }

    public String hww(String str, String str2, String str3) {
        com.bytedance.sdk.openadsdk.core.vhb.hww.hww hwwVarHww = hww(str + e.f104695m + str2, str3);
        if (hwwVarHww == null) {
            return null;
        }
        hww(hwwVarHww);
        return hwwVarHww.hv();
    }

    private com.bytedance.sdk.openadsdk.core.vhb.hww.hww hww(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return sd.hww().hww(str, str2);
    }

    private void hww(final com.bytedance.sdk.openadsdk.core.vhb.hww.hww hwwVar) {
        hwwVar.hww(Long.valueOf(System.currentTimeMillis()));
        syb.hww(new ok("updateTmplTime") { // from class: com.bytedance.sdk.openadsdk.core.vhb.hww.tq.4
            @Override // java.lang.Runnable
            public void run() {
                sd.hww().hww(hwwVar);
            }
        }, 10);
    }

    public void hww(Set<String> set) {
        try {
            sd.hww().hww(set);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
