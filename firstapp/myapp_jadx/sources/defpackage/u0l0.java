package defpackage;

import android.app.Activity;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: loaded from: classes4.dex */
public final class u0l0 extends h0l0 {
    public final /* synthetic */ Activity e;
    public final /* synthetic */ o1l0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0l0(o1l0 o1l0Var, Activity activity) {
        super(o1l0Var.a, true);
        this.e = activity;
        this.f = o1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        vvk0 vvk0Var = this.f.a.f;
        hm20.h(vvk0Var);
        vvk0Var.onActivityStoppedByScionActivityInfo(zzdf.G0(this.e), this.b);
    }
}
