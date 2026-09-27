package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n0 extends or.a implements or.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f100842c = new a(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @dr.v
    public static final class a extends or.b<or.g, n0> {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public static final n0 d(or.j.b bVar) {
            if (bVar instanceof n0) {
                return (n0) bVar;
            }
            return null;
        }

        public a() {
            super(or.g.Aa, new ds.l() { // from class: jv.m0
                @Override // ds.l
                public final Object invoke(Object obj) {
                    return n0.a.d((or.j.b) obj);
                }
            });
        }
    }

    public n0() {
        super(or.g.Aa);
    }

    public static /* synthetic */ n0 v0(n0 n0Var, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return n0Var.p0(i10, str);
    }

    public abstract void F(@oy.l or.j jVar, @oy.l Runnable runnable);

    @Override // or.g
    @oy.l
    public final <T> or.f<T> L(@oy.l or.f<? super T> fVar) {
        return new qv.m(this, fVar);
    }

    @Override // or.a, or.j.b, or.j
    @oy.m
    public <E extends or.j.b> E get(@oy.l or.j.c<E> cVar) {
        return (E) or.g.a.b(this, cVar);
    }

    @Override // or.g
    public final void i(@oy.l or.f<?> fVar) {
        kotlin.jvm.internal.m0.n(fVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((qv.m) fVar).v();
    }

    @j2
    public void m0(@oy.l or.j jVar, @oy.l Runnable runnable) {
        qv.n.e(this, jVar, runnable);
    }

    @Override // or.a, or.j.b, or.j
    @oy.l
    public or.j minusKey(@oy.l or.j.c<?> cVar) {
        return or.g.a.c(this, cVar);
    }

    public boolean n0(@oy.l or.j jVar) {
        return true;
    }

    @dr.o(level = dr.q.HIDDEN, message = "Deprecated for good. Override 'limitedParallelism(parallelism: Int, name: String?)' instead", replaceWith = @dr.g1(expression = "limitedParallelism(parallelism, null)", imports = {}))
    public /* synthetic */ n0 o0(int i10) {
        return p0(i10, null);
    }

    @oy.l
    public n0 p0(int i10, @oy.m String str) {
        qv.a0.a(i10);
        return new qv.z(this, i10, str);
    }

    @oy.l
    public String toString() {
        return x0.a(this) + '@' + x0.b(this);
    }

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final n0 w0(@oy.l n0 n0Var) {
        return n0Var;
    }
}
