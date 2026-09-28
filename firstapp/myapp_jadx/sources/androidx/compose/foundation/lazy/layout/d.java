package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.g0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import defpackage.dxr;
import defpackage.et60;
import defpackage.gaj;
import defpackage.gyr;
import defpackage.hxr;
import defpackage.hyr;
import defpackage.la0;
import defpackage.nj4;
import defpackage.nxr;
import defpackage.po20;
import defpackage.qo20;
import defpackage.xvf;
import defpackage.y6d;
import defpackage.ytw;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class d implements gaj<et60, androidx.compose.runtime.a, Integer, Unit> {
    public final /* synthetic */ gyr a;
    public final /* synthetic */ androidx.compose.ui.d b;
    public final /* synthetic */ nxr c;
    public final /* synthetic */ ytw d;

    public d(gyr gyrVar, androidx.compose.ui.d dVar, nxr nxrVar, ytw ytwVar) {
        this.a = gyrVar;
        this.b = dVar;
        this.c = nxrVar;
        this.d = ytwVar;
    }

    @Override // defpackage.gaj
    public final Unit invoke(et60 et60Var, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.ui.d dVarN;
        et60 et60Var2 = et60Var;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        Object objY = aVar2.y();
        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
        if (objY == c0042a) {
            objY = new dxr(et60Var2, new nj4(this.d, 1));
            aVar2.r(objY);
        }
        final dxr dxrVar = (dxr) objY;
        Object objY2 = aVar2.y();
        if (objY2 == c0042a) {
            objY2 = new g0(new hxr(dxrVar));
            aVar2.r(objY2);
        }
        final g0 g0Var = (g0) objY2;
        final gyr gyrVar = this.a;
        if (gyrVar != null) {
            aVar2.N(1743490539);
            final po20 po20Var = gyrVar.a;
            if (po20Var == null) {
                aVar2.N(887527095);
                po20Var = qo20.a;
                if (po20Var != null) {
                    aVar2.N(1345648624);
                    aVar2.H();
                } else {
                    aVar2.N(1345697697);
                    View view = (View) aVar2.O(AndroidCompositionLocals_androidKt.f);
                    boolean zM = aVar2.M(view);
                    Object objY3 = aVar2.y();
                    if (zM || objY3 == c0042a) {
                        Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                        objY3 = tag instanceof po20 ? (po20) tag : null;
                        if (objY3 == null) {
                            objY3 = new la0(view);
                            view.setTag(R.id.compose_prefetch_scheduler, objY3);
                        }
                        aVar2.r(objY3);
                    }
                    aVar2.H();
                    po20Var = (po20) objY3;
                }
            } else {
                aVar2.N(887526010);
            }
            aVar2.H();
            Object[] objArr = {gyrVar, dxrVar, g0Var, po20Var};
            boolean zM2 = aVar2.M(gyrVar) | aVar2.A(dxrVar) | aVar2.A(g0Var) | aVar2.A(po20Var);
            Object objY4 = aVar2.y();
            if (zM2 || objY4 == c0042a) {
                objY4 = new Function1() { // from class: kxr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        lo20 lo20Var = new lo20(dxrVar, g0Var, po20Var);
                        gyr gyrVar2 = gyrVar;
                        gyrVar2.d = lo20Var;
                        return new lxr(gyrVar2);
                    }
                };
                aVar2.r(objY4);
            }
            xvf.d(objArr, (Function1) objY4, aVar2);
            aVar2.H();
        } else {
            aVar2.N(1744076749);
            aVar2.H();
        }
        int i = hyr.a;
        androidx.compose.ui.d dVar = this.b;
        if (gyrVar != null && (dVarN = dVar.n(new TraversablePrefetchStateModifierElement(gyrVar))) != null) {
            dVar = dVarN;
        }
        boolean zM3 = aVar2.M(dxrVar);
        nxr nxrVar = this.c;
        boolean zM4 = zM3 | aVar2.M(nxrVar);
        Object objY5 = aVar2.y();
        if (zM4 || objY5 == c0042a) {
            objY5 = new y6d(dxrVar, nxrVar);
            aVar2.r(objY5);
        }
        f0.b(g0Var, dVar, (Function2) objY5, aVar2, 8);
        return Unit.a;
    }
}
