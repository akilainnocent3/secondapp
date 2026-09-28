package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class n1s extends wqz<Integer, f1s> {
    public final long b;
    public final ix6 c;
    public final e27 d;

    public n1s(long j, ix6 ix6Var, e27 e27Var) {
        ix6Var.getClass();
        this.b = j;
        this.c = ix6Var;
        this.d = e27Var;
    }

    @Override // defpackage.wqz
    public final Integer b(xqz<Integer, f1s> xqzVar) {
        wqz.b.c<Integer, f1s> cVarA;
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

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.wqz
    public final Object d(wqz.a aVar, x1b x1bVar) {
        m1s m1sVar;
        int i;
        if (x1bVar instanceof m1s) {
            m1sVar = (m1s) x1bVar;
            int i2 = m1sVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m1sVar.d = i2 - Integer.MIN_VALUE;
            } else {
                m1sVar = new m1s(this, x1bVar);
            }
        } else {
            m1sVar = new m1s(this, x1bVar);
        }
        m1s m1sVar2 = m1sVar;
        Object obj = m1sVar2.b;
        y5b y5bVar = y5b.a;
        int i3 = m1sVar2.d;
        try {
            if (i3 == 0) {
                uj50.b(obj);
                Integer num = (Integer) aVar.a();
                int iIntValue = num != null ? num.intValue() : 1;
                ix6 ix6Var = this.c;
                long j = this.b;
                Integer num2 = new Integer(iIntValue);
                Integer num3 = new Integer(aVar.a);
                m1sVar2.a = iIntValue;
                m1sVar2.d = 1;
                Object objB = ix6Var.b(j, num2, num3, m1sVar2);
                if (objB == y5bVar) {
                    return y5bVar;
                }
                int i4 = iIntValue;
                obj = objB;
                i = i4;
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = m1sVar2.a;
                uj50.b(obj);
            }
            k07 k07VarH = wz6.h((l07) n52.b((BaseResponse) obj));
            if (i == 1) {
                this.d.invoke(k07VarH.a);
            }
            int i5 = k07VarH.e;
            int i6 = k07VarH.d;
            return new wqz.b.c(k07VarH.b, i == 1 ? null : new Integer(i - 1), i < (i6 <= 0 ? 1 : ((i5 + i6) - 1) / i6) ? new Integer(i + 1) : null, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } catch (Exception e) {
            return new wqz.b.a(e);
        }
    }
}
