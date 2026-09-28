package androidx.compose.ui.platform;

import defpackage.op8;
import defpackage.qlr;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class g extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
    public final /* synthetic */ i a;
    public final /* synthetic */ op8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, op8 op8Var) {
        super(2);
        this.a = iVar;
        this.b = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            AndroidCompositionLocals_androidKt.a(this.a.a, this.b, aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
