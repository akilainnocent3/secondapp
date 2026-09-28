package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class v880 implements gaj<d, a, Integer, d> {
    public final /* synthetic */ Function0<gly> a;
    public final /* synthetic */ Function1<Function0<gly>, d> b;

    /* JADX WARN: Multi-variable type inference failed */
    public v880(Function0<gly> function0, Function1<? super Function0<gly>, ? extends d> function1) {
        this.a = function0;
        this.b = function1;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(759876635);
        Object objY = aVar2.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (objY == c0042a) {
            objY = a6a0.b(this.a);
            aVar2.r(objY);
        }
        twd0 twd0Var = (twd0) objY;
        Object objY2 = aVar2.y();
        if (objY2 == c0042a) {
            gly glyVar = (gly) twd0Var.getValue();
            long j = glyVar.a;
            objY2 = new wd0(glyVar, y880.b, new gly(y880.c), 8);
            aVar2.r(objY2);
        }
        wd0 wd0Var = (wd0) objY2;
        Unit unit = Unit.a;
        boolean zA = aVar2.A(wd0Var);
        Object objY3 = aVar2.y();
        if (zA || objY3 == c0042a) {
            objY3 = new x880(twd0Var, wd0Var, null);
            aVar2.r(objY3);
        }
        xvf.e(aVar2, unit, (Function2) objY3);
        Object obj = wd0Var.c;
        boolean zM = aVar2.M(obj);
        Object objY4 = aVar2.y();
        if (zM || objY4 == c0042a) {
            objY4 = new u880(obj, 0);
            aVar2.r(objY4);
        }
        d dVarInvoke = this.b.invoke((Function0) objY4);
        aVar2.H();
        return dVarInvoke;
    }
}
