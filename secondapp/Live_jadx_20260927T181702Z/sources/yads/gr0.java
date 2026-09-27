package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class gr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static hr0 f149750a;

    public static final synchronized hr0 a(Context context) {
        hr0 hr0Var;
        hr0Var = f149750a;
        if (hr0Var == null) {
            hr0Var = new hr0(context);
            f149750a = hr0Var;
        }
        return hr0Var;
    }
}
