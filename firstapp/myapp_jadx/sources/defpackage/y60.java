package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class y60 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ d a;
    public final /* synthetic */ Function2<a, Integer, Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y60(d dVar, Function2 function2, int i) {
        super(2);
        this.a = dVar;
        this.b = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        int iA = qj40.a(1);
        u60.b(this.a, this.b, aVar, iA);
        return Unit.a;
    }
}
