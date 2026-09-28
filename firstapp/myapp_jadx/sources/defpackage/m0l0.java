package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: loaded from: classes4.dex */
public final class m0l0 extends h0l0 {
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ o1l0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0l0(o1l0 o1l0Var, Bundle bundle, Activity activity) {
        super(o1l0Var.a, true);
        this.e = bundle;
        this.f = activity;
        this.i = o1l0Var;
    }

    @Override // defpackage.h0l0
    public final void a() {
        Bundle bundle;
        Bundle bundle2 = this.e;
        if (bundle2 != null) {
            bundle = new Bundle();
            if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = bundle2.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        vvk0 vvk0Var = this.i.a.f;
        hm20.h(vvk0Var);
        Activity activity = this.f;
        vvk0Var.onActivityCreatedByScionActivityInfo(zzdf.G0(activity), bundle, this.b);
    }
}
