package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final class ghk0 implements Runnable {
    public final /* synthetic */ ihk0 a;

    public ghk0(ihk0 ihk0Var) {
        this.a = ihk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.k.b(new ConnectionResult(4));
    }
}
