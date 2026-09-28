package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ay60 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2<a, Integer, Unit> b;
    public final /* synthetic */ op8 c;
    public final /* synthetic */ Function2<a, Integer, Unit> d;
    public final /* synthetic */ Function2<a, Integer, Unit> e;
    public final /* synthetic */ guw f;
    public final /* synthetic */ Function2<a, Integer, Unit> i;

    public ay60(int i, Function2 function2, op8 op8Var, Function2 function3, Function2 function4, guw guwVar, Function2 function5) {
        this.a = i;
        this.b = function2;
        this.c = op8Var;
        this.d = function3;
        this.e = function4;
        this.f = guwVar;
        this.i = function5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            hy60.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
