package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.crash.models.BetComponentColors;
import com.sportygames.crash.remote.models.DetailResponse;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class lqv {
    public static final void a(final float f, final float f2, float f3, final float f4, final DetailResponse detailResponse, final BetComponentColors betComponentColors, a aVar, final int i) {
        b bVar;
        final float f5 = f3;
        detailResponse.getClass();
        betComponentColors.getClass();
        b bVarI = aVar.i(-56977575);
        int i2 = i | (bVarI.c(f) ? 32 : 16) | (bVarI.c(f2) ? 256 : 128) | (bVarI.c(f5) ? 2048 : 1024) | (bVarI.c(f4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(detailResponse) ? 131072 : 65536) | (bVarI.M(betComponentColors) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            if (f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            d dVarN = dVarG.n(new LayoutWeightElement(f > Float.MAX_VALUE ? Float.MAX_VALUE : f, true));
            kw0.g gVar = kw0.g;
            n54.b bVar2 = ht.a.j;
            d160 d160VarA = b160.a(gVar, bVar2, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarN);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar3);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            if (f2 <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            d dVarC2 = j.c(new LayoutWeightElement(f2 > Float.MAX_VALUE ? Float.MAX_VALUE : f2, true), 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarC2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar3);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            d dVarG2 = j.g(aVar2, 1.0f);
            d160 d160VarA2 = b160.a(gVar, bVar2, bVarI, 6);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar3);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            d dVarA = s3w.a(aVar2, "min_text");
            op5 op5Var = op5.a;
            String strC = op5.c(op5Var, pwo.e(R.string.min_text_cms, bVarI), pwo.e(R.string.sg_min, bVarI));
            TreeMap treeMap = pw.a;
            String strA = tug.a(strC, " : ", pw.p(detailResponse.getMinAmount()));
            long textTertiary = betComponentColors.getTextTertiary();
            qyd0 qyd0Var = ni60.b;
            lkf0.b(strA, dVarA, textTertiary, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, o6a.a(ni60.g(((sfd0) bVarI.O(qyd0Var)).e, R.dimen._8ssp, bVarI), f4), bVarI, 0, 0, 65528);
            lkf0.b(tug.a(op5.c(op5Var, pwo.e(R.string.max_text_cms, bVarI), pwo.e(R.string.sg_max, bVarI)), " : ", pw.p(detailResponse.getMaxAmount())), s3w.a(aVar2, "max_text"), betComponentColors.getTextTertiary(), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, o6a.a(ni60.g(((sfd0) bVarI.O(qyd0Var)).e, R.dimen._8ssp, bVarI), f4), bVarI, 0, 0, 65528);
            bVar = bVarI;
            bVar.X(true);
            bVar.X(true);
            ty0.a(bVar, j.w(aVar2, fw20.a(R.dimen._8sdp, bVar)));
            f5 = f3;
            if (f5 <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            ty0.a(bVar, new LayoutWeightElement(f5 > Float.MAX_VALUE ? Float.MAX_VALUE : f5, true));
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, f2, f5, f4, detailResponse, betComponentColors, i) { // from class: kqv
                public final /* synthetic */ float a;
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ DetailResponse e;
                public final /* synthetic */ BetComponentColors f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    lqv.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
