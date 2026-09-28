package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ww5 implements Runnable {
    public final /* synthetic */ qx5 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ wf80 c;
    public final /* synthetic */ snh0 d;
    public final /* synthetic */ k8e0 e;
    public final /* synthetic */ List f;

    public /* synthetic */ ww5(qx5 qx5Var, String str, wf80 wf80Var, snh0 snh0Var, k8e0 k8e0Var, List list) {
        this.a = qx5Var;
        this.b = str;
        this.c = wf80Var;
        this.d = snh0Var;
        this.e = k8e0Var;
        this.f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qx5 qx5Var = this.a;
        String str = this.b;
        wf80 wf80Var = this.c;
        snh0<?> snh0Var = this.d;
        k8e0 k8e0Var = this.e;
        List<tnh0.b> list = this.f;
        qx5Var.v("Use case " + str + " RESET", null);
        qx5Var.a.f(str, wf80Var, snh0Var, k8e0Var, list);
        qx5Var.r();
        qx5Var.E();
        qx5Var.L();
        if (qx5Var.e == qx5.f.y) {
            qx5Var.D();
        }
    }
}
