package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class lfk {
    public final x9f0 a;

    public lfk(x9f0 x9f0Var) {
        x9f0Var.getClass();
        this.a = x9f0Var;
    }

    public static /* synthetic */ Object b(lfk lfkVar, String str, String str2, tje0 tje0Var, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return lfkVar.a(10, tje0Var, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, x1b x1bVar, String str, String str2) {
        kfk kfkVar;
        if (x1bVar instanceof kfk) {
            kfkVar = (kfk) x1bVar;
            int i2 = kfkVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kfkVar.c = i2 - Integer.MIN_VALUE;
            } else {
                kfkVar = new kfk(this, x1bVar);
            }
        } else {
            kfkVar = new kfk(this, x1bVar);
        }
        Object obj = kfkVar.a;
        y5b y5bVar = y5b.a;
        int i3 = kfkVar.c;
        if (i3 == 0) {
            uj50.b(obj);
            kfkVar.c = 1;
            Object objA = this.a.a(i, kfkVar, str, str2);
            return objA == y5bVar ? y5bVar : objA;
        }
        if (i3 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
