package com.ironsource;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class Zd {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f60470o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<C4298gd> f60471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H1 f60472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f60474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f60475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f60476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f60477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f60478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f60479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f60480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f60481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C4298gd f60482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C4450p2 f60483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f60484n;

    public Zd() {
        this.f60471a = new ArrayList<>();
        this.f60472b = new H1();
    }

    public void a(C4298gd c4298gd) {
        if (c4298gd != null) {
            this.f60471a.add(c4298gd);
            if (this.f60482l == null) {
                this.f60482l = c4298gd;
            } else if (c4298gd.a(0)) {
                this.f60482l = c4298gd;
            }
        }
    }

    public int b() {
        return this.f60477g;
    }

    public int c() {
        return this.f60476f;
    }

    public boolean d() {
        return this.f60484n;
    }

    public ArrayList<C4298gd> e() {
        return this.f60471a;
    }

    public boolean f() {
        return this.f60479i;
    }

    public int g() {
        return this.f60473c;
    }

    public int h() {
        return this.f60475e;
    }

    public long i() {
        return TimeUnit.SECONDS.toMillis(this.f60475e);
    }

    public boolean j() {
        return this.f60474d;
    }

    public C4450p2 k() {
        return this.f60483m;
    }

    public long l() {
        return this.f60478h;
    }

    public H1 m() {
        return this.f60472b;
    }

    public boolean n() {
        return this.f60481k;
    }

    public boolean o() {
        return this.f60480j;
    }

    public String toString() {
        return "RewardedVideoConfigurations{parallelLoad=" + this.f60473c + ", bidderExclusive=" + this.f60474d + fw.b.f85383j;
    }

    public Zd(int i10, boolean z10, int i11, int i12, H1 h10, C4450p2 c4450p2, int i13, boolean z11, long j10, boolean z12, boolean z13, boolean z14) {
        this.f60471a = new ArrayList<>();
        this.f60473c = i10;
        this.f60474d = z10;
        this.f60475e = i11;
        this.f60472b = h10;
        this.f60476f = i12;
        this.f60483m = c4450p2;
        this.f60477g = i13;
        this.f60484n = z11;
        this.f60478h = j10;
        this.f60479i = z12;
        this.f60480j = z13;
        this.f60481k = z14;
    }

    public C4298gd a(String str) {
        for (C4298gd c4298gd : this.f60471a) {
            if (c4298gd.c().equals(str)) {
                return c4298gd;
            }
        }
        return null;
    }

    public C4298gd a() {
        for (C4298gd c4298gd : this.f60471a) {
            if (c4298gd.d()) {
                return c4298gd;
            }
        }
        return this.f60482l;
    }
}
