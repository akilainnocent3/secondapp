package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class g900 {
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114  */
    /* JADX WARN: Code duplicated, block: B:74:0x0123  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void a(d dVar, PayHintData payHintData, long j, v3a0 v3a0Var, final op8 op8Var, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        PayHintData payHintData2;
        int i4;
        long jA;
        v3a0 v3a0Var2;
        int i5;
        boolean z;
        b bVar;
        final d dVar3;
        final PayHintData payHintData3;
        final long j2;
        final v3a0 v3a0Var3;
        e eVarZ;
        Object objY;
        b bVarI = aVar.i(-1641533478);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i4 = i3 | 48;
            payHintData2 = payHintData;
        } else {
            payHintData2 = payHintData;
            i4 = i3 | (bVarI.A(payHintData2) ? 32 : 16);
        }
        if ((i & 384) == 0) {
            jA = j;
            i4 |= ((i2 & 4) == 0 && bVarI.e(jA)) ? 256 : 128;
        } else {
            jA = j;
        }
        if ((i2 & 8) == 0) {
            v3a0Var2 = v3a0Var;
            int i8 = bVarI.M(v3a0Var2) ? 2048 : 1024;
            i5 = i4 | i8;
            if ((i5 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i5 & 1, z)) {
                bVarI.A0();
                if ((i & 1) != 0 || bVarI.h0()) {
                    if (i6 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i7 != 0) {
                        payHintData3 = null;
                    } else {
                        payHintData3 = payHintData2;
                    }
                    if ((i2 & 4) != 0) {
                        i5 &= -897;
                        jA = c68.a(R.color.bg_primary_d_base, bVarI);
                    }
                    if ((i2 & 8) != 0) {
                        i5 &= -7169;
                        v3a0Var2 = new v3a0();
                    }
                } else {
                    bVarI.G();
                    if ((i2 & 4) != 0) {
                        i5 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i5 &= -7169;
                    }
                    dVar3 = dVar2;
                    payHintData3 = payHintData2;
                }
                long j3 = jA;
                bVarI.Y();
                d dVarE = j.e(dVar3, 1.0f);
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new vac(1);
                    bVarI.r(objY);
                }
                bVar = bVarI;
                hy60.a(xa80.b(dVarE, false, (Function1) objY), null, null, pp8.b(951151008, new n1h(v3a0Var2, 1), bVarI), null, 0, j3, 0L, null, pp8.b(914557417, new gaj() { // from class: e900
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        String str;
                        tmz tmzVar = (tmz) obj;
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        tmzVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                        }
                        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d dVarC = c.c(aVar2, d.a.b);
                            yka.k.getClass();
                            tsr.a aVar3 = yka.a.b;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar3);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, i78VarA, yka.a.f);
                            hlh0.a(aVar2, ne00VarO, yka.a.e);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            hlh0.a(aVar2, dVarC, yka.a.d);
                            PayHintData payHintData4 = payHintData3;
                            if (payHintData4 == null || (str = payHintData4.alert) == null || StringsKt.t0(str).toString().length() <= 0) {
                                str = null;
                            }
                            if (str == null) {
                                aVar2.N(-1763218533);
                                aVar2.H();
                            } else {
                                aVar2.N(-1763218532);
                                ac8.b(null, bt.b, str, aVar2, 48);
                                aVar2.H();
                            }
                            op8Var.invoke(tmzVar, aVar2, Integer.valueOf(iIntValue & 14));
                            aVar2.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, ((i5 << 12) & 3670016) | 805309440, 438);
                j2 = j3;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar3 = dVar2;
                payHintData3 = payHintData2;
                j2 = jA;
            }
            v3a0Var3 = v3a0Var2;
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: f900
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g900.a(dVar3, payHintData3, j2, v3a0Var3, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        v3a0Var2 = v3a0Var;
        i5 = i4 | i8;
        if ((i5 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i5 & 1, z)) {
            bVarI.A0();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i7 != 0) {
                    payHintData3 = null;
                } else {
                    payHintData3 = payHintData2;
                }
                if ((i2 & 4) != 0) {
                    i5 &= -897;
                    jA = c68.a(R.color.bg_primary_d_base, bVarI);
                }
                if ((i2 & 8) != 0) {
                    i5 &= -7169;
                    v3a0Var2 = new v3a0();
                }
            } else {
                if (i6 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i7 != 0) {
                    payHintData3 = null;
                } else {
                    payHintData3 = payHintData2;
                }
                if ((i2 & 4) != 0) {
                    i5 &= -897;
                    jA = c68.a(R.color.bg_primary_d_base, bVarI);
                }
                if ((i2 & 8) != 0) {
                    i5 &= -7169;
                    v3a0Var2 = new v3a0();
                }
            }
            long j4 = jA;
            bVarI.Y();
            d dVarE2 = j.e(dVar3, 1.0f);
            objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new vac(1);
                bVarI.r(objY);
            }
            bVar = bVarI;
            hy60.a(xa80.b(dVarE2, false, (Function1) objY), null, null, pp8.b(951151008, new n1h(v3a0Var2, 1), bVarI), null, 0, j4, 0L, null, pp8.b(914557417, new gaj() { // from class: e900
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String str;
                    tmz tmzVar = (tmz) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, d.a.b);
                        yka.k.getClass();
                        tsr.a aVar3 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar3);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        PayHintData payHintData4 = payHintData3;
                        if (payHintData4 == null || (str = payHintData4.alert) == null || StringsKt.t0(str).toString().length() <= 0) {
                            str = null;
                        }
                        if (str == null) {
                            aVar2.N(-1763218533);
                            aVar2.H();
                        } else {
                            aVar2.N(-1763218532);
                            ac8.b(null, bt.b, str, aVar2, 48);
                            aVar2.H();
                        }
                        op8Var.invoke(tmzVar, aVar2, Integer.valueOf(iIntValue & 14));
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, ((i5 << 12) & 3670016) | 805309440, 438);
            j2 = j4;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar3 = dVar2;
            payHintData3 = payHintData2;
            j2 = jA;
        }
        v3a0Var3 = v3a0Var2;
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: f900
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g900.a(dVar3, payHintData3, j2, v3a0Var3, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
