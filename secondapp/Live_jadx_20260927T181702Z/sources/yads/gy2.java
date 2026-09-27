package yads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gy2 extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f149820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hy2 f149821e;

    public gy2(hy2 hy2Var) {
        this.f149821e = hy2Var;
        this.f149820d = hy2Var.f150342b.iterator();
    }

    @Override // yads.g
    public final Object a() {
        while (this.f149820d.hasNext()) {
            Object next = this.f149820d.next();
            if (this.f149821e.f150343c.contains(next)) {
                return next;
            }
        }
        this.f149315b = 3;
        return null;
    }
}
