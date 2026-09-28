package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class iv1 {
    public final psm a;
    public final eg50 b;
    public final yu1 c;

    public iv1(psm psmVar, eg50 eg50Var, yu1 yu1Var) {
        psmVar.getClass();
        yu1Var.getClass();
        this.a = psmVar;
        this.b = eg50Var;
        this.c = yu1Var;
    }

    public static String b(String str, String str2, boolean z) {
        return z ? tug.a(str, " ", str2) : oxc.a(str2, " ", str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, boolean z, boolean z2, x1b x1bVar) {
        hv1 hv1Var;
        if (x1bVar instanceof hv1) {
            hv1Var = (hv1) x1bVar;
            int i = hv1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hv1Var.f = i - Integer.MIN_VALUE;
            } else {
                hv1Var = new hv1(this, x1bVar);
            }
        } else {
            hv1Var = new hv1(this, x1bVar);
        }
        Object objA = hv1Var.d;
        y5b y5bVar = y5b.a;
        int i2 = hv1Var.f;
        psm psmVar = this.a;
        if (i2 == 0) {
            uj50.b(objA);
            hv1Var.a = j;
            hv1Var.b = z;
            hv1Var.c = z2;
            hv1Var.f = 1;
            objA = this.b.a(psmVar.f(), hv1Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = hv1Var.c;
            z = hv1Var.b;
            j = hv1Var.a;
            uj50.b(objA);
        }
        String str = (String) objA;
        boolean zF = psmVar.F();
        if (z) {
            return z2 ? b(s5y.d(new Long(j)), str, zF) : b("*****", str, zF);
        }
        return b("--", str, zF);
    }
}
