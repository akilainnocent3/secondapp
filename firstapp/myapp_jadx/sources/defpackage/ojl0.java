package defpackage;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes4.dex */
public final class ojl0 implements Runnable {
    public final /* synthetic */ wjl0 a;

    public ojl0(wjl0 wjl0Var) {
        this.a = wjl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ikl0 ikl0Var = this.a.c;
        ikl0Var.r(new ComponentName(ikl0Var.a.a, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
