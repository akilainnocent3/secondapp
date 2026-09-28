package defpackage;

import androidx.compose.runtime.a;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pix implements iaj<pf0, ifx, a, Integer, Unit> {
    public final /* synthetic */ u480<ifx> a;
    public final /* synthetic */ ifx b;
    public final /* synthetic */ et60 c;
    public final /* synthetic */ ytw<Boolean> d;
    public final /* synthetic */ twd0<List<ifx>> e;

    public pix(u480 u480Var, ifx ifxVar, kt60 kt60Var, ytw ytwVar, twd0 twd0Var) {
        this.a = u480Var;
        this.b = ifxVar;
        this.c = kt60Var;
        this.d = ytwVar;
        this.e = twd0Var;
    }

    @Override // defpackage.iaj
    public final Unit d(pf0 pf0Var, ifx ifxVar, a aVar, Integer num) {
        ifx ifxVarPrevious;
        pf0 pf0Var2 = pf0Var;
        ifx ifxVar2 = ifxVar;
        a aVar2 = aVar;
        num.intValue();
        boolean zG = Intrinsics.g(((x5a0) this.a.c).getValue(), this.b);
        if (!this.d.getValue().booleanValue() && !zG) {
            List<ifx> value = this.e.getValue();
            ListIterator<ifx> listIterator = value.listIterator(value.size());
            do {
                if (!listIterator.hasPrevious()) {
                    ifxVarPrevious = null;
                    break;
                }
                ifxVarPrevious = listIterator.previous();
            } while (!Intrinsics.g(ifxVar2, ifxVarPrevious));
            ifxVar2 = ifxVarPrevious;
        }
        if (ifxVar2 == null) {
            aVar2.N(105930796);
        } else {
            aVar2.N(-1520603531);
            ip5.a(ifxVar2, this.c, pp8.b(-1263531443, new oix(ifxVar2, pf0Var2), aVar2), aVar2, 384);
        }
        aVar2.H();
        return Unit.a;
    }
}
