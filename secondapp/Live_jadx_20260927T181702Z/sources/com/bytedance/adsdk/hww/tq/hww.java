package com.bytedance.adsdk.hww.tq;

import com.bytedance.adsdk.hww.tq.sd.hww.hu;
import com.bytedance.adsdk.hww.tq.sd.hww.hv;
import com.bytedance.adsdk.hww.tq.sd.hww.nod;
import com.bytedance.adsdk.hww.tq.sd.hww.ok;
import com.bytedance.adsdk.hww.tq.sd.hww.rs;
import com.bytedance.adsdk.hww.tq.sd.hww.sd;
import com.bytedance.adsdk.hww.tq.sd.hww.tq;
import com.bytedance.adsdk.hww.tq.sd.hww.vgm;
import com.bytedance.adsdk.hww.tq.sd.hww.vy;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class hww {
    private static final com.bytedance.adsdk.hww.tq.sd.hww hww;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private String f31888hv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private com.bytedance.adsdk.hww.tq.tq.hww f31889sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final com.bytedance.adsdk.hww.tq.sd.hww f31890tq;
    private Deque<com.bytedance.adsdk.hww.tq.tq.hww> vy = new LinkedList();

    static {
        int i10 = 8;
        hu[] huVarArr = {new nod(), new vy(), new rs(), new tq(), new hv(), new com.bytedance.adsdk.hww.tq.sd.hww.hww(), new vgm(), new sd(), new ok()};
        final com.bytedance.adsdk.hww.tq.sd.hww hwwVar = new com.bytedance.adsdk.hww.tq.sd.hww() { // from class: com.bytedance.adsdk.hww.tq.hww.1
            @Override // com.bytedance.adsdk.hww.tq.sd.hww
            public int hww(String str, int i11, Deque<com.bytedance.adsdk.hww.tq.tq.hww> deque) {
                return i11;
            }
        };
        while (i10 >= 0) {
            final hu huVar = huVarArr[i10];
            i10--;
            hwwVar = new com.bytedance.adsdk.hww.tq.sd.hww() { // from class: com.bytedance.adsdk.hww.tq.hww.2
                @Override // com.bytedance.adsdk.hww.tq.sd.hww
                public int hww(String str, int i11, Deque<com.bytedance.adsdk.hww.tq.tq.hww> deque) {
                    return huVar.hww(str, i11, deque, hwwVar);
                }
            };
        }
        hww = hwwVar;
    }

    private hww(String str, com.bytedance.adsdk.hww.tq.sd.hww hwwVar) {
        this.f31890tq = hwwVar;
        this.f31888hv = str;
        try {
            hww();
        } catch (Exception e10) {
            throw new com.bytedance.adsdk.hww.hww.tq(str, e10);
        }
    }

    public static hww hww(String str) {
        return new hww(str, hww);
    }

    private void hww() {
        int length = this.f31888hv.length();
        int i10 = 0;
        while (i10 < length) {
            int iHww = this.f31890tq.hww(this.f31888hv, i10, this.vy);
            if (iHww == i10) {
                throw new IllegalArgumentException("Unrecognized expression, unrecognized characters encountered during parsing:" + this.f31888hv.substring(0, i10));
            }
            i10 = iHww;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.hww.tq.tq.hww hwwVarPollFirst = this.vy.pollFirst();
            if (hwwVarPollFirst == null) {
                this.f31889sd = com.bytedance.adsdk.hww.tq.hv.tq.hww(arrayList, this.f31888hv, i10);
                this.vy = null;
                return;
            }
            arrayList.add(0, hwwVarPollFirst);
        }
    }

    public <T> T hww(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("default_key", jSONObject);
        return (T) hww(map);
    }

    public <T> T hww(Map<String, JSONObject> map) {
        return (T) this.f31889sd.hww(map);
    }
}
