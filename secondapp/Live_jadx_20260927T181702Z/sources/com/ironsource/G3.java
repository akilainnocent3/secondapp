package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class G3 implements InterfaceC4505s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final Boolean f59011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final Integer f59012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    private final N3 f59013c;

    public G3(@oy.m Boolean bool, @oy.m Integer num, @oy.m N3 n10) {
        this.f59011a = bool;
        this.f59012b = num;
        this.f59013c = n10;
    }

    @Override // com.ironsource.InterfaceC4505s7
    @oy.l
    public Object a() {
        Boolean bool = this.f59011a;
        if (bool == null) {
            dr.i1.a aVar = dr.i1.f79460c;
            return dr.i1.b(dr.j1.a(new Exception("enabled flag is not provided or invalid")));
        }
        if (!bool.booleanValue()) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            return dr.i1.b(Boolean.FALSE);
        }
        Integer num = this.f59012b;
        if (num == null || num.intValue() <= 0) {
            dr.i1.a aVar3 = dr.i1.f79460c;
            return dr.i1.b(dr.j1.a(new Exception("limit flag is not provided or invalid")));
        }
        if (this.f59013c == null) {
            dr.i1.a aVar4 = dr.i1.f79460c;
            return dr.i1.b(dr.j1.a(new Exception("unit flag is not provided or invalid")));
        }
        dr.i1.a aVar5 = dr.i1.f79460c;
        return dr.i1.b(Boolean.TRUE);
    }
}
