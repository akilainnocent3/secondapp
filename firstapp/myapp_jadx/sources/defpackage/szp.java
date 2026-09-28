package defpackage;

import androidx.compose.foundation.g;
import androidx.compose.runtime.a;
import androidx.compose.runtime.j;
import androidx.compose.runtime.k;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class szp implements gaj {
    public final /* synthetic */ ifn a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ szp(ifn ifnVar, boolean z, Function0 function0) {
        this.a = ifnVar;
        this.b = z;
        this.c = function0;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d dVar = (d) obj;
        a aVar = (a) obj2;
        e3w.a((Integer) obj3, dVar, aVar, 175467769);
        final af1 af1Var = (af1) aVar.O(wzp.c);
        Object objY = aVar.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (objY == c0042a) {
            objY = k.a(0);
            aVar.r(objY);
        }
        final osw oswVar = (osw) objY;
        Object objY2 = aVar.y();
        if (objY2 == c0042a) {
            objY2 = j.a(0.0f);
            aVar.r(objY2);
        }
        final isw iswVar = (isw) objY2;
        final mmd mmdVar = (mmd) aVar.O(kna.h);
        Object objY3 = aVar.y();
        if (objY3 == c0042a) {
            objY3 = new Function1() { // from class: uzp
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    urr urrVar = (urr) obj4;
                    urrVar.getClass();
                    oswVar.k((int) (urrVar.a() & 4294967295L));
                    iswVar.A(Float.intBitsToFloat((int) (urrVar.T(0L) & 4294967295L)));
                    return Unit.a;
                }
            };
            aVar.r(objY3);
        }
        d dVarA = v.a(dVar, (Function1) objY3);
        Object objY4 = aVar.y();
        if (objY4 == c0042a) {
            objY4 = pr7.a(aVar);
        }
        psw pswVar = (psw) objY4;
        ifn ifnVar = this.a;
        if (ifnVar == null) {
            aVar.N(1120817952);
            ifnVar = (ifn) aVar.O(g.a);
        } else {
            aVar.N(1120817022);
        }
        aVar.H();
        ifn ifnVar2 = ifnVar;
        boolean zM = aVar.M(af1Var) | aVar.M(mmdVar) | aVar.c(8.0f);
        final Function0 function0 = this.c;
        boolean zM2 = zM | aVar.M(function0);
        Object objY5 = aVar.y();
        if (zM2 || objY5 == c0042a) {
            Function0 function1 = new Function0() { // from class: vzp
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ytw<dp70> ytwVar = af1Var.a;
                    x5a0 x5a0Var = (x5a0) ytwVar;
                    x5a0Var.setValue(new dp70(oswVar.D(), iswVar.j(), mmdVar.C1(8.0f)));
                    function0.invoke();
                    return Unit.a;
                }
            };
            aVar.r(function1);
            objY5 = function1;
        }
        d dVarB = androidx.compose.foundation.d.b(dVarA, pswVar, ifnVar2, this.b, null, (Function0) objY5, 24);
        aVar.H();
        return dVarB;
    }
}
