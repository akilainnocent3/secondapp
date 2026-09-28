package androidx.compose.foundation;

import defpackage.gaj;
import defpackage.ifn;
import defpackage.pr7;
import defpackage.psw;
import defpackage.su50;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements gaj<androidx.compose.ui.d, androidx.compose.runtime.a, Integer, androidx.compose.ui.d> {
    public final /* synthetic */ ifn a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ su50 c;
    public final /* synthetic */ Function0 d;

    public c(ifn ifnVar, boolean z, su50 su50Var, Function0 function0) {
        this.a = ifnVar;
        this.b = z;
        this.c = su50Var;
        this.d = function0;
    }

    @Override // defpackage.gaj
    public final androidx.compose.ui.d invoke(androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        aVar2.N(-1525724089);
        Object objY = aVar2.y();
        if (objY == androidx.compose.runtime.a.C0041a.a) {
            objY = pr7.a(aVar2);
        }
        psw pswVar = (psw) objY;
        androidx.compose.ui.d dVarN = g.a(androidx.compose.ui.d.a.b, pswVar, this.a).n(new ClickableElement(pswVar, null, false, this.b, null, this.c, this.d));
        aVar2.H();
        return dVarN;
    }
}
