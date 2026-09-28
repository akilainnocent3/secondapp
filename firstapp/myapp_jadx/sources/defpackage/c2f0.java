package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.r;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c2f0 implements gaj {
    public final /* synthetic */ y1f0 a;

    public /* synthetic */ c2f0(y1f0 y1f0Var) {
        this.a = y1f0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        d dVar = (d) obj;
        a aVar = (a) obj2;
        e3w.a((Integer) obj3, dVar, aVar, -1560672401);
        y1f0 y1f0Var = this.a;
        float f = y1f0Var.b;
        f4c f4cVar = xkf.a;
        twd0 twd0VarA = xe0.a(f, yi0.e(r.d.DEFAULT_SWIPE_ANIMATION_DURATION, 0, f4cVar, 2), null, aVar, 0, 12);
        d dVarW = j.w(g.d(j.C(j.g(dVar, 1.0f), ht.a.g, 2), ((g7f) xe0.a(y1f0Var.a, yi0.e(r.d.DEFAULT_SWIPE_ANIMATION_DURATION, 0, f4cVar, 2), null, aVar, 0, 12).getValue()).a, 0.0f, 2), ((g7f) twd0VarA.getValue()).a);
        aVar.H();
        return dVarW;
    }
}
