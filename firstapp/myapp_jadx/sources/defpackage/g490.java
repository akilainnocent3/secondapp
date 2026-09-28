package defpackage;

import androidx.compose.animation.u;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class g490 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ d a;
    public final /* synthetic */ op8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g490(d dVar, op8 op8Var, int i) {
        super(2);
        this.a = dVar;
        this.b = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        int iA = qj40.a(55);
        u.a(this.a, this.b, aVar, iA);
        return Unit.a;
    }
}
