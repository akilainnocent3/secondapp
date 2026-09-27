package yads;

import android.util.LruCache;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hp0 extends LruCache {
    public hp0(int i10) {
        super(i10);
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        p52 p52Var = (p52) obj2;
        if (p52Var != null) {
            p52Var.a();
        }
    }
}
