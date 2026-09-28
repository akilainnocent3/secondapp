package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class a22 {
    public static final void a(final d dVar, final op8 op8Var, a aVar, final int i) {
        int i2;
        dVar.getClass();
        b bVarI = aVar.i(-1009255268);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            rg6.a(j.g(androidx.compose.foundation.a.b(dVar, c68.a(R.color.background_general_primary, bVarI), zk40.a), 1.0f), j060.c(2.0f), gg6.b(c68.a(R.color.background_general_secondary, bVarI), c68.a(R.color.background_general_secondary, bVarI), bVarI, 24576, 12), gg6.c(62, 8.0f), null, pp8.b(-321811222, new y12(op8Var, 0), bVarI), bVarI, 196608, 16);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    a22.a(dVar, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(-87970488);
        int i2 = i | (bVarI.M(str) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVar = bVarI;
            lkf0.d(str, null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, bVarI), bVar, i2 & 14, 0, 131066);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i) { // from class: x12
                public final /* synthetic */ String a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    a22.b(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
