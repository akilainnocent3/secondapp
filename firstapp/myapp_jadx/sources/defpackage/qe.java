package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qe {
    public static final tnu a(vd vdVar, Function1 function1, a aVar) {
        vd vdVar2;
        ytw ytwVarC = m.c(vdVar, aVar);
        ytw ytwVarC2 = m.c(function1, aVar);
        String str = (String) o350.d(new Object[0], null, pe.a, aVar, 3072, 6);
        re reVar = (re) aVar.O(adt.a);
        if (reVar == null) {
            aVar.N(1006590171);
            Object baseContext = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof re) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            reVar = (re) baseContext;
        } else {
            aVar.N(1006589303);
        }
        aVar.H();
        if (reVar == null) {
            ib5.a("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        ie activityResultRegistry = reVar.getActivityResultRegistry();
        Object objY = aVar.y();
        Object obj = a.C0041a.a;
        if (objY == obj) {
            objY = new fe();
            aVar.r(objY);
        }
        fe feVar = (fe) objY;
        Object objY2 = aVar.y();
        if (objY2 == obj) {
            objY2 = new tnu(feVar, ytwVarC);
            aVar.r(objY2);
        }
        tnu tnuVar = (tnu) objY2;
        boolean zA = aVar.A(feVar) | aVar.A(activityResultRegistry) | aVar.M(str) | aVar.A(vdVar) | aVar.M(ytwVarC2);
        Object objY3 = aVar.y();
        if (zA || objY3 == obj) {
            vdVar2 = vdVar;
            objY3 = new oe(feVar, activityResultRegistry, str, vdVar2, ytwVarC2);
            aVar.r(objY3);
        } else {
            vdVar2 = vdVar;
        }
        xvf.b(activityResultRegistry, str, vdVar2, (Function1) objY3, aVar);
        return tnuVar;
    }
}
