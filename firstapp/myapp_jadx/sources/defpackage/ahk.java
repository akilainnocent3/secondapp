package defpackage;

import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class ahk {
    public final sr10 a;

    public ahk(sr10 sr10Var) {
        sr10Var.getClass();
        this.a = sr10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        zgk zgkVar;
        if (x1bVar instanceof zgk) {
            zgkVar = (zgk) x1bVar;
            int i = zgkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zgkVar.c = i - Integer.MIN_VALUE;
            } else {
                zgkVar = new zgk(this, x1bVar);
            }
        } else {
            zgkVar = new zgk(this, x1bVar);
        }
        Object objR = zgkVar.a;
        y5b y5bVar = y5b.a;
        int i2 = zgkVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objR);
                zi50.a aVar = zi50.b;
                g1i g1iVarJ0 = this.a.j0(pu0.c.a);
                zgkVar.c = 1;
                objR = bm50.r(g1iVarJ0, null, zgkVar);
                if (objR == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objR);
            }
            WithDrawInfo withDrawInfo = (WithDrawInfo) objR;
            zi50.a aVar2 = zi50.b;
            return withDrawInfo;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
