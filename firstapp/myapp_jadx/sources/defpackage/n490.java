package defpackage;

import androidx.compose.animation.u;
import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class n490 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ op8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n490(int i, op8 op8Var) {
        super(2);
        this.a = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        u.b(qj40.a(7), this.a, aVar);
        return Unit.a;
    }
}
