package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class kie extends wqz<Integer, mbe> {
    public final phe.a.C0969a b;

    public kie(phe.a.C0969a c0969a) {
        this.b = c0969a;
    }

    @Override // defpackage.wqz
    public final Integer b(xqz<Integer, mbe> xqzVar) {
        wqz.b.c<Integer, mbe> cVarA;
        int iIntValue;
        Integer num = xqzVar.b;
        if (num == null || (cVarA = xqzVar.a(num.intValue())) == null) {
            return null;
        }
        Integer num2 = cVarA.b;
        if (num2 != null) {
            iIntValue = num2.intValue() + 1;
        } else {
            Integer num3 = cVarA.c;
            if (num3 == null) {
                return null;
            }
            iIntValue = num3.intValue() - 1;
        }
        return Integer.valueOf(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wqz
    public final Object d(wqz.a aVar, x1b x1bVar) {
        jie jieVar;
        int i;
        if (x1bVar instanceof jie) {
            jieVar = (jie) x1bVar;
            int i2 = jieVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jieVar.d = i2 - Integer.MIN_VALUE;
            } else {
                jieVar = new jie(this, x1bVar);
            }
        } else {
            jieVar = new jie(this, x1bVar);
        }
        Object obj = jieVar.b;
        y5b y5bVar = y5b.a;
        int i3 = jieVar.d;
        try {
            if (i3 == 0) {
                uj50.b(obj);
                Integer num = (Integer) aVar.a();
                int iIntValue = num != null ? num.intValue() : 1;
                phe.a.C0969a c0969a = this.b;
                Integer num2 = new Integer(iIntValue);
                Integer num3 = new Integer(aVar.a);
                jieVar.a = iIntValue;
                jieVar.d = 1;
                Object objInvoke = c0969a.invoke(num2, num3, jieVar);
                if (objInvoke == y5bVar) {
                    return y5bVar;
                }
                int i4 = iIntValue;
                obj = objInvoke;
                i = i4;
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = jieVar.a;
                uj50.b(obj);
            }
            gie gieVar = (gie) obj;
            return new wqz.b.c(gieVar.a, i == 1 ? null : new Integer(i - 1), i < gieVar.c ? new Integer(i + 1) : null, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } catch (Throwable th) {
            return new wqz.b.a(th);
        }
    }
}
