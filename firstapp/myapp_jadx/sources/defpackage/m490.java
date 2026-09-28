package defpackage;

import androidx.compose.animation.n;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.j;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class m490 extends qlr implements gaj<glt, a, Integer, Unit> {
    public final /* synthetic */ op8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m490(op8 op8Var) {
        super(3);
        this.a = op8Var;
    }

    @Override // defpackage.gaj
    public final Unit invoke(glt gltVar, a aVar, Integer num) {
        glt gltVar2 = gltVar;
        a aVar2 = aVar;
        num.intValue();
        Object objY = aVar2.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (objY == c0042a) {
            objY = xvf.i(e.a, aVar2);
            aVar2.r(objY);
        }
        v5b v5bVar = (v5b) objY;
        Object objY2 = aVar2.y();
        if (objY2 == c0042a) {
            objY2 = new n(gltVar2, v5bVar);
            aVar2.r(objY2);
        }
        n nVar = (n) objY2;
        Object objY3 = aVar2.y();
        if (objY3 == c0042a) {
            objY3 = new i490(nVar);
            aVar2.r(objY3);
        }
        d dVarA = j.a(d.a.b, (gaj) objY3);
        Object objY4 = aVar2.y();
        if (objY4 == c0042a) {
            objY4 = new j490(nVar);
            aVar2.r(objY4);
        }
        this.a.d(nVar, androidx.compose.ui.draw.a.c(dVarA, (Function1) objY4), aVar2, 6);
        Unit unit = Unit.a;
        Object objY5 = aVar2.y();
        if (objY5 == c0042a) {
            objY5 = new l490(nVar);
            aVar2.r(objY5);
        }
        xvf.c(unit, (Function1) objY5, aVar2);
        return unit;
    }
}
