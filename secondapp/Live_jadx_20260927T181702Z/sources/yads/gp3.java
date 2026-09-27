package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gp3 implements to2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hp3 f149740a;

    public gp3(hp3 hp3Var) {
        this.f149740a = hp3Var;
    }

    public final void a() {
        hp3 hp3Var = this.f149740a;
        to2 to2Var = hp3Var.f150218c;
        if (hp3Var.f150219d != 0 || to2Var == null) {
            return;
        }
        to2Var.onSuccess(hp3Var.f150217b);
    }

    @Override // yads.to2
    public final void onSuccess(Object obj) {
        hp3 hp3Var = this.f149740a;
        hp3Var.f150219d--;
        hp3Var.f150217b.addAll((List) obj);
        a();
    }

    @Override // yads.to2
    public final void a(be3 be3Var) {
        this.f149740a.f150219d--;
        a();
    }
}
