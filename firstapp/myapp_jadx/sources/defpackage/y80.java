package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class y80 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ d a;
    public final /* synthetic */ cuw<Boolean> b;
    public final /* synthetic */ ytw<jsg0> c;
    public final /* synthetic */ zp70 d;
    public final /* synthetic */ qx80 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float i;
    public final /* synthetic */ op8 v;

    public y80(d dVar, cuw cuwVar, ytw ytwVar, zp70 zp70Var, qx80 qx80Var, long j, float f, op8 op8Var) {
        this.a = dVar;
        this.b = cuwVar;
        this.c = ytwVar;
        this.d = zp70Var;
        this.e = qx80Var;
        this.f = j;
        this.i = f;
        this.v = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            tmv.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, aVar2, 384);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
