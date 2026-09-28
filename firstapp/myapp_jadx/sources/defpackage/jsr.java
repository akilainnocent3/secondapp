package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jsr extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ d a;
    public final /* synthetic */ op8 b;
    public final /* synthetic */ aiv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsr(d dVar, op8 op8Var, aiv aivVar, int i) {
        super(2);
        this.a = dVar;
        this.b = op8Var;
        this.c = aivVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        int iA = qj40.a(49);
        lsr.a(this.a, this.b, this.c, aVar, iA);
        return Unit.a;
    }
}
