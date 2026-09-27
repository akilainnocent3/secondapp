package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC5549zd extends Ye implements InterfaceC5457vl {
    public AbstractC5549zd(@oy.l Ia ia2, @oy.m String str) {
        super(ia2, str);
    }

    @oy.m
    public final String c(@oy.l String str, @oy.m String str2) {
        return this.f96838a.getString(f(str), str2);
    }

    @oy.l
    public final InterfaceC5457vl d(@oy.l String str, @oy.m String str2) {
        return (InterfaceC5457vl) b(f(str), str2);
    }

    public final boolean e(@oy.l String str) {
        return this.f96838a.a(f(str));
    }

    @oy.l
    public abstract String f(@oy.l String str);

    @oy.l
    public InterfaceC5457vl g(@oy.l String str) {
        return (InterfaceC5457vl) d(f(str));
    }

    public AbstractC5549zd(@oy.l Ia ia2) {
        this(ia2, null);
    }

    @oy.l
    public final InterfaceC5457vl d(@oy.l String str, int i10) {
        return (InterfaceC5457vl) b(f(str), i10);
    }

    public final int c(@oy.l String str, int i10) {
        return this.f96838a.getInt(f(str), i10);
    }

    @oy.l
    public final InterfaceC5457vl d(@oy.l String str, long j10) {
        return (InterfaceC5457vl) b(f(str), j10);
    }

    @oy.l
    public final InterfaceC5457vl d(@oy.l String str, boolean z10) {
        return (InterfaceC5457vl) b(f(str), z10);
    }

    public final long c(@oy.l String str, long j10) {
        return this.f96838a.getLong(f(str), j10);
    }

    public final boolean c(@oy.l String str, boolean z10) {
        return this.f96838a.getBoolean(f(str), z10);
    }
}
