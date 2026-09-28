package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class m990 {
    public final mgb0 a;

    public m990(mgb0 mgb0Var) {
        mgb0Var.getClass();
        this.a = mgb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        l990 l990Var;
        if (x1bVar instanceof l990) {
            l990Var = (l990) x1bVar;
            int i = l990Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l990Var.c = i - Integer.MIN_VALUE;
            } else {
                l990Var = new l990(this, x1bVar);
            }
        } else {
            l990Var = new l990(this, x1bVar);
        }
        Object userId = l990Var.a;
        y5b y5bVar = y5b.a;
        int i2 = l990Var.c;
        if (i2 == 0) {
            uj50.b(userId);
            l990Var.c = 1;
            userId = this.a.getUserId(l990Var);
            if (userId == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(userId);
        }
        String str = (String) (((String) userId).length() > 0 ? userId : null);
        return str == null ? Boolean.FALSE : Boolean.valueOf(!vn20.c("user_accept_change", str, false));
    }
}
