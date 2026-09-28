package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class kne {
    public static final void a(final wr50.b bVar, final int i, final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i2) {
        int i3;
        lme lmeVar;
        b bVarA = v2g.a(function0, function1, aVar, 1890492372);
        if ((i2 & 6) == 0) {
            i3 = (bVarA.M(bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarA.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarA.A(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarA.A(function1) ? 2048 : 1024;
        }
        if (bVarA.q(i3 & 1, (i3 & 1171) != 1170)) {
            if (i == 0) {
                lmeVar = lme.b;
            } else if (i != 1) {
                lmeVar = i != 2 ? lme.a : lme.d;
            } else {
                lmeVar = lme.c;
            }
            voe.a(null, lmeVar, pp8.b(1998321423, new gne(bVar, function1, function0), bVarA), bVarA, 384, 1);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hne
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kne.a(bVar, i, function0, function1, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }
}
