package com.ironsource;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class H9 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f59155n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<M9> f59156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H1 f59157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f59158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f59159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f59160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f59161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C4450p2 f59162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f59163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f59164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f59165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f59166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f59167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private M9 f59168m;

    public H9() {
        this.f59156a = new ArrayList<>();
        this.f59157b = new H1();
        this.f59162g = new C4450p2();
    }

    public void a(M9 m10) {
        if (m10 != null) {
            this.f59156a.add(m10);
            if (this.f59168m == null) {
                this.f59168m = m10;
            } else if (m10.a(0)) {
                this.f59168m = m10;
            }
        }
    }

    public int b() {
        return this.f59161f;
    }

    public int c() {
        return this.f59158c;
    }

    public int d() {
        return this.f59160e;
    }

    public long e() {
        return TimeUnit.SECONDS.toMillis(this.f59160e);
    }

    public boolean f() {
        return this.f59159d;
    }

    public C4450p2 g() {
        return this.f59162g;
    }

    public long h() {
        return this.f59164i;
    }

    public H1 i() {
        return this.f59157b;
    }

    public boolean j() {
        return this.f59163h;
    }

    public boolean k() {
        return this.f59165j;
    }

    public boolean l() {
        return this.f59167l;
    }

    public boolean m() {
        return this.f59166k;
    }

    public String toString() {
        return "InterstitialConfigurations{parallelLoad=" + this.f59158c + ", bidderExclusive=" + this.f59159d + fw.b.f85383j;
    }

    public H9(int i10, boolean z10, int i11, H1 h10, C4450p2 c4450p2, int i12, boolean z11, long j10, boolean z12, boolean z13, boolean z14) {
        this.f59156a = new ArrayList<>();
        this.f59158c = i10;
        this.f59159d = z10;
        this.f59160e = i11;
        this.f59157b = h10;
        this.f59162g = c4450p2;
        this.f59165j = z12;
        this.f59166k = z13;
        this.f59161f = i12;
        this.f59163h = z11;
        this.f59164i = j10;
        this.f59167l = z14;
    }

    public M9 a(String str) {
        for (M9 m10 : this.f59156a) {
            if (m10.c().equals(str)) {
                return m10;
            }
        }
        return null;
    }

    public M9 a() {
        for (M9 m10 : this.f59156a) {
            if (m10.d()) {
                return m10;
            }
        }
        return this.f59168m;
    }
}
