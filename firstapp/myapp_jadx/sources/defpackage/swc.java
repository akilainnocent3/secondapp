package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class swc implements gaj<e160, a, Integer, Unit> {
    public final /* synthetic */ op8 a;
    public final /* synthetic */ boolean b;

    public swc(op8 op8Var, boolean z) {
        this.a = op8Var;
        this.b = z;
    }

    @Override // defpackage.gaj
    public final Unit invoke(e160 e160Var, a aVar, Integer num) {
        String strA;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            this.a.invoke(aVar2, 0);
            float f = ek5.e;
            d.a aVar3 = d.a.b;
            ty0.a(aVar2, j.r(aVar3, f));
            rbn rbnVarB = j6n.d;
            if (rbnVarB == null) {
                rbn.a aVar4 = new rbn.a("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                m2g m2gVar = lwh0.a;
                soa0 soa0Var = new soa0(j58.b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new qxz.f(7.0f, 10.0f));
                arrayList.add(new qxz.m(5.0f, 5.0f));
                arrayList.add(new qxz.m(5.0f, -5.0f));
                arrayList.add(qxz.b.c);
                rbn.a.a(aVar4, arrayList, soa0Var);
                rbnVarB = aVar4.b();
                j6n.d = rbnVarB;
            }
            boolean z = this.b;
            if (z) {
                aVar2.N(1509384391);
                strA = xae0.a(R.string.m3c_date_picker_switch_to_day_selection, aVar2);
                aVar2.H();
            } else {
                aVar2.N(1509478662);
                strA = xae0.a(R.string.m3c_date_picker_switch_to_year_selection, aVar2);
                aVar2.H();
            }
            h6n.a(rbnVarB, strA, p1a.a(aVar3, z ? 180.0f : 0.0f), 0L, aVar2, 0, 8);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
