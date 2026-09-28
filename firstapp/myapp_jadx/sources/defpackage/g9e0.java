package defpackage;

import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;

/* JADX INFO: loaded from: classes8.dex */
public final class g9e0 implements yxd0, k6b {
    public static final g9e0 a = new g9e0();

    public static final Object d(mi10 mi10Var, int i) {
        if (i < 0 || i >= mi10Var.a()) {
            ks40.a(mi10Var.a(), efe0.a(i, "Index: ", yFmFZvuWxAYfEj.YQmFYaJrOZho));
            return null;
        }
        int iD = i - mi10Var.d();
        if (iD < 0 || iD >= mi10Var.b()) {
            return null;
        }
        return mi10Var.getItem(iD);
    }

    @Override // defpackage.yxd0
    public int a(Object obj, ptu ptuVar) {
        return cyd0.e(cl0.a, (String) obj, ptuVar);
    }

    @Override // defpackage.yxd0
    public void b(me80 me80Var, Object obj, ptu ptuVar) {
        me80Var.P(cl0.a, (String) obj, ptuVar);
    }

    @Override // defpackage.k6b
    public Object c(j6b j6bVar) throws j6b {
        throw j6bVar;
    }
}
