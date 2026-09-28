package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class r55 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ l65 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ qx80 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long i;
    public final /* synthetic */ float v;
    public final /* synthetic */ Function2<a, Integer, Unit> w;
    public final /* synthetic */ op8 y;

    public r55(l65 l65Var, float f, float f2, boolean z, qx80 qx80Var, long j, long j2, float f3, Function2 function2, op8 op8Var) {
        this.a = l65Var;
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = qx80Var;
        this.f = j;
        this.i = j2;
        this.v = f3;
        this.w = function2;
        this.y = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            k65.c(this.a.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
