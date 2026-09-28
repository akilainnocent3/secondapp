package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rlh0 implements Runnable {
    public final /* synthetic */ bmh0 a;
    public final /* synthetic */ ml1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ rlh0(bmh0 bmh0Var, ml1 ml1Var, int i, Runnable runnable) {
        this.a = bmh0Var;
        this.b = ml1Var;
        this.c = i;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ml1 ml1Var = this.b;
        final int i = this.c;
        Runnable runnable = this.d;
        final bmh0 bmh0Var = this.a;
        zoe0 zoe0Var = bmh0Var.f;
        try {
            final erg ergVar = bmh0Var.c;
            Objects.requireNonNull(ergVar);
            zoe0Var.f(new zoe0.a() { // from class: tlh0
                @Override // zoe0.a
                public final Object execute() {
                    return Integer.valueOf(ergVar.h());
                }
            });
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) bmh0Var.a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                zoe0Var.f(new zoe0.a() { // from class: ulh0
                    @Override // zoe0.a
                    public final Object execute() {
                        bmh0Var.d.a(ml1Var, i + 1);
                        return null;
                    }
                });
            } else {
                bmh0Var.a(ml1Var, i);
            }
        } catch (yoe0 unused) {
            bmh0Var.d.a(ml1Var, i + 1);
        } finally {
            runnable.run();
        }
    }
}
