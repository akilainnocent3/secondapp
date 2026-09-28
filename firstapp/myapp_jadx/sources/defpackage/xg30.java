package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class xg30 {
    public static final void a(final d dVar, final fg30 fg30Var, a aVar, final int i) {
        fg30Var.getClass();
        ArrayList arrayList = fg30Var.a;
        b bVarI = aVar.i(-1618674783);
        int i2 = i | 6 | (bVarI.A(fg30Var) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(h.j(aVar2, 16.0f, 16.0f, 16.0f, 0.0f, 8), 1.0f);
            int i3 = arrayList.size() < 6 ? 2 : 3;
            bVarI.N(-768292092);
            ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                final bh30 bh30Var = (bh30) obj;
                arrayList2.add(pp8.b(1592130723, new Function2() { // from class: vg30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        a aVar3 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            sg30.a(j.g(d.a.b, 1.0f), bh30Var, fg30Var.b, aVar3, 6);
                        } else {
                            aVar3.G();
                        }
                        return Unit.a;
                    }
                }, bVarI));
            }
            bVarI.X(false);
            yf.a(dVarG, i3, arrayList2, bVarI, 3456);
            dVar = aVar2;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(fg30Var, i) { // from class: wg30
                public final /* synthetic */ fg30 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(65);
                    xg30.a(this.a, this.b, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }
}
