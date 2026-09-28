package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class wit {
    public static final void a(final int i, a aVar, d dVar, final Function0 function0) {
        b bVar;
        final d dVar2;
        function0.getClass();
        b bVarI = aVar.i(869253270);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i | 48;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            i060 i060VarC = j060.c(5.0f);
            hfs hfsVarI = ya5.a.i(new Pair[]{new Pair(Float.valueOf(0.0121f), new j58(r58.d(4278533398L))), new Pair(Float.valueOf(0.551f), new j58(r58.d(4281519714L)))}, 8);
            hfs hfsVarE = ya5.a.e(new Pair[]{new Pair(Float.valueOf(0.05f), new j58(r58.d(4278807335L))), new Pair(Float.valueOf(0.49f), new j58(r58.d(4294965753L))), new Pair(Float.valueOf(0.95f), new j58(r58.d(4281519714L)))}, 0L, 0L, 14);
            String strA = cb40.a(R.string.page_loyalty__login_to_join, new Object[0], bVarI);
            imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).g;
            long j = ((lib0) bVarI.O(oib0.a)).o;
            d.a aVar2 = d.a.b;
            d dVarB = d35.b(androidx.compose.foundation.a.a(ls7.a(h.g(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), r58.d(3422552064L), zk40.a), 16.0f, 12.0f), i060VarC), hfsVarI, null, 0.0f, 6), 2.0f, hfsVarE, i060VarC);
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function0() { // from class: uit
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            bVar = bVarI;
            dVar2 = aVar2;
            lkf0.d(strA, h.h(androidx.compose.foundation.d.d(dVarB, false, null, null, (Function0) objY, 15), 0.0f, 14.0f, 1), j, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, bVar, 0, 0, 130040);
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar2, function0) { // from class: vit
                public final /* synthetic */ Function0 a;
                public final /* synthetic */ d b;

                {
                    this.a = function0;
                    this.b = dVar2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wit.a(qj40.a(1), (a) obj, this.b, this.a);
                    return Unit.a;
                }
            };
        }
    }
}
