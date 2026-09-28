package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class te4 {
    public static se4 a(c8n c8nVar, int i) {
        se4 se4Var = new se4(c8nVar, (((long) c8nVar.b()) & 4294967295L) | (((long) c8nVar.c()) << 32));
        se4Var.v = i;
        return se4Var;
    }

    public static final int b(xkt xktVar, kt ktVar) {
        xkt xktVarK0 = xktVar.K0();
        if (xktVarK0 == null) {
            wkn.c("Child of " + xktVar + " cannot be null when calculating alignment line");
        }
        if (xktVar.O0().s().containsKey(ktVar)) {
            Integer num = xktVar.O0().s().get(ktVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iF0 = xktVarK0.f0(ktVar);
            if (iF0 != Integer.MIN_VALUE) {
                xktVarK0.y = true;
                xktVar.z = true;
                xktVar.W0();
                xktVarK0.y = false;
                xktVar.z = false;
                return iF0 + ((int) (ktVar instanceof mjm ? xktVarK0.R0() & 4294967295L : xktVarK0.R0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }
}
