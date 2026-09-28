package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
public final class cga {
    public static final long a = r58.d(3439329279L);

    public static final void a(final double d, final double d2, final mz1 mz1Var, final float f, final boolean z, final boolean z2, a aVar, final int i) {
        b bVar;
        String strP;
        mz1Var.getClass();
        b bVarI = aVar.i(1158031634);
        int i2 = i | (bVarI.f(d) ? 4 : 2) | (bVarI.f(d2) ? 32 : 16) | (bVarI.A(mz1Var) ? 256 : 128) | (bVarI.c(f) ? 2048 : 1024) | (bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.b(z2) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            boolean z3 = (i2 & 7168) == 2048;
            Object objY = bVarI.y();
            if (z3 || objY == a.C0041a.a) {
                omf0 omf0Var = new omf0(d2l.g(f, 4294967296L));
                bVarI.r(omf0Var);
                objY = omf0Var;
            }
            long j = ((omf0) objY).a;
            long jI0 = mz1Var.I0();
            int i3 = j58.n;
            long j2 = a;
            long jH0 = nbh0.a(jI0, j2) ? mz1Var.H0() : mz1Var.I0();
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(j.c(aVar2, 1.0f), 0.0f, 0.0f, 2.0f, 0.0f, 11);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            long j3 = jH0;
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.g, ht.a.j, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            d dVarA = s3w.a(j.y(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f, 0.0f, 2), "bet_min_text");
            op5 op5Var = op5.a;
            String strC = op5.c(op5Var, pwo.e(R.string.min_text_cms, bVarI), pwo.e(R.string.sg_min, bVarI));
            double dAbs = Math.abs(d);
            String strP2 = vZBMKENANSz.zDQiszFsclWzBf;
            if (dAbs <= Double.MAX_VALUE) {
                try {
                    strP = pw.p(d);
                } catch (Exception unused) {
                    strP = strP2;
                }
            } else {
                strP = strP2;
            }
            wf1.a(tug.a(strC, " : ", strP), dVarA, imf0.b(((sfd0) bVarI.O(ni60.b)).e, 0L, j, null, new n9i(z ? 1 : 0), null, 0L, null, null, null, 0, 0L, null, null, 16777205), 0, 0L, null, 5, null, z2 ? j2 : j3, bVarI, 0, 184);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            d dVarA2 = s3w.a(j.y(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f, 0.0f, 2), "bet_max_text");
            String strC2 = op5.c(op5Var, pwo.e(R.string.max_text_cms, bVarI), pwo.e(R.string.sg_max, bVarI));
            if (Math.abs(d2) <= Double.MAX_VALUE) {
                try {
                    strP2 = pw.p(d2);
                } catch (Exception unused2) {
                }
            }
            wf1.a(tug.a(strC2, " : ", strP2), dVarA2, imf0.b(((sfd0) bVarI.O(ni60.b)).e, 0L, j, null, new n9i(z ? 1 : 0), null, 0L, null, null, null, 0, 0L, null, null, 16777205), 0, 0L, null, 6, null, z2 ? j2 : j3, bVarI, 0, 184);
            bVar = bVarI;
            bVar.X(true);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(d, d2, mz1Var, f, z, z2, i) { // from class: bga
                public final /* synthetic */ double a;
                public final /* synthetic */ double b;
                public final /* synthetic */ mz1 c;
                public final /* synthetic */ float d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    cga.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
