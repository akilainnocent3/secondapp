package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.ironsource.C4235d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f66847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f66848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f66849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f66852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f66853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f66854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f66855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f66856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f66857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f66858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f66859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f66860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f66861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f66862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f66863q;

    public String a() {
        return this.f66847a;
    }

    public String b() {
        return this.f66849c;
    }

    public int c() {
        return this.f66850d;
    }

    public String d() {
        return this.f66848b;
    }

    public void e(int i10) {
        this.f66859m = i10;
    }

    public void f(int i10) {
        this.f66862p = i10;
    }

    public String g() {
        return this.f66853g;
    }

    public void h(String str) {
        this.f66858l = str;
    }

    public void i(String str) {
        this.f66860n = str;
    }

    public String j() {
        return this.f66856j;
    }

    public void k(String str) {
        this.f66863q = str;
    }

    public String l() {
        return this.f66858l;
    }

    public int m() {
        return this.f66859m;
    }

    public String n() {
        return this.f66860n;
    }

    public String o() {
        return this.f66861o;
    }

    public int p() {
        return this.f66862p;
    }

    public String q() {
        return this.f66863q;
    }

    public String toString() {
        return "ClickTime [campaignId=" + this.f66847a + ", click_duration=" + this.f66848b + ", lastUrl=" + this.f66856j + ", code=" + this.f66851e + ", excepiton=" + this.f66853g + ", header=" + this.f66854h + ", content=" + this.f66852f + ", type=" + this.f66862p + ", click_type=" + this.f66850d + C4235d4.j.f61462e;
    }

    public void a(int i10) {
        this.f66850d = i10;
    }

    public void b(String str) {
        this.f66849c = str;
    }

    public void c(int i10) {
        this.f66855i = i10;
    }

    public void d(int i10) {
        this.f66857k = i10;
    }

    public int e() {
        return this.f66851e;
    }

    public String f() {
        return this.f66852f;
    }

    public void g(String str) {
        this.f66856j = str;
    }

    public String h() {
        return this.f66854h;
    }

    public int i() {
        return this.f66855i;
    }

    public void j(String str) {
        this.f66861o = str;
    }

    public int k() {
        return this.f66857k;
    }

    public void a(String str) {
        this.f66847a = str;
    }

    public void b(int i10) {
        this.f66851e = i10;
    }

    public void c(String str) {
        this.f66848b = str;
    }

    public void d(String str) {
        this.f66852f = str;
    }

    public void e(String str) {
        this.f66853g = str;
    }

    public void f(String str) {
        this.f66854h = str;
    }

    public static JSONObject a(e eVar) {
        if (eVar == null) {
            return null;
        }
        String strJ = eVar.j();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rid", eVar.n());
            jSONObject.put("rid_n", eVar.o());
            jSONObject.put("click_type", eVar.c());
            jSONObject.put("type", eVar.p());
            jSONObject.put("cid", eVar.a());
            jSONObject.put(gp.e.f87278q, eVar.d());
            jSONObject.put("key", "2000012");
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
            jSONObject.put("last_url", strJ);
            jSONObject.put(gp.e.f87280s, eVar.e());
            jSONObject.put("exception", eVar.g());
            jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
            jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
            jSONObject.put("click_time", eVar.b());
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("network_type", eVar.m());
                jSONObject.put("network_str", eVar.l());
            }
            return jSONObject;
        } catch (Throwable th2) {
            q0.b("ClickTime", th2.getMessage());
            return null;
        }
    }

    public static ArrayList<JSONObject> a(List<e> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<JSONObject> arrayList = new ArrayList<>();
        for (e eVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("rid", eVar.n());
                jSONObject.put("rid_n", eVar.o());
                jSONObject.put("cid", eVar.a());
                jSONObject.put("click_type", eVar.c());
                jSONObject.put("type", eVar.p());
                jSONObject.put(gp.e.f87278q, eVar.d());
                jSONObject.put("key", "2000013");
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, eVar.q());
                jSONObject.put("last_url", eVar.j());
                jSONObject.put("content", eVar.f());
                jSONObject.put(gp.e.f87280s, eVar.e());
                jSONObject.put("exception", eVar.g());
                jSONObject.put("header", eVar.h());
                jSONObject.put(CampaignEx.JSON_KEY_LANDING_TYPE, eVar.i());
                jSONObject.put(CampaignEx.JSON_KEY_LINK_TYPE, eVar.k());
                jSONObject.put("click_time", eVar.b());
                if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                    jSONObject.put("network_type", eVar.m());
                    jSONObject.put("network_str", eVar.l());
                }
                String strQ = eVar.q();
                if (!TextUtils.isEmpty(strQ)) {
                    String str = com.mbridge.msdk.foundation.controller.a.f66666r.get(strQ);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                arrayList.add(jSONObject);
            } catch (Throwable th2) {
                q0.b("ClickTime", th2.getMessage());
            }
        }
        return arrayList;
    }
}
