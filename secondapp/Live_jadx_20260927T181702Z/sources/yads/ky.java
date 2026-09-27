package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ky implements ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ag0[] f151767a;

    public ky(ag0... ag0VarArr) {
        this.f151767a = ag0VarArr;
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        for (ag0 ag0Var : this.f151767a) {
            if (!ag0Var.a(context)) {
                return false;
            }
        }
        return true;
    }
}
