package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.ignite.m;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public String A;
    public String B;
    public String C;
    public String E;
    public String F;
    public String G;
    public String I;
    public CreativeType M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f47717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f47718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f47719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f47720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f47722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f47724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f47725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f47726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f47727k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f47728l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f47729m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f47730n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f47731o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public UnitDisplayType f47732p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f47733q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Map f47734r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f47735s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImpressionData f47736t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.fyber.inneractive.sdk.dv.j f47737u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f47740x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Exception f47742z;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f47738v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f47739w = -1.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f47741y = -1;
    public boolean D = false;
    public m H = m.NONE;
    public boolean J = false;
    public long K = 0;
    public boolean L = false;

    public abstract InneractiveErrorCode a(InneractiveAdRequest inneractiveAdRequest, r rVar);

    public final void a(String str) {
        long j10;
        try {
            j10 = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            j10 = 20;
        }
        this.f47718b = j10;
        this.f47717a = TimeUnit.MINUTES.toMillis(j10) + this.f47719c;
    }

    public abstract InneractiveErrorCode b();

    public final boolean a() {
        return (this.H == m.NONE || TextUtils.isEmpty(this.A) || TextUtils.isEmpty(this.G) || TextUtils.isEmpty(this.I)) ? false : true;
    }
}
