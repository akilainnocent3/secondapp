package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C4235d4;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.m0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class n {
    public static int N = 1;
    public static int O;
    private String A;
    private String B;
    private int C;
    private String D;
    private String E;
    private String G;
    private String H;
    private String I;
    private int J;
    private long K;
    private String L;
    private int M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f66919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f66920c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f66923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f66924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f66925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f66926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f66927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f66928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f66929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f66930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f66931n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f66932o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f66933p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f66934q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f66935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f66936s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f66938u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f66939v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f66940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f66941x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f66942y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f66943z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f66918a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f66921d = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f66937t = 0;
    private int F = 0;

    public n(String str, int i10, int i11, int i12, int i13, String str2, String str3, int i14, String str4, int i15, String str5) {
        this.f66934q = str;
        this.f66938u = i10;
        this.f66939v = str5;
        this.f66933p = i11;
        this.M = i12;
        this.J = i13;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f66940w = URLEncoder.encode(str2, G5.N);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f66941x = str3;
        this.C = i14;
        this.f66926i = str4;
        this.K = i15;
    }

    public String A() {
        return this.H;
    }

    public String B() {
        return this.I;
    }

    public int C() {
        return this.J;
    }

    public long D() {
        return this.K;
    }

    public String E() {
        return this.L;
    }

    public int F() {
        return this.M;
    }

    public String a() {
        return this.f66919b;
    }

    public void b(String str) {
        this.f66923f = str;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f66924g = URLEncoder.encode(str);
    }

    public String d() {
        return this.f66923f;
    }

    public String e() {
        return this.f66924g;
    }

    public String f() {
        return this.f66925h;
    }

    public String g() {
        return this.f66926i;
    }

    public String h() {
        return this.f66927j;
    }

    public String i() {
        return this.f66928k;
    }

    public void j(String str) {
        this.f66934q = str;
    }

    public String k() {
        return this.f66930m;
    }

    public void l(String str) {
        this.f66939v = str;
    }

    public void m(String str) {
        this.f66941x = str;
    }

    public String n() {
        return this.f66934q;
    }

    public void o(String str) {
        this.f66943z = str;
    }

    public void p(String str) {
        this.A = str;
    }

    public int q() {
        return this.f66938u;
    }

    public String r() {
        return this.f66939v;
    }

    public String s() {
        return this.f66940w;
    }

    public String t() {
        return TextUtils.isEmpty(this.f66941x) ? "" : this.f66941x;
    }

    @NonNull
    public String toString() {
        return "RewardReportData [key=" + this.f66934q + ", networkType=" + this.f66938u + ", isCompleteView=" + this.f66933p + ", watchedMillis=" + this.M + ", videoLength=" + this.J + ", offerUrl=" + this.f66940w + ", reason=" + this.f66941x + ", result=" + this.C + ", duration=" + this.f66926i + ", videoSize=" + this.K + C4235d4.j.f61462e;
    }

    public void u(String str) {
        this.I = str;
    }

    public String v() {
        return this.f66943z;
    }

    public String w() {
        return this.A;
    }

    public int x() {
        return this.C;
    }

    public int y() {
        return this.F;
    }

    public String z() {
        return this.G;
    }

    public void a(String str) {
        this.f66919b = str;
    }

    public int b() {
        return this.f66920c;
    }

    public void d(String str) {
        this.f66925h = str;
    }

    public void e(String str) {
        this.f66926i = str;
    }

    public void f(String str) {
        this.f66927j = str;
    }

    public void g(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f66928k = URLEncoder.encode(str, G5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void h(String str) {
        this.f66929l = str;
    }

    public void i(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f66932o = URLEncoder.encode(str, G5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public String j() {
        return this.f66929l;
    }

    public void k(String str) {
        this.f66936s = str;
    }

    public String l() {
        return this.f66932o;
    }

    public int m() {
        return this.f66933p;
    }

    public void n(String str) {
        this.f66942y = str;
    }

    public String o() {
        return this.f66935r;
    }

    public int p() {
        return this.f66937t;
    }

    public void q(String str) {
        this.B = str;
    }

    public void r(String str) {
        this.D = str;
    }

    public void s(String str) {
        this.E = str;
    }

    public void t(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.G = URLEncoder.encode(str, G5.N);
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
    }

    public String u() {
        return this.f66942y;
    }

    public void v(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.L = URLEncoder.encode(str, G5.N);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(int i10) {
        this.f66920c = i10;
    }

    public void b(int i10) {
        this.f66937t = i10;
    }

    public void c(int i10) {
        this.f66938u = i10;
    }

    public void d(int i10) {
        this.C = i10;
    }

    public void e(int i10) {
        this.F = i10;
    }

    public String a(String str, String str2) {
        Map<String, String> map;
        if (!TextUtils.isEmpty(str) && (map = this.f66918a) != null) {
            try {
                String str3 = map.get(str);
                if (!TextUtils.isEmpty(str3)) {
                    return str3;
                }
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f66918a == null) {
            this.f66918a = new HashMap();
        }
        try {
            this.f66918a.put(str, str2);
        } catch (Exception unused) {
        }
    }

    public int c() {
        return this.f66922e;
    }

    public n() {
    }

    public n(String str, int i10, String str2, String str3, String str4) {
        this.f66934q = str;
        this.f66939v = str4;
        this.f66938u = i10;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f66940w = URLEncoder.encode(str2, G5.N);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.f66941x = str3;
    }

    public n(String str, int i10, int i11, String str2, int i12, String str3, int i13, String str4) {
        this.f66934q = str;
        this.f66938u = i10;
        this.f66939v = str4;
        this.J = i11;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f66940w = URLEncoder.encode(str2, G5.N);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i12;
        this.f66926i = str3;
        this.K = i13;
    }

    public n(Context context, CampaignEx campaignEx, int i10, String str, long j10, int i11) {
        if (i11 == 1 || i11 == 287 || i11 == 94) {
            this.f66934q = "m_download_end";
        } else if (i11 == 95) {
            this.f66934q = "2000025";
        }
        int iS = m0.s(context);
        this.f66938u = iS;
        this.f66939v = m0.a(context, iS);
        this.J = campaignEx.getVideoLength();
        this.f66942y = campaignEx.getRequestId();
        this.f66943z = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f66940w)) {
            try {
                this.f66940w = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), G5.N);
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
            }
        }
        this.C = i10;
        this.f66926i = str;
        this.K = j10 == 0 ? campaignEx.getVideoSize() : j10;
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7) {
        this.f66934q = str;
        this.f66930m = str2;
        this.H = str3;
        this.f66935r = str4;
        this.I = str5;
        this.f66923f = str6;
        this.f66938u = i10;
        this.f66939v = str7;
    }

    public n(String str) {
        this.f66931n = str;
    }

    public n(String str, int i10, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f66934q = str;
        this.C = i10;
        this.f66926i = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f66928k = URLEncoder.encode(str3, G5.N);
            }
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        this.f66923f = str4;
        this.I = str5;
        this.f66941x = str6;
        this.f66927j = str7;
        if (Integer.valueOf(str2).intValue() > com.mbridge.msdk.foundation.same.a.L) {
            this.C = 2;
        }
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10) {
        this.f66934q = str;
        this.f66923f = str2;
        this.f66942y = str3;
        this.f66943z = str4;
        this.I = str5;
        this.f66938u = i10;
    }

    public n(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6) {
        this.f66934q = str;
        this.f66923f = str2;
        this.f66942y = str3;
        this.f66943z = str4;
        this.I = str5;
        this.f66938u = i10;
        this.f66941x = str6;
        this.f66922e = i11;
    }
}
