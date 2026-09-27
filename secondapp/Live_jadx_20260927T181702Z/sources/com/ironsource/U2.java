package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class U2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f60161p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private H1 f60162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f60163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f60164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f60165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<C4306h3> f60166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4306h3 f60167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f60168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f60169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C4450p2 f60170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f60171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f60172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f60173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f60174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f60175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f60176o;

    public U2() {
        this.f60162a = new H1();
        this.f60166e = new ArrayList<>();
    }

    public int a() {
        return this.f60163b;
    }

    public long b() {
        return this.f60164c;
    }

    public boolean c() {
        return this.f60165d;
    }

    public C4450p2 d() {
        return this.f60170i;
    }

    public long e() {
        return this.f60172k;
    }

    public int f() {
        return this.f60169h;
    }

    public H1 g() {
        return this.f60162a;
    }

    public int h() {
        return this.f60168g;
    }

    @oy.l
    public C4306h3 i() {
        for (C4306h3 c4306h3 : this.f60166e) {
            if (c4306h3.d()) {
                return c4306h3;
            }
        }
        C4306h3 c4306h4 = this.f60167f;
        return c4306h4 != null ? c4306h4 : new C4435o5();
    }

    public long j() {
        return this.f60176o;
    }

    public boolean k() {
        return this.f60171j;
    }

    public boolean l() {
        return this.f60173l;
    }

    public boolean m() {
        return this.f60175n;
    }

    public boolean n() {
        return this.f60174m;
    }

    public String toString() {
        return "BannerConfigurations{parallelLoad=" + this.f60163b + ", bidderExclusive=" + this.f60165d + fw.b.f85383j;
    }

    public void a(C4306h3 c4306h3) {
        if (c4306h3 != null) {
            this.f60166e.add(c4306h3);
            if (this.f60167f == null) {
                this.f60167f = c4306h3;
            } else if (c4306h3.a(0)) {
                this.f60167f = c4306h3;
            }
        }
    }

    public U2(int i10, long j10, boolean z10, H1 h10, int i11, C4450p2 c4450p2, int i12, boolean z11, long j11, boolean z12, boolean z13, boolean z14, long j12) {
        this.f60166e = new ArrayList<>();
        this.f60163b = i10;
        this.f60164c = j10;
        this.f60165d = z10;
        this.f60162a = h10;
        this.f60168g = i11;
        this.f60169h = i12;
        this.f60170i = c4450p2;
        this.f60171j = z11;
        this.f60172k = j11;
        this.f60173l = z12;
        this.f60174m = z13;
        this.f60175n = z14;
        this.f60176o = j12;
    }

    public C4306h3 a(String str) {
        for (C4306h3 c4306h3 : this.f60166e) {
            if (c4306h3.c().equals(str)) {
                return c4306h3;
            }
        }
        return null;
    }
}
