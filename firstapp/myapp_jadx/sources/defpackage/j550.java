package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class j550 {
    public static final void a(int i, final int i2, final int i3, a aVar) {
        final int i4;
        int i5;
        b bVar;
        b bVarI = aVar.i(55442474);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i5 = i2 | 6;
            i4 = i;
        } else {
            i4 = i;
            i5 = (bVarI.d(i4) ? 4 : 2) | i2;
        }
        if (bVarI.q(i5 & 1, (i5 & 3) != 2)) {
            int i7 = i6 != 0 ? 4 : i4;
            bVar = bVarI;
            lkf0.d(cb40.a(R.string.bet_history__remix_bet_drawer_description, new Object[]{String.valueOf(i7)}, bVarI), j.A(h.g(androidx.compose.foundation.a.b(j.b(j.g(d.a.b, 1.0f), 0.0f, 56.0f, 1), c68.a(R.color.bg_brand_sub_secondary_d_base, bVarI), zk40.a), 20.0f, 8.0f), ht.a.k, 2), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVar, 0, 0, 131064);
            i4 = i7;
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i4, i2, i3) { // from class: i550
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;

                {
                    this.b = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    j550.a(this.a, iA, this.b, (a) obj);
                    return Unit.a;
                }
            };
        }
    }
}
