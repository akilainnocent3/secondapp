package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class x5l0 extends BroadcastReceiver {
    public final iol0 a;
    public boolean b;
    public boolean c;

    public x5l0(iol0 iol0Var) {
        this.a = iol0Var;
    }

    public final void a() {
        iol0 iol0Var = this.a;
        iol0Var.l0();
        iol0Var.b().g();
        iol0Var.b().g();
        if (this.b) {
            iol0Var.a().n.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                iol0Var.l.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                iol0Var.a().f.b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        iol0 iol0Var = this.a;
        iol0Var.l0();
        String action = intent.getAction();
        iol0Var.a().n.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            iol0Var.a().i.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        i5l0 i5l0Var = iol0Var.b;
        iol0.U(i5l0Var);
        boolean zK = i5l0Var.k();
        if (this.c != zK) {
            this.c = zK;
            iol0Var.b().p(new v5l0(this, zK));
        }
    }
}
