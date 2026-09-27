package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Q4 implements InterfaceC4505s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final Boolean f59849a;

    public Q4(@oy.m Boolean bool) {
        this.f59849a = bool;
    }

    @Override // com.ironsource.InterfaceC4505s7
    @oy.l
    public Object a() {
        Boolean bool = this.f59849a;
        if (bool == null) {
            dr.i1.a aVar = dr.i1.f79460c;
            return dr.i1.b(dr.j1.a(new Exception("enabled flag is not provided or invalid")));
        }
        dr.i1.a aVar2 = dr.i1.f79460c;
        return dr.i1.b(bool);
    }
}
