package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class P0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f59737e = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f59738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f59739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f59740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f59741d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public P0(a aVar, long j10, long j11, long j12) {
        this.f59738a = aVar;
        this.f59739b = j10;
        this.f59740c = j11;
        this.f59741d = j12;
    }

    public a a() {
        return this.f59738a;
    }

    public long b() {
        return this.f59741d;
    }

    public long c() {
        return this.f59740c;
    }

    public long d() {
        return this.f59739b;
    }

    public boolean e() {
        a aVar = this.f59738a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f59738a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }
}
