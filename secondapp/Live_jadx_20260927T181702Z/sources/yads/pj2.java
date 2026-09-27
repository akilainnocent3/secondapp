package yads;

import android.widget.ProgressBar;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pj2 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a91 f153956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y81 f153957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hj2 f153958c;

    public /* synthetic */ pj2(a91 a91Var) {
        this(a91Var, new y81(), new hj2());
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        z81 z81Var = this.f153956a.f146706a;
        ProgressBar progressBar = null;
        gq0 gq0VarA = z81Var != null ? z81Var.a() : null;
        if (gq0VarA != null) {
            this.f153957b.getClass();
            wd3 adUiElements = gq0VarA.getAdUiElements();
            if (adUiElements != null) {
                progressBar = adUiElements.f157315e;
            }
        }
        if (progressBar != null) {
            this.f153958c.f150157a.getClass();
            ff.a(progressBar, j10, j11);
        }
    }

    public pj2(a91 a91Var, y81 y81Var, hj2 hj2Var) {
        this.f153956a = a91Var;
        this.f153957b = y81Var;
        this.f153958c = hj2Var;
    }
}
