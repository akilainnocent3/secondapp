package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class f21 implements xxd0<e21<?>, Object> {
    public static final f21 a = new f21();

    public static class a implements xxd0<e21<?>, Object> {
        public static final a a = new a();

        @Override // defpackage.xxd0
        public final int a(e21<?> e21Var, Object obj, ptu ptuVar) {
            g21 type = e21Var.getType();
            switch (type.ordinal()) {
                case 0:
                    return cyd0.e(cl0.a, (String) obj, ptuVar);
                case 1:
                    int i = cl0.b.c;
                    ((Boolean) obj).getClass();
                    int i2 = s08.a;
                    return i + 1;
                case 2:
                    return s08.b(((Long) obj).longValue()) + cl0.c.c;
                case 3:
                    int i3 = cl0.d.c;
                    ((Double) obj).getClass();
                    int i4 = s08.a;
                    return i3 + 8;
                case 4:
                case 5:
                case 6:
                case 7:
                    return cyd0.a(cl0.e, type, (List) obj, d21.a, ptuVar);
                default:
                    hb5.a("Unsupported attribute type.");
                    return 0;
            }
        }

        @Override // defpackage.xxd0
        public final void b(me80 me80Var, e21<?> e21Var, Object obj, ptu ptuVar) {
            g21 type = e21Var.getType();
            switch (type.ordinal()) {
                case 0:
                    me80Var.P(cl0.a, (String) obj, ptuVar);
                    break;
                case 1:
                    me80Var.Y(cl0.b, ((Boolean) obj).booleanValue());
                    break;
                case 2:
                    me80Var.h0(cl0.c, ((Long) obj).longValue());
                    break;
                case 3:
                    me80Var.a0(cl0.d, ((Double) obj).doubleValue());
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    me80Var.o(cl0.e, type, (List) obj, d21.a, ptuVar);
                    break;
                default:
                    hb5.a("Unsupported attribute type.");
                    break;
            }
        }
    }

    @Override // defpackage.xxd0
    public final int a(e21<?> e21Var, Object obj, ptu ptuVar) {
        int iB;
        e21<?> e21Var2 = e21Var;
        if (e21Var2.getKey().isEmpty()) {
            iB = 0;
        } else {
            if (!(e21Var2 instanceof kyo)) {
                return cyd0.e(hnp.a, e21Var2.getKey(), ptuVar);
            }
            kyo kyoVar = (kyo) e21Var2;
            byte[] bytes = kyoVar.d;
            if (bytes == null) {
                bytes = kyoVar.b.getBytes(StandardCharsets.UTF_8);
                kyoVar.d = bytes;
            }
            iB = qtu.b(hnp.a, bytes);
        }
        return cyd0.a(hnp.b, e21Var2, obj, a.a, ptuVar) + iB;
    }

    @Override // defpackage.xxd0
    public final void b(me80 me80Var, e21<?> e21Var, Object obj, ptu ptuVar) {
        e21<?> e21Var2 = e21Var;
        if (e21Var2.getKey().isEmpty()) {
            ek1 ek1Var = hnp.a;
            me80Var.getClass();
        } else if (e21Var2 instanceof kyo) {
            kyo kyoVar = (kyo) e21Var2;
            byte[] bytes = kyoVar.d;
            if (bytes == null) {
                bytes = kyoVar.b.getBytes(StandardCharsets.UTF_8);
                kyoVar.d = bytes;
            }
            me80Var.J(hnp.a, bytes);
        } else {
            me80Var.P(hnp.a, e21Var2.getKey(), ptuVar);
        }
        me80Var.o(hnp.b, e21Var2, obj, a.a, ptuVar);
    }
}
