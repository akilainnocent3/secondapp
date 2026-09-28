package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class uh80 {
    public final Object a;

    public uh80(yfe yfeVar) {
        yfeVar.getClass();
        this.a = yfeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, x1b x1bVar) {
        hcg0 hcg0Var;
        if (x1bVar instanceof hcg0) {
            hcg0Var = (hcg0) x1bVar;
            int i = hcg0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hcg0Var.c = i - Integer.MIN_VALUE;
            } else {
                hcg0Var = new hcg0(this, x1bVar);
            }
        } else {
            hcg0Var = new hcg0(this, x1bVar);
        }
        Object obj = hcg0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = hcg0Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                uj50.b(obj);
                return ((zi50) obj).a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ecg0 ecg0Var = (ecg0) this.a;
        hcg0Var.c = 1;
        Object objA = ecg0Var.a(str, hcg0Var);
        return objA == y5bVar ? y5bVar : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(String str, x1b x1bVar) {
        icg0 icg0Var;
        if (x1bVar instanceof icg0) {
            icg0Var = (icg0) x1bVar;
            int i = icg0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                icg0Var.c = i - Integer.MIN_VALUE;
            } else {
                icg0Var = new icg0(this, x1bVar);
            }
        } else {
            icg0Var = new icg0(this, x1bVar);
        }
        Object obj = icg0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = icg0Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                uj50.b(obj);
                return ((zi50) obj).a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ecg0 ecg0Var = (ecg0) this.a;
        icg0Var.c = 1;
        Object objB = ecg0Var.b(str, icg0Var);
        return objB == y5bVar ? y5bVar : objB;
    }

    public uh80(ecg0 ecg0Var) {
        this.a = ecg0Var;
    }
}
