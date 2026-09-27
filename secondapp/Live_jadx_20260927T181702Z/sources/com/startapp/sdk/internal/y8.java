package com.startapp.sdk.internal;

import android.graphics.Bitmap;
import com.startapp.sdk.ads.list3d.List3DActivity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class y8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f75898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z8 f75899b;

    public y8(z8 z8Var, Bitmap bitmap) {
        this.f75899b = z8Var;
        this.f75898a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z8 z8Var;
        z8 z8Var2 = this.f75899b;
        Bitmap bitmap = this.f75898a;
        a9 a9Var = z8Var2.f75967d;
        a9Var.f74535g--;
        if (bitmap != null) {
            a9Var.f74532d.put(z8Var2.f75965b, bitmap);
            List3DActivity list3DActivity = z8Var2.f75967d.f74534f;
            if (list3DActivity != null) {
                list3DActivity.a(z8Var2.f75964a);
            }
            a9 a9Var2 = z8Var2.f75967d;
            if (a9Var2.f74536h.isEmpty() || (z8Var = (z8) a9Var2.f74536h.poll()) == null) {
                return;
            }
            ((Executor) a9Var2.f74529a.a()).execute(z8Var);
        }
    }
}
