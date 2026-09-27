package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ir2 implements kz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f150776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ow f150777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kz f150778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f150779d;

    public ir2(Context context, ei0 ei0Var, kz kzVar) {
        this.f150776a = context;
        this.f150777b = ei0Var;
        this.f150778c = kzVar;
    }

    @Override // yads.kz
    public final void e() {
        if (this.f150779d) {
            this.f150778c.e();
            return;
        }
        ((ei0) this.f150777b).a(this.f150776a);
    }
}
