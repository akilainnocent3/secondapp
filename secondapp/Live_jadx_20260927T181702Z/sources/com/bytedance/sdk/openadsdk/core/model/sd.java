package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    public String f36424hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public AdSlot f36425hv;
    public String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public int f36426sd = 1;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public int f36427tq;
    public int vgm;
    public ArrayList<Integer> vy;

    public ArrayList<Integer> hv() {
        return this.vy;
    }

    public String hww() {
        return this.hww;
    }

    public int sd() {
        return this.f36426sd;
    }

    public int tq() {
        return this.f36427tq;
    }

    public AdSlot vy() {
        return this.f36425hv;
    }

    public void hww(String str) {
        this.hww = str;
    }

    public void sd(int i10) {
        this.vgm = i10;
    }

    public void tq(int i10) {
        this.f36426sd = i10;
    }

    public void hww(int i10) {
        this.f36427tq = i10;
    }

    public void tq(String str) {
        this.f36424hu = str;
    }

    public void hww(AdSlot adSlot) {
        this.f36425hv = adSlot;
    }

    public void hww(ArrayList<Integer> arrayList) {
        this.vy = arrayList;
    }

    public static void hww(sd sdVar) {
        int iTq;
        if (sdVar == null || sdVar.vy() == null || (iTq = sdVar.tq()) >= 0 || iTq == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.wgt.sd.hww();
        com.bytedance.sdk.openadsdk.wgt.sd.hww("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.wgt.tq() { // from class: com.bytedance.sdk.openadsdk.core.model.sd.1
            @Override // com.bytedance.sdk.openadsdk.wgt.tq
            public com.bytedance.sdk.openadsdk.wgt.hww.sd hww() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", sd.this.sd());
                jSONObject.put("err_code", sd.this.tq());
                jSONObject.put("err_msg", sd.this.f36424hu);
                jSONObject.put("ext_from", sd.this.vgm);
                jSONObject.put("server_res_str", sd.this.hww());
                if (sd.this.hv() != null && sd.this.hv().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) sd.this.hv()).toString());
                }
                return com.bytedance.sdk.openadsdk.wgt.hww.vy.tq().hww("rd_client_custom_error").hww(sd.this.vy().getDurationSlotType()).tq(jSONObject.toString());
            }
        });
    }
}
