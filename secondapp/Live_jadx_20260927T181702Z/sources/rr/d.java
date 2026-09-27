package rr;

import dr.l1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.3")
@s1({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
public abstract class d extends a {

    @oy.m
    private final or.j _context;

    @oy.m
    private transient or.f<Object> intercepted;

    public d(@oy.m or.f<Object> fVar, @oy.m or.j jVar) {
        super(fVar);
        this._context = jVar;
    }

    @Override // or.f
    @oy.l
    public or.j getContext() {
        or.j jVar = this._context;
        m0.m(jVar);
        return jVar;
    }

    @oy.l
    public final or.f<Object> intercepted() {
        or.f<Object> fVarL = this.intercepted;
        if (fVarL == null) {
            or.g gVar = (or.g) getContext().get(or.g.Aa);
            if (gVar == null || (fVarL = gVar.L(this)) == null) {
                fVarL = this;
            }
            this.intercepted = fVarL;
        }
        return fVarL;
    }

    @Override // rr.a
    public void releaseIntercepted() {
        or.f<?> fVar = this.intercepted;
        if (fVar != null && fVar != this) {
            or.j.b bVar = getContext().get(or.g.Aa);
            m0.m(bVar);
            ((or.g) bVar).i(fVar);
        }
        this.intercepted = c.f127473b;
    }

    public d(@oy.m or.f<Object> fVar) {
        this(fVar, fVar != null ? fVar.getContext() : null);
    }
}
