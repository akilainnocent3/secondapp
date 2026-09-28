package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ws implements Function2<a, Integer, Unit> {
    public final /* synthetic */ op8 a;

    public ws(op8 op8Var) {
        this.a = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            umz umzVar = ys.a;
            ys.b(8.0f, 12.0f, pp8.b(-459506658, new vs(this.a), aVar2), aVar2, 438);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
