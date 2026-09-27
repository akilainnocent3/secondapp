package yads;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jp2 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f151211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f151212b;

    public jp2(f2 f2Var, int i10) {
        this.f151211a = f2Var;
        this.f151212b = i10;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        if (this.f151212b == 1) {
            ((q2) this.f151211a).a(7);
        } else {
            ((q2) this.f151211a).a(6);
        }
    }

    @Override // yads.zf0
    public final void c() {
    }
}
