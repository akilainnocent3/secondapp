package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nf0 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ dtg0<Object> a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Function1<androidx.compose.animation.d<Object>, f0b> c;
    public final /* synthetic */ ht d;
    public final /* synthetic */ Function1<Object, Object> e;
    public final /* synthetic */ iaj<pf0, Object, a, Integer, Unit> f;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf0(dtg0 dtg0Var, d dVar, Function1 function1, ht htVar, Function1 function2, iaj iajVar, int i) {
        super(2);
        this.a = dtg0Var;
        this.b = dVar;
        this.c = function1;
        this.d = htVar;
        this.e = function2;
        this.f = iajVar;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        androidx.compose.animation.a.a(this.a, this.b, this.c, this.d, this.e, this.f, aVar, qj40.a(this.i | 1));
        return Unit.a;
    }
}
