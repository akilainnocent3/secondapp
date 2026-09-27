package com.bytedance.adsdk.hww.tq.tq.hww;

import gi.j;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class nod implements com.bytedance.adsdk.hww.tq.tq.hww {
    private com.bytedance.adsdk.hww.tq.tq.hww[] hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private com.bytedance.adsdk.hww.tq.hww.hww f31897sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f31898tq;
    private boolean vy;

    public nod(String str) {
        this.f31898tq = str;
    }

    public void hww(com.bytedance.adsdk.hww.tq.tq.hww[] hwwVarArr) {
        this.hww = hwwVarArr;
    }

    public boolean sd() {
        return this.vy;
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public String tq() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31898tq);
        sb2.append(j.f86770c);
        com.bytedance.adsdk.hww.tq.tq.hww[] hwwVarArr = this.hww;
        if (hwwVarArr != null && hwwVarArr.length > 0) {
            int i10 = 0;
            while (true) {
                com.bytedance.adsdk.hww.tq.tq.hww[] hwwVarArr2 = this.hww;
                if (i10 >= hwwVarArr2.length) {
                    break;
                }
                sb2.append(hwwVarArr2[i10].tq());
                sb2.append(",");
                i10++;
            }
        }
        sb2.append(j.f86771d);
        return sb2.toString();
    }

    public void hww(boolean z10) {
        this.vy = z10;
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public Object hww(Map<String, JSONObject> map) {
        com.bytedance.adsdk.hww.tq.hww.hww hwwVar = new com.bytedance.adsdk.hww.tq.hww.hww();
        this.f31897sd = hwwVar;
        hwwVar.hww(this.f31898tq);
        Object[] objArr = new Object[this.hww.length];
        int i10 = 0;
        while (true) {
            com.bytedance.adsdk.hww.tq.tq.hww[] hwwVarArr = this.hww;
            if (i10 < hwwVarArr.length) {
                com.bytedance.adsdk.hww.tq.tq.hww hwwVar2 = hwwVarArr[i10];
                if (hwwVar2 != null) {
                    objArr[i10] = hwwVar2.hww(map);
                }
                i10++;
            } else {
                this.f31897sd.hww(objArr);
                return com.bytedance.adsdk.hww.wgt.hww(this.f31898tq).hww(map.get("default_key"), objArr);
            }
        }
    }

    @Override // com.bytedance.adsdk.hww.tq.tq.hww
    public com.bytedance.adsdk.hww.tq.vy.hv hww() {
        return com.bytedance.adsdk.hww.tq.vy.tq.METHOD;
    }
}
