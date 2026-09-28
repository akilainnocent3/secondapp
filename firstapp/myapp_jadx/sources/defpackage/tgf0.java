package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tgf0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ long a;
    public final /* synthetic */ imf0 b;
    public final /* synthetic */ Function2<a, Integer, Unit> c;

    /* JADX WARN: Multi-variable type inference failed */
    public tgf0(long j, imf0 imf0Var, Function2<? super a, ? super Integer, Unit> function2) {
        this.a = j;
        this.b = imf0Var;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            wgf0.b(this.a, this.b, this.c, aVar2, 0);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
