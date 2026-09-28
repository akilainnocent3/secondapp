package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zv50 {
    /* JADX WARN: Code duplicated, block: B:30:0x006a A[PHI: r3
      0x006a: PHI (r3v6 int) = (r3v5 int), (r3v5 int), (r3v13 int) binds: [B:32:0x006e, B:37:0x007b, B:29:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Object a(wqz.a aVar, bw50 bw50Var, int i, xbs.a aVar2, x1b x1bVar) {
        wv50 wv50Var;
        int i2;
        int iMax;
        int i3;
        int i4 = i;
        if (x1bVar instanceof wv50) {
            wv50Var = (wv50) x1bVar;
            int i5 = wv50Var.e;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                wv50Var.e = i5 - Integer.MIN_VALUE;
            } else {
                wv50Var = new wv50(x1bVar);
            }
        } else {
            wv50Var = new wv50(x1bVar);
        }
        Object objInvoke = wv50Var.d;
        Object obj = y5b.a;
        int i6 = wv50Var.e;
        Integer num = null;
        if (i6 == 0) {
            uj50.b(objInvoke);
            Integer num2 = (Integer) aVar.a();
            int iIntValue = num2 != null ? num2.intValue() : 0;
            boolean z = aVar instanceof wqz.a.b;
            if (z) {
                i2 = ((wqz.a.b) aVar).a;
                if (iIntValue < i2) {
                    i2 = iIntValue;
                }
            } else {
                i2 = aVar.a;
            }
            if (z) {
                int i7 = ((wqz.a.b) aVar).a;
                if (iIntValue < i7) {
                    iMax = 0;
                } else {
                    iIntValue -= i7;
                    iMax = iIntValue;
                }
            } else if (aVar instanceof wqz.a.C1262a) {
                iMax = iIntValue;
            } else {
                if (!(aVar instanceof wqz.a.c)) {
                    uhc.a();
                    return null;
                }
                int i8 = i4 - ((wqz.a.c) aVar).a;
                if (iIntValue >= i8) {
                    iMax = Math.max(0, i8);
                } else {
                    iMax = iIntValue;
                }
            }
            int i9 = i2 + iMax > i4 ? i4 - iMax : i2;
            StringBuilder sb = new StringBuilder("SELECT * FROM ( ");
            wxa.b(i2, bw50Var.a, " ) LIMIT ", " OFFSET ", sb);
            sb.append(iMax);
            bw50 bw50Var2 = new bw50(sb.toString(), bw50Var.b);
            Integer num3 = new Integer(i9);
            wv50Var.a = i4;
            wv50Var.b = i2;
            wv50Var.c = iMax;
            wv50Var.e = 1;
            objInvoke = aVar2.invoke(bw50Var2, num3, wv50Var);
            if (objInvoke == obj) {
                return obj;
            }
            i3 = i2;
        } else {
            if (i6 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iMax = wv50Var.c;
            i3 = wv50Var.b;
            i4 = wv50Var.a;
            uj50.b(objInvoke);
        }
        int i10 = iMax;
        List list = (List) objInvoke;
        int size = list.size() + i10;
        Integer num4 = (list.isEmpty() || list.size() < i3 || size >= i4) ? null : new Integer(size);
        if (i10 > 0 && !list.isEmpty()) {
            num = new Integer(i10);
        }
        return new wqz.b.c(list, num, num4, i10, Math.max(0, i4 - size));
    }
}
