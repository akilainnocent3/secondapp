package defpackage;

import androidx.compose.animation.f;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes.dex */
public final class ih0 extends qlr implements gaj<d, a, Integer, d> {
    public final /* synthetic */ jh0 a;
    public final /* synthetic */ t9g b;
    public final /* synthetic */ owg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih0(jh0 jh0Var, t9g t9gVar, owg owgVar) {
        super(3);
        this.a = jh0Var;
        this.b = t9gVar;
        this.c = owgVar;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(1840112047);
        d dVarN = dVar.n(f.a(this.a.b(), this.b, this.c, null, "animateEnterExit", aVar2, 0, 4));
        aVar2.H();
        return dVarN;
    }
}
