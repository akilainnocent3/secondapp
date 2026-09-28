package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.crash.remote.models.Coefficients;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class kz50 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final Coefficients coefficients, final m28 m28Var, final mz1 mz1Var, final String str, a aVar, final int i) {
        boolean z;
        coefficients.getClass();
        m28Var.getClass();
        mz1Var.getClass();
        b bVarI = aVar.i(933223029);
        int i2 = 2;
        int i3 = i | (bVarI.A(coefficients) ? 4 : 2) | (bVarI.A(m28Var) ? 32 : 16) | (bVarI.A(mz1Var) ? 256 : 128) | (bVarI.M(str) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            d dVarG = h.g(androidx.compose.foundation.a.b(ls7.a(d.a.b, j060.c(12.0f)), coefficients.m95getRoundHistoryChipColor0d7_KjU(), zk40.a), 10.0f, 3.0f);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new q5j(ytwVar, i2);
                bVarI.r(objY2);
            }
            d dVarD = androidx.compose.foundation.d.d(dVarG, false, null, null, (Function0) objY2, 15);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarD);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.b(yk10.a(coefficients.getHouseCoefficientStr(), "x"), null, coefficients.m94getCoeffColor0d7_KjU(), 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, ni60.g(((sfd0) bVarI.O(ni60.b)).d, R.dimen._9ssp, bVarI), bVarI, 0, 0, 65018);
            bVarI = bVarI;
            bVarI.X(true);
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                bVarI.N(324735380);
                String strValueOf = String.valueOf(coefficients.getId());
                Object objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new ede(ytwVar, 2);
                    bVarI.r(objY3);
                }
                ida.c(m28Var, strValueOf, mz1Var, str, (Function0) objY3, bVarI, ((i3 >> 3) & 14) | 24576 | (i3 & 896) | (i3 & 7168), 0);
                z = false;
            } else {
                z = false;
                bVarI.N(321474893);
            }
            bVarI.X(z);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(m28Var, mz1Var, str, i) { // from class: fz50
                public final /* synthetic */ m28 b;
                public final /* synthetic */ mz1 c;
                public final /* synthetic */ String d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kz50.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0272  */
    /* JADX WARN: Code duplicated, block: B:101:0x0276  */
    /* JADX WARN: Code duplicated, block: B:106:0x0297  */
    /* JADX WARN: Code duplicated, block: B:109:0x0316  */
    /* JADX WARN: Code duplicated, block: B:111:0x0328  */
    /* JADX WARN: Code duplicated, block: B:113:0x033c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0366  */
    /* JADX WARN: Code duplicated, block: B:118:0x0373  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:89:0x0203  */
    /* JADX WARN: Code duplicated, block: B:92:0x0221  */
    /* JADX WARN: Code duplicated, block: B:93:0x0223  */
    /* JADX WARN: Code duplicated, block: B:97:0x0231  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final Coefficients coefficients, final m28 m28Var, final Function1 function1, final mz1 mz1Var, final String str, final String str2, final float f, a aVar, final int i) {
        long jM94getCoeffColor0d7_KjU;
        a.C0041a.C0042a c0042a;
        d dVarD;
        boolean z;
        boolean zA;
        Object objY;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        a.C0041a.C0042a c0042a2;
        Object objY2;
        m28Var.getClass();
        function1.getClass();
        mz1Var.getClass();
        str.getClass();
        b bVarI = aVar.i(1060359093);
        int i2 = i | (bVarI.A(coefficients) ? 4 : 2) | (bVarI.A(m28Var) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(mz1Var) ? 2048 : 1024) | (bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(str2) ? 131072 : 65536) | (bVarI.c(f) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            int i3 = i5c0.d;
            boolean zEqualsIgnoreCase = str.equalsIgnoreCase("sporty-hero");
            Object objY3 = bVarI.y();
            a.C0041a.C0042a c0042a3 = a.C0041a.a;
            if (objY3 == c0042a3) {
                objY3 = nvc.a(!coefficients.isNew(), bVarI);
            }
            ytw ytwVar = (ytw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a3) {
                objY4 = m.b(Boolean.FALSE);
                bVarI.r(objY4);
            }
            ytw ytwVar2 = (ytw) objY4;
            final twd0 twd0VarB = xe0.b(((Boolean) ytwVar.getValue()).booleanValue() ? 0.0f : -300.0f, yi0.e(300, 0, xkf.a, 2), "SlideInAnimation", null, bVarI, 3072, 20);
            Integer numValueOf = Integer.valueOf(coefficients.getId());
            boolean zA2 = bVarI.A(coefficients);
            Object objY5 = bVarI.y();
            if (zA2 || objY5 == c0042a3) {
                objY5 = new jz50(coefficients, ytwVar, null);
                bVarI.r(objY5);
            }
            xvf.e(bVarI, numValueOf, (Function2) objY5);
            boolean zEquals = str.equals("sporty-cars");
            float fC = lja.c(R.dimen._7sdp, bVarI) + lja.c(R.dimen._10ssp, bVarI);
            long jM93getBgColor0d7_KjU = zEqualsIgnoreCase ? i5c0.a : coefficients.m93getBgColor0d7_KjU();
            if (zEqualsIgnoreCase) {
                bVarI.N(-325424421);
                jM94getCoeffColor0d7_KjU = i5c0.a(coefficients.getHouseCoefficient(), bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-325338551);
                bVarI.X(false);
                jM94getCoeffColor0d7_KjU = coefficients.m94getCoeffColor0d7_KjU();
            }
            i060 i060VarB = zEqualsIgnoreCase ? j060.b(50) : j060.c(24.0f);
            int i4 = zEqualsIgnoreCase ? R.dimen._13sdp : R.dimen._7sdp;
            int i5 = zEqualsIgnoreCase ? R.dimen._2sdp : R.dimen._3sdp;
            int i6 = zEqualsIgnoreCase ? R.dimen._8ssp : R.dimen._10ssp;
            float fA = fw20.a(i5, bVarI);
            float fB = lla.b(fC, bVarI);
            long j = jM94getCoeffColor0d7_KjU;
            d.a aVar3 = d.a.b;
            d dVarJ = h.j(j.i(aVar3, fB), 0.0f, 0.0f, f, 0.0f, 11);
            boolean zM = bVarI.M(twd0VarB);
            Object objY6 = bVarI.y();
            if (zM) {
                c0042a = r14;
            } else {
                c0042a = c0042a3;
                if (objY6 == c0042a) {
                }
                d dVarB = g.b(dVarJ, (Function1) objY6);
                if (zEquals) {
                    i060 i060VarC = j060.c(24.0f);
                    long j2 = j58.b;
                    dVarD = lx80.d(aVar3, 2.0f, i060VarC, false, j58.c(0.16f, j2), j58.c(0.16f, j2), 4);
                } else {
                    dVarD = aVar3;
                }
                d dVarG = h.g(androidx.compose.foundation.a.b(ls7.a(dVarB.n(dVarD), i060VarB), jM93getBgColor0d7_KjU, zk40.a), fw20.a(i4, bVarI), fA);
                if ((i2 & 896) == 256) {
                    z = true;
                } else {
                    z = false;
                }
                zA = bVarI.A(coefficients) | z;
                objY = bVarI.y();
                if (zA || objY == c0042a) {
                    objY = new Function0() { // from class: hz50
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(String.valueOf(coefficients.getId()));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                d dVarA = s3w.a(androidx.compose.foundation.d.d(dVarG, false, null, null, (Function0) objY, 15), "history_coefficient_item");
                aiv aivVarC = g75.c(ht.a.e, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarA);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                c0042a2 = c0042a;
                lkf0.b(yk10.a(coefficients.getHouseCoefficientStr(), "x"), null, j, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 1, 0, null, ni60.g(((sfd0) bVarI.O(ni60.b)).d, i6, bVarI), bVarI, 0, 3456, 52730);
                bVarI = bVarI;
                bVarI.X(true);
                if (((Boolean) ((x5a0) m28Var.D).getValue()).booleanValue()) {
                    bVarI.N(-323207363);
                    bVarI.X(false);
                    ytwVar2.setValue(Boolean.FALSE);
                } else {
                    bVarI.N(-323505986);
                    if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                        bVarI.N(-323467732);
                        String strValueOf = String.valueOf(coefficients.getId());
                        objY2 = bVarI.y();
                        if (objY2 == c0042a2) {
                            objY2 = new u5j(ytwVar2, 1);
                            bVarI.r(objY2);
                        }
                        int i7 = i2 >> 3;
                        ida.c(m28Var, strValueOf, mz1Var, str, (Function0) objY2, bVarI, (i7 & 7168) | (i7 & 14) | 24576 | (i7 & 896), 0);
                    } else {
                        bVarI.N(-330239155);
                    }
                    bVarI.X(r30);
                    bVarI.X(false);
                }
            }
            objY6 = new Function1() { // from class: gz50
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((mmd) obj).getClass();
                    return new iwo(((long) ycv.b(((Number) twd0VarB.getValue()).floatValue())) << 32);
                }
            };
            bVarI.r(objY6);
            d dVarB2 = g.b(dVarJ, (Function1) objY6);
            if (zEquals) {
                i060 i060VarC2 = j060.c(24.0f);
                long j3 = j58.b;
                dVarD = lx80.d(aVar3, 2.0f, i060VarC2, false, j58.c(0.16f, j3), j58.c(0.16f, j3), 4);
            } else {
                dVarD = aVar3;
            }
            d dVarG2 = h.g(androidx.compose.foundation.a.b(ls7.a(dVarB2.n(dVarD), i060VarB), jM93getBgColor0d7_KjU, zk40.a), fw20.a(i4, bVarI), fA);
            if ((i2 & 896) == 256) {
                z = true;
            } else {
                z = false;
            }
            zA = bVarI.A(coefficients) | z;
            objY = bVarI.y();
            if (zA) {
                objY = new Function0() { // from class: hz50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(String.valueOf(coefficients.getId()));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            } else {
                objY = new Function0() { // from class: hz50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(String.valueOf(coefficients.getId()));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarA2 = s3w.a(androidx.compose.foundation.d.d(dVarG2, false, null, null, (Function0) objY, 15), "history_coefficient_item");
            aiv aivVarC2 = g75.c(ht.a.e, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA2);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            c0042a2 = c0042a;
            lkf0.b(yk10.a(coefficients.getHouseCoefficientStr(), "x"), null, j, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 1, 0, null, ni60.g(((sfd0) bVarI.O(ni60.b)).d, i6, bVarI), bVarI, 0, 3456, 52730);
            bVarI = bVarI;
            bVarI.X(true);
            if (((Boolean) ((x5a0) m28Var.D).getValue()).booleanValue()) {
                bVarI.N(-323505986);
                if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                    bVarI.N(-323467732);
                    String strValueOf2 = String.valueOf(coefficients.getId());
                    objY2 = bVarI.y();
                    if (objY2 == c0042a2) {
                        objY2 = new u5j(ytwVar2, 1);
                        bVarI.r(objY2);
                    }
                    int i8 = i2 >> 3;
                    ida.c(m28Var, strValueOf2, mz1Var, str, (Function0) objY2, bVarI, (i8 & 7168) | (i8 & 14) | 24576 | (i8 & 896), 0);
                } else {
                    bVarI.N(-330239155);
                }
                bVarI.X(r30);
                bVarI.X(false);
            } else {
                bVarI.N(-323207363);
                bVarI.X(false);
                ytwVar2.setValue(Boolean.FALSE);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(m28Var, function1, mz1Var, str, str2, f, i) { // from class: iz50
                public final /* synthetic */ m28 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ mz1 d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;
                public final /* synthetic */ float i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kz50.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
