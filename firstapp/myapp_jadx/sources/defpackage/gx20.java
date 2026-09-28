package defpackage;

import com.sportybet.core.gift.domain.DobGift;

/* JADX INFO: loaded from: classes5.dex */
public final class gx20 {
    public final prk a;
    public final iug0 b;

    public gx20(prk prkVar, iug0 iug0Var) {
        prkVar.getClass();
        this.a = prkVar;
        this.b = iug0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(DobGift dobGift, x1b x1bVar) {
        fx20 fx20Var;
        boolean z;
        DobGift dobGift2;
        prk prkVar;
        DobGift dobGift3;
        if (x1bVar instanceof fx20) {
            fx20Var = (fx20) x1bVar;
            int i = fx20Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fx20Var.f = i - Integer.MIN_VALUE;
            } else {
                fx20Var = new fx20(this, x1bVar);
            }
        } else {
            fx20Var = new fx20(this, x1bVar);
        }
        Object objA = fx20Var.d;
        Object obj = y5b.a;
        int i2 = fx20Var.f;
        if (i2 != 0) {
            if (i2 == 1) {
                z = fx20Var.c;
                prkVar = fx20Var.b;
                dobGift2 = fx20Var.a;
                uj50.b(objA);
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dobGift3 = fx20Var.a;
                uj50.b(objA);
            }
            return new vue((String) objA, s5y.d(new Long((long) dobGift3.b)), dobGift3.c, dobGift3.d);
        }
        uj50.b(objA);
        boolean z2 = dobGift.a;
        fx20Var.a = dobGift;
        prk prkVar2 = this.a;
        fx20Var.b = prkVar2;
        fx20Var.c = z2;
        fx20Var.f = 1;
        Object objA2 = this.b.a();
        if (objA2 != obj) {
            objA = objA2;
            z = z2;
            dobGift2 = dobGift;
            prkVar = prkVar2;
        }
        return obj;
        fx20Var.a = dobGift2;
        fx20Var.b = null;
        fx20Var.f = 2;
        objA = prkVar.a(z, (hug0) objA);
        if (objA != obj) {
            dobGift3 = dobGift2;
            return new vue((String) objA, s5y.d(new Long((long) dobGift3.b)), dobGift3.c, dobGift3.d);
        }
        return obj;
    }
}
