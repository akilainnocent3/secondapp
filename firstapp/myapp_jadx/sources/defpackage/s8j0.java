package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes.dex */
public final class s8j0 implements gaj<d, a, Integer, d> {
    public final /* synthetic */ g8j0 a;

    public s8j0(g8j0 g8j0Var) {
        this.a = g8j0Var;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(788931215);
        g8j0 g8j0Var = this.a;
        boolean zM = aVar2.M(g8j0Var);
        Object objY = aVar2.y();
        if (zM || objY == a.C0041a.a) {
            objY = new zdh0(g8j0Var);
            aVar2.r(objY);
        }
        zdh0 zdh0Var = (zdh0) objY;
        aVar2.H();
        return zdh0Var;
    }
}
