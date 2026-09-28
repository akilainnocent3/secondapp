package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ndk0 implements ServiceConnection {
    public final /* synthetic */ odk0 a;

    public /* synthetic */ ndk0(odk0 odk0Var) {
        Objects.requireNonNull(odk0Var);
        this.a = odk0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        odk0 odk0Var = this.a;
        odk0Var.b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        odk0Var.a().post(new ldk0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        odk0 odk0Var = this.a;
        odk0Var.b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        odk0Var.a().post(new mdk0(this));
    }
}
