package defpackage;

import androidx.compose.animation.f;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class dz90 {
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void a(final boolean z, final boolean z2, final Function0 function0, long j, final op8 op8Var, a aVar, final int i, final int i2) {
        int i3;
        final long jC;
        op8 op8Var2;
        boolean z3;
        e eVarZ;
        int i4;
        function0.getClass();
        b bVarI = aVar.i(-130799479);
        if ((i & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.b(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.A(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                jC = j;
                i3 |= bVarI.e(jC) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                op8Var2 = op8Var;
                if (bVarI.A(op8Var2)) {
                    i4 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            } else {
                op8Var2 = op8Var;
            }
            if ((i3 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                if (i5 != 0) {
                    jC = j58.c(0.75f, j58.b);
                }
                final long j2 = jC;
                final int iA = (int) (((a8j0) bVarI.O(kna.t)).a() & 4294967295L);
                final op8 op8Var3 = op8Var2;
                jC = j2;
                hh0.e(z, null, f.f(null, 3), f.g(null, 3), null, pp8.b(1634051761, new gaj() { // from class: yy90
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        jh0 jh0Var = (jh0) obj;
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        jh0Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(jh0Var) : aVar2.A(jh0Var) ? 4 : 2;
                        }
                        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            d.a aVar3 = d.a.b;
                            d dVarB = androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), j2, zk40.a);
                            boolean z4 = z2;
                            Function0 function1 = function0;
                            d dVarF = g3w.f(dVarB, z4, function1);
                            aiv aivVarC = g75.c(ht.a.e, false);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d dVarC = c.c(aVar2, dVarF);
                            yka.k.getClass();
                            tsr.a aVar4 = yka.a.b;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            yka.a.b bVar = yka.a.f;
                            hlh0.a(aVar2, aivVarC, bVar);
                            yka.a.d dVar = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            tr1.a(z4, function1, aVar2, 0, 0);
                            final int i6 = iA;
                            boolean zD = aVar2.d(i6);
                            Object objY = aVar2.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (zD || objY == c0042a) {
                                objY = new Function1() { // from class: az90
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        return Integer.valueOf((i6 / 2) + ((Integer) obj4).intValue());
                                    }
                                };
                                aVar2.r(objY);
                            }
                            t9g t9gVarB = f.q((Function1) objY).b(f.h(null, 0.9f, 0L, 5));
                            boolean zD2 = aVar2.d(i6);
                            Object objY2 = aVar2.y();
                            if (zD2 || objY2 == c0042a) {
                                objY2 = new Function1() { // from class: bz90
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        return Integer.valueOf((i6 / 2) + ((Integer) obj4).intValue());
                                    }
                                };
                                aVar2.r(objY2);
                            }
                            d dVarA = jh0Var.a(aVar3, t9gVarB, f.u((Function1) objY2).b(f.i(5, 0L)));
                            Object objY3 = aVar2.y();
                            if (objY3 == c0042a) {
                                objY3 = pr7.a(aVar2);
                            }
                            psw pswVar = (psw) objY3;
                            Object objY4 = aVar2.y();
                            if (objY4 == c0042a) {
                                objY4 = new cz90();
                                aVar2.r(objY4);
                            }
                            d dVarB2 = androidx.compose.foundation.d.b(dVarA, pswVar, null, false, null, (Function0) objY4, 28);
                            aiv aivVarC2 = g75.c(ht.a.a, false);
                            int iHashCode2 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO2 = aVar2.o();
                            d dVarC2 = c.c(aVar2, dVarB2);
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, aivVarC2, bVar);
                            hlh0.a(aVar2, ne00VarO2, dVar);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            op8Var3.invoke(aVar2, 0);
                            aVar2.s();
                            aVar2.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, (i3 & 14) | 200064, 18);
            } else {
                bVarI.G();
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: zy90
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        dz90.a(z, z2, function0, jC, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        jC = j;
        if ((i & 24576) == 0) {
            op8Var2 = op8Var;
            if (bVarI.A(op8Var2)) {
                i4 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        } else {
            op8Var2 = op8Var;
        }
        if ((i3 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i3 & 1, z3)) {
            if (i5 != 0) {
                jC = j58.c(0.75f, j58.b);
            }
            final long j3 = jC;
            final int iA2 = (int) (((a8j0) bVarI.O(kna.t)).a() & 4294967295L);
            final op8 op8Var4 = op8Var2;
            jC = j3;
            hh0.e(z, null, f.f(null, 3), f.g(null, 3), null, pp8.b(1634051761, new gaj() { // from class: yy90
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    jh0 jh0Var = (jh0) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    jh0Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(jh0Var) : aVar2.A(jh0Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d.a aVar3 = d.a.b;
                        d dVarB = androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), j3, zk40.a);
                        boolean z4 = z2;
                        Function0 function1 = function0;
                        d dVarF = g3w.f(dVarB, z4, function1);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarF);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, aivVarC, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        tr1.a(z4, function1, aVar2, 0, 0);
                        final int i6 = iA2;
                        boolean zD = aVar2.d(i6);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zD || objY == c0042a) {
                            objY = new Function1() { // from class: az90
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    return Integer.valueOf((i6 / 2) + ((Integer) obj4).intValue());
                                }
                            };
                            aVar2.r(objY);
                        }
                        t9g t9gVarB = f.q((Function1) objY).b(f.h(null, 0.9f, 0L, 5));
                        boolean zD2 = aVar2.d(i6);
                        Object objY2 = aVar2.y();
                        if (zD2 || objY2 == c0042a) {
                            objY2 = new Function1() { // from class: bz90
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    return Integer.valueOf((i6 / 2) + ((Integer) obj4).intValue());
                                }
                            };
                            aVar2.r(objY2);
                        }
                        d dVarA = jh0Var.a(aVar3, t9gVarB, f.u((Function1) objY2).b(f.i(5, 0L)));
                        Object objY3 = aVar2.y();
                        if (objY3 == c0042a) {
                            objY3 = pr7.a(aVar2);
                        }
                        psw pswVar = (psw) objY3;
                        Object objY4 = aVar2.y();
                        if (objY4 == c0042a) {
                            objY4 = new cz90();
                            aVar2.r(objY4);
                        }
                        d dVarB2 = androidx.compose.foundation.d.b(dVarA, pswVar, null, false, null, (Function0) objY4, 28);
                        aiv aivVarC2 = g75.c(ht.a.a, false);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarB2);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC2, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        op8Var4.invoke(aVar2, 0);
                        aVar2.s();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i3 & 14) | 200064, 18);
        } else {
            bVarI.G();
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zy90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dz90.a(z, z2, function0, jC, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
