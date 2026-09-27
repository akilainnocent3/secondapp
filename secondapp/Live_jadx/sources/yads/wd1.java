package yads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wd1 extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Iterator f157298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ og2 f157299e;

    public wd1(Iterator it, og2 og2Var) {
        this.f157298d = it;
        this.f157299e = og2Var;
    }

    @Override // yads.g
    public final Object a() {
        while (this.f157298d.hasNext()) {
            Object next = this.f157298d.next();
            if (this.f157299e.apply(next)) {
                return next;
            }
        }
        this.f149315b = 3;
        return null;
    }
}
