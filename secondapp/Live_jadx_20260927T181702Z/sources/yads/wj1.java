package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wj1 implements ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f157397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qj1 f157398b;

    public wj1(int i10, qj1 qj1Var) {
        this.f157397a = i10;
        this.f157398b = qj1Var;
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        int iC = kl3.c(context);
        int i10 = context.getResources().getDisplayMetrics().widthPixels;
        Float fA = this.f157398b.a();
        return i10 - (fA != null ? is.d.L0(fA.floatValue() * ((float) iC)) : 0) >= this.f157397a;
    }
}
