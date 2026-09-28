package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes4.dex */
public final class brl0 implements ServiceConnection {
    public final /* synthetic */ esl0 a;

    public /* synthetic */ brl0(esl0 esl0Var) {
        this.a = esl0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        esl0 esl0Var = this.a;
        esl0Var.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        esl0Var.a().post(new lnl0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        esl0 esl0Var = this.a;
        esl0Var.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        esl0Var.a().post(new rpl0(this));
    }
}
