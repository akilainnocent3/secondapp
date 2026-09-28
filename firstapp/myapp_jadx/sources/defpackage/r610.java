package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class r610 {
    public static final void a(int i, a aVar, d dVar, final String str) {
        int i2;
        b bVarI = aVar.i(326863273);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            q75.a(androidx.compose.foundation.a.b(ls7.a(dVar, j060.a), c68.a(R.color.bg_surface_primary, bVarI), zk40.a), ht.a.e, false, pp8.b(1237118847, new gaj() { // from class: q610
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        String str2 = str;
                        int length = str2.length();
                        d.a aVar3 = d.a.b;
                        if (length > 0) {
                            aVar2.N(-106741716);
                            Context context = (Context) aVar2.O(AndroidCompositionLocals_androidKt.b);
                            boolean zM = aVar2.M(str2);
                            Object objY = aVar2.y();
                            if (zM || objY == a.C0041a.a) {
                                nan.a aVar4 = new nan.a(context);
                                aVar4.c = str2;
                                aVar4.h = new hke0.a(0);
                                objY = aVar4.a();
                                aVar2.r(objY);
                            }
                            mw90.a((nan) objY, null, j.e(aVar3, 1.0f), null, null, null, null, aVar2, 432, 2040);
                            aVar2.H();
                        } else {
                            aVar2.N(-106307158);
                            h9n.a(erz.a(R.drawable.ic_bank, 0, aVar2), null, j.r(aVar3, r75Var.d() * 0.6f), null, null, 0.0f, null, aVar2, 48, 120);
                            aVar2.H();
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3120, 4);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new yt4(i, dVar, str);
        }
    }
}
