package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class jwk0 implements wnk0 {
    public final qcl0 a;

    public jwk0(qcl0 qcl0Var) {
        this.a = qcl0Var;
    }

    @Override // defpackage.wnk0
    public final Object zza() {
        Context context = this.a.a.a;
        n36.a("UID: [", Process.myUid(), Process.myPid(), "]  PID: [", "] ").concat("AppUpdateListenerRegistry");
        new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        tuk0 tuk0Var = new tuk0();
        new HashSet();
        context.getApplicationContext();
        return tuk0Var;
    }
}
