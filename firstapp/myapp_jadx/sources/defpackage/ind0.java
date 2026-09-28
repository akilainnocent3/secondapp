package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.i;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.sportygames.newcms.CMSRes;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes8.dex */
public final class ind0 {

    @c0d(c = "com.sportygames.stacker.presentation.ui.component.StackerHeaderComponentKt$StackerHeaderComponent$1$1", f = "StackerHeaderComponent.kt", l = {65}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ double b;
        public final /* synthetic */ fsw c;
        public final /* synthetic */ fsw d;
        public final /* synthetic */ ytw<Boolean> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(double d, fsw fswVar, fsw fswVar2, ytw<Boolean> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = d;
            this.c = fswVar;
            this.d = fswVar2;
            this.e = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            ytw<Boolean> ytwVar = this.e;
            if (i == 0) {
                uj50.b(obj);
                fsw fswVar = this.c;
                double doubleValue = fswVar.getDoubleValue();
                double d = this.b;
                if (d != doubleValue) {
                    this.d.t(d - fswVar.getDoubleValue());
                    fswVar.t(d);
                    ytwVar.setValue(Boolean.TRUE);
                    b.a aVar = b.b;
                    long jH = c.h(1000, rgf.MILLISECONDS);
                    this.a = 1;
                    if (hkd.c(jH, this) == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            ytwVar.setValue(Boolean.FALSE);
            return Unit.a;
        }
    }

    public static final void a(final and0 and0Var, final long j, final double d, final String str, final long j2, androidx.compose.runtime.a aVar, final int i) {
        Object aVar2;
        fsw fswVar;
        final ytw ytwVar;
        and0Var.getClass();
        str.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1209607840);
        int i2 = i | (bVarI.d(and0Var.ordinal()) ? 4 : 2) | (bVarI.e(j) ? 32 : 16) | (bVarI.f(d) ? 256 : 128) | (bVarI.M(str) ? 2048 : 1024) | (bVarI.e(j2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = i.a(d);
                bVarI.r(objY);
            }
            fsw fswVar2 = (fsw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = i.a(0.0d);
                bVarI.r(objY3);
            }
            fsw fswVar3 = (fsw) objY3;
            Double dValueOf = Double.valueOf(d);
            boolean z = (i2 & 896) == 256;
            Object objY4 = bVarI.y();
            if (z || objY4 == c0042a) {
                fswVar = fswVar3;
                ytwVar = ytwVar2;
                aVar2 = new a(d, fswVar2, fswVar, ytwVar, null);
                bVarI.r(aVar2);
            } else {
                aVar2 = objY4;
                fswVar = fswVar3;
                ytwVar = ytwVar2;
            }
            xvf.e(bVarI, dValueOf, (Function2) aVar2);
            final fsw fswVar4 = fswVar;
            mez.a(new kod0(40.0f, 40.0f, 70.0f, 280.0f, (int) (j >> 32), (int) (j & 4294967295L), (int) (j2 >> 32), (int) (4294967295L & j2), 768), pp8.b(162745595, new iaj() { // from class: end0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i3;
                    String strP;
                    g7f g7fVar = (g7f) obj;
                    g7f g7fVar2 = (g7f) obj2;
                    a aVar3 = (a) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if ((iIntValue & 6) == 0) {
                        i3 = (aVar3.c(g7fVar.a) ? 4 : 2) | iIntValue;
                    } else {
                        i3 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i3 |= aVar3.c(g7fVar2.a) ? 32 : 16;
                    }
                    if (aVar3.q(i3 & 1, (i3 & 147) != 146)) {
                        uld0 uld0Var = uld0.i0;
                        CMSRes cMSRes = uld0Var.h0;
                        CMSRes cMSRes2 = uld0Var.o;
                        final mxs mxsVarA = d1a.a(d9i.a(cMSRes, aVar3));
                        and0 and0Var2 = and0.w;
                        d.a aVar4 = d.a.b;
                        and0 and0Var3 = and0Var;
                        final d dVarA = and0Var3 == and0Var2 ? androidx.compose.foundation.b.a(0, 63, aVar4) : aVar4;
                        final long jB = i7f.b(g7fVar.a / 13.0f, aVar3);
                        d dVarT = j.t(aVar4, g7fVar.a, g7fVar2.a);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = androidx.compose.ui.c.c(aVar3, dVarT);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar5);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, aivVarC, yka.a.f);
                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        hlh0.a(aVar3, dVarC, yka.a.d);
                        boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                        double doubleValue = fswVar4.getDoubleValue();
                        String str2 = str;
                        if (zBooleanValue) {
                            aVar3.N(1708516981);
                            strP = kotlin.text.c.p(kotlin.text.c.p(com.sportygames.newcms.c.c(cMSRes2, new String[0], aVar3), "%1$s", str2, false), "%2$s", String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue)}, 1)), false);
                            aVar3.H();
                        } else if (and0Var3 == and0.i) {
                            aVar3.N(1708520547);
                            strP = com.sportygames.newcms.c.c(uld0Var.n, new String[0], aVar3);
                            aVar3.H();
                        } else if (and0Var3 == and0Var2) {
                            aVar3.N(1708528080);
                            strP = kotlin.text.c.p(kotlin.text.c.p(com.sportygames.newcms.c.c(cMSRes2, new String[0], aVar3), "%1$s", str2, false), "%2$s", String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)), false);
                            aVar3.H();
                        } else {
                            aVar3.N(1956473838);
                            aVar3.H();
                            strP = "BONUS STACKER";
                        }
                        String str3 = strP;
                        Object objY5 = aVar3.y();
                        if (objY5 == a.C0041a.a) {
                            objY5 = new gnd0();
                            aVar3.r(objY5);
                        }
                        androidx.compose.animation.a.b(str3, null, (Function1) objY5, null, "headerText", null, pp8.b(1060729259, new iaj() { // from class: hnd0
                            @Override // defpackage.iaj
                            public final Object d(Object obj5, Object obj6, Object obj7, Object obj8) {
                                String str4 = (String) obj6;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                ((pf0) obj5).getClass();
                                str4.getClass();
                                d dVarG = h.g(dVarA, 12.0f, 8.0f);
                                long jD = r58.d(4294963646L);
                                imf0 imf0Var = new imf0(0L, 0L, null, null, null, 0L, null, new ix80(r58.d(4294945280L), 2, 0L, 24.0f), 0, 0L, null, null, 16769023);
                                gdf0 gdf0Var = new gdf0(3);
                                lkf0.b(str4, dVarG, jD, jB, null, null, mxsVarA, 0L, gdf0Var, 0L, 0, false, 0, 0, null, imf0Var, (a) obj7, ((iIntValue2 >> 3) & 14) | 384, 1572864, 64944);
                                return Unit.a;
                            }
                        }, aVar3), aVar3, 1597824, 42);
                        aVar3.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 48);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j, d, str, j2, i) { // from class: fnd0
                public final /* synthetic */ long b;
                public final /* synthetic */ double c;
                public final /* synthetic */ String d;
                public final /* synthetic */ long e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ind0.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
