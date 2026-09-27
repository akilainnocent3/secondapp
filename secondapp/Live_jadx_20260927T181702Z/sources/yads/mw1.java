package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f152707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gw1 f152708b;

    public mw1(Context context) {
        this.f152707a = context;
    }

    public final gw1 a() {
        gw1 gw1Var = this.f152708b;
        if (gw1Var != null) {
            return gw1Var;
        }
        gw1 gw1Var2 = new gw1(this.f152707a, (tn3) null, 6);
        this.f152708b = gw1Var2;
        return gw1Var2;
    }
}
