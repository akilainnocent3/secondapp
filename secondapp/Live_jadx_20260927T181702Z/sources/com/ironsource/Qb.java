package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Qb {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @oy.l
    public static final a f59938m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f59939n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f59940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private H1 f59941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f59942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f59943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f59944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    private final ArrayList<C4207bc> f59945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.m
    private C4207bc f59946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f59947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    private C4450p2 f59948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f59949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f59950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f59951l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        private a() {
        }
    }

    public Qb(int i10, long j10, boolean z10, @oy.l H1 events, @oy.l C4450p2 auctionSettings, int i11, long j11, boolean z11, boolean z12, boolean z13) {
        kotlin.jvm.internal.m0.p(events, "events");
        kotlin.jvm.internal.m0.p(auctionSettings, "auctionSettings");
        this.f59940a = z13;
        this.f59945f = new ArrayList<>();
        this.f59942c = i10;
        this.f59943d = j10;
        this.f59944e = z10;
        this.f59941b = events;
        this.f59947h = i11;
        this.f59948i = auctionSettings;
        this.f59949j = j11;
        this.f59950k = z11;
        this.f59951l = z12;
    }

    public final void a(@oy.l H1 h10) {
        kotlin.jvm.internal.m0.p(h10, "<set-?>");
        this.f59941b = h10;
    }

    public final int b() {
        return this.f59942c;
    }

    public final long c() {
        return this.f59943d;
    }

    @oy.l
    public final C4450p2 d() {
        return this.f59948i;
    }

    @oy.m
    public final C4207bc e() {
        for (C4207bc c4207bc : this.f59945f) {
            if (c4207bc.d()) {
                return c4207bc;
            }
        }
        return this.f59946g;
    }

    public final int f() {
        return this.f59947h;
    }

    @oy.l
    public final H1 g() {
        return this.f59941b;
    }

    public final long h() {
        return this.f59949j;
    }

    public final boolean i() {
        return this.f59950k;
    }

    public final boolean j() {
        return this.f59940a;
    }

    public final boolean k() {
        return this.f59951l;
    }

    @oy.l
    public String toString() {
        return "NativeAdConfigurations{parallelLoad=" + this.f59942c + ", bidderExclusive=" + this.f59944e + "}";
    }

    public final void a(int i10) {
        this.f59942c = i10;
    }

    public final void b(int i10) {
        this.f59947h = i10;
    }

    public final void c(boolean z10) {
        this.f59951l = z10;
    }

    public final void a(long j10) {
        this.f59943d = j10;
    }

    public final void b(long j10) {
        this.f59949j = j10;
    }

    public final boolean a() {
        return this.f59944e;
    }

    public final void b(boolean z10) {
        this.f59950k = z10;
    }

    public final void a(boolean z10) {
        this.f59944e = z10;
    }

    public final void a(@oy.l C4450p2 c4450p2) {
        kotlin.jvm.internal.m0.p(c4450p2, "<set-?>");
        this.f59948i = c4450p2;
    }

    public final void a(@oy.m C4207bc c4207bc) {
        if (c4207bc != null) {
            this.f59945f.add(c4207bc);
            if (this.f59946g == null) {
                this.f59946g = c4207bc;
            } else if (c4207bc.b() == 0) {
                this.f59946g = c4207bc;
            }
        }
    }

    @oy.m
    public final C4207bc a(@oy.l String placementName) {
        kotlin.jvm.internal.m0.p(placementName, "placementName");
        for (C4207bc c4207bc : this.f59945f) {
            if (kotlin.jvm.internal.m0.g(c4207bc.c(), placementName)) {
                return c4207bc;
            }
        }
        return null;
    }
}
