package yads;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class h83 implements l1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ns.o[] f149973d = {wb.a(h83.class, "contextReference", "getContextReference()Landroid/content/Context;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o32 f149974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f149975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2 f149976c;

    public h83(Activity activity, o32 o32Var, w0 w0Var) {
        this.f149974a = o32Var;
        this.f149975b = w0Var;
        this.f149976c = mm2.a(activity);
    }

    @Override // yads.l1
    public final void a(Activity activity) {
        lm2 lm2Var = this.f149976c;
        ns.o oVar = f149973d[0];
        Context context = (Context) lm2Var.f152056a.get();
        if (context == null || !kotlin.jvm.internal.m0.g(context, activity)) {
            return;
        }
        this.f149974a.f153340a.h();
    }

    @Override // yads.l1
    public final void b(Activity activity) {
        lm2 lm2Var = this.f149976c;
        ns.o oVar = f149973d[0];
        Context context = (Context) lm2Var.f152056a.get();
        if (context == null || !kotlin.jvm.internal.m0.g(context, activity)) {
            return;
        }
        this.f149974a.f153340a.g();
    }
}
