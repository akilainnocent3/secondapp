package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ts9 {
    public static final op8 a = new op8(-104849695, new ss9(), false);

    public static final ytw a(njs njsVar, a aVar) {
        return b(njsVar, njsVar.d(), aVar, 0);
    }

    public static final ytw b(final njs njsVar, Object obj, a aVar, int i) {
        final ibs ibsVar = (ibs) aVar.O(ndt.a);
        Object objY = aVar.y();
        Object obj2 = a.C0041a.a;
        if (objY == obj2) {
            if (njsVar.e != njs.k) {
                obj = njsVar.d();
            }
            objY = m.b(obj);
            aVar.r(objY);
        }
        final ytw ytwVar = (ytw) objY;
        boolean zA = aVar.A(njsVar) | aVar.A(ibsVar);
        Object objY2 = aVar.y();
        if (zA || objY2 == obj2) {
            objY2 = new Function1() { // from class: ojs
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    pjs pjsVar = new pjs(ytwVar, 0);
                    njs njsVar2 = njsVar;
                    njsVar2.f(ibsVar, pjsVar);
                    return new qjs(njsVar2, pjsVar);
                }
            };
            aVar.r(objY2);
        }
        xvf.a(njsVar, ibsVar, (Function1) objY2, aVar);
        return ytwVar;
    }
}
