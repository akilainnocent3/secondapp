package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class d21 implements xxd0 {
    public static final d21 a = new d21();

    public static final void c(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    @Override // defpackage.xxd0
    public int a(Object obj, Object obj2, ptu ptuVar) {
        List list = (List) obj2;
        int iOrdinal = ((g21) obj).ordinal();
        int i = 0;
        if (iOrdinal == 4) {
            ek1 ek1Var = ux0.a;
            if (list.isEmpty()) {
                return 0;
            }
            int i2 = ek1Var.c;
            int iA = 0;
            while (i < list.size()) {
                Object obj3 = list.get(i);
                int iB = ptuVar.b();
                int iE = cyd0.e(cl0.a, (String) obj3, ptuVar);
                ptuVar.b[iB] = iE;
                iA += s08.a(iE) + i2 + iE;
                i++;
            }
            return iA;
        }
        if (iOrdinal == 5) {
            ek1 ek1Var2 = ux0.a;
            if (list.isEmpty()) {
                return 0;
            }
            int iD = ek1Var2.d();
            int iA2 = 0;
            while (i < list.size()) {
                Object obj4 = list.get(i);
                int iB2 = ptuVar.b();
                int i3 = cl0.b.c;
                ((Boolean) obj4).getClass();
                int i4 = s08.a;
                int i5 = i3 + 1;
                ptuVar.b[iB2] = i5;
                iA2 += s08.a(i5) + iD + i5;
                i++;
            }
            return iA2;
        }
        if (iOrdinal == 6) {
            ek1 ek1Var3 = ux0.a;
            if (list.isEmpty()) {
                return 0;
            }
            int iD2 = ek1Var3.d();
            int iA3 = 0;
            while (i < list.size()) {
                Object obj5 = list.get(i);
                int iB3 = ptuVar.b();
                int iB4 = s08.b(((Long) obj5).longValue()) + cl0.c.c;
                ptuVar.b[iB3] = iB4;
                iA3 += s08.a(iB4) + iD2 + iB4;
                i++;
            }
            return iA3;
        }
        if (iOrdinal != 7) {
            hb5.a("Unsupported attribute type.");
            return 0;
        }
        ek1 ek1Var4 = ux0.a;
        if (list.isEmpty()) {
            return 0;
        }
        int iD3 = ek1Var4.d();
        int iA4 = 0;
        while (i < list.size()) {
            Object obj6 = list.get(i);
            int iB5 = ptuVar.b();
            int i6 = cl0.d.c;
            ((Double) obj6).getClass();
            int i7 = s08.a;
            int i8 = i6 + 8;
            ptuVar.b[iB5] = i8;
            iA4 += s08.a(i8) + iD3 + i8;
            i++;
        }
        return iA4;
    }

    @Override // defpackage.xxd0
    public void b(me80 me80Var, Object obj, Object obj2, ptu ptuVar) {
        List list = (List) obj2;
        int iOrdinal = ((g21) obj).ordinal();
        if (iOrdinal == 4) {
            me80Var.G(ux0.a, list, g9e0.a, ptuVar);
            return;
        }
        if (iOrdinal == 5) {
            me80Var.G(ux0.a, list, qw.a, ptuVar);
            return;
        }
        if (iOrdinal == 6) {
            me80Var.G(ux0.a, list, ovo.a, ptuVar);
        } else if (iOrdinal == 7) {
            me80Var.G(ux0.a, list, yye.a, ptuVar);
        } else {
            hb5.a("Unsupported attribute type.");
        }
    }
}
