package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fe40 {
    public static final void a(final int i, final int i2, final Function1 function1, final d dVar, a aVar, final int i3) {
        int i4;
        int i5;
        function1.getClass();
        b bVarI = aVar.i(-594462278);
        int i6 = (bVarI.d(i) ? 4 : 2) | i3 | (bVarI.d(i2) ? 32 : 16) | (bVarI.M(dVar) ? 2048 : 1024);
        if (bVarI.q(i6 & 1, (i6 & 1043) != 1042)) {
            d dVarG = j.g(dVar, 1.0f);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            bVarI.N(-190889155);
            int i7 = 0;
            while (i7 < i) {
                boolean z = i2 == i7;
                d dVarA = zqu.a(1.0f, j.i(h.h(d.a.b, 4.0f, 0.0f, 2), 2.0f), true);
                if (z) {
                    i4 = 1031023652;
                    i5 = R.color.text_disable_type1_primary;
                } else {
                    i4 = 1031025626;
                    i5 = R.color.background_type2_secondary;
                }
                g75.a(androidx.compose.foundation.a.b(dVarA, rzg.a(bVarI, i4, i5, bVarI, false), j060.b(50)), bVarI, 0);
                i7++;
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, function1, dVar, i3) { // from class: ee40
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ d d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fe40.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
