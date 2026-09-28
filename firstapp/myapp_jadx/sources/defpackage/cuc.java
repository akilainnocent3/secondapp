package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class cuc implements Function2<a, Integer, Unit> {
    public final /* synthetic */ Function2<a, Integer, Unit> a;
    public final /* synthetic */ op8 b;

    public cuc(Function2 function2, op8 op8Var) {
        this.a = function2;
        this.b = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            ys.b(fuc.b, fuc.c, pp8.b(-1980163584, new buc(this.a, this.b), aVar2), aVar2, 438);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
