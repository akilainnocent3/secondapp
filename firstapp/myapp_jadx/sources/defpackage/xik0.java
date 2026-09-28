package defpackage;

import android.app.AlertDialog;

/* JADX INFO: loaded from: classes4.dex */
public final class xik0 extends pgk0 {
    public final /* synthetic */ AlertDialog a;
    public final /* synthetic */ bjk0 b;

    public xik0(bjk0 bjk0Var, AlertDialog alertDialog) {
        this.b = bjk0Var;
        this.a = alertDialog;
    }

    @Override // defpackage.pgk0
    public final void a() {
        gjk0 gjk0Var = this.b.b;
        gjk0Var.b.set(null);
        ljk0 ljk0Var = ((ufk0) gjk0Var).f.C;
        ljk0Var.sendMessage(ljk0Var.obtainMessage(3));
        AlertDialog alertDialog = this.a;
        if (alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }
}
