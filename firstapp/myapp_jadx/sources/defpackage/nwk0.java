package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class nwk0 implements gs0.a {
    public final /* synthetic */ czk0 a;

    public nwk0(czk0 czk0Var) {
        this.a = czk0Var;
    }

    @Override // defpackage.rbl0
    public final void a(long j, Bundle bundle, String str, String str2) {
        czk0 czk0Var = this.a;
        if (czk0Var.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            tcn tcnVar = wuk0.a;
            String strB = ggl0.b(str2, lbl0.c, lbl0.a);
            if (strB != null) {
                str2 = strB;
            }
            bundle2.putString("events", str2);
            czk0Var.b.a(2, bundle2);
        }
    }
}
