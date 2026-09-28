package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h6z {
    public static final void a(final d dVar, final String str, final i6z i6zVar, final Function0<Unit> function0, a aVar, final int i) {
        int i2;
        String str2;
        b bVar;
        dVar.getClass();
        i6zVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(-411286718);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= bVarI.M(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(i6zVar) : bVarI.A(i6zVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
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
            boolean z = ((i2 & 896) == 256 || ((i2 & 512) != 0 && bVarI.A(i6zVar))) | ((i2 & 7168) == 2048);
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function0() { // from class: f6z
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (i6zVar instanceof i6z.b) {
                            function0.invoke();
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            lkf0.d(str2, g3w.f(d.a.b, true, (Function0) objY), c68.a(i6zVar instanceof i6z.b ? R.color.brand_secondary : R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, (i2 >> 3) & 14, 0, 131064);
            bVar = bVarI;
            if (i6zVar instanceof i6z.a) {
                bVar.N(-1696637175);
                UiText uiText = ((i6z.a) i6zVar).a;
                uiText.getClass();
                lkf0.e(uiText.a((Context) bVar.O(AndroidCompositionLocals_androidKt.b)), null, c68.a(R.color.text_type1_primary, bVar), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mla.l(R.style.B1_R, bVar), bVar, 0, 0, 262138);
                bVar = bVar;
                bVar.X(false);
            } else {
                bVar.N(-1696393732);
                bVar.X(false);
            }
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: g6z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h6z.a(dVar, str, i6zVar, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
