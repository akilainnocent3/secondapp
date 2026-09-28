package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class q6k implements rtm {
    public final b5 a;
    public final mum b;
    public final yym c;

    public q6k(b5 b5Var, mum mumVar, yym yymVar) {
        b5Var.getClass();
        mumVar.getClass();
        yymVar.getClass();
        this.a = b5Var;
        this.b = mumVar;
        this.c = yymVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.rtm
    public final Object a(hu00 hu00Var, x1b x1bVar) {
        p6k p6kVar;
        hu00 hu00Var2;
        Object objA;
        hu00 hu00Var3;
        bnj bnjVar;
        ArrayList arrayListB;
        Long lI;
        int size;
        int i;
        int i2;
        Object obj;
        if80 if80Var;
        String str;
        int size2;
        if80 if80Var2;
        double d;
        String countryCurrency;
        String str2;
        Object obj2;
        String str3;
        if (x1bVar instanceof p6k) {
            p6kVar = (p6k) x1bVar;
            int i3 = p6kVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p6kVar.e = i3 - Integer.MIN_VALUE;
            } else {
                p6kVar = new p6k(this, x1bVar);
            }
        } else {
            p6kVar = new p6k(this, x1bVar);
        }
        Object obj3 = p6kVar.c;
        y5b y5bVar = y5b.a;
        int i4 = p6kVar.e;
        Object obj4 = null;
        mum mumVar = this.b;
        if (i4 == 0) {
            uj50.b(obj3);
            hu00Var2 = hu00Var;
            p6kVar.a = hu00Var2;
            p6kVar.e = 1;
            objA = this.c.a();
            if (objA != y5bVar) {
            }
            return y5bVar;
        }
        if (i4 == 1) {
            hu00 hu00Var4 = p6kVar.a;
            uj50.b(obj3);
            objA = obj3;
            hu00Var2 = hu00Var4;
        } else {
            if (i4 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bnj bnjVar2 = p6kVar.b;
            hu00 hu00Var5 = p6kVar.a;
            uj50.b(obj3);
            hu00Var3 = hu00Var5;
            bnjVar = bnjVar2;
        }
        if (((Boolean) obj3).booleanValue()) {
            return null;
        }
        arrayListB = mumVar.b();
        lI = mumVar.i();
        size = arrayListB.size();
        i = 0;
        i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = null;
                break;
            }
            obj = arrayListB.get(i2);
            i2++;
            long j = ((if80) obj).a;
            if (lI != null && j == lI.longValue()) {
                break;
            }
        }
        if80Var = (if80) obj;
        if (if80Var != null || (str3 = if80Var.b) == null) {
            str = "";
        } else {
            str = str3;
        }
        boolean z = !(bnjVar instanceof tw20);
        size2 = arrayListB.size();
        while (i < size2) {
            obj2 = arrayListB.get(i);
            i++;
            long j2 = ((if80) obj2).a;
            if (lI != null && j2 == lI.longValue()) {
                obj4 = obj2;
                break;
            }
        }
        if80Var2 = (if80) obj4;
        if (if80Var2 != null) {
            d = if80Var2.e;
        } else {
            d = 0.0d;
        }
        double d2 = d;
        countryCurrency = this.a.getCountryCurrency();
        if (countryCurrency == null) {
            str2 = "";
        } else {
            str2 = countryCurrency;
        }
        return new bmj(lI, str, z, bnjVar, d2, str2, hu00Var3, arrayListB);
        bnj bnjVar3 = (bnj) objA;
        p6kVar.a = hu00Var2;
        p6kVar.b = bnjVar3;
        p6kVar.e = 2;
        Object objM = mumVar.m(p6kVar);
        if (objM != y5bVar) {
            hu00Var3 = hu00Var2;
            obj3 = objM;
            bnjVar = bnjVar3;
            if (((Boolean) obj3).booleanValue()) {
                return null;
            }
            arrayListB = mumVar.b();
            lI = mumVar.i();
            size = arrayListB.size();
            i = 0;
            i2 = 0;
            while (true) {
                if (i2 < size) {
                    obj = null;
                    break;
                }
                obj = arrayListB.get(i2);
                i2++;
                long j3 = ((if80) obj).a;
                if (lI != null) {
                    break;
                    break;
                }
            }
            if80Var = (if80) obj;
            if (if80Var != null) {
                str = "";
            } else {
                str = "";
            }
            boolean z2 = !(bnjVar instanceof tw20);
            size2 = arrayListB.size();
            while (i < size2) {
                obj2 = arrayListB.get(i);
                i++;
                long j4 = ((if80) obj2).a;
                if (lI != null) {
                    obj4 = obj2;
                    break;
                }
            }
            if80Var2 = (if80) obj4;
            if (if80Var2 != null) {
                d = if80Var2.e;
            } else {
                d = 0.0d;
            }
            double d3 = d;
            countryCurrency = this.a.getCountryCurrency();
            if (countryCurrency == null) {
                str2 = "";
            } else {
                str2 = countryCurrency;
            }
            return new bmj(lI, str, z2, bnjVar, d3, str2, hu00Var3, arrayListB);
        }
        return y5bVar;
    }
}
