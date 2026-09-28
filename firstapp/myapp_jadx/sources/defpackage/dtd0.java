package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class dtd0 {
    public static final void a(final String str, d dVar, long j, long j2, float f, float f2, float f3, float f4, tmz tmzVar, a aVar, final int i) {
        b bVar;
        final long j3;
        final long j4;
        final float f5;
        final float f6;
        final float f7;
        final float f8;
        final tmz tmzVar2;
        long jD;
        long j5;
        float fC;
        float fC2;
        float fC3;
        float fC4;
        tmz umzVar;
        int i2;
        d dVar2;
        float f9;
        float f10;
        float f11;
        str.getClass();
        b bVarI = aVar.i(243447331);
        int i3 = i | (bVarI.M(str) ? 4 : 2) | 38350256;
        if (bVarI.q(i3 & 1, (38347923 & i3) != 38347922)) {
            bVarI.A0();
            int i4 = i & 1;
            d.a aVar2 = d.a.b;
            if (i4 == 0 || bVarI.h0()) {
                jD = r58.d(4292844310L);
                j5 = j58.b;
                fC = i18.c(R.dimen._3sdp, 6, bVarI);
                fC2 = i18.c(R.dimen._6sdp, 6, bVarI);
                fC3 = i18.c(R.dimen._6sdp, 6, bVarI);
                fC4 = i18.c(R.dimen._10sdp, 6, bVarI);
                float fC5 = i18.c(R.dimen._8sdp, 6, bVarI);
                float fC6 = i18.c(R.dimen._3sdp, 6, bVarI);
                umzVar = new umz(fC5, fC6, fC5, fC6);
                i2 = i3 & (-268427265);
                dVar2 = aVar2;
            } else {
                bVarI.G();
                jD = j;
                j5 = j2;
                fC = f;
                fC2 = f2;
                fC3 = f3;
                fC4 = f4;
                umzVar = tmzVar;
                i2 = i3 & (-268427265);
                dVar2 = dVar;
            }
            bVarI.Y();
            d dVarJ = h.j(j.x(dVar2, i18.c(R.dimen._100sdp, 6, bVarI), i18.c(R.dimen._220sdp, 6, bVarI)), 0.0f, 0.0f, 0.0f, fC3, 7);
            aiv aivVarC = g75.c(ht.a.f, false);
            final long j6 = jD;
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            d dVar3 = dVar2;
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            d dVarF = androidx.compose.foundation.layout.d.a.f(aVar2);
            boolean zC = bVarI.c(fC2) | bVarI.c(fC3) | bVarI.c(fC4) | bVarI.c(fC);
            Object objY = bVarI.y();
            if (zC || objY == a.C0041a.a) {
                final float f12 = fC4;
                final float f13 = fC;
                final float f14 = fC3;
                final float f15 = fC2;
                objY = new Function1() { // from class: btd0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        float fC1 = tcfVar.C1(f15);
                        float fC7 = tcfVar.C1(f14);
                        float fC8 = tcfVar.C1(f12);
                        float fC9 = tcfVar.C1(f13);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) - fC7;
                        j90 j90VarA = m90.a();
                        bxz.s(j90VarA, bys.e(pk40.b(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L)), (((long) Float.floatToRawIntBits(fC9)) & 4294967295L) | (Float.floatToRawIntBits(fC9) << 32)));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) - fC8;
                        float f16 = fIntBitsToFloat2 - fC1;
                        j90VarA.a(f16, fIntBitsToFloat);
                        j90VarA.c(fIntBitsToFloat2, fIntBitsToFloat);
                        j90VarA.c(f16, fIntBitsToFloat + fC7);
                        j90VarA.close();
                        lc6 lc6VarA = tcfVar.F1().a();
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setColor(0);
                        paint.setShadowLayer(tcfVar.C1(6.0f), 0.0f, tcfVar.C1(4.0f), Color.argb(110, 0, 0, 0));
                        i40.c(lc6VarA).drawPath(j90VarA.a, paint);
                        tcf.Q1(tcfVar, j90VarA, j6, 0.0f, null, 60);
                        return Unit.a;
                    }
                };
                f9 = f15;
                f10 = f12;
                f11 = f13;
                bVarI.r(objY);
            } else {
                f10 = fC4;
                f11 = fC;
                f9 = fC2;
            }
            rxo.b(dVarF, (Function1) objY, bVarI, 0);
            float f16 = fC3;
            d dVarJ2 = h.j(h.e(aVar2, umzVar), 0.0f, 0.0f, 0.0f, f16, 7);
            tmz tmzVar3 = umzVar;
            long j7 = j5;
            dVar = dVar3;
            lkf0.b(str, dVarJ2, j7, 0L, null, null, null, 0L, new gdf0(6), 0L, 0, false, 0, 0, null, new imf0(0L, i18.d(R.dimen._8ssp, bVarI), t9i.C, null, null, 0L, null, null, 0, i18.d(R.dimen._8ssp, bVarI), null, null, 16646137), bVarI, (i2 & 14) | 384, 0, 65016);
            bVar = bVarI;
            bVar.X(true);
            j4 = j7;
            f6 = f9;
            f8 = f10;
            f5 = f11;
            j3 = j6;
            f7 = f16;
            tmzVar2 = tmzVar3;
        } else {
            bVar = bVarI;
            bVar.G();
            j3 = j;
            j4 = j2;
            f5 = f;
            f6 = f2;
            f7 = f3;
            f8 = f4;
            tmzVar2 = tmzVar;
        }
        final d dVar4 = dVar;
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, dVar4, j3, j4, f5, f6, f7, f8, tmzVar2, i) { // from class: ctd0
                public final /* synthetic */ String a;
                public final /* synthetic */ d b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;
                public final /* synthetic */ float i;
                public final /* synthetic */ float v;
                public final /* synthetic */ tmz w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    dtd0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
