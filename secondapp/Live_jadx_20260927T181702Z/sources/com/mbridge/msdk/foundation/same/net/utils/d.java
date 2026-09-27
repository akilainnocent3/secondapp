package com.mbridge.msdk.foundation.same.net.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.report.m;
import com.mbridge.msdk.foundation.same.report.n;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.tracker.network.toolbox.i;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.u;
import com.mbridge.msdk.tracker.x;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import lk.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class d {
    public String A;
    private String B;
    public String C;
    public String D;
    private String E;
    public String F;
    private String G;
    public String H;
    private String I;
    public String J;
    public String K;
    private String L;
    public String M;
    private String N;
    public String O;
    private String P;
    public String Q;
    public String R;
    private String S;
    public String T;
    public String U;
    private String V;
    public String W;
    public String X;
    private String Y;
    public String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f67136a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f67137a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f67138b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f67139b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f67140c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f67141c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f67142d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f67143d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f67144e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f67145e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f67146f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f67147f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f67148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f67149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f67150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f67151j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f67152k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f67153l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f67154m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f67155n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f67156o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f67157p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f67158q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f67159r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f67160s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f67161t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList<String> f67162u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f67163v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f67164w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<String> f67165x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f67166y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f67167z;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f67168a = new d();
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("(https|http)://[-A-Za-z0-9{}+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str.trim()).matches();
    }

    private void b() {
        this.M = this.f67146f + this.L;
    }

    private void c() {
        this.A = this.f67166y + this.f67167z;
        this.H = this.f67166y + this.G;
        i.b().f(this.f67166y);
    }

    public static d h() {
        return b.f67168a;
    }

    public void d(int i10) {
        this.f67147f0 = i10;
    }

    public void e() {
        this.Q = this.f67150i + this.P;
        this.C = this.f67150i + this.B;
        this.T = this.f67150i + this.S;
        this.J = this.f67150i + this.I;
        this.W = this.f67150i + this.V;
    }

    public void f() {
        this.R = this.f67154m + this.P;
        this.D = this.f67154m + this.B;
        this.U = this.f67154m + this.S;
        this.K = this.f67154m + this.I;
        this.X = this.f67154m + this.V;
    }

    public boolean g() {
        try {
            if (this.f67160s) {
                ArrayList<String> arrayList = this.f67165x;
                if (arrayList != null && this.f67164w <= arrayList.size() - 1) {
                    if (!a(this.f67165x.get(this.f67164w))) {
                        this.f67154m = this.f67165x.get(this.f67164w);
                        f();
                    }
                    return true;
                }
            } else {
                ArrayList<String> arrayList2 = this.f67162u;
                if (arrayList2 != null && this.f67163v <= arrayList2.size() - 1) {
                    this.f67150i = this.f67162u.get(this.f67163v);
                    e();
                    return true;
                }
            }
            if (this.f67159r) {
                this.f67163v = 0;
                this.f67164w = 0;
            }
            return false;
        } catch (Throwable th2) {
            q0.a("RequestUrlUtil", th2.getMessage());
            return false;
        }
    }

    public int i() {
        return this.f67147f0;
    }

    public void j() {
        HashMap<String, String> mapD;
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD != null) {
            com.mbridge.msdk.setting.a aVarJ = gVarD.j();
            if (aVarJ != null) {
                this.f67153l = aVarJ.f();
                this.f67157p = aVarJ.g();
                this.f67149h = aVarJ.e();
                a();
            }
            com.mbridge.msdk.setting.d dVarZ = gVarD.z();
            if (dVarZ != null) {
                this.f67152k = dVarZ.d();
                this.f67156o = dVarZ.e();
                this.f67146f = dVarZ.c();
                b();
                a(gVarD);
            }
            this.f67160s = gVarD.r0() == 2;
            this.f67161t = gVarD.r0();
            a(!gVarD.b(2));
            if (gVarD.D() != null && gVarD.D().size() > 0 && (mapD = gVarD.D()) != null && mapD.size() > 0) {
                if (mapD.containsKey("v") && !TextUtils.isEmpty(mapD.get("v")) && a(mapD.get("v"))) {
                    this.f67144e = mapD.get("v");
                    d();
                }
                if (mapD.containsKey(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(mapD.get(CampaignEx.JSON_KEY_HB)) && a(mapD.get(CampaignEx.JSON_KEY_HB))) {
                    this.f67166y = mapD.get(CampaignEx.JSON_KEY_HB);
                    c();
                }
                if (mapD.containsKey("lg") && !TextUtils.isEmpty(mapD.get("lg"))) {
                    String str = mapD.get("lg");
                    if (a(str)) {
                        this.f67142d = str;
                    } else {
                        this.f67151j = str;
                    }
                }
                if (mapD.containsKey("lgt") && !TextUtils.isEmpty(mapD.get("lgt"))) {
                    String str2 = mapD.get("lgt");
                    if (a(str2)) {
                        String strB = b(str2);
                        if (!TextUtils.isEmpty(strB)) {
                            this.f67151j = strB;
                        }
                    } else {
                        this.f67151j = str2;
                    }
                }
            }
            String strV = gVarD.v();
            if (!TextUtils.isEmpty(strV)) {
                this.f67150i = strV;
                e();
                this.f67162u.add(0, strV);
            }
            String strW = gVarD.w();
            if (TextUtils.isEmpty(strW)) {
                return;
            }
            this.f67154m = strW;
            f();
            this.f67165x.add(0, strW);
        }
    }

    private d() {
        this.f67136a = "RequestUrlUtil";
        this.f67138b = DomainNameUtils.getInstance().DEFAULT_HOST_APPLETS;
        this.f67140c = DomainNameUtils.getInstance().DEFAULT_CDN_SPARE_SETTING_URL;
        this.f67142d = DomainNameUtils.getInstance().DEFAULT_HOST_ANALYTICS;
        this.f67144e = DomainNameUtils.getInstance().DEFAULT_HOST_API;
        this.f67146f = DomainNameUtils.getInstance().DEFAULT_HOST_MONITOR_DEFAULT;
        this.f67148g = DomainNameUtils.getInstance().DEFAULT_HOST_PRIVACY;
        this.f67149h = DomainNameUtils.getInstance().DEFAULT_HOST_REVENUE_DEFAULT;
        this.f67150i = DomainNameUtils.getInstance().DEFAULT_HOST_SETTING;
        this.f67151j = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_ANALYTICS;
        this.f67152k = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_MONITOR;
        this.f67153l = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_REVENUE;
        this.f67154m = DomainNameUtils.getInstance().DEFAULT_HOST_TCP_SETTING;
        this.f67155n = 9377;
        this.f67156o = 9377;
        this.f67157p = 9988;
        this.f67158q = 9377;
        this.f67159r = false;
        this.f67160s = false;
        this.f67161t = 1;
        this.f67162u = DomainNameUtils.getInstance().SPARE_SETTING_HOST;
        this.f67163v = 0;
        this.f67164w = 0;
        this.f67165x = DomainNameUtils.getInstance().SPARE_TCP_SETTING_HOST;
        this.f67166y = DomainNameUtils.getInstance().DEFAULT_HB_HOST;
        this.f67167z = "/bid";
        this.A = this.f67166y + this.f67167z;
        this.B = "/sdk/customid";
        this.C = this.f67150i + this.B;
        this.D = this.f67154m + this.B;
        this.E = "/image";
        this.F = this.f67144e + this.E;
        this.G = "/load";
        this.H = this.f67166y + this.G;
        this.I = "/mapping";
        this.J = this.f67150i + this.I;
        this.K = this.f67154m + this.I;
        this.L = "";
        this.M = this.f67149h + this.L;
        this.N = "/batchPaidEvent";
        this.O = this.f67149h + this.N;
        this.P = "/setting";
        this.Q = this.f67150i + this.P;
        this.R = this.f67154m + this.P;
        this.S = "/rewardsetting";
        this.T = this.f67150i + this.S;
        this.U = this.f67154m + this.S;
        this.V = "/appwall/setting";
        this.W = this.f67150i + this.V;
        this.X = this.f67154m + this.V;
        this.Y = "/openapi/ad/v3";
        this.Z = this.f67144e + this.Y;
        this.f67137a0 = "/openapi/ad/v4";
        this.f67139b0 = this.f67144e + this.f67137a0;
        this.f67141c0 = "/openapi/ad/v5";
        this.f67143d0 = this.f67144e + this.f67141c0;
        this.f67145e0 = true;
        this.f67147f0 = 0;
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Throwable th2) {
            q0.b("RequestUrlUtil", th2.getMessage());
            return "";
        }
    }

    private void d() {
        this.Z = this.f67144e + this.Y;
        this.f67139b0 = this.f67144e + this.f67137a0;
        this.f67143d0 = this.f67144e + this.f67141c0;
        this.F = this.f67144e + this.E;
    }

    public void c(int i10) {
        this.f67158q = i10;
    }

    public String a(String str, int i10) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split(e.f104695m);
                if (strArrSplit.length > 1) {
                    return a(true, strArrSplit[1]);
                }
                return a(true, "");
            }
        } catch (Exception e10) {
            q0.b("RequestUrlUtil", e10.getMessage());
        }
        return i10 % 2 == 0 ? this.f67143d0 : this.Z;
    }

    public void b(int i10) {
        this.f67155n = i10;
    }

    public String a(boolean z10, String str) {
        if (z10) {
            if (this.H.contains(JsonUtils.EMPTY_JSON) && !TextUtils.isEmpty(str)) {
                return this.H.replace(JsonUtils.EMPTY_JSON, str + TokenBuilder.TOKEN_DELIMITER);
            }
            return this.H.replace(JsonUtils.EMPTY_JSON, "");
        }
        return this.A.replace(JsonUtils.EMPTY_JSON, "");
    }

    public void a(boolean z10) {
        this.f67145e0 = z10;
    }

    private void a() {
        this.O = this.f67149h + this.N;
    }

    private void a(g gVar) {
        com.mbridge.msdk.setting.d dVarZ;
        if (gVar == null || (dVarZ = gVar.z()) == null || dVarZ.a() == 1) {
            return;
        }
        int iB = s0.a().b(kp.b.f102821a, "type", s0.a().b("t_r_t", 1));
        if (iB != 0 && iB != 1) {
            iB = 0;
        }
        u.a().a(com.mbridge.msdk.foundation.controller.c.n().d(), new x.b().a(new com.mbridge.msdk.foundation.same.report.d()).a(new n()).a(iB, a(iB)).a(s0.a().b("t_m_e_t", 604800000)).b(s0.a().b("t_m_e_s", 50)).d(s0.a().b("t_m_r_c", 50)).c(s0.a().b("t_m_t", 15000)).e(s0.a().b("t_m_r_t_s", 1)).a(), dVarZ.b() * 1000, com.mbridge.msdk.foundation.same.report.c.b());
    }

    private p a(int i10) {
        if (i10 == 1) {
            return new p(new m((byte) 2), h().f67152k, h().f67156o);
        }
        return new p(new com.mbridge.msdk.tracker.network.toolbox.h(), h().M, 0);
    }
}
