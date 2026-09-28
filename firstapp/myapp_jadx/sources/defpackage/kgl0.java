package defpackage;

import android.os.Bundle;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class kgl0 implements Runnable {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ igl0 b;
    public final /* synthetic */ igl0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ khl0 e;

    public kgl0(khl0 khl0Var, Bundle bundle, igl0 igl0Var, igl0 igl0Var2, long j) {
        this.a = bundle;
        this.b = igl0Var;
        this.c = igl0Var2;
        this.d = j;
        Objects.requireNonNull(khl0Var);
        this.e = khl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        khl0 khl0Var = this.e;
        khl0Var.getClass();
        Bundle bundle = this.a;
        bundle.remove(AnalyticsParam.EVENT_PARAM_SCREEN_NAME);
        bundle.remove("screen_class");
        yol0 yol0Var = khl0Var.a.i;
        k8l0.k(yol0Var);
        khl0Var.q(this.b, this.c, this.d, true, yol0Var.o("screen_view", bundle, null, false));
    }
}
