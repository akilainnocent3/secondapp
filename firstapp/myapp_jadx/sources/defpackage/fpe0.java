package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fpe0 implements cbj<Void> {
    public final /* synthetic */ hpe0 a;

    public fpe0(hpe0 hpe0Var) {
        this.a = hpe0Var;
    }

    @Override // defpackage.cbj
    public final void onFailure(Throwable th) {
        hpe0 hpe0Var = this.a;
        hpe0Var.b();
        uf6 uf6Var = hpe0Var.b;
        ArrayList arrayListB = uf6Var.b();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListB.get(i);
            i++;
            ape0 ape0Var = (ape0) obj;
            if (ape0Var == hpe0Var) {
                break;
            } else {
                ape0Var.b();
            }
        }
        synchronized (uf6Var.b) {
            uf6Var.e.remove(hpe0Var);
        }
    }

    @Override // defpackage.cbj
    public final void onSuccess(Void r1) {
    }
}
