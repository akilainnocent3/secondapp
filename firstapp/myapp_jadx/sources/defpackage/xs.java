package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xs implements Function2<a, Integer, Unit> {
    public final /* synthetic */ Function2<a, Integer, Unit> a;
    public final /* synthetic */ Function2<a, Integer, Unit> b;
    public final /* synthetic */ qx80 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long i;
    public final /* synthetic */ op8 v;

    public xs(Function2 function2, Function2 function3, qx80 qx80Var, long j, long j2, long j3, long j4, op8 op8Var) {
        this.a = function2;
        this.b = function3;
        this.c = qx80Var;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.i = j4;
        this.v = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            ys.a(pp8.b(1367541877, new ws(this.v), aVar2), null, this.a, this.b, this.c, this.d, g68.d(cme.a, aVar2), this.e, this.f, this.i, aVar2, 6);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
