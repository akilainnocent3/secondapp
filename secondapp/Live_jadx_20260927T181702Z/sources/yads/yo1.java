package yads;

import android.content.Context;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yo1 implements eo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mo1 f158440a;

    public yo1(mo1 mo1Var) {
        this.f158440a = mo1Var;
    }

    @Override // yads.eo1
    public final co1 a(Context context) {
        return this.f158440a.a(context, MediatedAppOpenAdAdapter.class);
    }
}
