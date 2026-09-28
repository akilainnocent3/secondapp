package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zw5 implements nv5.c, pya {
    public final /* synthetic */ Object a;

    public /* synthetic */ zw5(Object obj) {
        this.a = obj;
    }

    @Override // nv5.c
    public Object a(nv5.a aVar) {
        qx5 qx5Var = (qx5) this.a;
        try {
            ArrayList arrayList = new ArrayList(qx5Var.a.b().b().c);
            arrayList.add(qx5Var.R.f);
            arrayList.add(new ox5(qx5Var, aVar));
            qx5Var.b.a.d(qx5Var.y.a, qx5Var.c, a26.a(arrayList));
            return "configAndCloseTask";
        } catch (RuntimeException | rz5 e) {
            qx5Var.v("Unable to open camera for configAndClose: " + e.getMessage(), e);
            aVar.d(e);
            return "configAndCloseTask";
        }
    }

    @Override // defpackage.pya
    public void accept(Object obj) {
        ((qja0) this.a).invoke(obj);
    }
}
