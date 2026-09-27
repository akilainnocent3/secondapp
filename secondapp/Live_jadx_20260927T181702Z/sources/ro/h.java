package ro;

import androidx.annotation.Nullable;
import androidx.lifecycle.b0;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import java.util.concurrent.atomic.AtomicBoolean;
import k.j0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class h<T> extends l0<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l
    public final AtomicBoolean f127468m = new AtomicBoolean(false);

    public static final void u(h hVar, m0 m0Var, Object obj) {
        if (hVar.f127468m.compareAndSet(true, false)) {
            m0Var.a(obj);
        }
    }

    @Override // androidx.lifecycle.LiveData
    @j0
    public void k(@l b0 owner, @l final m0<? super T> observer) {
        kotlin.jvm.internal.m0.p(owner, "owner");
        kotlin.jvm.internal.m0.p(observer, "observer");
        if (h()) {
            System.out.println((Object) "Multiple observers registered but only one will be notified of changes.");
        }
        super.k(owner, new m0() { // from class: ro.g
            @Override // androidx.lifecycle.m0
            public final void a(Object obj) {
                h.u(this.f127466b, observer, obj);
            }
        });
    }

    @Override // androidx.lifecycle.l0, androidx.lifecycle.LiveData
    @j0
    public void r(@Nullable @m T t10) {
        this.f127468m.set(true);
        super.r(t10);
    }

    @j0
    public final void t() {
        r(null);
    }
}
