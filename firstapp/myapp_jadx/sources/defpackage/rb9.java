package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rb9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            rbn rbnVarB = xpf.a;
            if (rbnVarB == null) {
                rbn.a aVar2 = new rbn.a("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                m2g m2gVar = lwh0.a;
                soa0 soa0Var = new soa0(j58.b);
                fxz fxzVar = new fxz();
                fxzVar.f(3.0f, 17.25f);
                qxz.s sVar = new qxz.s(21.0f);
                ArrayList<qxz> arrayList = fxzVar.a;
                arrayList.add(sVar);
                fxzVar.c(3.75f);
                fxzVar.d(17.81f, 9.94f);
                fxzVar.e(-3.75f, -3.75f);
                fxzVar.d(3.0f, 17.25f);
                fxzVar.a();
                fxzVar.f(20.71f, 7.04f);
                fxzVar.b(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                fxzVar.e(-2.34f, -2.34f);
                fxzVar.b(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                fxzVar.e(-1.83f, 1.83f);
                fxzVar.e(3.75f, 3.75f);
                fxzVar.e(1.83f, -1.83f);
                fxzVar.a();
                rbn.a.a(aVar2, arrayList, soa0Var);
                rbnVarB = aVar2.b();
                xpf.a = rbnVarB;
            }
            h6n.a(rbnVarB, cb40.a(R.string.component_assign_custom_code__edit_custom_code_name, new Object[0], aVar), j.r(d.a.b, 20.0f), c68.a(R.color.text_primary, aVar), aVar, 384, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
