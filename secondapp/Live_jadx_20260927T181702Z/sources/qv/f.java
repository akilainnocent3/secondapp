package qv;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.s1;
import qv.f;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@s1({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n103#1,7:266\n1#2:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n111#1:266,7\n*E\n"})
public abstract class f<N extends f<N>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f122957b = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f122958c = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public f(@oy.m N n10) {
        this._prev$volatile = n10;
    }

    private final /* synthetic */ void u(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, ds.l<Object, ? extends Object> lVar) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!h0.b.a(atomicReferenceFieldUpdater, obj, obj2, lVar.invoke(obj2)));
    }

    public final void c() {
        f122958c.set(this, null);
    }

    public final N d() {
        N n10 = (N) h();
        while (n10 != null && n10.m()) {
            n10 = (N) f122958c.get(n10);
        }
        return n10;
    }

    public final N e() {
        f fVarF;
        N n10 = (N) f();
        kotlin.jvm.internal.m0.m(n10);
        while (n10.m() && (fVarF = n10.f()) != null) {
            n10 = (N) fVarF;
        }
        return n10;
    }

    @oy.m
    public final N f() {
        Object objG = g();
        if (objG == e.f122956b) {
            return null;
        }
        return (N) objG;
    }

    public final Object g() {
        return f122957b.get(this);
    }

    @oy.m
    public final N h() {
        return (N) f122958c.get(this);
    }

    public final /* synthetic */ Object i() {
        return this._next$volatile;
    }

    public final /* synthetic */ Object k() {
        return this._prev$volatile;
    }

    public abstract boolean m();

    public final boolean n() {
        return f() == null;
    }

    public final boolean o() {
        return h0.b.a(f122957b, this, null, e.f122956b);
    }

    @oy.m
    public final N p(@oy.l ds.a aVar) {
        Object objG = g();
        if (objG != e.f122956b) {
            return (N) objG;
        }
        aVar.invoke();
        throw new dr.e0();
    }

    public final void q() {
        Object obj;
        if (n()) {
            return;
        }
        while (true) {
            f fVarD = d();
            f fVarE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122958c;
            do {
                obj = atomicReferenceFieldUpdater.get(fVarE);
            } while (!h0.b.a(atomicReferenceFieldUpdater, fVarE, obj, ((f) obj) == null ? null : fVarD));
            if (fVarD != null) {
                f122957b.set(fVarD, fVarE);
            }
            if (!fVarE.m() || fVarE.n()) {
                if (fVarD == null || !fVarD.m()) {
                    return;
                }
            }
        }
    }

    public final /* synthetic */ void r(Object obj) {
        this._next$volatile = obj;
    }

    public final /* synthetic */ void s(Object obj) {
        this._prev$volatile = obj;
    }

    public final boolean t(@oy.l N n10) {
        return h0.b.a(f122957b, this, null, n10);
    }
}
