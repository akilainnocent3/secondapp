package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class p3c extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ dtg0<Object> a;
    public final /* synthetic */ d b;
    public final /* synthetic */ goh<Float> c;
    public final /* synthetic */ Function1<Object, Object> d;
    public final /* synthetic */ op8 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3c(dtg0 dtg0Var, d dVar, goh gohVar, Function1 function1, op8 op8Var, int i, int i2) {
        super(2);
        this.a = dtg0Var;
        this.b = dVar;
        this.c = gohVar;
        this.d = function1;
        this.e = op8Var;
        this.f = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        q3c.a(this.a, this.b, this.c, this.d, this.e, aVar, qj40.a(this.f | 1), this.i);
        return Unit.a;
    }
}
