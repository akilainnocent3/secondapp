package defpackage;

import androidx.compose.runtime.a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rw9 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            rbn rbnVarB = ih.a;
            if (rbnVarB == null) {
                rbn.a aVar2 = new rbn.a("Outlined.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                m2g m2gVar = lwh0.a;
                soa0 soa0Var = new soa0(j58.b);
                fxz fxzVar = new fxz();
                fxzVar.f(19.0f, 13.0f);
                fxzVar.c(-6.0f);
                fxzVar.h(6.0f);
                fxzVar.c(-2.0f);
                fxzVar.h(-6.0f);
                qxz.d dVar = new qxz.d(5.0f);
                ArrayList<qxz> arrayList = fxzVar.a;
                arrayList.add(dVar);
                fxzVar.h(-2.0f);
                fxzVar.c(6.0f);
                arrayList.add(new qxz.s(5.0f));
                fxzVar.c(2.0f);
                fxzVar.h(6.0f);
                fxzVar.c(6.0f);
                fxzVar.h(2.0f);
                fxzVar.a();
                rbn.a.a(aVar2, arrayList, soa0Var);
                rbnVarB = aVar2.b();
                ih.a = rbnVarB;
            }
            h6n.a(rbnVarB, null, null, 0L, aVar, 48, 12);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
