package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class m6k {
    public final x9f0 a;

    public m6k(x9f0 x9f0Var) {
        x9f0Var.getClass();
        this.a = x9f0Var;
    }

    public static /* synthetic */ Object b(m6k m6kVar, String str, String str2, String str3, tje0 tje0Var, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        return m6kVar.a(str, str2, 10, str3, tje0Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, String str2, int i, String str3, x1b x1bVar) {
        l6k l6kVar;
        if (x1bVar instanceof l6k) {
            l6kVar = (l6k) x1bVar;
            int i2 = l6kVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l6kVar.c = i2 - Integer.MIN_VALUE;
            } else {
                l6kVar = new l6k(this, x1bVar);
            }
        } else {
            l6kVar = new l6k(this, x1bVar);
        }
        l6k l6kVar2 = l6kVar;
        Object obj = l6kVar2.a;
        y5b y5bVar = y5b.a;
        int i3 = l6kVar2.c;
        if (i3 == 0) {
            uj50.b(obj);
            l6kVar2.c = 1;
            Object objD = this.a.d(str, str2, i, str3, l6kVar2);
            return objD == y5bVar ? y5bVar : objD;
        }
        if (i3 == 1) {
            uj50.b(obj);
            return ((zi50) obj).a;
        }
        ib5.a("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
