package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class f11 extends nn implements f4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z9 f148927c;

    public f11(Context context, v9 v9Var) {
        this(context, v9Var, new z9());
    }

    @Override // yads.nn
    public final synchronized void b() {
        this.f148927c.a(null);
    }

    public f11(Context context, v9 v9Var, z9 z9Var) {
        super(context, v9Var);
        this.f148927c = z9Var;
        z9Var.a(this);
    }
}
