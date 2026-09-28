package defpackage;

import androidx.compose.animation.g;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class gh0 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ dtg0<Object> a;
    public final /* synthetic */ Function1<Object, Boolean> b;
    public final /* synthetic */ d c;
    public final /* synthetic */ s9g d;
    public final /* synthetic */ g e;
    public final /* synthetic */ op8 f;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh0(dtg0 dtg0Var, Function1 function1, d dVar, s9g s9gVar, g gVar, op8 op8Var, int i) {
        super(2);
        this.a = dtg0Var;
        this.b = function1;
        this.c = dVar;
        this.d = s9gVar;
        this.e = gVar;
        this.f = op8Var;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        hh0.f(this.a, this.b, this.c, this.d, this.e, this.f, aVar, qj40.a(this.i | 1));
        return Unit.a;
    }
}
