package com.bytedance.sdk.openadsdk.core.model;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ok {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f36374hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private List<String> f36375hv;
    private int hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private List<Integer> f36376sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f36377tq;
    private int vgm;
    private int vy;

    public List<Integer> hu() {
        return this.f36376sd;
    }

    public int hv() {
        return this.f36377tq;
    }

    public boolean hww() {
        return this.f36374hu == 1;
    }

    public JSONObject ok() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interceptor_x", this.hww);
            jSONObject.put("interceptor_y", this.f36377tq);
            if (this.f36376sd != null) {
                JSONArray jSONArray = new JSONArray();
                Iterator<Integer> it = this.f36376sd.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.vy);
            if (this.f36375hv != null) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<String> it2 = this.f36375hv.iterator();
                while (it2.hasNext()) {
                    jSONArray2.put(it2.next());
                }
                jSONObject.put("url_regular", jSONArray2);
            }
            jSONObject.put("is_act", this.f36374hu);
            jSONObject.put("boc_index", this.vgm);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.omn.vy(th2.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    public List<String> sd() {
        return this.f36375hv;
    }

    public int tq() {
        int i10 = this.vgm;
        if (i10 >= 2) {
            return i10;
        }
        return 0;
    }

    public int vgm() {
        return this.vy;
    }

    public int vy() {
        return this.hww;
    }

    public void hv(int i10) {
        this.vy = i10;
    }

    public void hww(int i10) {
        this.f36374hu = i10;
    }

    public void sd(int i10) {
        this.hww = i10;
    }

    public void tq(int i10) {
        this.vgm = i10;
    }

    public void vy(int i10) {
        this.f36377tq = i10;
    }

    public void hww(List<String> list) {
        this.f36375hv = list;
    }

    public void tq(List<Integer> list) {
        this.f36376sd = list;
    }
}
