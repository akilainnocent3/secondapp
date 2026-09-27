package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class v0 extends b1 implements ns.k {
    public v0() {
    }

    @Override // kotlin.jvm.internal.r
    public ns.c computeReflected() {
        return m1.j(this);
    }

    @Override // ns.p
    @dr.l1(version = "1.1")
    public Object getDelegate() {
        return ((ns.k) getReflected()).getDelegate();
    }

    @Override // ds.a
    public Object invoke() {
        return get();
    }

    @dr.l1(version = "1.1")
    public v0(Object obj) {
        super(obj);
    }

    @Override // ns.o
    public ns.p.a getGetter() {
        return ((ns.k) getReflected()).getGetter();
    }

    @Override // ns.j
    public ns.k.a getSetter() {
        return ((ns.k) getReflected()).getSetter();
    }

    @dr.l1(version = sc.k.f129877g)
    public v0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
