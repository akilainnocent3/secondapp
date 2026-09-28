package defpackage;

import androidx.compose.foundation.g;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class qr7 implements gaj<d, a, Integer, d> {
    public final /* synthetic */ Function0<Unit> a;

    public qr7(Function0 function0) {
        this.a = function0;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        psw pswVar;
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(-756081143);
        ifn ifnVar = (ifn) aVar2.O(g.a);
        if (ifnVar instanceof mfn) {
            aVar2.N(-1604682242);
            aVar2.H();
            pswVar = null;
        } else {
            aVar2.N(-1604549624);
            Object objY = aVar2.y();
            if (objY == a.C0041a.a) {
                objY = pr7.a(aVar2);
            }
            pswVar = (psw) objY;
            aVar2.H();
        }
        psw pswVar2 = pswVar;
        d dVarA = androidx.compose.foundation.d.a(d.a.b, pswVar2, ifnVar, true, null, this.a);
        aVar2.H();
        return dVarA;
    }
}
