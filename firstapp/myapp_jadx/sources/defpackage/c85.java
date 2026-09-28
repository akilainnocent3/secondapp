package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c85 {
    public static final void a(final d85.a aVar, final q85 q85Var, Function0<Unit> function0, Function0<Unit> function1, a aVar2, final int i) {
        final Function0<Unit> function2;
        final Function0<Unit> function3;
        b bVarA = v2g.a(function0, function1, aVar2, -897031843);
        int i2 = (bVarA.M(aVar) ? 4 : 2) | i | (bVarA.d(q85Var.ordinal()) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= bVarA.A(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarA.A(function1) ? 2048 : 1024;
        }
        if (bVarA.q(i2 & 1, (i2 & 1171) != 1170)) {
            int iOrdinal = q85Var.ordinal();
            if (iOrdinal == 0) {
                function2 = function1;
                function3 = function0;
                bVarA.N(1240834177);
                bVarA.X(false);
            } else {
                if (iOrdinal != 1 && iOrdinal != 2) {
                    throw igf0.a(bVarA, 1240832549, false);
                }
                bVarA.N(1240837255);
                nx40.d(aVar.a, aVar.b, q85Var == q85.B, function0, function1, bVarA, (i2 << 3) & 64512);
                function3 = function0;
                function2 = function1;
                bVarA.X(false);
            }
        } else {
            function2 = function1;
            function3 = function0;
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: a85
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c85.a(aVar, q85Var, function3, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, a aVar) {
        b bVarI = aVar.i(1823063587);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarI = j.i(j.g(aVar2, 1.0f), 120.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
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
            q330.a(j.r(aVar2, 32.0f), c68.a(R.color.bg_brand_sub_primary_d_base, bVarI), 0.0f, 0L, 0, 0.0f, bVarI, 6, 60);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new b85(i);
        }
    }
}
