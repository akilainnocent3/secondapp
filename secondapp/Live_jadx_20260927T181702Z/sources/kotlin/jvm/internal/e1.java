package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class e1 extends k1 implements ns.p {
    public e1() {
    }

    @Override // kotlin.jvm.internal.r
    public ns.c computeReflected() {
        return m1.t(this);
    }

    @Override // ns.p
    @dr.l1(version = "1.1")
    public Object getDelegate() {
        return ((ns.p) getReflected()).getDelegate();
    }

    @Override // ds.a
    public Object invoke() {
        return get();
    }

    @dr.l1(version = "1.1")
    public e1(Object obj) {
        super(obj);
    }

    @Override // ns.o
    public ns.p.a getGetter() {
        return ((ns.p) getReflected()).getGetter();
    }

    @dr.l1(version = sc.k.f129877g)
    public e1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }
}
