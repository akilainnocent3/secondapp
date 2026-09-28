package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.layout.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class llt extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ op8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llt(int i, op8 op8Var) {
        super(2);
        this.a = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        s.a(qj40.a(7), this.a, aVar);
        return Unit.a;
    }
}
