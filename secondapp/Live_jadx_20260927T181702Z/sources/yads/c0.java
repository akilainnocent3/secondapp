package yads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public class c0 extends tx1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f147463b;

    public c0(a0 a0Var) {
        this.f147463b = a0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        a0 a0Var = (a0) this.f147463b;
        a0Var.getClass();
        return new k(a0Var);
    }
}
