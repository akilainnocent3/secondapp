package qv;

import dr.w2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class d0 extends f0 {
    public final void C(@oy.l ds.l<? super f0, w2> lVar) {
        Object objK = k();
        kotlin.jvm.internal.m0.n(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        for (f0 f0VarL = (f0) objK; !kotlin.jvm.internal.m0.g(f0VarL, this); f0VarL = f0VarL.l()) {
            lVar.invoke(f0VarL);
        }
    }

    @oy.l
    public final Void D() {
        throw new IllegalStateException("head cannot be removed");
    }

    @Override // qv.f0
    public boolean t() {
        return false;
    }

    @Override // qv.f0
    public /* bridge */ /* synthetic */ boolean v() {
        return ((Boolean) D()).booleanValue();
    }
}
