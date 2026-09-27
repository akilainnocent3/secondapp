package qv;

import dr.w2;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class g0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f122962a = AtomicReferenceFieldUpdater.newUpdater(g0.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public g0(boolean z10) {
        this._cur$volatile = new h0(8, z10);
    }

    public final boolean a(@oy.l E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122962a;
        while (true) {
            h0 h0Var = (h0) atomicReferenceFieldUpdater.get(this);
            int iA = h0Var.a(e10);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                h0.b.a(f122962a, this, h0Var, h0Var.r());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122962a;
        while (true) {
            h0 h0Var = (h0) atomicReferenceFieldUpdater.get(this);
            if (h0Var.d()) {
                return;
            } else {
                h0.b.a(f122962a, this, h0Var, h0Var.r());
            }
        }
    }

    public final int c() {
        return ((h0) f122962a.get(this)).g();
    }

    public final /* synthetic */ Object d() {
        return this._cur$volatile;
    }

    public final boolean f() {
        return ((h0) f122962a.get(this)).l();
    }

    public final boolean g() {
        return ((h0) f122962a.get(this)).m();
    }

    public final /* synthetic */ void h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, ds.l<Object, w2> lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @oy.l
    public final <R> List<R> i(@oy.l ds.l<? super E, ? extends R> lVar) {
        return ((h0) f122962a.get(this)).p(lVar);
    }

    @oy.m
    public final E j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122962a;
        while (true) {
            h0 h0Var = (h0) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) h0Var.s();
            if (e10 != h0.f122979t) {
                return e10;
            }
            h0.b.a(f122962a, this, h0Var, h0Var.r());
        }
    }

    public final /* synthetic */ void k(Object obj) {
        this._cur$volatile = obj;
    }
}
