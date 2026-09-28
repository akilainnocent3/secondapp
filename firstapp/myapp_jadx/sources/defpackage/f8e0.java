package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f8e0 implements wf80.d {
    public final /* synthetic */ g8e0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ snh0 d;
    public final /* synthetic */ k8e0 e;
    public final /* synthetic */ k8e0 f;

    public /* synthetic */ f8e0(g8e0 g8e0Var, String str, String str2, snh0 snh0Var, k8e0 k8e0Var, k8e0 k8e0Var2) {
        this.a = g8e0Var;
        this.b = str;
        this.c = str2;
        this.d = snh0Var;
        this.e = k8e0Var;
        this.f = k8e0Var2;
    }

    @Override // wf80.d
    public final void a(wf80 wf80Var) {
        g8e0 g8e0Var = this.a;
        if (g8e0Var.c() == null) {
            return;
        }
        g8e0Var.F();
        g8e0Var.E(g8e0Var.G(this.b, this.c, this.d, this.e, this.f));
        g8e0Var.r();
        pei0 pei0Var = g8e0Var.s;
        pei0Var.getClass();
        kpf0.a();
        Iterator it = pei0Var.a.iterator();
        while (it.hasNext()) {
            pei0Var.d((pnh0) it.next());
        }
    }
}
