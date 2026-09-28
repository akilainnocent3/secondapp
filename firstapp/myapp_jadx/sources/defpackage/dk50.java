package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.w;
import com.sportygames.newcms.b;
import com.sportygames.newcms.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class dk50 {

    @c0d(c = "com.sportygames.piggybash.presentation.screens.ResultScreenKt$ResultScreen$1$1", f = "ResultScreen.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, b bVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = z;
            this.b = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (this.a) {
                this.b.c(lu00.b2.T1);
            }
            return Unit.a;
        }
    }

    public static final void a(final zj50 zj50Var, final boolean z, final jaj<? super Double, ? super Long, ? super String, ? super String, ? super ap20, Unit> jajVar, final jaj<? super Double, ? super Long, ? super String, ? super String, ? super ap20, Unit> jajVar2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        zj50Var.getClass();
        jajVar.getClass();
        jajVar2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(642862939);
        int i2 = i | (bVarI.M(zj50Var) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.A(jajVar) ? 256 : 128) | (bVarI.A(jajVar2) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            b bVar2 = (b) bVarI.O(c.a);
            Unit unit = Unit.a;
            boolean zA = bVarI.A(bVar2) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new a(z, bVar2, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, unit, (Function2) objY);
            final mxs mxsVarA = d1a.a(d9i.a(lu00.b2.h, bVarI));
            final mmd mmdVar = (mmd) bVarI.O(kna.h);
            bVar = bVarI;
            q75.a(j.e(d.a.b, 1.0f), null, false, pp8.b(1232645829, new gaj() { // from class: bk50
                /* JADX WARN: Code duplicated, block: B:46:0x013f  */
                /* JADX WARN: Code duplicated, block: B:49:0x016b  */
                /* JADX WARN: Code duplicated, block: B:51:0x0174  */
                /* JADX WARN: Code duplicated, block: B:52:0x0178  */
                /* JADX WARN: Code duplicated, block: B:57:0x0195  */
                /* JADX WARN: Code duplicated, block: B:60:0x01fa  */
                /* JADX WARN: Code duplicated, block: B:62:0x020a  */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                    Throwable th;
                    yka.a.c cVar;
                    Object objY2;
                    i78 i78VarA;
                    int iHashCode;
                    ne00 ne00VarO;
                    d dVarC;
                    g7f g7fVar;
                    g7f g7fVar2;
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fD = r75Var.d();
                        float fE = r75Var.e();
                        zj50 zj50Var2 = zj50Var;
                        ap20 ap20Var = zj50Var2.i;
                        boolean z2 = zj50Var2.d;
                        boolean z3 = zj50Var2.c;
                        String strE = xav.e(ap20Var, aVar2);
                        d.a aVar3 = d.a.b;
                        mw90.a(strE, "Result Screen Background", j.e(aVar3, 1.0f), null, null, d0b.a.a, null, aVar2, 1573296, 1976);
                        g75.a(androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), j58.c(z3 ? 0.6f : 0.4f, j58.b), zk40.a), aVar2, 0);
                        if (z2 && zj50Var2.k == null && zj50Var2.l == null) {
                            aVar2.N(-217785731);
                            t9j0.a(true, aVar2, 6);
                        } else {
                            aVar2.N(-220816291);
                        }
                        aVar2.H();
                        Object objY3 = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY3 == c0042a) {
                            objY3 = k.a(0);
                            aVar2.r(objY3);
                        }
                        osw oswVar = (osw) objY3;
                        d dVarC2 = op70.c(j.g(aVar3, 1.0f), op70.a(aVar2), 14);
                        kw0.k kVar = kw0.c;
                        i78 i78VarA2 = g78.a(kVar, ht.a.n, aVar2, 48);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC3 = androidx.compose.ui.c.c(aVar2, dVarC2);
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
                        yka.a.b bVar3 = yka.a.f;
                        hlh0.a(aVar2, i78VarA2, bVar3);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g()) {
                            th = null;
                        } else {
                            th = null;
                            if (!Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            }
                            cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC3, cVar);
                            objY2 = aVar2.y();
                            if (objY2 == c0042a) {
                                objY2 = new pd10(oswVar, 1);
                                aVar2.r(objY2);
                            }
                            d dVarA = w.a(aVar3, (Function1) objY2);
                            i78VarA = g78.a(kVar, ht.a.m, aVar2, 0);
                            iHashCode = Long.hashCode(aVar2.m());
                            ne00VarO = aVar2.o();
                            dVarC = androidx.compose.ui.c.c(aVar2, dVarA);
                            if (aVar2.k() != null) {
                                l2a.b();
                                throw th;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, i78VarA, bVar3);
                            hlh0.a(aVar2, ne00VarO, dVar);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            hlh0.a(aVar2, dVarC, cVar);
                            dk50.b(z3, z2, aVar2, 0);
                            boolean z4 = zj50Var2.c;
                            boolean z5 = zj50Var2.d;
                            double d = zj50Var2.e;
                            String str = zj50Var2.f;
                            String str2 = zj50Var2.g;
                            Double d2 = zj50Var2.k;
                            Double d3 = zj50Var2.l;
                            mxs mxsVar = mxsVarA;
                            tj50.c(mxsVar, fD, fE, z, z4, z5, d, str, str2, d2, d3, aVar2, 0);
                            ty0.a(aVar2, j.i(aVar3, 40.0f));
                            aVar2.s();
                            boolean z6 = zj50Var2.d;
                            uf00<dp20> uf00Var = zj50Var2.j;
                            double d4 = zj50Var2.h;
                            Long l = zj50Var2.b;
                            String str3 = zj50Var2.a;
                            ap20 ap20Var2 = zj50Var2.i;
                            String str4 = zj50Var2.f;
                            g7fVar = new g7f(fE - mmdVar.u1(oswVar.D()));
                            g7fVar2 = new g7f(0.0f);
                            if (g7fVar.compareTo(g7fVar2) < 0) {
                                g7fVar = g7fVar2;
                            }
                            urx.b(mxsVar, z6, uf00Var, d4, str3, l, ap20Var2, str4, g7fVar.a, jajVar, jajVar2, aVar2, 0);
                            aVar2.s();
                        }
                        j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC3, cVar);
                        objY2 = aVar2.y();
                        if (objY2 == c0042a) {
                            objY2 = new pd10(oswVar, 1);
                            aVar2.r(objY2);
                        }
                        d dVarA2 = w.a(aVar3, (Function1) objY2);
                        i78VarA = g78.a(kVar, ht.a.m, aVar2, 0);
                        iHashCode = Long.hashCode(aVar2.m());
                        ne00VarO = aVar2.o();
                        dVarC = androidx.compose.ui.c.c(aVar2, dVarA2);
                        if (aVar2.k() != null) {
                            l2a.b();
                            throw th;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, bVar3);
                        hlh0.a(aVar2, ne00VarO, dVar);
                        if (aVar2.g()) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        } else {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, cVar);
                        dk50.b(z3, z2, aVar2, 0);
                        boolean z7 = zj50Var2.c;
                        boolean z8 = zj50Var2.d;
                        double d5 = zj50Var2.e;
                        String str5 = zj50Var2.f;
                        String str6 = zj50Var2.g;
                        Double d6 = zj50Var2.k;
                        Double d7 = zj50Var2.l;
                        mxs mxsVar2 = mxsVarA;
                        tj50.c(mxsVar2, fD, fE, z, z7, z8, d5, str5, str6, d6, d7, aVar2, 0);
                        ty0.a(aVar2, j.i(aVar3, 40.0f));
                        aVar2.s();
                        boolean z9 = zj50Var2.d;
                        uf00<dp20> uf00Var2 = zj50Var2.j;
                        double d8 = zj50Var2.h;
                        Long l2 = zj50Var2.b;
                        String str7 = zj50Var2.a;
                        ap20 ap20Var3 = zj50Var2.i;
                        String str8 = zj50Var2.f;
                        g7fVar = new g7f(fE - mmdVar.u1(oswVar.D()));
                        g7fVar2 = new g7f(0.0f);
                        if (g7fVar.compareTo(g7fVar2) < 0) {
                            g7fVar = g7fVar2;
                        }
                        urx.b(mxsVar2, z9, uf00Var2, d8, str7, l2, ap20Var3, str8, g7fVar.a, jajVar, jajVar2, aVar2, 0);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 3078, 6);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, jajVar, jajVar2, i) { // from class: ck50
                public final /* synthetic */ boolean b;
                public final /* synthetic */ jaj c;
                public final /* synthetic */ jaj d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    dk50.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        float f;
        androidx.compose.runtime.b bVarI = aVar.i(-1968656123);
        int i2 = (bVarI.b(z) ? 4 : 2) | i | (bVarI.b(z2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarG = j.g(d.a.b, 1.0f);
            if (z2) {
                f = 46.0f;
            } else {
                f = (!z || z2) ? 28.0f : 36.0f;
            }
            d dVarI = j.i(dVarG, f);
            ya5.a aVar2 = ya5.a;
            g75.a(androidx.compose.foundation.a.a(dVarI, z ? ya5.a.h(aVar2, kotlin.collections.b.k(new j58(j58.c(1.0f, r58.d(4278190080L))), new j58(j58.c(0.0f, r58.d(4278190080L)))), 0.0f, 0.0f, 14) : ya5.a.h(aVar2, kotlin.collections.b.k(new j58(j58.c(1.0f, r58.d(4280750644L))), new j58(j58.c(0.0f, r58.d(4280750644L)))), 0.0f, 0.0f, 14), null, 0.0f, 6), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, z2, i) { // from class: ak50
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    dk50.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
