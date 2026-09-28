package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class abd0 {
    public static final void a(final j3a0 j3a0Var, final d dVar, final boolean z, a aVar, final int i, final int i2) {
        int i3;
        j3a0Var.getClass();
        b bVarI = aVar.i(478847860);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(j3a0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bVarI.M(dVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bVarI.b(z) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                dVar = d.a.b;
            }
            if (i5 != 0) {
                z = false;
            }
            qyd0 qyd0Var = kna.h;
            hna.a(qyd0Var.a(new nmd(((mmd) bVarI.O(qyd0Var)).getDensity(), 1.0f)), pp8.b(1325930164, new Function2() { // from class: yad0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        f4a0.d(j3a0Var, dVar, z, null, j58.c(0.95f, c68.a(R.color.background_snackbar, aVar2)), c68.a(R.color.text_type2_primary, aVar2), c68.a(R.color.text_inverse_brand_sub, aVar2), 0L, 0L, aVar2, 0, 392);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        final d dVar2 = dVar;
        final boolean z2 = z;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zad0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    abd0.a(j3a0Var, dVar2, z2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
