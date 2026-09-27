package yads;

import android.view.View;
import android.widget.ProgressBar;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class v71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pa1 f156808a;

    public v71(pa1 pa1Var) {
        this.f156808a = pa1Var;
    }

    public final r91 a(wd3 wd3Var, r91 r91Var) {
        boolean z10 = this.f156808a.getVolume() == 0.0f;
        View view = wd3Var.f157316f;
        Float fValueOf = null;
        Boolean boolValueOf = view != null ? Boolean.valueOf(view.isEnabled()) : null;
        ProgressBar progressBar = wd3Var.f157315e;
        if (progressBar != null) {
            int progress = progressBar.getProgress();
            int max = progressBar.getMax();
            if (max != 0) {
                fValueOf = Float.valueOf(progress / max);
            }
        }
        return new r91(z10, r91Var.f154821b, boolValueOf != null ? boolValueOf.booleanValue() : false, fValueOf != null ? fValueOf.floatValue() : 0.0f);
    }
}
