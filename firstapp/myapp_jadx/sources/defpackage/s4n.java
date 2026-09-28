package defpackage;

import android.content.Context;
import androidx.compose.animation.f;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class s4n {
    public static final void a(final d dVar, final UiText uiText, boolean z, a aVar, final int i) {
        final boolean z2;
        uiText.getClass();
        b bVarI = aVar.i(-748387486);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(uiText) ? 32 : 16) | (bVarI.b(z) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            gzg0 gzg0VarE = yi0.e(400, 0, null, 6);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new o4n(0);
                bVarI.r(objY);
            }
            t9g t9gVarB = f.n(gzg0VarE, (Function1) objY).b(f.f(null, 3));
            gzg0 gzg0VarE2 = yi0.e(400, 0, null, 6);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new qoz();
                bVarI.r(objY2);
            }
            owg owgVarB = f.r(gzg0VarE2, (Function1) objY2).b(f.g(null, 3));
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new p4n(0);
                bVarI.r(objY3);
            }
            z2 = z;
            hh0.e(z2, xa80.b(dVar, false, (Function1) objY3), t9gVarB, owgVarB, null, pp8.b(-944529862, new gaj() { // from class: q4n
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        UiText uiText2 = uiText;
                        uiText2.getClass();
                        String upperCase = uiText2.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        lkf0.d(upperCase, g3w.h(androidx.compose.foundation.a.b(j.g(d.a.b, 1.0f), c68.a(R.color.bg_warning_primary, aVar2), zk40.a), "ib_quarter_highlight_text"), c68.a(R.color.text_inverse_primary, aVar2), null, mla.m(28.0f, aVar2), null, t9i.y, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, null, aVar2, 1572864, 0, 261032);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 >> 6) & 14) | 196608, 16);
        } else {
            z2 = z;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(uiText, z2, i) { // from class: r4n
                public final /* synthetic */ UiText b;
                public final /* synthetic */ boolean c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    s4n.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
