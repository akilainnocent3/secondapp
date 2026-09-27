package yads;

import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z9 implements f4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ns.o[] f158664b = {kotlin.jvm.internal.m1.k(new kotlin.jvm.internal.y0(z9.class, "adEventsReceiver", "getAdEventsReceiver()Lcom/monetization/ads/base/AdEventsReceiver;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f158665a = mm2.a(null);

    @Override // yads.f4
    public final void a(int i10, Bundle bundle) {
        lm2 lm2Var = this.f158665a;
        ns.o oVar = f158664b[0];
        f4 f4Var = (f4) lm2Var.f152056a.get();
        if (f4Var != null) {
            f4Var.a(i10, bundle);
            boolean z10 = ad1.f146762a;
        }
    }

    public final void a(f4 f4Var) {
        lm2 lm2Var = this.f158665a;
        ns.o oVar = f158664b[0];
        lm2Var.getClass();
        lm2Var.f152056a = new WeakReference(f4Var);
    }
}
