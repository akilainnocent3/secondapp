package defpackage;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes8.dex */
public final class z1h implements xxd0<w1h<?>, Object> {

    public static class a implements xxd0<w1h<?>, Object> {
        public static final a a = new a();

        @Override // defpackage.xxd0
        public final int a(w1h<?> w1hVar, Object obj, ptu ptuVar) {
            w1h<?> w1hVar2 = w1hVar;
            switch (w1hVar2.getType().ordinal()) {
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
                    ek1 ek1Var = cl0.e;
                    e21<?> e21VarA = w1hVar2.a();
                    Objects.requireNonNull(e21VarA);
                    return cyd0.a(ek1Var, e21VarA.getType(), (List) obj, d21.a, ptuVar);
                case 8:
                    ek1 ek1Var2 = cl0.f;
                    int iB = ptuVar.b();
                    int iD = z1h.d(lnp.a, (b2h) obj, ptuVar);
                    int iA = s08.a(iD) + ek1Var2.c + iD;
                    ptuVar.b[iB] = iD;
                    return iA;
                case 9:
                    return dl0.c((ruh0) obj, ptuVar);
                default:
                    hb5.a("Unsupported attribute type.");
                    return 0;
            }
        }

        @Override // defpackage.xxd0
        public final void b(me80 me80Var, w1h<?> w1hVar, Object obj, ptu ptuVar) throws IOException {
            w1h<?> w1hVar2 = w1hVar;
            switch (w1hVar2.getType().ordinal()) {
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
                    ek1 ek1Var = cl0.e;
                    e21<?> e21VarA = w1hVar2.a();
                    Objects.requireNonNull(e21VarA);
                    me80Var.o(ek1Var, e21VarA.getType(), (List) obj, d21.a, ptuVar);
                    break;
                case 8:
                    ek1 ek1Var2 = cl0.f;
                    me80Var.getClass();
                    me80Var.z0(ek1Var2, ptuVar.e());
                    z1h.c(me80Var, lnp.a, (b2h) obj, ptuVar);
                    me80Var.b0();
                    break;
                case 9:
                    dl0.d(me80Var, (ruh0) obj, ptuVar);
                    break;
                default:
                    hb5.a("Unsupported attribute type.");
                    break;
            }
        }
    }

    public static void c(final me80 me80Var, final ek1 ek1Var, b2h b2hVar, final ptu ptuVar) throws IOException {
        me80Var.A0(ek1Var);
        if (!b2hVar.isEmpty()) {
            try {
                b2hVar.forEach(new BiConsumer() { // from class: y1h
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        me80 me80Var2 = me80Var;
                        ek1 ek1Var2 = ek1Var;
                        ptu ptuVar2 = ptuVar;
                        w1h w1hVar = (w1h) obj;
                        try {
                            me80Var2.D0(ek1Var2, ptuVar2.e());
                            if (w1hVar.getKey().isEmpty()) {
                                ek1 ek1Var3 = hnp.a;
                            } else if (w1hVar instanceof syo) {
                                me80Var2.J(hnp.a, ((syo) w1hVar).c());
                            } else {
                                me80Var2.P(hnp.a, w1hVar.getKey(), ptuVar2);
                            }
                            me80Var2.o(hnp.b, w1hVar, obj2, z1h.a.a, ptuVar2);
                            me80Var2.d0();
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    }
                });
            } catch (UncheckedIOException e) {
                throw e.getCause();
            }
        }
        me80Var.c0();
    }

    public static int d(final ek1 ek1Var, b2h b2hVar, final ptu ptuVar) {
        if (b2hVar.isEmpty()) {
            return 0;
        }
        final int[] iArr = {0};
        b2hVar.forEach(new BiConsumer() { // from class: x1h
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                int iB;
                int iA;
                w1h w1hVar = (w1h) obj;
                ptu ptuVar2 = ptuVar;
                int iB2 = ptuVar2.b();
                if (!w1hVar.getKey().isEmpty()) {
                    if (w1hVar instanceof syo) {
                        iB = qtu.b(hnp.a, ((syo) w1hVar).c());
                    } else {
                        iA = cyd0.e(hnp.a, w1hVar.getKey(), ptuVar2);
                    }
                    ptuVar2.b[iB2] = iA;
                    int[] iArr2 = iArr;
                    iArr2[0] = s08.a(iA) + ek1Var.d() + iA + iArr2[0];
                }
                iB = 0;
                iA = cyd0.a(hnp.b, w1hVar, obj2, z1h.a.a, ptuVar2) + iB;
                ptuVar2.b[iB2] = iA;
                int[] iArr3 = iArr;
                iArr3[0] = s08.a(iA) + ek1Var.d() + iA + iArr3[0];
            }
        });
        return iArr[0];
    }
}
