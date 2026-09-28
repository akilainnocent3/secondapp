package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kay {
    public static final void a(final d dVar, final uf00<? extends OtpSelection> uf00Var, final Function1<? super OtpSelection, Unit> function1, final Function0<Unit> function0, a aVar, final int i) {
        int i2;
        b bVar;
        d.a aVar2;
        dVar.getClass();
        uf00Var.getClass();
        function1.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1683478617);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(uf00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            String strA = cb40.a(R.string.common_otp_verify__have_not_you_received_the_code, new Object[0], bVarI);
            long jA = c68.a(R.color.text_type1_secondary, bVarI);
            imf0 imf0VarL = mla.l(R.style.B1_R, bVarI);
            int i3 = 256;
            lkf0.d(strA, null, jA, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0VarL, bVarI, 0, 0, 130042);
            b bVar2 = bVarI;
            bVar2.N(-991987346);
            Iterator<? extends OtpSelection> it = uf00Var.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                aVar2 = d.a.b;
                if (!zHasNext) {
                    break;
                }
                final OtpSelection next = it.next();
                d dVarJ = h.j(aVar2, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                boolean zD = bVar2.d(next.ordinal()) | ((i2 & 896) == i3);
                Object objY = bVar2.y();
                if (zD || objY == a.C0041a.a) {
                    objY = new Function0() { // from class: iay
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(next);
                            return Unit.a;
                        }
                    };
                    bVar2.r(objY);
                }
                b bVar3 = bVar2;
                lkf0.d(cb40.a(next.e, new Object[0], bVar2), g3w.f(dVarJ, true, (Function0) objY), c68.a(R.color.brand_secondary, bVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar2), bVar3, 0, 0, 130040);
                bVar2 = bVar3;
                i3 = 256;
            }
            bVar2.X(false);
            b bVar4 = bVar2;
            lkf0.d(cb40.a(R.string.self_exclusion__contact_customer_service, new Object[0], bVar2), g3w.f(h.j(aVar2, 0.0f, 12.0f, 0.0f, 0.0f, 13), true, function0), c68.a(R.color.brand_secondary, bVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVar2), bVar4, 0, 0, 130040);
            bVar = bVar4;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: jay
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    kay.a(dVar, uf00Var, function1, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
