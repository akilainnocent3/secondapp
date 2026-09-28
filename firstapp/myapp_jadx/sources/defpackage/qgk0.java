package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;

/* JADX INFO: loaded from: classes4.dex */
public final class qgk0 extends BroadcastReceiver {
    Context a;
    private final pgk0 b;

    public qgk0(pgk0 pgk0Var) {
        this.b = pgk0Var;
    }

    public final void a(Context context) {
        this.a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("3snfyLrKadrzpHqw", new Object[]{this, context, intent});
    }
}
