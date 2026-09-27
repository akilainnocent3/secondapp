package yads;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class q2 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f154234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z9 f154235b;

    public q2(Activity activity, z9 z9Var) {
        this.f154234a = activity;
        this.f154235b = z9Var;
    }

    public final void a(int i10, Bundle bundle) {
        z9 z9Var = this.f154235b;
        if (z9Var != null) {
            z9Var.a(i10, bundle);
        }
    }

    public final void a(int i10) {
        try {
            if (Build.VERSION.SDK_INT != 26) {
                this.f154234a.setRequestedOrientation(i10);
            }
        } catch (Exception unused) {
            boolean z10 = ad1.f146762a;
        }
    }
}
