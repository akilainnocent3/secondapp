package androidx.compose.foundation.selection;

import androidx.compose.foundation.g;
import androidx.compose.ui.d;
import defpackage.gaj;
import defpackage.ifn;
import defpackage.kzf0;
import defpackage.pr7;
import defpackage.psw;
import defpackage.su50;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements gaj<d, androidx.compose.runtime.a, Integer, d> {
    public final /* synthetic */ ifn a;
    public final /* synthetic */ kzf0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ su50 d;
    public final /* synthetic */ Function0 e;

    public b(ifn ifnVar, kzf0 kzf0Var, boolean z, su50 su50Var, Function0 function0) {
        this.a = ifnVar;
        this.b = kzf0Var;
        this.c = z;
        this.d = su50Var;
        this.e = function0;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        aVar2.N(-1525724089);
        Object objY = aVar2.y();
        if (objY == androidx.compose.runtime.a.C0041a.a) {
            objY = pr7.a(aVar2);
        }
        psw pswVar = (psw) objY;
        d dVarN = g.a(d.a.b, pswVar, this.a).n(new TriStateToggleableElement(this.b, pswVar, null, this.c, this.d, this.e));
        aVar2.H();
        return dVarN;
    }
}
