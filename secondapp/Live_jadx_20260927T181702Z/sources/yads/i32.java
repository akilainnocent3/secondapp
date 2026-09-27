package yads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class i32 implements z00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f150414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final my0 f150415b;

    public i32(q2 q2Var, my0 my0Var) {
        this.f150414a = q2Var;
        this.f150415b = my0Var;
    }

    @Override // yads.z00
    public final void a(j5 j5Var) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("impression_data_key", j5Var);
        ((q2) this.f150414a).a(16, bundle);
    }

    @Override // yads.z00
    public final void closeNativeAd() {
        nt2 nt2Var = this.f150415b.f152757a;
        if (nt2Var == null || nt2Var.f153186t) {
            return;
        }
        ((q2) this.f150414a).f154234a.finish();
    }

    @Override // yads.z00
    public final void onLeftApplication() {
        ((q2) this.f150414a).a(17, null);
    }

    @Override // yads.z00
    public final void onReturnedToApplication() {
        ((q2) this.f150414a).a(18, null);
    }

    @Override // yads.z00
    public final void onAdClicked() {
    }
}
