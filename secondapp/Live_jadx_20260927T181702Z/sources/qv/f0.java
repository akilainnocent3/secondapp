package qv;

import dr.w2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jv.j2;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@j2
@s1({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1#2:289\n*E\n"})
public class f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f122959b = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f122960c = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f122961d = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final /* synthetic */ void A(Object obj) {
        this._removedRef$volatile = obj;
    }

    public final boolean d(@oy.l f0 f0Var, int i10) {
        f0 f0VarM;
        do {
            f0VarM = m();
            if (f0VarM instanceof b0) {
                return (((b0) f0VarM).f122951e & i10) == 0 && f0VarM.d(f0Var, i10);
            }
        } while (!f0VarM.e(f0Var, this));
        return true;
    }

    @dr.f1
    public final boolean e(@oy.l f0 f0Var, @oy.l f0 f0Var2) {
        f122960c.set(f0Var, this);
        f122959b.set(f0Var, f0Var2);
        if (!h0.b.a(f122959b, this, f0Var2, f0Var)) {
            return false;
        }
        f0Var.j(f0Var2);
        return true;
    }

    public final boolean f(@oy.l f0 f0Var) {
        f122960c.set(f0Var, this);
        f122959b.set(f0Var, this);
        while (k() == this) {
            if (h0.b.a(f122959b, this, this, f0Var)) {
                f0Var.j(this);
                return true;
            }
        }
        return false;
    }

    public final void g(int i10) {
        d(new b0(i10), i10);
    }

    public final f0 h() {
        f0 f0Var;
        Object obj;
        while (true) {
            f0 f0Var2 = (f0) f122960c.get(this);
            f0Var = f0Var2;
            while (true) {
                f0 f0Var3 = null;
                while (true) {
                    obj = f122959b.get(f0Var);
                    if (obj == this) {
                        if (f0Var2 != f0Var && !h0.b.a(f122960c, this, f0Var2, f0Var)) {
                            break;
                        }
                        break;
                    }
                    if (t()) {
                        return null;
                    }
                    if (!(obj instanceof t0)) {
                        kotlin.jvm.internal.m0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        f0Var3 = f0Var;
                        f0Var = (f0) obj;
                    } else {
                        if (f0Var3 != null) {
                            break;
                        }
                        f0Var = (f0) f122960c.get(f0Var);
                    }
                }
                if (!h0.b.a(f122959b, f0Var3, f0Var, ((t0) obj).f123036a)) {
                    break;
                }
                f0Var = f0Var3;
            }
        }
        return f0Var;
    }

    public final f0 i(f0 f0Var) {
        while (f0Var.t()) {
            f0Var = (f0) f122960c.get(f0Var);
        }
        return f0Var;
    }

    public final void j(f0 f0Var) {
        f0 f0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122960c;
        do {
            f0Var2 = (f0) atomicReferenceFieldUpdater.get(f0Var);
            if (k() != f0Var) {
                return;
            }
        } while (!h0.b.a(f122960c, f0Var, f0Var2, this));
        if (t()) {
            f0Var.h();
        }
    }

    @oy.l
    public final Object k() {
        return f122959b.get(this);
    }

    @oy.l
    public final f0 l() {
        f0 f0Var;
        Object objK = k();
        t0 t0Var = objK instanceof t0 ? (t0) objK : null;
        if (t0Var != null && (f0Var = t0Var.f123036a) != null) {
            return f0Var;
        }
        kotlin.jvm.internal.m0.n(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (f0) objK;
    }

    @oy.l
    public final f0 m() {
        f0 f0VarH = h();
        return f0VarH == null ? i((f0) f122960c.get(this)) : f0VarH;
    }

    public final /* synthetic */ Object n() {
        return this._next$volatile;
    }

    public final /* synthetic */ Object p() {
        return this._prev$volatile;
    }

    public final /* synthetic */ Object r() {
        return this._removedRef$volatile;
    }

    public boolean t() {
        return k() instanceof t0;
    }

    @oy.l
    public String toString() {
        return new kotlin.jvm.internal.f1(this) { // from class: qv.f0.a
            @Override // kotlin.jvm.internal.f1, ns.p
            public Object get() {
                return jv.x0.a(this.receiver);
            }
        } + '@' + jv.x0.b(this);
    }

    public final /* synthetic */ void u(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, ds.l<Object, w2> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public boolean v() {
        return w() == null;
    }

    @dr.f1
    @oy.m
    public final f0 w() {
        Object objK;
        f0 f0Var;
        do {
            objK = k();
            if (objK instanceof t0) {
                return ((t0) objK).f123036a;
            }
            if (objK == this) {
                return (f0) objK;
            }
            kotlin.jvm.internal.m0.n(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            f0Var = (f0) objK;
        } while (!h0.b.a(f122959b, this, objK, f0Var.x()));
        f0Var.h();
        return null;
    }

    public final t0 x() {
        t0 t0Var = (t0) f122961d.get(this);
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0Var2 = new t0(this);
        f122961d.set(this, t0Var2);
        return t0Var2;
    }

    public final /* synthetic */ void y(Object obj) {
        this._next$volatile = obj;
    }

    public final /* synthetic */ void z(Object obj) {
        this._prev$volatile = obj;
    }

    public final void B(@oy.l f0 f0Var, @oy.l f0 f0Var2) {
    }
}
