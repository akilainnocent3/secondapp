package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class mog implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ rog b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ uss d;

    public mog(ArrayList arrayList, rog rogVar, Function2 function2, uss ussVar) {
        this.a = arrayList;
        this.b = rogVar;
        this.c = function2;
        this.d = ussVar;
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
            vts vtsVar = (vts) this.a.get(iIntValue);
            aVar2.N(1997073037);
            boolean z = vtsVar instanceof vts.a;
            Function2 function2 = this.c;
            rog rogVar = this.b;
            if (z) {
                aVar2.N(-766860218);
                tts.a((vts.a) vtsVar, rogVar.b, function2, aVar2, 0);
                aVar2.H();
            } else {
                if (!(vtsVar instanceof vts.b)) {
                    throw rg.a(-766862675, aVar2);
                }
                aVar2.N(-766852130);
                ros.a((vts.b) vtsVar, rogVar.b, function2, aVar2, 0);
                aVar2.H();
            }
            if (iIntValue < this.d.c.size() - 1) {
                aVar2.N(1997656363);
                ute.b(h.h(d.a.b, 12.0f, 0.0f, 2), 1.0f, c68.a(R.color.background_type1_primary, aVar2), aVar2, 54, 0);
                aVar2.H();
            } else {
                aVar2.N(1997974454);
                aVar2.H();
            }
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
