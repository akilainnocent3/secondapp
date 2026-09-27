package com.mbridge.msdk.advanced.common;

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
    public String f64654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f64655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f64656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f64657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f64658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f64659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f64660k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f64661l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f64662m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f64663n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f64664o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f64665p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f64666q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f64652c = "android";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f64650a = m0.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f64651b = m0.q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f64653d = g.d();

    public a(Context context) {
        int iS = m0.s(context);
        this.f64654e = String.valueOf(iS);
        this.f64655f = m0.a(context, iS);
        this.f64656g = m0.l(context);
        this.f64657h = com.mbridge.msdk.foundation.controller.c.n().c();
        this.f64658i = com.mbridge.msdk.foundation.controller.c.n().b();
        this.f64659j = String.valueOf(v0.g(context));
        this.f64660k = String.valueOf(v0.f(context));
        this.f64662m = String.valueOf(v0.d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f64661l = C4235d4.i.C;
        } else {
            this.f64661l = C4235d4.i.D;
        }
        this.f64663n = m0.u();
        this.f64664o = g.e();
        this.f64665p = g.a();
        this.f64666q = com.mbridge.msdk.foundation.controller.authoritycontroller.b.j() ? 1 : 0;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f64650a);
                jSONObject.put("system_version", this.f64651b);
                jSONObject.put("network_type", this.f64654e);
                jSONObject.put("network_type_str", this.f64655f);
                jSONObject.put("device_ua", this.f64656g);
                jSONObject.put("has_wx", m0.D(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("integrated_wx", m0.E());
                jSONObject.put("opensdk_ver", m0.B() + "");
                jSONObject.put("wx_api_ver", m0.e(com.mbridge.msdk.foundation.controller.c.n().j()) + "");
                jSONObject.put("mnc", m0.r(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("mcc", m0.q(com.mbridge.msdk.foundation.controller.c.n().d()));
                jSONObject.put("adid_limit", this.f64665p);
                jSONObject.put("adid_limit_dev", this.f64666q);
            }
            jSONObject.put("plantform", this.f64652c);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f64653d);
                jSONObject.put("az_aid_info", this.f64664o);
            }
            jSONObject.put("appkey", this.f64657h);
            jSONObject.put("appId", this.f64658i);
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, this.f64659j);
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, this.f64660k);
            jSONObject.put("orientation", this.f64661l);
            jSONObject.put("scale", this.f64662m);
            if (m0.y() != 0) {
                jSONObject.put("tun", m0.y());
            }
            jSONObject.put(InneractiveMediationDefs.GENDER_FEMALE, this.f64663n);
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
