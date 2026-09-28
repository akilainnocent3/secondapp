package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class pog implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ rog b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ ui20 d;

    public pog(ArrayList arrayList, rog rogVar, Function2 function2, ui20 ui20Var) {
        this.a = arrayList;
        this.b = rogVar;
        this.c = function2;
        this.d = ui20Var;
    }

    @Override // defpackage.iaj
    public final Unit d(gwr gwrVar, Integer num, a aVar, Integer num2) {
        int i;
        gwr gwrVar2 = gwrVar;
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= aVar2.d(iIntValue) ? 32 : 16;
        }
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            kk20 kk20Var = (kk20) this.a.get(iIntValue);
            aVar2.N(-811900152);
            dg20.a(kk20Var, this.b.b, this.c, aVar2, 0);
            if (iIntValue < this.d.c.size()) {
                aVar2.N(-811637800);
                ute.b(h.h(d.a.b, 12.0f, 0.0f, 2), 1.0f, c68.a(R.color.background_type1_primary, aVar2), aVar2, 54, 0);
                aVar2.H();
            } else {
                aVar2.N(-811296645);
                aVar2.H();
            }
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
