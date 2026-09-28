package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.plugin.realsports.data.FeaturedMatch;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedMatchView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class hgh {
    public static final void a(final FeaturedMatch featuredMatch, final xeh xehVar, a aVar, final int i) {
        int i2;
        xehVar.getClass();
        b bVarI = aVar.i(1757038673);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(featuredMatch) : bVarI.A(featuredMatch) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(xehVar) : bVarI.A(xehVar) ? 32 : 16;
        }
        boolean z = false;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarI = j.i(j.g(d.a.b, 1.0f), 156.0f);
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && bVarI.A(xehVar));
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = new Function1() { // from class: egh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        return new FeaturedMatchView(context, false, xehVar);
                    }
                };
                bVarI.r(objY);
            }
            Function1 function1 = (Function1) objY;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && bVarI.A(featuredMatch))) {
                z = true;
            }
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new Function1() { // from class: fgh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        FeaturedMatchView featuredMatchView = (FeaturedMatchView) obj;
                        featuredMatchView.getClass();
                        featuredMatchView.a(featuredMatch);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            androidx.compose.ui.viewinterop.b.a(function1, dVarI, (Function1) objY2, bVarI, 48, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ggh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    hgh.a(featuredMatch, xehVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
