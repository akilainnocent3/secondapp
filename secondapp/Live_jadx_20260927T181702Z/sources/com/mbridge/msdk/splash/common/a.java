package com.mbridge.msdk.splash.common;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4235d4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f69071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f69072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f69073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f69074h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f69075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f69076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f69077k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f69078l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f69079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f69080n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f69081o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f69082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f69083q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f69069c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f69067a = m0.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f69068b = m0.q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f69070d = g.d();

    public a(Context context) {
        int iS = m0.s(context);
        this.f69071e = String.valueOf(iS);
        this.f69072f = m0.a(context, iS);
        this.f69073g = m0.l(context);
        this.f69074h = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f69075i = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f69076j = String.valueOf(v0.g(context));
        this.f69077k = String.valueOf(v0.f(context));
        this.f69079m = String.valueOf(v0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f69078l = C4235d4.i.C;
        } else {
            this.f69078l = C4235d4.i.D;
        }
        this.f69080n = m0.u();
        this.f69081o = g.e();
        this.f69082p = g.a();
        this.f69083q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f69067a);
                jSONObject.put("system_version", this.f69068b);
                jSONObject.put("network_type", this.f69071e);
                jSONObject.put("network_type_str", this.f69072f);
                jSONObject.put("device_ua", this.f69073g);
                jSONObject.put("has_wx", m0.D(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.E());
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f69082p);
                jSONObject.put("adid_limit_dev", this.f69083q);
            }
            jSONObject.put("plantform", this.f69069c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f69070d);
                jSONObject.put("az_aid_info", this.f69081o);
            }
            jSONObject.put("appkey", this.f69074h);
            jSONObject.put("appId", this.f69075i);
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, this.f69076j);
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, this.f69077k);
            jSONObject.put("orientation", this.f69078l);
            jSONObject.put("scale", this.f69079m);
            if (m0.y() != 0) {
                jSONObject.put("tun", m0.y());
            }
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f69080n);
            if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
                jSONObject.put("re_domain", "1");
            }
            return jSONObject;
        } catch (JSONException e10) {
            q0.b("BaseDeviceInfo", e10.getMessage());
            return jSONObject;
        }
    }
}
