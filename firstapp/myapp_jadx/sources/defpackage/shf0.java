package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class shf0 implements gaj<d, a, Integer, d> {
    public final /* synthetic */ Function1<gly, Unit> a;
    public final /* synthetic */ psw b;

    /* JADX WARN: Multi-variable type inference failed */
    public shf0(Function1<? super gly, Unit> function1, psw pswVar) {
        this.a = function1;
        this.b = pswVar;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(-102778667);
        Object objY = aVar2.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (objY == c0042a) {
            objY = xvf.i(e.a, aVar2);
            aVar2.r(objY);
        }
        v5b v5bVar = (v5b) objY;
        Object objY2 = aVar2.y();
        if (objY2 == c0042a) {
            objY2 = m.b(null);
            aVar2.r(objY2);
        }
        final ytw ytwVar = (ytw) objY2;
        ytw ytwVarC = m.c(this.a, aVar2);
        final psw pswVar = this.b;
        boolean zM = aVar2.M(pswVar);
        Object objY3 = aVar2.y();
        if (zM || objY3 == c0042a) {
            objY3 = new Function1() { // from class: ohf0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return new rhf0(ytwVar, pswVar);
                }
            };
            aVar2.r(objY3);
        }
        xvf.c(pswVar, (Function1) objY3, aVar2);
        boolean zA = aVar2.A(v5bVar) | aVar2.M(pswVar) | aVar2.M(ytwVarC);
        Object objY4 = aVar2.y();
        if (zA || objY4 == c0042a) {
            objY4 = new qhf0(v5bVar, ytwVar, pswVar, ytwVarC);
            aVar2.r(objY4);
        }
        d dVarA = wje0.a(d.a.b, pswVar, (PointerInputEventHandler) objY4);
        aVar2.H();
        return dVarA;
    }
}
