package com.bytedance.sdk.component.adexpress.dynamic.vy;

import android.text.TextUtils;
import fw.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ok {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private String f34250ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private float f34251hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private float f34252hv;
    private String hww;
    private boolean khx;
    private List<ok> nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private List<List<ok>> f34253ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private float f34254ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private hv f34255rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private float f34256sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f34257tq;
    private float vgm;
    private ok vhb;
    private float vy;
    private Map<String, String> weu = new HashMap();
    private Map<Integer, String> wgt = new HashMap();

    public boolean aeg() {
        return this.f34255rs.hv().gsa() < 0 || this.f34255rs.hv().kft() < 0 || this.f34255rs.hv().fc() < 0 || this.f34255rs.hv().hh() < 0;
    }

    public List<List<ok>> bs() {
        return this.f34253ny;
    }

    public int ed() {
        hu huVarHv = this.f34255rs.hv();
        return huVarHv.et() + huVarHv.xas();
    }

    public void hnv() {
        List<List<ok>> list = this.f34253ny;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<ok> list2 : this.f34253ny) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.f34253ny = arrayList;
    }

    public float hu() {
        return this.f34257tq;
    }

    public float hv() {
        return this.f34252hv;
    }

    public String hww() {
        return this.f34250ed;
    }

    public boolean jpb() {
        List<ok> list = this.nod;
        return list == null || list.size() <= 0;
    }

    public int khx() {
        hu huVarHv = this.f34255rs.hv();
        return huVarHv.ce() + huVarHv.ytm();
    }

    public String kub() {
        return this.f34255rs.hv().kub();
    }

    public boolean kv() {
        return TextUtils.equals(this.f34255rs.hv().mw(), "flex");
    }

    public boolean mrs() {
        return this.khx;
    }

    public hv nod() {
        return this.f34255rs;
    }

    public ok ny() {
        return this.vhb;
    }

    public float ok() {
        return this.f34251hu;
    }

    public Map<String, String> omn() {
        return this.weu;
    }

    public float rs() {
        return this.vgm;
    }

    public String sd() {
        return this.hww;
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.hww + "', x=" + this.f34257tq + ", y=" + this.f34256sd + ", width=" + this.f34251hu + ", height=" + this.vgm + ", remainWidth=" + this.f34254ok + ", rootBrick=" + this.f34255rs + ", childrenBrickUnits=" + this.nod + b.f85383j;
    }

    public Map<Integer, String> tq() {
        return this.wgt;
    }

    public float vgm() {
        return this.f34256sd;
    }

    public List<ok> vhb() {
        return this.nod;
    }

    public float vy() {
        return this.vy;
    }

    public float weu() {
        hu huVarHv = this.f34255rs.hv();
        return ed() + huVarHv.weu() + huVarHv.wgt() + (huVarHv.ny() * 2.0f);
    }

    public float wgt() {
        hu huVarHv = this.f34255rs.hv();
        return khx() + huVarHv.bs() + huVarHv.khx() + (huVarHv.ny() * 2.0f);
    }

    public void hu(float f10) {
        this.vgm = f10;
    }

    public void hv(float f10) {
        this.f34251hu = f10;
    }

    public void hww(String str) {
        this.f34250ed = str;
    }

    public void sd(float f10) {
        this.f34257tq = f10;
    }

    public void tq(String str) {
        this.hww = str;
    }

    public void vgm(float f10) {
        this.f34254ok = f10;
    }

    public void vy(float f10) {
        this.f34256sd = f10;
    }

    public void hww(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    this.wgt.put(Integer.valueOf(jSONObjectOptJSONObject.optInt("id")), jSONObjectOptJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void sd(String str) {
        this.f34255rs.hv().hu(str);
    }

    public void tq(float f10) {
        this.f34252hv = f10;
    }

    public void tq(List<List<ok>> list) {
        this.f34253ny = list;
    }

    public void hww(float f10) {
        this.vy = f10;
    }

    public void hww(hv hvVar) {
        this.f34255rs = hvVar;
    }

    public void hww(List<ok> list) {
        this.nod = list;
    }

    public void hww(ok okVar) {
        this.vhb = okVar;
    }

    public void hww(boolean z10) {
        this.khx = z10;
    }

    public void hww(String str, String str2) {
        this.weu.put(str, str2);
    }

    public String hww(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f34255rs.tq());
        sb2.append(":");
        sb2.append(this.hww);
        if (this.f34255rs.hv() != null) {
            sb2.append(":");
            sb2.append(this.f34255rs.hv().tre());
        }
        sb2.append(":");
        sb2.append(i10);
        return sb2.toString();
    }
}
