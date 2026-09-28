package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class okl0 implements Runnable {
    public final /* synthetic */ iol0 a;
    public final /* synthetic */ Runnable b;

    public okl0(zkl0 zkl0Var, iol0 iol0Var, Runnable runnable) {
        this.a = iol0Var;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iol0 iol0Var = this.a;
        iol0Var.B();
        iol0Var.b().g();
        ArrayList arrayList = iol0Var.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            iol0Var.p = arrayList;
        }
        arrayList.add(this.b);
        iol0Var.q();
    }
}
