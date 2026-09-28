package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class rqx {
    public static final void a(d dVar, long j, float f, float f2, float f3, a aVar, final int i) {
        b bVar;
        final d dVar2;
        final long j2;
        final float f4;
        final float f5;
        final float f6;
        b bVarI = aVar.i(1716224866);
        int i2 = i | 28086;
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            long jF = d2l.f(12);
            String strA = cb40.a(R.string.common_functions__u_new, new Object[0], bVarI);
            i060 i060VarC = j060.c(36.0f);
            d.a aVar2 = d.a.b;
            bVar = bVarI;
            lkf0.d(strA, h.g(androidx.compose.foundation.a.b(ls7.a(aVar2, i060VarC), c68.a(R.color.c_brand_active, bVarI), zk40.a), 6.0f, 1.0f), c68.a(R.color.brand_tertiary, bVarI), null, jF, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, mla.l(R.style.B2_R, bVarI), bVar, 24576, 24960, 110568);
            j2 = jF;
            f6 = 36.0f;
            dVar2 = aVar2;
            f4 = 6.0f;
            f5 = 1.0f;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
            j2 = j;
            f4 = f;
            f5 = f2;
            f6 = f3;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j2, f4, f5, f6, i) { // from class: qqx
                public final /* synthetic */ long b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    rqx.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
